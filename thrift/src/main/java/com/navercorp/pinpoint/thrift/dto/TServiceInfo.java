/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-13")
public class TServiceInfo implements org.apache.thrift.TBase<TServiceInfo, TServiceInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TServiceInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TServiceInfo");

  private static final org.apache.thrift.protocol.TField SERVICE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("serviceName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SERVICE_LIBS_FIELD_DESC = new org.apache.thrift.protocol.TField("serviceLibs", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TServiceInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TServiceInfoTupleSchemeFactory());
  }

  private String serviceName; // optional
  private List<String> serviceLibs; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SERVICE_NAME((short)1, "serviceName"),
    SERVICE_LIBS((short)2, "serviceLibs");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SERVICE_NAME
          return SERVICE_NAME;
        case 2: // SERVICE_LIBS
          return SERVICE_LIBS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.SERVICE_NAME,_Fields.SERVICE_LIBS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SERVICE_NAME, new org.apache.thrift.meta_data.FieldMetaData("serviceName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERVICE_LIBS, new org.apache.thrift.meta_data.FieldMetaData("serviceLibs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TServiceInfo.class, metaDataMap);
  }

  public TServiceInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TServiceInfo(TServiceInfo other) {
    if (other.isSetServiceName()) {
      this.serviceName = other.serviceName;
    }
    if (other.isSetServiceLibs()) {
      List<String> __this__serviceLibs = new ArrayList<String>(other.serviceLibs);
      this.serviceLibs = __this__serviceLibs;
    }
  }

  public TServiceInfo deepCopy() {
    return new TServiceInfo(this);
  }

  @Override
  public void clear() {
    this.serviceName = null;
    this.serviceLibs = null;
  }

  public String getServiceName() {
    return this.serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public void unsetServiceName() {
    this.serviceName = null;
  }

  /** Returns true if field serviceName is set (has been assigned a value) and false otherwise */
  public boolean isSetServiceName() {
    return this.serviceName != null;
  }

  public void setServiceNameIsSet(boolean value) {
    if (!value) {
      this.serviceName = null;
    }
  }

  public int getServiceLibsSize() {
    return (this.serviceLibs == null) ? 0 : this.serviceLibs.size();
  }

  public java.util.Iterator<String> getServiceLibsIterator() {
    return (this.serviceLibs == null) ? null : this.serviceLibs.iterator();
  }

  public void addToServiceLibs(String elem) {
    if (this.serviceLibs == null) {
      this.serviceLibs = new ArrayList<String>();
    }
    this.serviceLibs.add(elem);
  }

  public List<String> getServiceLibs() {
    return this.serviceLibs;
  }

  public void setServiceLibs(List<String> serviceLibs) {
    this.serviceLibs = serviceLibs;
  }

  public void unsetServiceLibs() {
    this.serviceLibs = null;
  }

  /** Returns true if field serviceLibs is set (has been assigned a value) and false otherwise */
  public boolean isSetServiceLibs() {
    return this.serviceLibs != null;
  }

  public void setServiceLibsIsSet(boolean value) {
    if (!value) {
      this.serviceLibs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SERVICE_NAME:
      if (value == null) {
        unsetServiceName();
      } else {
        setServiceName((String)value);
      }
      break;

    case SERVICE_LIBS:
      if (value == null) {
        unsetServiceLibs();
      } else {
        setServiceLibs((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SERVICE_NAME:
      return getServiceName();

    case SERVICE_LIBS:
      return getServiceLibs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SERVICE_NAME:
      return isSetServiceName();
    case SERVICE_LIBS:
      return isSetServiceLibs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TServiceInfo)
      return this.equals((TServiceInfo)that);
    return false;
  }

  public boolean equals(TServiceInfo that) {
    if (that == null)
      return false;

    boolean this_present_serviceName = true && this.isSetServiceName();
    boolean that_present_serviceName = true && that.isSetServiceName();
    if (this_present_serviceName || that_present_serviceName) {
      if (!(this_present_serviceName && that_present_serviceName))
        return false;
      if (!this.serviceName.equals(that.serviceName))
        return false;
    }

    boolean this_present_serviceLibs = true && this.isSetServiceLibs();
    boolean that_present_serviceLibs = true && that.isSetServiceLibs();
    if (this_present_serviceLibs || that_present_serviceLibs) {
      if (!(this_present_serviceLibs && that_present_serviceLibs))
        return false;
      if (!this.serviceLibs.equals(that.serviceLibs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_serviceName = true && (isSetServiceName());
    list.add(present_serviceName);
    if (present_serviceName)
      list.add(serviceName);

    boolean present_serviceLibs = true && (isSetServiceLibs());
    list.add(present_serviceLibs);
    if (present_serviceLibs)
      list.add(serviceLibs);

    return list.hashCode();
  }

  @Override
  public int compareTo(TServiceInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetServiceName()).compareTo(other.isSetServiceName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServiceName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serviceName, other.serviceName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServiceLibs()).compareTo(other.isSetServiceLibs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServiceLibs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serviceLibs, other.serviceLibs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TServiceInfo(");
    boolean first = true;

    if (isSetServiceName()) {
      sb.append("serviceName:");
      if (this.serviceName == null) {
        sb.append("null");
      } else {
        sb.append(this.serviceName);
      }
      first = false;
    }
    if (isSetServiceLibs()) {
      if (!first) sb.append(", ");
      sb.append("serviceLibs:");
      if (this.serviceLibs == null) {
        sb.append("null");
      } else {
        sb.append(this.serviceLibs);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TServiceInfoStandardSchemeFactory implements SchemeFactory {
    public TServiceInfoStandardScheme getScheme() {
      return new TServiceInfoStandardScheme();
    }
  }

  private static class TServiceInfoStandardScheme extends StandardScheme<TServiceInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TServiceInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SERVICE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serviceName = iprot.readString();
              struct.setServiceNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SERVICE_LIBS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.serviceLibs = new ArrayList<String>(_list0.size);
                String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.serviceLibs.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setServiceLibsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TServiceInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.serviceName != null) {
        if (struct.isSetServiceName()) {
          oprot.writeFieldBegin(SERVICE_NAME_FIELD_DESC);
          oprot.writeString(struct.serviceName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.serviceLibs != null) {
        if (struct.isSetServiceLibs()) {
          oprot.writeFieldBegin(SERVICE_LIBS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.serviceLibs.size()));
            for (String _iter3 : struct.serviceLibs)
            {
              oprot.writeString(_iter3);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TServiceInfoTupleSchemeFactory implements SchemeFactory {
    public TServiceInfoTupleScheme getScheme() {
      return new TServiceInfoTupleScheme();
    }
  }

  private static class TServiceInfoTupleScheme extends TupleScheme<TServiceInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TServiceInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetServiceName()) {
        optionals.set(0);
      }
      if (struct.isSetServiceLibs()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetServiceName()) {
        oprot.writeString(struct.serviceName);
      }
      if (struct.isSetServiceLibs()) {
        {
          oprot.writeI32(struct.serviceLibs.size());
          for (String _iter4 : struct.serviceLibs)
          {
            oprot.writeString(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TServiceInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.serviceName = iprot.readString();
        struct.setServiceNameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.serviceLibs = new ArrayList<String>(_list5.size);
          String _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readString();
            struct.serviceLibs.add(_elem6);
          }
        }
        struct.setServiceLibsIsSet(true);
      }
    }
  }

}

