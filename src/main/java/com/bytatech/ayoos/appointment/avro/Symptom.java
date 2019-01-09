/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.bytatech.ayoos.appointment.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Symptom extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4000901315535152165L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Symptom\",\"namespace\":\"com.bytatech.ayoos.appointment.avro\",\"fields\":[{\"name\":\"ref\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"numberOfDaysSuffering\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Symptom> ENCODER =
      new BinaryMessageEncoder<Symptom>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Symptom> DECODER =
      new BinaryMessageDecoder<Symptom>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Symptom> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Symptom> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Symptom>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Symptom to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Symptom from a ByteBuffer. */
  public static Symptom fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String ref;
  @Deprecated public int numberOfDaysSuffering;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Symptom() {}

  /**
   * All-args constructor.
   * @param ref The new value for ref
   * @param numberOfDaysSuffering The new value for numberOfDaysSuffering
   */
  public Symptom(java.lang.String ref, java.lang.Integer numberOfDaysSuffering) {
    this.ref = ref;
    this.numberOfDaysSuffering = numberOfDaysSuffering;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ref;
    case 1: return numberOfDaysSuffering;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ref = (java.lang.String)value$; break;
    case 1: numberOfDaysSuffering = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'ref' field.
   * @return The value of the 'ref' field.
   */
  public java.lang.String getRef() {
    return ref;
  }

  /**
   * Sets the value of the 'ref' field.
   * @param value the value to set.
   */
  public void setRef(java.lang.String value) {
    this.ref = value;
  }

  /**
   * Gets the value of the 'numberOfDaysSuffering' field.
   * @return The value of the 'numberOfDaysSuffering' field.
   */
  public java.lang.Integer getNumberOfDaysSuffering() {
    return numberOfDaysSuffering;
  }

  /**
   * Sets the value of the 'numberOfDaysSuffering' field.
   * @param value the value to set.
   */
  public void setNumberOfDaysSuffering(java.lang.Integer value) {
    this.numberOfDaysSuffering = value;
  }

  /**
   * Creates a new Symptom RecordBuilder.
   * @return A new Symptom RecordBuilder
   */
  public static com.bytatech.ayoos.appointment.avro.Symptom.Builder newBuilder() {
    return new com.bytatech.ayoos.appointment.avro.Symptom.Builder();
  }

  /**
   * Creates a new Symptom RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Symptom RecordBuilder
   */
  public static com.bytatech.ayoos.appointment.avro.Symptom.Builder newBuilder(com.bytatech.ayoos.appointment.avro.Symptom.Builder other) {
    return new com.bytatech.ayoos.appointment.avro.Symptom.Builder(other);
  }

  /**
   * Creates a new Symptom RecordBuilder by copying an existing Symptom instance.
   * @param other The existing instance to copy.
   * @return A new Symptom RecordBuilder
   */
  public static com.bytatech.ayoos.appointment.avro.Symptom.Builder newBuilder(com.bytatech.ayoos.appointment.avro.Symptom other) {
    return new com.bytatech.ayoos.appointment.avro.Symptom.Builder(other);
  }

  /**
   * RecordBuilder for Symptom instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Symptom>
    implements org.apache.avro.data.RecordBuilder<Symptom> {

    private java.lang.String ref;
    private int numberOfDaysSuffering;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.bytatech.ayoos.appointment.avro.Symptom.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ref)) {
        this.ref = data().deepCopy(fields()[0].schema(), other.ref);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.numberOfDaysSuffering)) {
        this.numberOfDaysSuffering = data().deepCopy(fields()[1].schema(), other.numberOfDaysSuffering);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Symptom instance
     * @param other The existing instance to copy.
     */
    private Builder(com.bytatech.ayoos.appointment.avro.Symptom other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.ref)) {
        this.ref = data().deepCopy(fields()[0].schema(), other.ref);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.numberOfDaysSuffering)) {
        this.numberOfDaysSuffering = data().deepCopy(fields()[1].schema(), other.numberOfDaysSuffering);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'ref' field.
      * @return The value.
      */
    public java.lang.String getRef() {
      return ref;
    }

    /**
      * Sets the value of the 'ref' field.
      * @param value The value of 'ref'.
      * @return This builder.
      */
    public com.bytatech.ayoos.appointment.avro.Symptom.Builder setRef(java.lang.String value) {
      validate(fields()[0], value);
      this.ref = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'ref' field has been set.
      * @return True if the 'ref' field has been set, false otherwise.
      */
    public boolean hasRef() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'ref' field.
      * @return This builder.
      */
    public com.bytatech.ayoos.appointment.avro.Symptom.Builder clearRef() {
      ref = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'numberOfDaysSuffering' field.
      * @return The value.
      */
    public java.lang.Integer getNumberOfDaysSuffering() {
      return numberOfDaysSuffering;
    }

    /**
      * Sets the value of the 'numberOfDaysSuffering' field.
      * @param value The value of 'numberOfDaysSuffering'.
      * @return This builder.
      */
    public com.bytatech.ayoos.appointment.avro.Symptom.Builder setNumberOfDaysSuffering(int value) {
      validate(fields()[1], value);
      this.numberOfDaysSuffering = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'numberOfDaysSuffering' field has been set.
      * @return True if the 'numberOfDaysSuffering' field has been set, false otherwise.
      */
    public boolean hasNumberOfDaysSuffering() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'numberOfDaysSuffering' field.
      * @return This builder.
      */
    public com.bytatech.ayoos.appointment.avro.Symptom.Builder clearNumberOfDaysSuffering() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Symptom build() {
      try {
        Symptom record = new Symptom();
        record.ref = fieldSetFlags()[0] ? this.ref : (java.lang.String) defaultValue(fields()[0]);
        record.numberOfDaysSuffering = fieldSetFlags()[1] ? this.numberOfDaysSuffering : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Symptom>
    WRITER$ = (org.apache.avro.io.DatumWriter<Symptom>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Symptom>
    READER$ = (org.apache.avro.io.DatumReader<Symptom>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
