// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WeWrite.proto

package com.melon.wewrite;

public final class WeWriteProtos {
  private WeWriteProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ActionOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string message = 1;
    /**
     * <code>required string message = 1;</code>
     */
    boolean hasMessage();
    /**
     * <code>required string message = 1;</code>
     */
    java.lang.String getMessage();
    /**
     * <code>required string message = 1;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();

    // required bool addDelete = 2;
    /**
     * <code>required bool addDelete = 2;</code>
     */
    boolean hasAddDelete();
    /**
     * <code>required bool addDelete = 2;</code>
     */
    boolean getAddDelete();

    // required int32 cursorPosition = 3;
    /**
     * <code>required int32 cursorPosition = 3;</code>
     */
    boolean hasCursorPosition();
    /**
     * <code>required int32 cursorPosition = 3;</code>
     */
    int getCursorPosition();

    // required string uuid = 4;
    /**
     * <code>required string uuid = 4;</code>
     */
    boolean hasUuid();
    /**
     * <code>required string uuid = 4;</code>
     */
    java.lang.String getUuid();
    /**
     * <code>required string uuid = 4;</code>
     */
    com.google.protobuf.ByteString
        getUuidBytes();
  }
  /**
   * Protobuf type {@code wewrite.Action}
   */
  public static final class Action extends
      com.google.protobuf.GeneratedMessage
      implements ActionOrBuilder {
    // Use Action.newBuilder() to construct.
    private Action(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Action(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Action defaultInstance;
    public static Action getDefaultInstance() {
      return defaultInstance;
    }

    public Action getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Action(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      @SuppressWarnings("unused")
	int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              message_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              addDelete_ = input.readBool();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              cursorPosition_ = input.readInt32();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              uuid_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.melon.wewrite.WeWriteProtos.internal_static_wewrite_Action_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.melon.wewrite.WeWriteProtos.internal_static_wewrite_Action_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.melon.wewrite.WeWriteProtos.Action.class, com.melon.wewrite.WeWriteProtos.Action.Builder.class);
    }

    public static com.google.protobuf.Parser<Action> PARSER =
        new com.google.protobuf.AbstractParser<Action>() {
      public Action parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Action(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Action> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string message = 1;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private java.lang.Object message_;
    /**
     * <code>required string message = 1;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string message = 1;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required bool addDelete = 2;
    public static final int ADDDELETE_FIELD_NUMBER = 2;
    private boolean addDelete_;
    /**
     * <code>required bool addDelete = 2;</code>
     */
    public boolean hasAddDelete() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required bool addDelete = 2;</code>
     */
    public boolean getAddDelete() {
      return addDelete_;
    }

    // required int32 cursorPosition = 3;
    public static final int CURSORPOSITION_FIELD_NUMBER = 3;
    private int cursorPosition_;
    /**
     * <code>required int32 cursorPosition = 3;</code>
     */
    public boolean hasCursorPosition() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 cursorPosition = 3;</code>
     */
    public int getCursorPosition() {
      return cursorPosition_;
    }

    // required string uuid = 4;
    public static final int UUID_FIELD_NUMBER = 4;
    private java.lang.Object uuid_;
    /**
     * <code>required string uuid = 4;</code>
     */
    public boolean hasUuid() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string uuid = 4;</code>
     */
    public java.lang.String getUuid() {
      java.lang.Object ref = uuid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          uuid_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string uuid = 4;</code>
     */
    public com.google.protobuf.ByteString
        getUuidBytes() {
      java.lang.Object ref = uuid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      message_ = "";
      addDelete_ = false;
      cursorPosition_ = 0;
      uuid_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasMessage()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAddDelete()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCursorPosition()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUuid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getMessageBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, addDelete_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, cursorPosition_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getUuidBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getMessageBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, addDelete_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, cursorPosition_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getUuidBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.melon.wewrite.WeWriteProtos.Action parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.melon.wewrite.WeWriteProtos.Action parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.melon.wewrite.WeWriteProtos.Action parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.melon.wewrite.WeWriteProtos.Action parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.melon.wewrite.WeWriteProtos.Action parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.melon.wewrite.WeWriteProtos.Action parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.melon.wewrite.WeWriteProtos.Action parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.melon.wewrite.WeWriteProtos.Action parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.melon.wewrite.WeWriteProtos.Action parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.melon.wewrite.WeWriteProtos.Action parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.melon.wewrite.WeWriteProtos.Action prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code wewrite.Action}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.melon.wewrite.WeWriteProtos.ActionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.melon.wewrite.WeWriteProtos.internal_static_wewrite_Action_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.melon.wewrite.WeWriteProtos.internal_static_wewrite_Action_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.melon.wewrite.WeWriteProtos.Action.class, com.melon.wewrite.WeWriteProtos.Action.Builder.class);
      }

      // Construct using com.melon.wewrite.WeWriteProtos.Action.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        addDelete_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        cursorPosition_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        uuid_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.melon.wewrite.WeWriteProtos.internal_static_wewrite_Action_descriptor;
      }

      public com.melon.wewrite.WeWriteProtos.Action getDefaultInstanceForType() {
        return com.melon.wewrite.WeWriteProtos.Action.getDefaultInstance();
      }

      public com.melon.wewrite.WeWriteProtos.Action build() {
        com.melon.wewrite.WeWriteProtos.Action result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.melon.wewrite.WeWriteProtos.Action buildPartial() {
        com.melon.wewrite.WeWriteProtos.Action result = new com.melon.wewrite.WeWriteProtos.Action(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.message_ = message_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.addDelete_ = addDelete_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.cursorPosition_ = cursorPosition_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.uuid_ = uuid_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.melon.wewrite.WeWriteProtos.Action) {
          return mergeFrom((com.melon.wewrite.WeWriteProtos.Action)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.melon.wewrite.WeWriteProtos.Action other) {
        if (other == com.melon.wewrite.WeWriteProtos.Action.getDefaultInstance()) return this;
        if (other.hasMessage()) {
          bitField0_ |= 0x00000001;
          message_ = other.message_;
          onChanged();
        }
        if (other.hasAddDelete()) {
          setAddDelete(other.getAddDelete());
        }
        if (other.hasCursorPosition()) {
          setCursorPosition(other.getCursorPosition());
        }
        if (other.hasUuid()) {
          bitField0_ |= 0x00000008;
          uuid_ = other.uuid_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasMessage()) {
          
          return false;
        }
        if (!hasAddDelete()) {
          
          return false;
        }
        if (!hasCursorPosition()) {
          
          return false;
        }
        if (!hasUuid()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.melon.wewrite.WeWriteProtos.Action parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.melon.wewrite.WeWriteProtos.Action) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string message = 1;
      private java.lang.Object message_ = "";
      /**
       * <code>required string message = 1;</code>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string message = 1;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string message = 1;</code>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string message = 1;</code>
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string message = 1;</code>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000001);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>required string message = 1;</code>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        message_ = value;
        onChanged();
        return this;
      }

      // required bool addDelete = 2;
      private boolean addDelete_ ;
      /**
       * <code>required bool addDelete = 2;</code>
       */
      public boolean hasAddDelete() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required bool addDelete = 2;</code>
       */
      public boolean getAddDelete() {
        return addDelete_;
      }
      /**
       * <code>required bool addDelete = 2;</code>
       */
      public Builder setAddDelete(boolean value) {
        bitField0_ |= 0x00000002;
        addDelete_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool addDelete = 2;</code>
       */
      public Builder clearAddDelete() {
        bitField0_ = (bitField0_ & ~0x00000002);
        addDelete_ = false;
        onChanged();
        return this;
      }

      // required int32 cursorPosition = 3;
      private int cursorPosition_ ;
      /**
       * <code>required int32 cursorPosition = 3;</code>
       */
      public boolean hasCursorPosition() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 cursorPosition = 3;</code>
       */
      public int getCursorPosition() {
        return cursorPosition_;
      }
      /**
       * <code>required int32 cursorPosition = 3;</code>
       */
      public Builder setCursorPosition(int value) {
        bitField0_ |= 0x00000004;
        cursorPosition_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 cursorPosition = 3;</code>
       */
      public Builder clearCursorPosition() {
        bitField0_ = (bitField0_ & ~0x00000004);
        cursorPosition_ = 0;
        onChanged();
        return this;
      }

      // required string uuid = 4;
      private java.lang.Object uuid_ = "";
      /**
       * <code>required string uuid = 4;</code>
       */
      public boolean hasUuid() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string uuid = 4;</code>
       */
      public java.lang.String getUuid() {
        java.lang.Object ref = uuid_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          uuid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string uuid = 4;</code>
       */
      public com.google.protobuf.ByteString
          getUuidBytes() {
        java.lang.Object ref = uuid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          uuid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string uuid = 4;</code>
       */
      public Builder setUuid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        uuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string uuid = 4;</code>
       */
      public Builder clearUuid() {
        bitField0_ = (bitField0_ & ~0x00000008);
        uuid_ = getDefaultInstance().getUuid();
        onChanged();
        return this;
      }
      /**
       * <code>required string uuid = 4;</code>
       */
      public Builder setUuidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        uuid_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:wewrite.Action)
    }

    static {
      defaultInstance = new Action(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:wewrite.Action)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_wewrite_Action_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_wewrite_Action_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rWeWrite.proto\022\007wewrite\"R\n\006Action\022\017\n\007me" +
      "ssage\030\001 \002(\t\022\021\n\taddDelete\030\002 \002(\010\022\026\n\016cursor" +
      "Position\030\003 \002(\005\022\014\n\004uuid\030\004 \002(\tB\"\n\021com.melo" +
      "n.wewriteB\rWeWriteProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_wewrite_Action_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_wewrite_Action_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_wewrite_Action_descriptor,
              new java.lang.String[] { "Message", "AddDelete", "CursorPosition", "Uuid", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
