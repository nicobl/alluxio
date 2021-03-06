// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dataserver/status.proto

package alluxio.proto.status;

public final class Status {
  private Status() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code alluxio.proto.status.PStatus}
   *
   * <pre>
   * exception status for a response.
   * </pre>
   */
  public enum PStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>OK = 0;</code>
     *
     * <pre>
     * OK is returned on success.
     * </pre>
     */
    OK(0, 0),
    /**
     * <code>CANCELED = 1;</code>
     *
     * <pre>
     * Canceled indicates the operation was cancelled (typically by the caller).
     * </pre>
     */
    CANCELED(1, 1),
    /**
     * <code>UNKNOWN = 2;</code>
     *
     * <pre>
     * Unknown error.  An example of where this error may be returned is
     * if a Status value received from another address space belongs to
     * an error-space that is not known in this address space.  Also
     * errors raised by APIs that do not return enough error information
     * may be converted to this error.
     * </pre>
     */
    UNKNOWN(2, 2),
    /**
     * <code>INVALID_ARGUMENT = 3;</code>
     *
     * <pre>
     * InvalidArgument indicates client specified an invalid argument.
     * Note that this differs from FailedPrecondition. It indicates arguments
     * that are problematic regardless of the state of the system
     * (e.g., a malformed file name).
     * </pre>
     */
    INVALID_ARGUMENT(3, 3),
    /**
     * <code>DEADLINE_EXCEEDED = 4;</code>
     *
     * <pre>
     * DeadlineExceeded means operation expired before completion.
     * For operations that change the state of the system, this error may be
     * returned even if the operation has completed successfully. For
     * example, a successful response from a server could have been delayed
     * long enough for the deadline to expire.
     * </pre>
     */
    DEADLINE_EXCEEDED(4, 4),
    /**
     * <code>NOT_FOUND = 5;</code>
     *
     * <pre>
     * NotFound means some requested entity (e.g., file or directory) was
     * not found.
     * </pre>
     */
    NOT_FOUND(5, 5),
    /**
     * <code>ALREADY_EXISTS = 6;</code>
     *
     * <pre>
     * AlreadyExists means an attempt to create an entity failed because one
     * already exists.
     * </pre>
     */
    ALREADY_EXISTS(6, 6),
    /**
     * <code>PERMISSION_DENIED = 7;</code>
     *
     * <pre>
     * PermissionDenied indicates the caller does not have permission to
     * execute the specified operation. It must not be used for rejections
     * caused by exhausting some resource (use ResourceExhausted
     * instead for those errors).  It must not be
     * used if the caller cannot be identified (use Unauthenticated
     * instead for those errors).
     * </pre>
     */
    PERMISSION_DENIED(7, 7),
    /**
     * <code>UNAUTHENTICATED = 16;</code>
     *
     * <pre>
     * Unauthenticated indicates the request does not have valid
     * authentication credentials for the operation.
     * </pre>
     */
    UNAUTHENTICATED(8, 16),
    /**
     * <code>RESOURCE_EXHAUSTED = 8;</code>
     *
     * <pre>
     * ResourceExhausted indicates some resource has been exhausted, perhaps
     * a per-user quota, or perhaps the entire file system is out of space.
     * </pre>
     */
    RESOURCE_EXHAUSTED(9, 8),
    /**
     * <code>FAILED_PRECONDITION = 9;</code>
     *
     * <pre>
     * FailedPrecondition indicates operation was rejected because the
     * system is not in a state required for the operation's execution.
     * For example, directory to be deleted may be non-empty, an rmdir
     * operation is applied to a non-directory, etc.
     * A litmus test that may help a service implementor in deciding
     * between FailedPrecondition, Aborted, and Unavailable:
     *  (a) Use Unavailable if the client can retry just the failing call.
     *  (b) Use Aborted if the client should retry at a higher-level
     *      (e.g., restarting a read-modify-write sequence).
     *  (c) Use FailedPrecondition if the client should not retry until
     *      the system state has been explicitly fixed.  E.g., if an "rmdir"
     *      fails because the directory is non-empty, FailedPrecondition
     *      should be returned since the client should not retry unless
     *      they have first fixed up the directory by deleting files from it.
     *  (d) Use FailedPrecondition if the client performs conditional
     *      REST Get/Update/Delete on a resource and the resource on the
     *      server does not match the condition. E.g., conflicting
     *      read-modify-write on the same resource.
     * </pre>
     */
    FAILED_PRECONDITION(10, 9),
    /**
     * <code>ABORTED = 10;</code>
     *
     * <pre>
     * Aborted indicates the operation was aborted, typically due to a
     * concurrency issue like sequencer check failures, transaction aborts,
     * etc.
     * See litmus test above for deciding between FailedPrecondition,
     * Aborted, and Unavailable.
     * </pre>
     */
    ABORTED(11, 10),
    /**
     * <code>OUT_OF_RANGE = 11;</code>
     *
     * <pre>
     * OutOfRange means operation was attempted past the valid range.
     * E.g., seeking or reading past end of file.
     * Unlike InvalidArgument, this error indicates a problem that may
     * be fixed if the system state changes. For example, a 32-bit file
     * system will generate InvalidArgument if asked to read at an
     * offset that is not in the range [0,2^32-1], but it will generate
     * OutOfRange if asked to read from an offset past the current
     * file size.
     * There is a fair bit of overlap between FailedPrecondition and
     * OutOfRange.  We recommend using OutOfRange (the more specific
     * error) when it applies so that callers who are iterating through
     * a space can easily look for an OutOfRange error to detect when
     * they are done.
     * </pre>
     */
    OUT_OF_RANGE(12, 11),
    /**
     * <code>UNIMPLEMENTED = 12;</code>
     *
     * <pre>
     * Unimplemented indicates operation is not implemented or not
     * supported/enabled in this service.
     * </pre>
     */
    UNIMPLEMENTED(13, 12),
    /**
     * <code>INTERNAL = 13;</code>
     *
     * <pre>
     * Internal errors.  Means some invariants expected by underlying
     * system has been broken.  If you see one of these errors,
     * something is very broken.
     * </pre>
     */
    INTERNAL(14, 13),
    /**
     * <code>UNAVAILABLE = 14;</code>
     *
     * <pre>
     * Unavailable indicates the service is currently unavailable.
     * This is a most likely a transient condition and may be corrected
     * by retrying with a backoff.
     * See litmus test above for deciding between FailedPrecondition,
     * Aborted, and Unavailable.
     * </pre>
     */
    UNAVAILABLE(15, 14),
    /**
     * <code>DATA_LOSS = 15;</code>
     *
     * <pre>
     * DataLoss indicates unrecoverable data loss or corruption.
     * </pre>
     */
    DATA_LOSS(16, 15),
    ;

    /**
     * <code>OK = 0;</code>
     *
     * <pre>
     * OK is returned on success.
     * </pre>
     */
    public static final int OK_VALUE = 0;
    /**
     * <code>CANCELED = 1;</code>
     *
     * <pre>
     * Canceled indicates the operation was cancelled (typically by the caller).
     * </pre>
     */
    public static final int CANCELED_VALUE = 1;
    /**
     * <code>UNKNOWN = 2;</code>
     *
     * <pre>
     * Unknown error.  An example of where this error may be returned is
     * if a Status value received from another address space belongs to
     * an error-space that is not known in this address space.  Also
     * errors raised by APIs that do not return enough error information
     * may be converted to this error.
     * </pre>
     */
    public static final int UNKNOWN_VALUE = 2;
    /**
     * <code>INVALID_ARGUMENT = 3;</code>
     *
     * <pre>
     * InvalidArgument indicates client specified an invalid argument.
     * Note that this differs from FailedPrecondition. It indicates arguments
     * that are problematic regardless of the state of the system
     * (e.g., a malformed file name).
     * </pre>
     */
    public static final int INVALID_ARGUMENT_VALUE = 3;
    /**
     * <code>DEADLINE_EXCEEDED = 4;</code>
     *
     * <pre>
     * DeadlineExceeded means operation expired before completion.
     * For operations that change the state of the system, this error may be
     * returned even if the operation has completed successfully. For
     * example, a successful response from a server could have been delayed
     * long enough for the deadline to expire.
     * </pre>
     */
    public static final int DEADLINE_EXCEEDED_VALUE = 4;
    /**
     * <code>NOT_FOUND = 5;</code>
     *
     * <pre>
     * NotFound means some requested entity (e.g., file or directory) was
     * not found.
     * </pre>
     */
    public static final int NOT_FOUND_VALUE = 5;
    /**
     * <code>ALREADY_EXISTS = 6;</code>
     *
     * <pre>
     * AlreadyExists means an attempt to create an entity failed because one
     * already exists.
     * </pre>
     */
    public static final int ALREADY_EXISTS_VALUE = 6;
    /**
     * <code>PERMISSION_DENIED = 7;</code>
     *
     * <pre>
     * PermissionDenied indicates the caller does not have permission to
     * execute the specified operation. It must not be used for rejections
     * caused by exhausting some resource (use ResourceExhausted
     * instead for those errors).  It must not be
     * used if the caller cannot be identified (use Unauthenticated
     * instead for those errors).
     * </pre>
     */
    public static final int PERMISSION_DENIED_VALUE = 7;
    /**
     * <code>UNAUTHENTICATED = 16;</code>
     *
     * <pre>
     * Unauthenticated indicates the request does not have valid
     * authentication credentials for the operation.
     * </pre>
     */
    public static final int UNAUTHENTICATED_VALUE = 16;
    /**
     * <code>RESOURCE_EXHAUSTED = 8;</code>
     *
     * <pre>
     * ResourceExhausted indicates some resource has been exhausted, perhaps
     * a per-user quota, or perhaps the entire file system is out of space.
     * </pre>
     */
    public static final int RESOURCE_EXHAUSTED_VALUE = 8;
    /**
     * <code>FAILED_PRECONDITION = 9;</code>
     *
     * <pre>
     * FailedPrecondition indicates operation was rejected because the
     * system is not in a state required for the operation's execution.
     * For example, directory to be deleted may be non-empty, an rmdir
     * operation is applied to a non-directory, etc.
     * A litmus test that may help a service implementor in deciding
     * between FailedPrecondition, Aborted, and Unavailable:
     *  (a) Use Unavailable if the client can retry just the failing call.
     *  (b) Use Aborted if the client should retry at a higher-level
     *      (e.g., restarting a read-modify-write sequence).
     *  (c) Use FailedPrecondition if the client should not retry until
     *      the system state has been explicitly fixed.  E.g., if an "rmdir"
     *      fails because the directory is non-empty, FailedPrecondition
     *      should be returned since the client should not retry unless
     *      they have first fixed up the directory by deleting files from it.
     *  (d) Use FailedPrecondition if the client performs conditional
     *      REST Get/Update/Delete on a resource and the resource on the
     *      server does not match the condition. E.g., conflicting
     *      read-modify-write on the same resource.
     * </pre>
     */
    public static final int FAILED_PRECONDITION_VALUE = 9;
    /**
     * <code>ABORTED = 10;</code>
     *
     * <pre>
     * Aborted indicates the operation was aborted, typically due to a
     * concurrency issue like sequencer check failures, transaction aborts,
     * etc.
     * See litmus test above for deciding between FailedPrecondition,
     * Aborted, and Unavailable.
     * </pre>
     */
    public static final int ABORTED_VALUE = 10;
    /**
     * <code>OUT_OF_RANGE = 11;</code>
     *
     * <pre>
     * OutOfRange means operation was attempted past the valid range.
     * E.g., seeking or reading past end of file.
     * Unlike InvalidArgument, this error indicates a problem that may
     * be fixed if the system state changes. For example, a 32-bit file
     * system will generate InvalidArgument if asked to read at an
     * offset that is not in the range [0,2^32-1], but it will generate
     * OutOfRange if asked to read from an offset past the current
     * file size.
     * There is a fair bit of overlap between FailedPrecondition and
     * OutOfRange.  We recommend using OutOfRange (the more specific
     * error) when it applies so that callers who are iterating through
     * a space can easily look for an OutOfRange error to detect when
     * they are done.
     * </pre>
     */
    public static final int OUT_OF_RANGE_VALUE = 11;
    /**
     * <code>UNIMPLEMENTED = 12;</code>
     *
     * <pre>
     * Unimplemented indicates operation is not implemented or not
     * supported/enabled in this service.
     * </pre>
     */
    public static final int UNIMPLEMENTED_VALUE = 12;
    /**
     * <code>INTERNAL = 13;</code>
     *
     * <pre>
     * Internal errors.  Means some invariants expected by underlying
     * system has been broken.  If you see one of these errors,
     * something is very broken.
     * </pre>
     */
    public static final int INTERNAL_VALUE = 13;
    /**
     * <code>UNAVAILABLE = 14;</code>
     *
     * <pre>
     * Unavailable indicates the service is currently unavailable.
     * This is a most likely a transient condition and may be corrected
     * by retrying with a backoff.
     * See litmus test above for deciding between FailedPrecondition,
     * Aborted, and Unavailable.
     * </pre>
     */
    public static final int UNAVAILABLE_VALUE = 14;
    /**
     * <code>DATA_LOSS = 15;</code>
     *
     * <pre>
     * DataLoss indicates unrecoverable data loss or corruption.
     * </pre>
     */
    public static final int DATA_LOSS_VALUE = 15;


    public final int getNumber() { return value; }

    public static PStatus valueOf(int value) {
      switch (value) {
        case 0: return OK;
        case 1: return CANCELED;
        case 2: return UNKNOWN;
        case 3: return INVALID_ARGUMENT;
        case 4: return DEADLINE_EXCEEDED;
        case 5: return NOT_FOUND;
        case 6: return ALREADY_EXISTS;
        case 7: return PERMISSION_DENIED;
        case 16: return UNAUTHENTICATED;
        case 8: return RESOURCE_EXHAUSTED;
        case 9: return FAILED_PRECONDITION;
        case 10: return ABORTED;
        case 11: return OUT_OF_RANGE;
        case 12: return UNIMPLEMENTED;
        case 13: return INTERNAL;
        case 14: return UNAVAILABLE;
        case 15: return DATA_LOSS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<PStatus>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PStatus>() {
            public PStatus findValueByNumber(int number) {
              return PStatus.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return alluxio.proto.status.Status.getDescriptor().getEnumTypes().get(0);
    }

    private static final PStatus[] VALUES = values();

    public static PStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private PStatus(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:alluxio.proto.status.PStatus)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027dataserver/status.proto\022\024alluxio.proto" +
      ".status*\271\002\n\007PStatus\022\006\n\002OK\020\000\022\014\n\010CANCELED\020" +
      "\001\022\013\n\007UNKNOWN\020\002\022\024\n\020INVALID_ARGUMENT\020\003\022\025\n\021" +
      "DEADLINE_EXCEEDED\020\004\022\r\n\tNOT_FOUND\020\005\022\022\n\016AL" +
      "READY_EXISTS\020\006\022\025\n\021PERMISSION_DENIED\020\007\022\023\n" +
      "\017UNAUTHENTICATED\020\020\022\026\n\022RESOURCE_EXHAUSTED" +
      "\020\010\022\027\n\023FAILED_PRECONDITION\020\t\022\013\n\007ABORTED\020\n" +
      "\022\020\n\014OUT_OF_RANGE\020\013\022\021\n\rUNIMPLEMENTED\020\014\022\014\n" +
      "\010INTERNAL\020\r\022\017\n\013UNAVAILABLE\020\016\022\r\n\tDATA_LOS" +
      "S\020\017"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
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
