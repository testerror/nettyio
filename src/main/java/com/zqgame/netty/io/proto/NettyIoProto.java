// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: netty_io_proto.proto

package com.zqgame.netty.io.proto;

public final class NettyIoProto {
	private NettyIoProto() {
	}

	public static void registerAllExtensions(
			com.google.protobuf.ExtensionRegistryLite registry) {
	}

	public static void registerAllExtensions(
			com.google.protobuf.ExtensionRegistry registry) {
		registerAllExtensions(
				(com.google.protobuf.ExtensionRegistryLite) registry);
	}

	public interface TestOrBuilder extends
			// @@protoc_insertion_point(interface_extends:netty_io_proto.Test)
			com.google.protobuf.MessageOrBuilder {

		/**
		 * <code>repeated string value = 1;</code>
		 */
		java.util.List <java.lang.String>
		getValueList();

		/**
		 * <code>repeated string value = 1;</code>
		 */
		int getValueCount();

		/**
		 * <code>repeated string value = 1;</code>
		 */
		java.lang.String getValue(int index);

		/**
		 * <code>repeated string value = 1;</code>
		 */
		com.google.protobuf.ByteString
		getValueBytes(int index);
	}

	/**
	 * Protobuf type {@code netty_io_proto.Test}
	 */
	public static final class Test extends
			com.google.protobuf.GeneratedMessageV3 implements
			// @@protoc_insertion_point(message_implements:netty_io_proto.Test)
			TestOrBuilder {
		private static final long serialVersionUID = 0L;

		// Use Test.newBuilder() to construct.
		private Test(com.google.protobuf.GeneratedMessageV3.Builder <?> builder) {
			super(builder);
		}

		private Test() {
			value_ = com.google.protobuf.LazyStringArrayList.EMPTY;
		}

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet
		getUnknownFields() {
			return this.unknownFields;
		}

		private Test(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			this();
			if (extensionRegistry == null) {
				throw new java.lang.NullPointerException();
			}
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
							if (!parseUnknownFieldProto3(
									input, unknownFields, extensionRegistry, tag)) {
								done = true;
							}
							break;
						}
						case 10: {
							java.lang.String s = input.readStringRequireUtf8();
							if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
								value_ = new com.google.protobuf.LazyStringArrayList();
								mutable_bitField0_ |= 0x00000001;
							}
							value_.add(s);
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
				if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
					value_ = value_.getUnmodifiableView();
				}
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor
		getDescriptor() {
			return com.zqgame.netty.io.proto.NettyIoProto.internal_static_netty_io_proto_Test_descriptor;
		}

		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
		internalGetFieldAccessorTable() {
			return com.zqgame.netty.io.proto.NettyIoProto.internal_static_netty_io_proto_Test_fieldAccessorTable
					.ensureFieldAccessorsInitialized(
							com.zqgame.netty.io.proto.NettyIoProto.Test.class, com.zqgame.netty.io.proto.NettyIoProto.Test.Builder.class);
		}

		public static final int VALUE_FIELD_NUMBER = 1;
		private com.google.protobuf.LazyStringList value_;

		/**
		 * <code>repeated string value = 1;</code>
		 */
		public com.google.protobuf.ProtocolStringList
		getValueList() {
			return value_;
		}

		/**
		 * <code>repeated string value = 1;</code>
		 */
		public int getValueCount() {
			return value_.size();
		}

		/**
		 * <code>repeated string value = 1;</code>
		 */
		public java.lang.String getValue(int index) {
			return value_.get(index);
		}

