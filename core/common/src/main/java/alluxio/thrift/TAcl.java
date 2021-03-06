/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package alluxio.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class TAcl implements org.apache.thrift.TBase<TAcl, TAcl._Fields>, java.io.Serializable, Cloneable, Comparable<TAcl> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAcl");

  private static final org.apache.thrift.protocol.TField OWNER_FIELD_DESC = new org.apache.thrift.protocol.TField("owner", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField OWNING_GROUP_FIELD_DESC = new org.apache.thrift.protocol.TField("owningGroup", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ENTRIES_FIELD_DESC = new org.apache.thrift.protocol.TField("entries", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TAclStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TAclTupleSchemeFactory());
  }

  private String owner; // optional
  private String owningGroup; // optional
  private List<TAclEntry> entries; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OWNER((short)1, "owner"),
    OWNING_GROUP((short)2, "owningGroup"),
    ENTRIES((short)3, "entries");

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
        case 1: // OWNER
          return OWNER;
        case 2: // OWNING_GROUP
          return OWNING_GROUP;
        case 3: // ENTRIES
          return ENTRIES;
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
  private static final _Fields optionals[] = {_Fields.OWNER,_Fields.OWNING_GROUP,_Fields.ENTRIES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OWNER, new org.apache.thrift.meta_data.FieldMetaData("owner", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OWNING_GROUP, new org.apache.thrift.meta_data.FieldMetaData("owningGroup", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ENTRIES, new org.apache.thrift.meta_data.FieldMetaData("entries", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TAclEntry.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAcl.class, metaDataMap);
  }

  public TAcl() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAcl(TAcl other) {
    if (other.isSetOwner()) {
      this.owner = other.owner;
    }
    if (other.isSetOwningGroup()) {
      this.owningGroup = other.owningGroup;
    }
    if (other.isSetEntries()) {
      List<TAclEntry> __this__entries = new ArrayList<TAclEntry>(other.entries.size());
      for (TAclEntry other_element : other.entries) {
        __this__entries.add(new TAclEntry(other_element));
      }
      this.entries = __this__entries;
    }
  }

  public TAcl deepCopy() {
    return new TAcl(this);
  }

  @Override
  public void clear() {
    this.owner = null;
    this.owningGroup = null;
    this.entries = null;
  }

  public String getOwner() {
    return this.owner;
  }

  public TAcl setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public void unsetOwner() {
    this.owner = null;
  }

  /** Returns true if field owner is set (has been assigned a value) and false otherwise */
  public boolean isSetOwner() {
    return this.owner != null;
  }

  public void setOwnerIsSet(boolean value) {
    if (!value) {
      this.owner = null;
    }
  }

  public String getOwningGroup() {
    return this.owningGroup;
  }

  public TAcl setOwningGroup(String owningGroup) {
    this.owningGroup = owningGroup;
    return this;
  }

  public void unsetOwningGroup() {
    this.owningGroup = null;
  }

  /** Returns true if field owningGroup is set (has been assigned a value) and false otherwise */
  public boolean isSetOwningGroup() {
    return this.owningGroup != null;
  }

  public void setOwningGroupIsSet(boolean value) {
    if (!value) {
      this.owningGroup = null;
    }
  }

  public int getEntriesSize() {
    return (this.entries == null) ? 0 : this.entries.size();
  }

  public java.util.Iterator<TAclEntry> getEntriesIterator() {
    return (this.entries == null) ? null : this.entries.iterator();
  }

  public void addToEntries(TAclEntry elem) {
    if (this.entries == null) {
      this.entries = new ArrayList<TAclEntry>();
    }
    this.entries.add(elem);
  }

  public List<TAclEntry> getEntries() {
    return this.entries;
  }

  public TAcl setEntries(List<TAclEntry> entries) {
    this.entries = entries;
    return this;
  }

  public void unsetEntries() {
    this.entries = null;
  }

  /** Returns true if field entries is set (has been assigned a value) and false otherwise */
  public boolean isSetEntries() {
    return this.entries != null;
  }

  public void setEntriesIsSet(boolean value) {
    if (!value) {
      this.entries = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OWNER:
      if (value == null) {
        unsetOwner();
      } else {
        setOwner((String)value);
      }
      break;

    case OWNING_GROUP:
      if (value == null) {
        unsetOwningGroup();
      } else {
        setOwningGroup((String)value);
      }
      break;

    case ENTRIES:
      if (value == null) {
        unsetEntries();
      } else {
        setEntries((List<TAclEntry>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OWNER:
      return getOwner();

    case OWNING_GROUP:
      return getOwningGroup();

    case ENTRIES:
      return getEntries();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OWNER:
      return isSetOwner();
    case OWNING_GROUP:
      return isSetOwningGroup();
    case ENTRIES:
      return isSetEntries();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TAcl)
      return this.equals((TAcl)that);
    return false;
  }

  public boolean equals(TAcl that) {
    if (that == null)
      return false;

    boolean this_present_owner = true && this.isSetOwner();
    boolean that_present_owner = true && that.isSetOwner();
    if (this_present_owner || that_present_owner) {
      if (!(this_present_owner && that_present_owner))
        return false;
      if (!this.owner.equals(that.owner))
        return false;
    }

    boolean this_present_owningGroup = true && this.isSetOwningGroup();
    boolean that_present_owningGroup = true && that.isSetOwningGroup();
    if (this_present_owningGroup || that_present_owningGroup) {
      if (!(this_present_owningGroup && that_present_owningGroup))
        return false;
      if (!this.owningGroup.equals(that.owningGroup))
        return false;
    }

    boolean this_present_entries = true && this.isSetEntries();
    boolean that_present_entries = true && that.isSetEntries();
    if (this_present_entries || that_present_entries) {
      if (!(this_present_entries && that_present_entries))
        return false;
      if (!this.entries.equals(that.entries))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_owner = true && (isSetOwner());
    list.add(present_owner);
    if (present_owner)
      list.add(owner);

    boolean present_owningGroup = true && (isSetOwningGroup());
    list.add(present_owningGroup);
    if (present_owningGroup)
      list.add(owningGroup);

    boolean present_entries = true && (isSetEntries());
    list.add(present_entries);
    if (present_entries)
      list.add(entries);

    return list.hashCode();
  }

  @Override
  public int compareTo(TAcl other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOwner()).compareTo(other.isSetOwner());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOwner()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.owner, other.owner);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOwningGroup()).compareTo(other.isSetOwningGroup());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOwningGroup()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.owningGroup, other.owningGroup);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEntries()).compareTo(other.isSetEntries());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntries()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entries, other.entries);
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
    StringBuilder sb = new StringBuilder("TAcl(");
    boolean first = true;

    if (isSetOwner()) {
      sb.append("owner:");
      if (this.owner == null) {
        sb.append("null");
      } else {
        sb.append(this.owner);
      }
      first = false;
    }
    if (isSetOwningGroup()) {
      if (!first) sb.append(", ");
      sb.append("owningGroup:");
      if (this.owningGroup == null) {
        sb.append("null");
      } else {
        sb.append(this.owningGroup);
      }
      first = false;
    }
    if (isSetEntries()) {
      if (!first) sb.append(", ");
      sb.append("entries:");
      if (this.entries == null) {
        sb.append("null");
      } else {
        sb.append(this.entries);
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

  private static class TAclStandardSchemeFactory implements SchemeFactory {
    public TAclStandardScheme getScheme() {
      return new TAclStandardScheme();
    }
  }

  private static class TAclStandardScheme extends StandardScheme<TAcl> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAcl struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OWNER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.owner = iprot.readString();
              struct.setOwnerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OWNING_GROUP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.owningGroup = iprot.readString();
              struct.setOwningGroupIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ENTRIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.entries = new ArrayList<TAclEntry>(_list24.size);
                TAclEntry _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = new TAclEntry();
                  _elem25.read(iprot);
                  struct.entries.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setEntriesIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAcl struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.owner != null) {
        if (struct.isSetOwner()) {
          oprot.writeFieldBegin(OWNER_FIELD_DESC);
          oprot.writeString(struct.owner);
          oprot.writeFieldEnd();
        }
      }
      if (struct.owningGroup != null) {
        if (struct.isSetOwningGroup()) {
          oprot.writeFieldBegin(OWNING_GROUP_FIELD_DESC);
          oprot.writeString(struct.owningGroup);
          oprot.writeFieldEnd();
        }
      }
      if (struct.entries != null) {
        if (struct.isSetEntries()) {
          oprot.writeFieldBegin(ENTRIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.entries.size()));
            for (TAclEntry _iter27 : struct.entries)
            {
              _iter27.write(oprot);
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

  private static class TAclTupleSchemeFactory implements SchemeFactory {
    public TAclTupleScheme getScheme() {
      return new TAclTupleScheme();
    }
  }

  private static class TAclTupleScheme extends TupleScheme<TAcl> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAcl struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOwner()) {
        optionals.set(0);
      }
      if (struct.isSetOwningGroup()) {
        optionals.set(1);
      }
      if (struct.isSetEntries()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetOwner()) {
        oprot.writeString(struct.owner);
      }
      if (struct.isSetOwningGroup()) {
        oprot.writeString(struct.owningGroup);
      }
      if (struct.isSetEntries()) {
        {
          oprot.writeI32(struct.entries.size());
          for (TAclEntry _iter28 : struct.entries)
          {
            _iter28.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAcl struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.owner = iprot.readString();
        struct.setOwnerIsSet(true);
      }
      if (incoming.get(1)) {
        struct.owningGroup = iprot.readString();
        struct.setOwningGroupIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.entries = new ArrayList<TAclEntry>(_list29.size);
          TAclEntry _elem30;
          for (int _i31 = 0; _i31 < _list29.size; ++_i31)
          {
            _elem30 = new TAclEntry();
            _elem30.read(iprot);
            struct.entries.add(_elem30);
          }
        }
        struct.setEntriesIsSet(true);
      }
    }
  }

}

