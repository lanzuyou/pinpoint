package com.nhn.pinpoint.web.applicationmap;

import com.nhn.pinpoint.web.applicationmap.rawdata.LinkData;
import com.nhn.pinpoint.web.applicationmap.rawdata.LinkDataDuplexMap;
import com.nhn.pinpoint.web.applicationmap.rawdata.LinkDataMap;
import com.nhn.pinpoint.web.service.AgentInfoService;
import com.nhn.pinpoint.web.vo.Application;
import com.nhn.pinpoint.web.vo.LinkKey;
import com.nhn.pinpoint.web.vo.Range;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * @author emeroad
 */
public class ApplicationMapBuilder {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final Range range;

    public ApplicationMapBuilder(Range range) {
        if (range == null) {
            throw new NullPointerException("range must not be null");
        }

        this.range = range;
    }

    public ApplicationMap build(LinkDataDuplexMap linkDataDuplexMap, AgentInfoService agentInfoService) {
        if (linkDataDuplexMap == null) {
            throw new NullPointerException("linkDataMap must not be null");
        }
        if (agentInfoService == null) {
            throw new NullPointerException("agentInfoService must not be null");
        }


        final ApplicationMap map = new ApplicationMap(range);
        buildNode(map, linkDataDuplexMap, agentInfoService);

        buildLink(map, linkDataDuplexMap);


        return map;
    }

    private void buildNode(ApplicationMap map, LinkDataDuplexMap linkDataDuplexMap, AgentInfoService agentInfoService) {
        NodeList nodeList = new NodeList();
        createNode(nodeList, linkDataDuplexMap.getSourceLinkDataMap());

        createNode(nodeList, linkDataDuplexMap.getTargetLinkDataMap());
        map.addNodeList(nodeList.getNodeList());

        // agentInfo를 넣는다.
        map.appendAgentInfo(linkDataDuplexMap, agentInfoService);
        logger.debug("allNode:{}", map.getNodes());
    }

    private void createNode(NodeList nodeList, LinkDataMap linkDataMap) {

        for (LinkData linkData : linkDataMap.getLinkDataList()) {
            final Application fromApplication = linkData.getFromApplication();
            // FROM -> TO에서 FROM이 CLIENT가 아니면 FROM은 node
            // rpc가 나올수가 없음. 이미 unknown으로 치환을 하기 때문에. 만약 rpc가 나온다면 이상한 케이스임
            if (!fromApplication.getServiceType().isRpcClient()) {
                if (!nodeList.containsNode(fromApplication)) {
                    logger.debug("createSourceNode:{}", fromApplication);
                    Node fromNode = new Node(fromApplication);
                    nodeList.addNode(fromNode);
                }
            } else {
                logger.warn("found rpc fromNode linkData:{}", linkData);
            }


            final Application toApplication = linkData.getToApplication();
            // FROM -> TO에서 TO가 CLIENT가 아니면 TO는 node
            if (!toApplication.getServiceType().isRpcClient()) {
                if (!nodeList.containsNode(toApplication)) {
                    logger.debug("createTargetNode:{}", toApplication);
                    Node toNode = new Node(toApplication);
                    nodeList.addNode(toNode);
                }
            } else {
                logger.warn("found rpc toNode:{}", linkData);
            }
        }

    }

    private void buildLink(ApplicationMap map, LinkDataDuplexMap linkDataDuplexMap) {
        // 변경하면 안됨.
        List<Link> sourceLink = createSourceLink(linkDataDuplexMap.getSourceLinkDataMap(), map);
        logger.debug("sourceLink.size:{}", sourceLink.size());
        map.addLink(sourceLink);


        List<Link> targetLink = createTargetLink(linkDataDuplexMap.getTargetLinkDataMap(), map);
        logger.debug("targetLink.size:{}", targetLink.size());
        map.addLink(targetLink);


        for (Link link : map.getLinks()) {
            appendLinkHistogram(link, linkDataDuplexMap);
        }

    }

    private void appendLinkHistogram(Link link, LinkDataDuplexMap linkDataDuplexMap) {
        logger.debug("appendLinkHistogram link:{}", link);

        LinkKey key = link.getLinkKey();
        LinkData sourceLinkData = linkDataDuplexMap.getSourceLinkData(key);
        if (sourceLinkData != null) {
            link.addSource(sourceLinkData.getLinkCallDataMap());
        }
        LinkData targetLinkData = linkDataDuplexMap.getTargetLinkData(key);
        if (targetLinkData != null) {
            link.addTarget(targetLinkData.getLinkCallDataMap());
        }
    }

    private List<Link> createSourceLink(LinkDataMap linkDataMap, ApplicationMap map) {
        final List<Link> result = new ArrayList<Link>();

        for (LinkData linkData : linkDataMap.getLinkDataList()) {
            final Application fromApplicationId = linkData.getFromApplication();
            Node fromNode = map.findNode(fromApplicationId);

            final Application toApplicationId = linkData.getToApplication();
            Node toNode = map.findNode(toApplicationId);

            // rpc client가 빠진경우임.
            if (toNode == null) {
                logger.warn("toNode rcp client not found:{}", toApplicationId);
                continue;
            }

            // RPC client인 경우 dest application이 이미 있으면 삭제, 없으면 unknown cloud로 변경.
            final Link link = new Link(CreateType.Source, fromNode, toNode, range);

            if (toNode.getServiceType().isRpcClient()) {
                if (!map.containsNode(toNode.getApplication())) {
                    result.add(link);
                }
            } else {

                result.add(link);
            }
        }
        return result;
    }



    private List<Link> createTargetLink(LinkDataMap rawData, ApplicationMap map) {
        final List<Link> result = new ArrayList<Link>();
        // extract relation
        for (LinkData linkData : rawData.getLinkDataList()) {
            final Application fromApplicationId = linkData.getFromApplication();
            Node fromNode = map.findNode(fromApplicationId);
            // TODO
            final Application toApplicationId = linkData.getToApplication();
            Node toNode = map.findNode(toApplicationId);

            // rpc client가 빠진경우임.
            if (fromNode == null) {
                logger.warn("fromNode rcp client not found:{}", toApplicationId);
                continue;
            }

            // RPC client인 경우 dest application이 이미 있으면 삭제, 없으면 unknown cloud로 변경.
            Link link = new Link(CreateType.Target, fromNode, toNode, range);
            if (toNode.getServiceType().isRpcClient()) {
                if (!map.containsNode(toNode.getApplication())) {
                    result.add(link);
                }
            } else {
                result.add(link);
            }
        }
        return result;
    }



}