		/**
		 * <code>repeated string value = 1;</code>
		 */
		public com.google.protobuf.ByteString
		getValueBytes(int index) {
			return value_.getByteString(index);
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized == 1) return true;
			if (isInitialized == 0) return false;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output)
				throws java.io.IOException {
			for (int i = 0; i < value_.size(); i++) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 1, value_.getRaw(i));
			}
			unknownFields.writeTo(output);
		}

		public int getSerializedSize() {
			int size = memoizedSize;
			if (size != -1) return size;

			size = 0;
			{
				int dataSize = 0;
				for (int i = 0; i < value_.size(); i++) {
					dataSize += computeStringSizeNoTag(value_.getRaw(i));
				}
				size += dataSize;
				size += 1 * getValueList().size();
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
			if (!(obj instanceof com.zqgame.netty.io.proto.NettyIoProto.Test)) {
				return super.equals(obj);
			}
			com.zqgame.netty.io.proto.NettyIoProto.Test other = (com.zqgame.netty.io.proto.NettyIoProto.Test) obj;

			boolean result = true;
			result = result && getValueList()
					.equals(other.getValueList());
			result = result && unknownFields.equals(other.unknownFields);
			return result;
		}

		@java.lang.Override
		public int hashCode() {
			if (memoizedHashCode != 0) {
				return memoizedHashCode;
			}
			int hash = 41;
			hash = (19 * hash) + getDescriptor().hashCode();
			if (getValueCount() > 0) {
				hash = (37 * hash) + VALUE_FIELD_NUMBER;
				hash = (53 * hash) + getValueList().hashCode();
			}
			hash = (29 * hash) + unknownFields.hashCode();
			memoizedHashCode = hash;
			return hash;
		}

		public static com.zqgame.netty.io.proto.NettyIoProto.Test parseFrom(
				java.nio.ByteBuffer data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static com.zqgame.netty.io.proto.NettyIoProto.Test parseFrom(
				java.nio.ByteBuffer data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static com.zqgame.netty.io.proto.NettyIoProto.Test parseFrom(
				com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static com.zqgame.netty.io.proto.NettyIoProto.Test parseFrom(
				com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static com.zqgame.netty.io.proto.NettyIoProto.Test parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static com.zqgame.netty.io.proto.NettyIoProto.Test parseFrom(
				byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static com.zqgame.netty.io.proto.NettyIoProto.Test parseFrom(java.io.InputStream input)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
					.parseWithIOException(PARSER, input);
		}

		public static com.zqgame.netty.io.proto.NettyIoProto.Test parseFrom(
				java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
					.parseWithIOException(PARSER, input, extensionRegistry);
		}

		public static com.zqgame.netty.io.proto.NettyIoProto.Test parseDelimitedFrom(java.io.InputStream input)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
					.parseDelimitedWithIOException(PARSER, input);
		}

		public static com.zqgame.netty.io.proto.NettyIoProto.Test parseDelimitedFrom(
				java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
					.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
		}

		public static com.zqgame.netty.io.proto.NettyIoProto.Test parseFrom(
				com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
					.parseWithIOException(PARSER, input);
		}

		public static com.zqgame.netty.io.proto.NettyIoProto.Test parseFrom(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
					.parseWithIOException(PARSER, input, extensionRegistry);
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder() {
			return DEFAULT_INSTANCE.toBuilder();
		}

		public static Builder newBuilder(com.zqgame.netty.io.proto.NettyIoProto.Test prototype) {
			return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
		}

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
		 * Protobuf type {@code netty_io_proto.Test}
		 */
		public static final class Builder extends
				com.google.protobuf.GeneratedMessageV3.Builder <Builder> implements
				// @@protoc_insertion_point(builder_implements:netty_io_proto.Test)
				com.zqgame.netty.io.proto.NettyIoProto.TestOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor
			getDescriptor() {
				return com.zqgame.netty.io.proto.NettyIoProto.internal_static_netty_io_proto_Test_descriptor;
			}

			protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
			internalGetFieldAccessorTable() {
				return com.zqgame.netty.io.proto.NettyIoProto.internal_static_netty_io_proto_Test_fieldAccessorTable
						.ensureFieldAccessorsInitialized(
								com.zqgame.netty.io.proto.NettyIoProto.Test.class, com.zqgame.netty.io.proto.NettyIoProto.Test.Builder.class);
			}

			// Construct using com.zqgame.netty.io.proto.NettyIoProto.Test.newBuilder()
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

			public Builder clear() {
				super.clear();
				value_ = com.google.protobuf.LazyStringArrayList.EMPTY;
				bitField0_ = (bitField0_ & ~0x00000001);
				return this;
			}

			public com.google.protobuf.Descriptors.Descriptor
			getDescriptorForType() {
				return com.zqgame.netty.io.proto.NettyIoProto.internal_static_netty_io_proto_Test_descriptor;
			}

			public com.zqgame.netty.io.proto.NettyIoProto.Test getDefaultInstanceForType() {
				return com.zqgame.netty.io.proto.NettyIoProto.Test.getDefaultInstance();
			}

			public com.zqgame.netty.io.proto.NettyIoProto.Test build() {
				com.zqgame.netty.io.proto.NettyIoProto.Test result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public com.zqgame.netty.io.proto.NettyIoProto.Test buildPartial() {
				com.zqgame.netty.io.proto.NettyIoProto.Test result = new com.zqgame.netty.io.proto.NettyIoProto.Test(this);
				int from_bitField0_ = bitField0_;
				if (((bitField0_ & 0x00000001) == 0x00000001)) {
					value_ = value_.getUnmodifiableView();
					bitField0_ = (bitField0_ & ~0x00000001);
				}
				result.value_ = value_;
				onBuilt();
				return result;
			}

			public Builder clone() {
				return (Builder) super.clone();
			}

			public Builder setField(
					com.google.protobuf.Descriptors.FieldDescriptor field,
					java.lang.Object value) {
				return (Builder) super.setField(field, value);
			}

			public Builder clearField(
					com.google.protobuf.Descriptors.FieldDescriptor field) {
				return (Builder) super.clearField(field);
			}

			public Builder clearOneof(
					com.google.protobuf.Descriptors.OneofDescriptor oneof) {
				return (Builder) super.clearOneof(oneof);
			}

			public Builder setRepeatedField(
					com.google.protobuf.Descriptors.FieldDescriptor field,
					int index, java.lang.Object value) {
				return (Builder) super.setRepeatedField(field, index, value);
			}

			public Builder addRepeatedField(
					com.google.protobuf.Descriptors.FieldDescriptor field,
					java.lang.Object value) {
				return (Builder) super.addRepeatedField(field, value);
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof com.zqgame.netty.io.proto.NettyIoProto.Test) {
					return mergeFrom((com.zqgame.netty.io.proto.NettyIoProto.Test) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(com.zqgame.netty.io.proto.NettyIoProto.Test other) {
				if (other == com.zqgame.netty.io.proto.NettyIoProto.Test.getDefaultInstance()) return this;
				if (!other.value_.isEmpty()) {
					if (value_.isEmpty()) {
						value_ = other.value_;
						bitField0_ = (bitField0_ & ~0x00000001);
					} else {
						ensureValueIsMutable();
						value_.addAll(other.value_);
					}
					onChanged();
				}
				this.mergeUnknownFields(other.unknownFields);
				onChanged();
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(
					com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws java.io.IOException {
				com.zqgame.netty.io.proto.NettyIoProto.Test parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (com.zqgame.netty.io.proto.NettyIoProto.Test) e.getUnfinishedMessage();
					throw e.unwrapIOException();
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			private com.google.protobuf.LazyStringList value_ = com.google.protobuf.LazyStringArrayList.EMPTY;

			private void ensureValueIsMutable() {
				if (!((bitField0_ & 0x00000001) == 0x00000001)) {
					value_ = new com.google.protobuf.LazyStringArrayList(value_);
					bitField0_ |= 0x00000001;
				}
			}

			/**
			 * <code>repeated string value = 1;</code>
			 */
			public com.google.protobuf.ProtocolStringList
			getValueList() {
				return value_.getUnmodifiableView();
			}

			/**
			 * <code>repeated string value = 1;</code>
			 */
			public int getValueCount() {
				return value_.size();
			}

			/**
			 * <code>repeated string value = 1;</code>
			 */
			public java.lang.String getValue(int index) {
				return value_.get(index);
			}

			/**
			 * <code>repeated string value = 1;</code>
			 */
			public com.google.protobuf.ByteString
			getValueBytes(int index) {
				return value_.getByteString(index);
			}

			/**
			 * <code>repeated string value = 1;</code>
			 */
			public Builder setValue(
					int index, java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureValueIsMutable();
				value_.set(index, value);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated string value = 1;</code>
			 */
			public Builder addValue(
					java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureValueIsMutable();
				value_.add(value);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated string value = 1;</code>
			 */
			public Builder addAllValue(
					java.lang.Iterable <java.lang.String> values) {
				ensureValueIsMutable();
				com.google.protobuf.AbstractMessageLite.Builder.addAll(
						values, value_);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated string value = 1;</code>
			 */
			public Builder clearValue() {
				value_ = com.google.protobuf.LazyStringArrayList.EMPTY;
				bitField0_ = (bitField0_ & ~0x00000001);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated string value = 1;</code>
			 */
			public Builder addValueBytes(
					com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);
				ensureValueIsMutable();
				value_.add(value);
				onChanged();
				return this;
			}

			public final Builder setUnknownFields(
					final com.google.protobuf.UnknownFieldSet unknownFields) {
				return super.setUnknownFieldsProto3(unknownFields);
			}

			public final Builder mergeUnknownFields(
					final com.google.protobuf.UnknownFieldSet unknownFields) {
				return super.mergeUnknownFields(unknownFields);
			}


			// @@protoc_insertion_point(builder_scope:netty_io_proto.Test)
		}

		// @@protoc_insertion_point(class_scope:netty_io_proto.Test)
		private static final com.zqgame.netty.io.proto.NettyIoProto.Test DEFAULT_INSTANCE;

		static {
			DEFAULT_INSTANCE = new com.zqgame.netty.io.proto.NettyIoProto.Test();
		}

		public static com.zqgame.netty.io.proto.NettyIoProto.Test getDefaultInstance() {
			return DEFAULT_INSTANCE;
		}

		private static final com.google.protobuf.Parser <Test>
				PARSER = new com.google.protobuf.AbstractParser <Test>() {
			public Test parsePartialFrom(
					com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new Test(input, extensionRegistry);
			}
		};

		public static com.google.protobuf.Parser <Test> parser() {
			return PARSER;
		}

		@java.lang.Override
		public com.google.protobuf.Parser <Test> getParserForType() {
			return PARSER;
		}

		public com.zqgame.netty.io.proto.NettyIoProto.Test getDefaultInstanceForType() {
			return DEFAULT_INSTANCE;
		}

	}

	private static final com.google.protobuf.Descriptors.Descriptor
			internal_static_netty_io_proto_Test_descriptor;
	private static final
	com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
			internal_static_netty_io_proto_Test_fieldAccessorTable;

	public static com.google.protobuf.Descriptors.FileDescriptor
	getDescriptor() {
		return descriptor;
	}

	private static com.google.protobuf.Descriptors.FileDescriptor
			descriptor;

	static {
		java.lang.String[] descriptorData = {
				"\n\024netty_io_proto.proto\022\016netty_io_proto\"\025" +
						"\n\004Test\022\r\n\005value\030\001 \003(\tB\033\n\031com.zqgame.nett" +
						"y.io.protob\006proto3"
		};
		com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
				new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
					public com.google.protobuf.ExtensionRegistry assignDescriptors(
							com.google.protobuf.Descriptors.FileDescriptor root) {
						descriptor = root;
						return null;
					}
				};
		com.google.protobuf.Descriptors.FileDescriptor
				.internalBuildGeneratedFileFrom(descriptorData,
						new com.google.protobuf.Descriptors.FileDescriptor[]{
						}, assigner);
		internal_static_netty_io_proto_Test_descriptor =
				getDescriptor().getMessageTypes().get(0);
		internal_static_netty_io_proto_Test_fieldAccessorTable = new
				com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
				internal_static_netty_io_proto_Test_descriptor,
				new java.lang.String[]{"Value",});
	}

	// @@protoc_insertion_point(outer_class_scope)
}
