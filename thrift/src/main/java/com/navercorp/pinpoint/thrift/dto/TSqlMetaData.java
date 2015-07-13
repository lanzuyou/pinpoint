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
public class TSqlMetaData implements org.apache.thrift.TBase<TSqlMetaData, TSqlMetaData._Fields>, java.io.Serializable, Cloneable, Comparable<TSqlMetaData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSqlMetaData");

  private static final org.apache.thrift.protocol.TField AGENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("agentId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField AGENT_START_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("agentStartTime", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField SQL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sqlId", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField SQL_FIELD_DESC = new org.apache.thrift.protocol.TField("sql", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TSqlMetaDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TSqlMetaDataTupleSchemeFactory());
  }

  private String agentId; // required
  private long agentStartTime; // required
  private int sqlId; // required
  private String sql; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AGENT_ID((short)1, "agentId"),
    AGENT_START_TIME((short)2, "agentStartTime"),
    SQL_ID((short)4, "sqlId"),
    SQL((short)5, "sql");

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
        case 1: // AGENT_ID
          return AGENT_ID;
        case 2: // AGENT_START_TIME
          return AGENT_START_TIME;
        case 4: // SQL_ID
          return SQL_ID;
        case 5: // SQL
          return SQL;
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
  private static final int __AGENTSTARTTIME_ISSET_ID = 0;
  private static final int __SQLID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AGENT_ID, new org.apache.thrift.meta_data.FieldMetaData("agentId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AGENT_START_TIME, new org.apache.thrift.meta_data.FieldMetaData("agentStartTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SQL_ID, new org.apache.thrift.meta_data.FieldMetaData("sqlId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SQL, new org.apache.thrift.meta_data.FieldMetaData("sql", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSqlMetaData.class, metaDataMap);
  }

  public TSqlMetaData() {
  }

  public TSqlMetaData(
    String agentId,
    long agentStartTime,
    int sqlId,
    String sql)
  {
    this();
    this.agentId = agentId;
    this.agentStartTime = agentStartTime;
    setAgentStartTimeIsSet(true);
    this.sqlId = sqlId;
    setSqlIdIsSet(true);
    this.sql = sql;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSqlMetaData(TSqlMetaData other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAgentId()) {
      this.agentId = other.agentId;
    }
    this.agentStartTime = other.agentStartTime;
    this.sqlId = other.sqlId;
    if (other.isSetSql()) {
      this.sql = other.sql;
    }
  }

  public TSqlMetaData deepCopy() {
    return new TSqlMetaData(this);
  }

  @Override
  public void clear() {
    this.agentId = null;
    setAgentStartTimeIsSet(false);
    this.agentStartTime = 0;
    setSqlIdIsSet(false);
    this.sqlId = 0;
    this.sql = null;
  }

  public String getAgentId() {
    return this.agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public void unsetAgentId() {
    this.agentId = null;
  }

  /** Returns true if field agentId is set (has been assigned a value) and false otherwise */
  public boolean isSetAgentId() {
    return this.agentId != null;
  }

  public void setAgentIdIsSet(boolean value) {
    if (!value) {
      this.agentId = null;
    }
  }

  public long getAgentStartTime() {
    return this.agentStartTime;
  }

  public void setAgentStartTime(long agentStartTime) {
    this.agentStartTime = agentStartTime;
    setAgentStartTimeIsSet(true);
  }

  public void unsetAgentStartTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AGENTSTARTTIME_ISSET_ID);
  }

  /** Returns true if field agentStartTime is set (has been assigned a value) and false otherwise */
  public boolean isSetAgentStartTime() {
    return EncodingUtils.testBit(__isset_bitfield, __AGENTSTARTTIME_ISSET_ID);
  }

  public void setAgentStartTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AGENTSTARTTIME_ISSET_ID, value);
  }

  public int getSqlId() {
    return this.sqlId;
  }

  public void setSqlId(int sqlId) {
    this.sqlId = sqlId;
    setSqlIdIsSet(true);
  }

  public void unsetSqlId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SQLID_ISSET_ID);
  }

  /** Returns true if field sqlId is set (has been assigned a value) and false otherwise */
  public boolean isSetSqlId() {
    return EncodingUtils.testBit(__isset_bitfield, __SQLID_ISSET_ID);
  }

  public void setSqlIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SQLID_ISSET_ID, value);
  }

  public String getSql() {
    return this.sql;
  }

  public void setSql(String sql) {
    this.sql = sql;
  }

  public void unsetSql() {
    this.sql = null;
  }

  /** Returns true if field sql is set (has been assigned a value) and false otherwise */
  public boolean isSetSql() {
    return this.sql != null;
  }

  public void setSqlIsSet(boolean value) {
    if (!value) {
      this.sql = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case AGENT_ID:
      if (value == null) {
        unsetAgentId();
      } else {
        setAgentId((String)value);
      }
      break;

    case AGENT_START_TIME:
      if (value == null) {
        unsetAgentStartTime();
      } else {
        setAgentStartTime((Long)value);
      }
      break;

    case SQL_ID:
      if (value == null) {
        unsetSqlId();
      } else {
        setSqlId((Integer)value);
      }
      break;

    case SQL:
      if (value == null) {
        unsetSql();
      } else {
        setSql((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case AGENT_ID:
      return getAgentId();

    case AGENT_START_TIME:
      return Long.valueOf(getAgentStartTime());

    case SQL_ID:
      return Integer.valueOf(getSqlId());

    case SQL:
      return getSql();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case AGENT_ID:
      return isSetAgentId();
    case AGENT_START_TIME:
      return isSetAgentStartTime();
    case SQL_ID:
      return isSetSqlId();
    case SQL:
      return isSetSql();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TSqlMetaData)
      return this.equals((TSqlMetaData)that);
    return false;
  }

  public boolean equals(TSqlMetaData that) {
    if (that == null)
      return false;

    boolean this_present_agentId = true && this.isSetAgentId();
    boolean that_present_agentId = true && that.isSetAgentId();
    if (this_present_agentId || that_present_agentId) {
      if (!(this_present_agentId && that_present_agentId))
        return false;
      if (!this.agentId.equals(that.agentId))
        return false;
    }

    boolean this_present_agentStartTime = true;
    boolean that_present_agentStartTime = true;
    if (this_present_agentStartTime || that_present_agentStartTime) {
      if (!(this_present_agentStartTime && that_present_agentStartTime))
        return false;
      if (this.agentStartTime != that.agentStartTime)
        return false;
    }

    boolean this_present_sqlId = true;
    boolean that_present_sqlId = true;
    if (this_present_sqlId || that_present_sqlId) {
      if (!(this_present_sqlId && that_present_sqlId))
        return false;
      if (this.sqlId != that.sqlId)
        return false;
    }

    boolean this_present_sql = true && this.isSetSql();
    boolean that_present_sql = true && that.isSetSql();
    if (this_present_sql || that_present_sql) {
      if (!(this_present_sql && that_present_sql))
        return false;
      if (!this.sql.equals(that.sql))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_agentId = true && (isSetAgentId());
    list.add(present_agentId);
    if (present_agentId)
      list.add(agentId);

    boolean present_agentStartTime = true;
    list.add(present_agentStartTime);
    if (present_agentStartTime)
      list.add(agentStartTime);

    boolean present_sqlId = true;
    list.add(present_sqlId);
    if (present_sqlId)
      list.add(sqlId);

    boolean present_sql = true && (isSetSql());
    list.add(present_sql);
    if (present_sql)
      list.add(sql);

    return list.hashCode();
  }

  @Override
  public int compareTo(TSqlMetaData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAgentId()).compareTo(other.isSetAgentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAgentId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.agentId, other.agentId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAgentStartTime()).compareTo(other.isSetAgentStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAgentStartTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.agentStartTime, other.agentStartTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSqlId()).compareTo(other.isSetSqlId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSqlId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sqlId, other.sqlId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSql()).compareTo(other.isSetSql());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSql()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sql, other.sql);
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
    StringBuilder sb = new StringBuilder("TSqlMetaData(");
    boolean first = true;

    sb.append("agentId:");
    if (this.agentId == null) {
      sb.append("null");
    } else {
      sb.append(this.agentId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("agentStartTime:");
    sb.append(this.agentStartTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sqlId:");
    sb.append(this.sqlId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sql:");
    if (this.sql == null) {
      sb.append("null");
    } else {
      sb.append(this.sql);
    }
    first = false;
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TSqlMetaDataStandardSchemeFactory implements SchemeFactory {
    public TSqlMetaDataStandardScheme getScheme() {
      return new TSqlMetaDataStandardScheme();
    }
  }

  private static class TSqlMetaDataStandardScheme extends StandardScheme<TSqlMetaData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSqlMetaData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AGENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.agentId = iprot.readString();
              struct.setAgentIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AGENT_START_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.agentStartTime = iprot.readI64();
              struct.setAgentStartTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SQL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sqlId = iprot.readI32();
              struct.setSqlIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SQL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sql = iprot.readString();
              struct.setSqlIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSqlMetaData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.agentId != null) {
        oprot.writeFieldBegin(AGENT_ID_FIELD_DESC);
        oprot.writeString(struct.agentId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(AGENT_START_TIME_FIELD_DESC);
      oprot.writeI64(struct.agentStartTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SQL_ID_FIELD_DESC);
      oprot.writeI32(struct.sqlId);
      oprot.writeFieldEnd();
      if (struct.sql != null) {
        oprot.writeFieldBegin(SQL_FIELD_DESC);
        oprot.writeString(struct.sql);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSqlMetaDataTupleSchemeFactory implements SchemeFactory {
    public TSqlMetaDataTupleScheme getScheme() {
      return new TSqlMetaDataTupleScheme();
    }
  }

  private static class TSqlMetaDataTupleScheme extends TupleScheme<TSqlMetaData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSqlMetaData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAgentId()) {
        optionals.set(0);
      }
      if (struct.isSetAgentStartTime()) {
        optionals.set(1);
      }
      if (struct.isSetSqlId()) {
        optionals.set(2);
      }
      if (struct.isSetSql()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetAgentId()) {
        oprot.writeString(struct.agentId);
      }
      if (struct.isSetAgentStartTime()) {
        oprot.writeI64(struct.agentStartTime);
      }
      if (struct.isSetSqlId()) {
        oprot.writeI32(struct.sqlId);
      }
      if (struct.isSetSql()) {
        oprot.writeString(struct.sql);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSqlMetaData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.agentId = iprot.readString();
        struct.setAgentIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.agentStartTime = iprot.readI64();
        struct.setAgentStartTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.sqlId = iprot.readI32();
        struct.setSqlIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.sql = iprot.readString();
        struct.setSqlIsSet(true);
      }
    }
  }

}

