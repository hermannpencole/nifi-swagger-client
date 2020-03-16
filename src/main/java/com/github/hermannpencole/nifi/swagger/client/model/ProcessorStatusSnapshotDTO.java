/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.5.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.hermannpencole.nifi.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ProcessorStatusSnapshotDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class ProcessorStatusSnapshotDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  /**
   * The state of the processor.
   */
  @JsonAdapter(RunStatusEnum.Adapter.class)
  public enum RunStatusEnum {
    RUNNING("RUNNING"),
    
    STOPPED("STOPPED"),
    
    DISABLED("DISABLED"),
    
    INVALID("INVALID");

    private String value;

    RunStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RunStatusEnum fromValue(String text) {
      for (RunStatusEnum b : RunStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RunStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RunStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RunStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RunStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("runStatus")
  private RunStatusEnum runStatus = null;

  /**
   * Indicates the node where the process will execute.
   */
  @JsonAdapter(ExecutionNodeEnum.Adapter.class)
  public enum ExecutionNodeEnum {
    ALL("ALL"),
    
    PRIMARY("PRIMARY");

    private String value;

    ExecutionNodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExecutionNodeEnum fromValue(String text) {
      for (ExecutionNodeEnum b : ExecutionNodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ExecutionNodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExecutionNodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExecutionNodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ExecutionNodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("executionNode")
  private ExecutionNodeEnum executionNode = null;

  @SerializedName("bytesRead")
  private Long bytesRead = null;

  @SerializedName("bytesWritten")
  private Long bytesWritten = null;

  @SerializedName("read")
  private String read = null;

  @SerializedName("written")
  private String written = null;

  @SerializedName("flowFilesIn")
  private Integer flowFilesIn = null;

  @SerializedName("bytesIn")
  private Long bytesIn = null;

  @SerializedName("input")
  private String input = null;

  @SerializedName("flowFilesOut")
  private Integer flowFilesOut = null;

  @SerializedName("bytesOut")
  private Long bytesOut = null;

  @SerializedName("output")
  private String output = null;

  @SerializedName("taskCount")
  private Integer taskCount = null;

  @SerializedName("tasksDurationNanos")
  private Long tasksDurationNanos = null;

  @SerializedName("tasks")
  private String tasks = null;

  @SerializedName("tasksDuration")
  private String tasksDuration = null;

  @SerializedName("activeThreadCount")
  private Integer activeThreadCount = null;

  public ProcessorStatusSnapshotDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the processor.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the processor.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProcessorStatusSnapshotDTO groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The id of the parent process group to which the processor belongs.
   * @return groupId
  **/
  @ApiModelProperty(value = "The id of the parent process group to which the processor belongs.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public ProcessorStatusSnapshotDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the prcessor.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the prcessor.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProcessorStatusSnapshotDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the processor.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the processor.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProcessorStatusSnapshotDTO runStatus(RunStatusEnum runStatus) {
    this.runStatus = runStatus;
    return this;
  }

   /**
   * The state of the processor.
   * @return runStatus
  **/
  @ApiModelProperty(value = "The state of the processor.")
  public RunStatusEnum getRunStatus() {
    return runStatus;
  }

  public void setRunStatus(RunStatusEnum runStatus) {
    this.runStatus = runStatus;
  }

  public ProcessorStatusSnapshotDTO executionNode(ExecutionNodeEnum executionNode) {
    this.executionNode = executionNode;
    return this;
  }

   /**
   * Indicates the node where the process will execute.
   * @return executionNode
  **/
  @ApiModelProperty(value = "Indicates the node where the process will execute.")
  public ExecutionNodeEnum getExecutionNode() {
    return executionNode;
  }

  public void setExecutionNode(ExecutionNodeEnum executionNode) {
    this.executionNode = executionNode;
  }

  public ProcessorStatusSnapshotDTO bytesRead(Long bytesRead) {
    this.bytesRead = bytesRead;
    return this;
  }

   /**
   * The number of bytes read by this Processor in the last 5 mintues
   * @return bytesRead
  **/
  @ApiModelProperty(value = "The number of bytes read by this Processor in the last 5 mintues")
  public Long getBytesRead() {
    return bytesRead;
  }

  public void setBytesRead(Long bytesRead) {
    this.bytesRead = bytesRead;
  }

  public ProcessorStatusSnapshotDTO bytesWritten(Long bytesWritten) {
    this.bytesWritten = bytesWritten;
    return this;
  }

   /**
   * The number of bytes written by this Processor in the last 5 minutes
   * @return bytesWritten
  **/
  @ApiModelProperty(value = "The number of bytes written by this Processor in the last 5 minutes")
  public Long getBytesWritten() {
    return bytesWritten;
  }

  public void setBytesWritten(Long bytesWritten) {
    this.bytesWritten = bytesWritten;
  }

  public ProcessorStatusSnapshotDTO read(String read) {
    this.read = read;
    return this;
  }

   /**
   * The number of bytes read in the last 5 minutes.
   * @return read
  **/
  @ApiModelProperty(value = "The number of bytes read in the last 5 minutes.")
  public String getRead() {
    return read;
  }

  public void setRead(String read) {
    this.read = read;
  }

  public ProcessorStatusSnapshotDTO written(String written) {
    this.written = written;
    return this;
  }

   /**
   * The number of bytes written in the last 5 minutes.
   * @return written
  **/
  @ApiModelProperty(value = "The number of bytes written in the last 5 minutes.")
  public String getWritten() {
    return written;
  }

  public void setWritten(String written) {
    this.written = written;
  }

  public ProcessorStatusSnapshotDTO flowFilesIn(Integer flowFilesIn) {
    this.flowFilesIn = flowFilesIn;
    return this;
  }

   /**
   * The number of FlowFiles that have been accepted in the last 5 minutes
   * @return flowFilesIn
  **/
  @ApiModelProperty(value = "The number of FlowFiles that have been accepted in the last 5 minutes")
  public Integer getFlowFilesIn() {
    return flowFilesIn;
  }

  public void setFlowFilesIn(Integer flowFilesIn) {
    this.flowFilesIn = flowFilesIn;
  }

  public ProcessorStatusSnapshotDTO bytesIn(Long bytesIn) {
    this.bytesIn = bytesIn;
    return this;
  }

   /**
   * The size of the FlowFiles that have been accepted in the last 5 minutes
   * @return bytesIn
  **/
  @ApiModelProperty(value = "The size of the FlowFiles that have been accepted in the last 5 minutes")
  public Long getBytesIn() {
    return bytesIn;
  }

  public void setBytesIn(Long bytesIn) {
    this.bytesIn = bytesIn;
  }

  public ProcessorStatusSnapshotDTO input(String input) {
    this.input = input;
    return this;
  }

   /**
   * The count/size of flowfiles that have been accepted in the last 5 minutes.
   * @return input
  **/
  @ApiModelProperty(value = "The count/size of flowfiles that have been accepted in the last 5 minutes.")
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public ProcessorStatusSnapshotDTO flowFilesOut(Integer flowFilesOut) {
    this.flowFilesOut = flowFilesOut;
    return this;
  }

   /**
   * The number of FlowFiles transferred to a Connection in the last 5 minutes
   * @return flowFilesOut
  **/
  @ApiModelProperty(value = "The number of FlowFiles transferred to a Connection in the last 5 minutes")
  public Integer getFlowFilesOut() {
    return flowFilesOut;
  }

  public void setFlowFilesOut(Integer flowFilesOut) {
    this.flowFilesOut = flowFilesOut;
  }

  public ProcessorStatusSnapshotDTO bytesOut(Long bytesOut) {
    this.bytesOut = bytesOut;
    return this;
  }

   /**
   * The size of the FlowFiles transferred to a Connection in the last 5 minutes
   * @return bytesOut
  **/
  @ApiModelProperty(value = "The size of the FlowFiles transferred to a Connection in the last 5 minutes")
  public Long getBytesOut() {
    return bytesOut;
  }

  public void setBytesOut(Long bytesOut) {
    this.bytesOut = bytesOut;
  }

  public ProcessorStatusSnapshotDTO output(String output) {
    this.output = output;
    return this;
  }

   /**
   * The count/size of flowfiles that have been processed in the last 5 minutes.
   * @return output
  **/
  @ApiModelProperty(value = "The count/size of flowfiles that have been processed in the last 5 minutes.")
  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }

  public ProcessorStatusSnapshotDTO taskCount(Integer taskCount) {
    this.taskCount = taskCount;
    return this;
  }

   /**
   * The number of times this Processor has run in the last 5 minutes
   * @return taskCount
  **/
  @ApiModelProperty(value = "The number of times this Processor has run in the last 5 minutes")
  public Integer getTaskCount() {
    return taskCount;
  }

  public void setTaskCount(Integer taskCount) {
    this.taskCount = taskCount;
  }

  public ProcessorStatusSnapshotDTO tasksDurationNanos(Long tasksDurationNanos) {
    this.tasksDurationNanos = tasksDurationNanos;
    return this;
  }

   /**
   * The number of nanoseconds that this Processor has spent running in the last 5 minutes
   * @return tasksDurationNanos
  **/
  @ApiModelProperty(value = "The number of nanoseconds that this Processor has spent running in the last 5 minutes")
  public Long getTasksDurationNanos() {
    return tasksDurationNanos;
  }

  public void setTasksDurationNanos(Long tasksDurationNanos) {
    this.tasksDurationNanos = tasksDurationNanos;
  }

  public ProcessorStatusSnapshotDTO tasks(String tasks) {
    this.tasks = tasks;
    return this;
  }

   /**
   * The total number of task this connectable has completed over the last 5 minutes.
   * @return tasks
  **/
  @ApiModelProperty(value = "The total number of task this connectable has completed over the last 5 minutes.")
  public String getTasks() {
    return tasks;
  }

  public void setTasks(String tasks) {
    this.tasks = tasks;
  }

  public ProcessorStatusSnapshotDTO tasksDuration(String tasksDuration) {
    this.tasksDuration = tasksDuration;
    return this;
  }

   /**
   * The total duration of all tasks for this connectable over the last 5 minutes.
   * @return tasksDuration
  **/
  @ApiModelProperty(value = "The total duration of all tasks for this connectable over the last 5 minutes.")
  public String getTasksDuration() {
    return tasksDuration;
  }

  public void setTasksDuration(String tasksDuration) {
    this.tasksDuration = tasksDuration;
  }

  public ProcessorStatusSnapshotDTO activeThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
    return this;
  }

   /**
   * The number of threads currently executing in the processor.
   * @return activeThreadCount
  **/
  @ApiModelProperty(value = "The number of threads currently executing in the processor.")
  public Integer getActiveThreadCount() {
    return activeThreadCount;
  }

  public void setActiveThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorStatusSnapshotDTO processorStatusSnapshotDTO = (ProcessorStatusSnapshotDTO) o;
    return Objects.equals(this.id, processorStatusSnapshotDTO.id) &&
        Objects.equals(this.groupId, processorStatusSnapshotDTO.groupId) &&
        Objects.equals(this.name, processorStatusSnapshotDTO.name) &&
        Objects.equals(this.type, processorStatusSnapshotDTO.type) &&
        Objects.equals(this.runStatus, processorStatusSnapshotDTO.runStatus) &&
        Objects.equals(this.executionNode, processorStatusSnapshotDTO.executionNode) &&
        Objects.equals(this.bytesRead, processorStatusSnapshotDTO.bytesRead) &&
        Objects.equals(this.bytesWritten, processorStatusSnapshotDTO.bytesWritten) &&
        Objects.equals(this.read, processorStatusSnapshotDTO.read) &&
        Objects.equals(this.written, processorStatusSnapshotDTO.written) &&
        Objects.equals(this.flowFilesIn, processorStatusSnapshotDTO.flowFilesIn) &&
        Objects.equals(this.bytesIn, processorStatusSnapshotDTO.bytesIn) &&
        Objects.equals(this.input, processorStatusSnapshotDTO.input) &&
        Objects.equals(this.flowFilesOut, processorStatusSnapshotDTO.flowFilesOut) &&
        Objects.equals(this.bytesOut, processorStatusSnapshotDTO.bytesOut) &&
        Objects.equals(this.output, processorStatusSnapshotDTO.output) &&
        Objects.equals(this.taskCount, processorStatusSnapshotDTO.taskCount) &&
        Objects.equals(this.tasksDurationNanos, processorStatusSnapshotDTO.tasksDurationNanos) &&
        Objects.equals(this.tasks, processorStatusSnapshotDTO.tasks) &&
        Objects.equals(this.tasksDuration, processorStatusSnapshotDTO.tasksDuration) &&
        Objects.equals(this.activeThreadCount, processorStatusSnapshotDTO.activeThreadCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, name, type, runStatus, executionNode, bytesRead, bytesWritten, read, written, flowFilesIn, bytesIn, input, flowFilesOut, bytesOut, output, taskCount, tasksDurationNanos, tasks, tasksDuration, activeThreadCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorStatusSnapshotDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
    sb.append("    executionNode: ").append(toIndentedString(executionNode)).append("\n");
    sb.append("    bytesRead: ").append(toIndentedString(bytesRead)).append("\n");
    sb.append("    bytesWritten: ").append(toIndentedString(bytesWritten)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    written: ").append(toIndentedString(written)).append("\n");
    sb.append("    flowFilesIn: ").append(toIndentedString(flowFilesIn)).append("\n");
    sb.append("    bytesIn: ").append(toIndentedString(bytesIn)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    flowFilesOut: ").append(toIndentedString(flowFilesOut)).append("\n");
    sb.append("    bytesOut: ").append(toIndentedString(bytesOut)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    taskCount: ").append(toIndentedString(taskCount)).append("\n");
    sb.append("    tasksDurationNanos: ").append(toIndentedString(tasksDurationNanos)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    tasksDuration: ").append(toIndentedString(tasksDuration)).append("\n");
    sb.append("    activeThreadCount: ").append(toIndentedString(activeThreadCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

