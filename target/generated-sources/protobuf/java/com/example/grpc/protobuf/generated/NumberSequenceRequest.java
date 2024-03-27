// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NumberSequence.proto

package com.example.grpc.protobuf.generated;

/**
 * Protobuf type {@code com.example.grpc.protobuf.generated.NumberSequenceRequest}
 */
public  final class NumberSequenceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpc.protobuf.generated.NumberSequenceRequest)
    NumberSequenceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NumberSequenceRequest.newBuilder() to construct.
  private NumberSequenceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NumberSequenceRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NumberSequenceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NumberSequenceRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            firstValue_ = input.readInt32();
            break;
          }
          case 16: {

            lastValue_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.protobuf.generated.NumberSequenceStreamingProto.internal_static_com_example_grpc_protobuf_generated_NumberSequenceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.protobuf.generated.NumberSequenceStreamingProto.internal_static_com_example_grpc_protobuf_generated_NumberSequenceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.protobuf.generated.NumberSequenceRequest.class, com.example.grpc.protobuf.generated.NumberSequenceRequest.Builder.class);
  }

  public static final int FIRSTVALUE_FIELD_NUMBER = 1;
  private int firstValue_;
  /**
   * <code>int32 firstValue = 1;</code>
   */
  public int getFirstValue() {
    return firstValue_;
  }

  public static final int LASTVALUE_FIELD_NUMBER = 2;
  private int lastValue_;
  /**
   * <code>int32 lastValue = 2;</code>
   */
  public int getLastValue() {
    return lastValue_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (firstValue_ != 0) {
      output.writeInt32(1, firstValue_);
    }
    if (lastValue_ != 0) {
      output.writeInt32(2, lastValue_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (firstValue_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, firstValue_);
    }
    if (lastValue_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, lastValue_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.grpc.protobuf.generated.NumberSequenceRequest)) {
      return super.equals(obj);
    }
    com.example.grpc.protobuf.generated.NumberSequenceRequest other = (com.example.grpc.protobuf.generated.NumberSequenceRequest) obj;

    if (getFirstValue()
        != other.getFirstValue()) return false;
    if (getLastValue()
        != other.getLastValue()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FIRSTVALUE_FIELD_NUMBER;
    hash = (53 * hash) + getFirstValue();
    hash = (37 * hash) + LASTVALUE_FIELD_NUMBER;
    hash = (53 * hash) + getLastValue();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.protobuf.generated.NumberSequenceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.protobuf.generated.NumberSequenceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.protobuf.generated.NumberSequenceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.protobuf.generated.NumberSequenceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.protobuf.generated.NumberSequenceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.protobuf.generated.NumberSequenceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.protobuf.generated.NumberSequenceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.protobuf.generated.NumberSequenceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.protobuf.generated.NumberSequenceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.protobuf.generated.NumberSequenceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.protobuf.generated.NumberSequenceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.protobuf.generated.NumberSequenceRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.grpc.protobuf.generated.NumberSequenceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.example.grpc.protobuf.generated.NumberSequenceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpc.protobuf.generated.NumberSequenceRequest)
      com.example.grpc.protobuf.generated.NumberSequenceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.protobuf.generated.NumberSequenceStreamingProto.internal_static_com_example_grpc_protobuf_generated_NumberSequenceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.protobuf.generated.NumberSequenceStreamingProto.internal_static_com_example_grpc_protobuf_generated_NumberSequenceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.protobuf.generated.NumberSequenceRequest.class, com.example.grpc.protobuf.generated.NumberSequenceRequest.Builder.class);
    }

    // Construct using com.example.grpc.protobuf.generated.NumberSequenceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      firstValue_ = 0;

      lastValue_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.protobuf.generated.NumberSequenceStreamingProto.internal_static_com_example_grpc_protobuf_generated_NumberSequenceRequest_descriptor;
    }

    @java.lang.Override
    public com.example.grpc.protobuf.generated.NumberSequenceRequest getDefaultInstanceForType() {
      return com.example.grpc.protobuf.generated.NumberSequenceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.grpc.protobuf.generated.NumberSequenceRequest build() {
      com.example.grpc.protobuf.generated.NumberSequenceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.grpc.protobuf.generated.NumberSequenceRequest buildPartial() {
      com.example.grpc.protobuf.generated.NumberSequenceRequest result = new com.example.grpc.protobuf.generated.NumberSequenceRequest(this);
      result.firstValue_ = firstValue_;
      result.lastValue_ = lastValue_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.grpc.protobuf.generated.NumberSequenceRequest) {
        return mergeFrom((com.example.grpc.protobuf.generated.NumberSequenceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.protobuf.generated.NumberSequenceRequest other) {
      if (other == com.example.grpc.protobuf.generated.NumberSequenceRequest.getDefaultInstance()) return this;
      if (other.getFirstValue() != 0) {
        setFirstValue(other.getFirstValue());
      }
      if (other.getLastValue() != 0) {
        setLastValue(other.getLastValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.grpc.protobuf.generated.NumberSequenceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.protobuf.generated.NumberSequenceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int firstValue_ ;
    /**
     * <code>int32 firstValue = 1;</code>
     */
    public int getFirstValue() {
      return firstValue_;
    }
    /**
     * <code>int32 firstValue = 1;</code>
     */
    public Builder setFirstValue(int value) {
      
      firstValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 firstValue = 1;</code>
     */
    public Builder clearFirstValue() {
      
      firstValue_ = 0;
      onChanged();
      return this;
    }

    private int lastValue_ ;
    /**
     * <code>int32 lastValue = 2;</code>
     */
    public int getLastValue() {
      return lastValue_;
    }
    /**
     * <code>int32 lastValue = 2;</code>
     */
    public Builder setLastValue(int value) {
      
      lastValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 lastValue = 2;</code>
     */
    public Builder clearLastValue() {
      
      lastValue_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.grpc.protobuf.generated.NumberSequenceRequest)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpc.protobuf.generated.NumberSequenceRequest)
  private static final com.example.grpc.protobuf.generated.NumberSequenceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.protobuf.generated.NumberSequenceRequest();
  }

  public static com.example.grpc.protobuf.generated.NumberSequenceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NumberSequenceRequest>
      PARSER = new com.google.protobuf.AbstractParser<NumberSequenceRequest>() {
    @java.lang.Override
    public NumberSequenceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NumberSequenceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NumberSequenceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NumberSequenceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.grpc.protobuf.generated.NumberSequenceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

