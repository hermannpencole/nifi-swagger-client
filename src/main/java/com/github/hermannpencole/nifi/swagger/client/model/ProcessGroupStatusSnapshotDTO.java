/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.hermannpencole.nifi.swagger.client.model;

import java.util.Objects;
import com.github.hermannpencole.nifi.swagger.client.model.ConnectionStatusSnapshotEntity;
import com.github.hermannpencole.nifi.swagger.client.model.PortStatusSnapshotEntity;
import com.github.hermannpencole.nifi.swagger.client.model.ProcessGroupStatusSnapshotEntity;
import com.github.hermannpencole.nifi.swagger.client.model.ProcessorStatusSnapshotEntity;
import com.github.hermannpencole.nifi.swagger.client.model.RemoteProcessGroupStatusSnapshotEntity;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ProcessGroupStatusSnapshotDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-30T10:58:58.550+02:00")
public class ProcessGroupStatusSnapshotDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("connectionStatusSnapshots")
  private List<ConnectionStatusSnapshotEntity> connectionStatusSnapshots = new ArrayList<ConnectionStatusSnapshotEntity>();

  @SerializedName("processorStatusSnapshots")
  private List<ProcessorStatusSnapshotEntity> processorStatusSnapshots = new ArrayList<ProcessorStatusSnapshotEntity>();

  @SerializedName("processGroupStatusSnapshots")
  private List<ProcessGroupStatusSnapshotEntity> processGroupStatusSnapshots = new ArrayList<ProcessGroupStatusSnapshotEntity>();

  @SerializedName("remoteProcessGroupStatusSnapshots")
  private List<RemoteProcessGroupStatusSnapshotEntity> remoteProcessGroupStatusSnapshots = new ArrayList<RemoteProcessGroupStatusSnapshotEntity>();

  @SerializedName("inputPortStatusSnapshots")
  private List<PortStatusSnapshotEntity> inputPortStatusSnapshots = new ArrayList<PortStatusSnapshotEntity>();

  @SerializedName("outputPortStatusSnapshots")
  private List<PortStatusSnapshotEntity> outputPortStatusSnapshots = new ArrayList<PortStatusSnapshotEntity>();

  @SerializedName("flowFilesIn")
  private Integer flowFilesIn = null;

  @SerializedName("bytesIn")
  private Long bytesIn = null;

  @SerializedName("input")
  private String input = null;

  @SerializedName("flowFilesQueued")
  private Integer flowFilesQueued = null;

  @SerializedName("bytesQueued")
  private Long bytesQueued = null;

  @SerializedName("queued")
  private String queued = null;

  @SerializedName("queuedCount")
  private String queuedCount = null;

  @SerializedName("queuedSize")
  private String queuedSize = null;

  @SerializedName("bytesRead")
  private Long bytesRead = null;

  @SerializedName("read")
  private String read = null;

  @SerializedName("bytesWritten")
  private Long bytesWritten = null;

  @SerializedName("written")
  private String written = null;

  @SerializedName("flowFilesOut")
  private Integer flowFilesOut = null;

  @SerializedName("bytesOut")
  private Long bytesOut = null;

  @SerializedName("output")
  private String output = null;

  @SerializedName("flowFilesTransferred")
  private Integer flowFilesTransferred = null;

  @SerializedName("bytesTransferred")
  private Long bytesTransferred = null;

  @SerializedName("transferred")
  private String transferred = null;

  @SerializedName("bytesReceived")
  private Long bytesReceived = null;

  @SerializedName("flowFilesReceived")
  private Integer flowFilesReceived = null;

  @SerializedName("received")
  private String received = null;

  @SerializedName("bytesSent")
  private Long bytesSent = null;

  @SerializedName("flowFilesSent")
  private Integer flowFilesSent = null;

  @SerializedName("sent")
  private String sent = null;

  @SerializedName("activeThreadCount")
  private Integer activeThreadCount = null;

  public ProcessGroupStatusSnapshotDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the process group.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the process group.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProcessGroupStatusSnapshotDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this process group.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of this process group.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProcessGroupStatusSnapshotDTO connectionStatusSnapshots(List<ConnectionStatusSnapshotEntity> connectionStatusSnapshots) {
    this.connectionStatusSnapshots = connectionStatusSnapshots;
    return this;
  }

  public ProcessGroupStatusSnapshotDTO addConnectionStatusSnapshotsItem(ConnectionStatusSnapshotEntity connectionStatusSnapshotsItem) {
    this.connectionStatusSnapshots.add(connectionStatusSnapshotsItem);
    return this;
  }

   /**
   * The status of all conenctions in the process group.
   * @return connectionStatusSnapshots
  **/
  @ApiModelProperty(example = "null", value = "The status of all conenctions in the process group.")
  public List<ConnectionStatusSnapshotEntity> getConnectionStatusSnapshots() {
    return connectionStatusSnapshots;
  }

  public void setConnectionStatusSnapshots(List<ConnectionStatusSnapshotEntity> connectionStatusSnapshots) {
    this.connectionStatusSnapshots = connectionStatusSnapshots;
  }

  public ProcessGroupStatusSnapshotDTO processorStatusSnapshots(List<ProcessorStatusSnapshotEntity> processorStatusSnapshots) {
    this.processorStatusSnapshots = processorStatusSnapshots;
    return this;
  }

  public ProcessGroupStatusSnapshotDTO addProcessorStatusSnapshotsItem(ProcessorStatusSnapshotEntity processorStatusSnapshotsItem) {
    this.processorStatusSnapshots.add(processorStatusSnapshotsItem);
    return this;
  }

   /**
   * The status of all processors in the process group.
   * @return processorStatusSnapshots
  **/
  @ApiModelProperty(example = "null", value = "The status of all processors in the process group.")
  public List<ProcessorStatusSnapshotEntity> getProcessorStatusSnapshots() {
    return processorStatusSnapshots;
  }

  public void setProcessorStatusSnapshots(List<ProcessorStatusSnapshotEntity> processorStatusSnapshots) {
    this.processorStatusSnapshots = processorStatusSnapshots;
  }

  public ProcessGroupStatusSnapshotDTO processGroupStatusSnapshots(List<ProcessGroupStatusSnapshotEntity> processGroupStatusSnapshots) {
    this.processGroupStatusSnapshots = processGroupStatusSnapshots;
    return this;
  }

  public ProcessGroupStatusSnapshotDTO addProcessGroupStatusSnapshotsItem(ProcessGroupStatusSnapshotEntity processGroupStatusSnapshotsItem) {
    this.processGroupStatusSnapshots.add(processGroupStatusSnapshotsItem);
    return this;
  }

   /**
   * The status of all process groups in the process group.
   * @return processGroupStatusSnapshots
  **/
  @ApiModelProperty(example = "null", value = "The status of all process groups in the process group.")
  public List<ProcessGroupStatusSnapshotEntity> getProcessGroupStatusSnapshots() {
    return processGroupStatusSnapshots;
  }

  public void setProcessGroupStatusSnapshots(List<ProcessGroupStatusSnapshotEntity> processGroupStatusSnapshots) {
    this.processGroupStatusSnapshots = processGroupStatusSnapshots;
  }

  public ProcessGroupStatusSnapshotDTO remoteProcessGroupStatusSnapshots(List<RemoteProcessGroupStatusSnapshotEntity> remoteProcessGroupStatusSnapshots) {
    this.remoteProcessGroupStatusSnapshots = remoteProcessGroupStatusSnapshots;
    return this;
  }

  public ProcessGroupStatusSnapshotDTO addRemoteProcessGroupStatusSnapshotsItem(RemoteProcessGroupStatusSnapshotEntity remoteProcessGroupStatusSnapshotsItem) {
    this.remoteProcessGroupStatusSnapshots.add(remoteProcessGroupStatusSnapshotsItem);
    return this;
  }

   /**
   * The status of all remote process groups in the process group.
   * @return remoteProcessGroupStatusSnapshots
  **/
  @ApiModelProperty(example = "null", value = "The status of all remote process groups in the process group.")
  public List<RemoteProcessGroupStatusSnapshotEntity> getRemoteProcessGroupStatusSnapshots() {
    return remoteProcessGroupStatusSnapshots;
  }

  public void setRemoteProcessGroupStatusSnapshots(List<RemoteProcessGroupStatusSnapshotEntity> remoteProcessGroupStatusSnapshots) {
    this.remoteProcessGroupStatusSnapshots = remoteProcessGroupStatusSnapshots;
  }

  public ProcessGroupStatusSnapshotDTO inputPortStatusSnapshots(List<PortStatusSnapshotEntity> inputPortStatusSnapshots) {
    this.inputPortStatusSnapshots = inputPortStatusSnapshots;
    return this;
  }

  public ProcessGroupStatusSnapshotDTO addInputPortStatusSnapshotsItem(PortStatusSnapshotEntity inputPortStatusSnapshotsItem) {
    this.inputPortStatusSnapshots.add(inputPortStatusSnapshotsItem);
    return this;
  }

   /**
   * The status of all input ports in the process group.
   * @return inputPortStatusSnapshots
  **/
  @ApiModelProperty(example = "null", value = "The status of all input ports in the process group.")
  public List<PortStatusSnapshotEntity> getInputPortStatusSnapshots() {
    return inputPortStatusSnapshots;
  }

  public void setInputPortStatusSnapshots(List<PortStatusSnapshotEntity> inputPortStatusSnapshots) {
    this.inputPortStatusSnapshots = inputPortStatusSnapshots;
  }

  public ProcessGroupStatusSnapshotDTO outputPortStatusSnapshots(List<PortStatusSnapshotEntity> outputPortStatusSnapshots) {
    this.outputPortStatusSnapshots = outputPortStatusSnapshots;
    return this;
  }

  public ProcessGroupStatusSnapshotDTO addOutputPortStatusSnapshotsItem(PortStatusSnapshotEntity outputPortStatusSnapshotsItem) {
    this.outputPortStatusSnapshots.add(outputPortStatusSnapshotsItem);
    return this;
  }

   /**
   * The status of all output ports in the process group.
   * @return outputPortStatusSnapshots
  **/
  @ApiModelProperty(example = "null", value = "The status of all output ports in the process group.")
  public List<PortStatusSnapshotEntity> getOutputPortStatusSnapshots() {
    return outputPortStatusSnapshots;
  }

  public void setOutputPortStatusSnapshots(List<PortStatusSnapshotEntity> outputPortStatusSnapshots) {
    this.outputPortStatusSnapshots = outputPortStatusSnapshots;
  }

  public ProcessGroupStatusSnapshotDTO flowFilesIn(Integer flowFilesIn) {
    this.flowFilesIn = flowFilesIn;
    return this;
  }

   /**
   * The number of FlowFiles that have come into this ProcessGroup in the last 5 minutes
   * @return flowFilesIn
  **/
  @ApiModelProperty(example = "null", value = "The number of FlowFiles that have come into this ProcessGroup in the last 5 minutes")
  public Integer getFlowFilesIn() {
    return flowFilesIn;
  }

  public void setFlowFilesIn(Integer flowFilesIn) {
    this.flowFilesIn = flowFilesIn;
  }

  public ProcessGroupStatusSnapshotDTO bytesIn(Long bytesIn) {
    this.bytesIn = bytesIn;
    return this;
  }

   /**
   * The number of bytes that have come into this ProcessGroup in the last 5 minutes
   * @return bytesIn
  **/
  @ApiModelProperty(example = "null", value = "The number of bytes that have come into this ProcessGroup in the last 5 minutes")
  public Long getBytesIn() {
    return bytesIn;
  }

  public void setBytesIn(Long bytesIn) {
    this.bytesIn = bytesIn;
  }

  public ProcessGroupStatusSnapshotDTO input(String input) {
    this.input = input;
    return this;
  }

   /**
   * The input count/size for the process group in the last 5 minutes (pretty printed).
   * @return input
  **/
  @ApiModelProperty(example = "null", value = "The input count/size for the process group in the last 5 minutes (pretty printed).")
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public ProcessGroupStatusSnapshotDTO flowFilesQueued(Integer flowFilesQueued) {
    this.flowFilesQueued = flowFilesQueued;
    return this;
  }

   /**
   * The number of FlowFiles that are queued up in this ProcessGroup right now
   * @return flowFilesQueued
  **/
  @ApiModelProperty(example = "null", value = "The number of FlowFiles that are queued up in this ProcessGroup right now")
  public Integer getFlowFilesQueued() {
    return flowFilesQueued;
  }

  public void setFlowFilesQueued(Integer flowFilesQueued) {
    this.flowFilesQueued = flowFilesQueued;
  }

  public ProcessGroupStatusSnapshotDTO bytesQueued(Long bytesQueued) {
    this.bytesQueued = bytesQueued;
    return this;
  }

   /**
   * The number of bytes that are queued up in this ProcessGroup right now
   * @return bytesQueued
  **/
  @ApiModelProperty(example = "null", value = "The number of bytes that are queued up in this ProcessGroup right now")
  public Long getBytesQueued() {
    return bytesQueued;
  }

  public void setBytesQueued(Long bytesQueued) {
    this.bytesQueued = bytesQueued;
  }

  public ProcessGroupStatusSnapshotDTO queued(String queued) {
    this.queued = queued;
    return this;
  }

   /**
   * The count/size that is queued in the the process group.
   * @return queued
  **/
  @ApiModelProperty(example = "null", value = "The count/size that is queued in the the process group.")
  public String getQueued() {
    return queued;
  }

  public void setQueued(String queued) {
    this.queued = queued;
  }

  public ProcessGroupStatusSnapshotDTO queuedCount(String queuedCount) {
    this.queuedCount = queuedCount;
    return this;
  }

   /**
   * The count that is queued for the process group.
   * @return queuedCount
  **/
  @ApiModelProperty(example = "null", value = "The count that is queued for the process group.")
  public String getQueuedCount() {
    return queuedCount;
  }

  public void setQueuedCount(String queuedCount) {
    this.queuedCount = queuedCount;
  }

  public ProcessGroupStatusSnapshotDTO queuedSize(String queuedSize) {
    this.queuedSize = queuedSize;
    return this;
  }

   /**
   * The size that is queued for the process group.
   * @return queuedSize
  **/
  @ApiModelProperty(example = "null", value = "The size that is queued for the process group.")
  public String getQueuedSize() {
    return queuedSize;
  }

  public void setQueuedSize(String queuedSize) {
    this.queuedSize = queuedSize;
  }

  public ProcessGroupStatusSnapshotDTO bytesRead(Long bytesRead) {
    this.bytesRead = bytesRead;
    return this;
  }

   /**
   * The number of bytes read by components in this ProcessGroup in the last 5 minutes
   * @return bytesRead
  **/
  @ApiModelProperty(example = "null", value = "The number of bytes read by components in this ProcessGroup in the last 5 minutes")
  public Long getBytesRead() {
    return bytesRead;
  }

  public void setBytesRead(Long bytesRead) {
    this.bytesRead = bytesRead;
  }

  public ProcessGroupStatusSnapshotDTO read(String read) {
    this.read = read;
    return this;
  }

   /**
   * The number of bytes read in the last 5 minutes.
   * @return read
  **/
  @ApiModelProperty(example = "null", value = "The number of bytes read in the last 5 minutes.")
  public String getRead() {
    return read;
  }

  public void setRead(String read) {
    this.read = read;
  }

  public ProcessGroupStatusSnapshotDTO bytesWritten(Long bytesWritten) {
    this.bytesWritten = bytesWritten;
    return this;
  }

   /**
   * The number of bytes written by components in this ProcessGroup in the last 5 minutes
   * @return bytesWritten
  **/
  @ApiModelProperty(example = "null", value = "The number of bytes written by components in this ProcessGroup in the last 5 minutes")
  public Long getBytesWritten() {
    return bytesWritten;
  }

  public void setBytesWritten(Long bytesWritten) {
    this.bytesWritten = bytesWritten;
  }

  public ProcessGroupStatusSnapshotDTO written(String written) {
    this.written = written;
    return this;
  }

   /**
   * The number of bytes written in the last 5 minutes.
   * @return written
  **/
  @ApiModelProperty(example = "null", value = "The number of bytes written in the last 5 minutes.")
  public String getWritten() {
    return written;
  }

  public void setWritten(String written) {
    this.written = written;
  }

  public ProcessGroupStatusSnapshotDTO flowFilesOut(Integer flowFilesOut) {
    this.flowFilesOut = flowFilesOut;
    return this;
  }

   /**
   * The number of FlowFiles transferred out of this ProcessGroup in the last 5 minutes
   * @return flowFilesOut
  **/
  @ApiModelProperty(example = "null", value = "The number of FlowFiles transferred out of this ProcessGroup in the last 5 minutes")
  public Integer getFlowFilesOut() {
    return flowFilesOut;
  }

  public void setFlowFilesOut(Integer flowFilesOut) {
    this.flowFilesOut = flowFilesOut;
  }

  public ProcessGroupStatusSnapshotDTO bytesOut(Long bytesOut) {
    this.bytesOut = bytesOut;
    return this;
  }

   /**
   * The number of bytes transferred out of this ProcessGroup in the last 5 minutes
   * @return bytesOut
  **/
  @ApiModelProperty(example = "null", value = "The number of bytes transferred out of this ProcessGroup in the last 5 minutes")
  public Long getBytesOut() {
    return bytesOut;
  }

  public void setBytesOut(Long bytesOut) {
    this.bytesOut = bytesOut;
  }

  public ProcessGroupStatusSnapshotDTO output(String output) {
    this.output = output;
    return this;
  }

   /**
   * The output count/size for the process group in the last 5 minutes.
   * @return output
  **/
  @ApiModelProperty(example = "null", value = "The output count/size for the process group in the last 5 minutes.")
  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }

  public ProcessGroupStatusSnapshotDTO flowFilesTransferred(Integer flowFilesTransferred) {
    this.flowFilesTransferred = flowFilesTransferred;
    return this;
  }

   /**
   * The number of FlowFiles transferred in this ProcessGroup in the last 5 minutes
   * @return flowFilesTransferred
  **/
  @ApiModelProperty(example = "null", value = "The number of FlowFiles transferred in this ProcessGroup in the last 5 minutes")
  public Integer getFlowFilesTransferred() {
    return flowFilesTransferred;
  }

  public void setFlowFilesTransferred(Integer flowFilesTransferred) {
    this.flowFilesTransferred = flowFilesTransferred;
  }

  public ProcessGroupStatusSnapshotDTO bytesTransferred(Long bytesTransferred) {
    this.bytesTransferred = bytesTransferred;
    return this;
  }

   /**
   * The number of bytes transferred in this ProcessGroup in the last 5 minutes
   * @return bytesTransferred
  **/
  @ApiModelProperty(example = "null", value = "The number of bytes transferred in this ProcessGroup in the last 5 minutes")
  public Long getBytesTransferred() {
    return bytesTransferred;
  }

  public void setBytesTransferred(Long bytesTransferred) {
    this.bytesTransferred = bytesTransferred;
  }

  public ProcessGroupStatusSnapshotDTO transferred(String transferred) {
    this.transferred = transferred;
    return this;
  }

   /**
   * The count/size transferred to/frome queues in the process group in the last 5 minutes.
   * @return transferred
  **/
  @ApiModelProperty(example = "null", value = "The count/size transferred to/frome queues in the process group in the last 5 minutes.")
  public String getTransferred() {
    return transferred;
  }

  public void setTransferred(String transferred) {
    this.transferred = transferred;
  }

  public ProcessGroupStatusSnapshotDTO bytesReceived(Long bytesReceived) {
    this.bytesReceived = bytesReceived;
    return this;
  }

   /**
   * The number of bytes received from external sources by components within this ProcessGroup in the last 5 minutes
   * @return bytesReceived
  **/
  @ApiModelProperty(example = "null", value = "The number of bytes received from external sources by components within this ProcessGroup in the last 5 minutes")
  public Long getBytesReceived() {
    return bytesReceived;
  }

  public void setBytesReceived(Long bytesReceived) {
    this.bytesReceived = bytesReceived;
  }

  public ProcessGroupStatusSnapshotDTO flowFilesReceived(Integer flowFilesReceived) {
    this.flowFilesReceived = flowFilesReceived;
    return this;
  }

   /**
   * The number of FlowFiles received from external sources by components within this ProcessGroup in the last 5 minutes
   * @return flowFilesReceived
  **/
  @ApiModelProperty(example = "null", value = "The number of FlowFiles received from external sources by components within this ProcessGroup in the last 5 minutes")
  public Integer getFlowFilesReceived() {
    return flowFilesReceived;
  }

  public void setFlowFilesReceived(Integer flowFilesReceived) {
    this.flowFilesReceived = flowFilesReceived;
  }

  public ProcessGroupStatusSnapshotDTO received(String received) {
    this.received = received;
    return this;
  }

   /**
   * The count/size sent to the process group in the last 5 minutes.
   * @return received
  **/
  @ApiModelProperty(example = "null", value = "The count/size sent to the process group in the last 5 minutes.")
  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public ProcessGroupStatusSnapshotDTO bytesSent(Long bytesSent) {
    this.bytesSent = bytesSent;
    return this;
  }

   /**
   * The number of bytes sent to an external sink by components within this ProcessGroup in the last 5 minutes
   * @return bytesSent
  **/
  @ApiModelProperty(example = "null", value = "The number of bytes sent to an external sink by components within this ProcessGroup in the last 5 minutes")
  public Long getBytesSent() {
    return bytesSent;
  }

  public void setBytesSent(Long bytesSent) {
    this.bytesSent = bytesSent;
  }

  public ProcessGroupStatusSnapshotDTO flowFilesSent(Integer flowFilesSent) {
    this.flowFilesSent = flowFilesSent;
    return this;
  }

   /**
   * The number of FlowFiles sent to an external sink by components within this ProcessGroup in the last 5 minutes
   * @return flowFilesSent
  **/
  @ApiModelProperty(example = "null", value = "The number of FlowFiles sent to an external sink by components within this ProcessGroup in the last 5 minutes")
  public Integer getFlowFilesSent() {
    return flowFilesSent;
  }

  public void setFlowFilesSent(Integer flowFilesSent) {
    this.flowFilesSent = flowFilesSent;
  }

  public ProcessGroupStatusSnapshotDTO sent(String sent) {
    this.sent = sent;
    return this;
  }

   /**
   * The count/size sent from this process group in the last 5 minutes.
   * @return sent
  **/
  @ApiModelProperty(example = "null", value = "The count/size sent from this process group in the last 5 minutes.")
  public String getSent() {
    return sent;
  }

  public void setSent(String sent) {
    this.sent = sent;
  }

  public ProcessGroupStatusSnapshotDTO activeThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
    return this;
  }

   /**
   * The active thread count for this process group.
   * @return activeThreadCount
  **/
  @ApiModelProperty(example = "null", value = "The active thread count for this process group.")
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
    ProcessGroupStatusSnapshotDTO processGroupStatusSnapshotDTO = (ProcessGroupStatusSnapshotDTO) o;
    return Objects.equals(this.id, processGroupStatusSnapshotDTO.id) &&
        Objects.equals(this.name, processGroupStatusSnapshotDTO.name) &&
        Objects.equals(this.connectionStatusSnapshots, processGroupStatusSnapshotDTO.connectionStatusSnapshots) &&
        Objects.equals(this.processorStatusSnapshots, processGroupStatusSnapshotDTO.processorStatusSnapshots) &&
        Objects.equals(this.processGroupStatusSnapshots, processGroupStatusSnapshotDTO.processGroupStatusSnapshots) &&
        Objects.equals(this.remoteProcessGroupStatusSnapshots, processGroupStatusSnapshotDTO.remoteProcessGroupStatusSnapshots) &&
        Objects.equals(this.inputPortStatusSnapshots, processGroupStatusSnapshotDTO.inputPortStatusSnapshots) &&
        Objects.equals(this.outputPortStatusSnapshots, processGroupStatusSnapshotDTO.outputPortStatusSnapshots) &&
        Objects.equals(this.flowFilesIn, processGroupStatusSnapshotDTO.flowFilesIn) &&
        Objects.equals(this.bytesIn, processGroupStatusSnapshotDTO.bytesIn) &&
        Objects.equals(this.input, processGroupStatusSnapshotDTO.input) &&
        Objects.equals(this.flowFilesQueued, processGroupStatusSnapshotDTO.flowFilesQueued) &&
        Objects.equals(this.bytesQueued, processGroupStatusSnapshotDTO.bytesQueued) &&
        Objects.equals(this.queued, processGroupStatusSnapshotDTO.queued) &&
        Objects.equals(this.queuedCount, processGroupStatusSnapshotDTO.queuedCount) &&
        Objects.equals(this.queuedSize, processGroupStatusSnapshotDTO.queuedSize) &&
        Objects.equals(this.bytesRead, processGroupStatusSnapshotDTO.bytesRead) &&
        Objects.equals(this.read, processGroupStatusSnapshotDTO.read) &&
        Objects.equals(this.bytesWritten, processGroupStatusSnapshotDTO.bytesWritten) &&
        Objects.equals(this.written, processGroupStatusSnapshotDTO.written) &&
        Objects.equals(this.flowFilesOut, processGroupStatusSnapshotDTO.flowFilesOut) &&
        Objects.equals(this.bytesOut, processGroupStatusSnapshotDTO.bytesOut) &&
        Objects.equals(this.output, processGroupStatusSnapshotDTO.output) &&
        Objects.equals(this.flowFilesTransferred, processGroupStatusSnapshotDTO.flowFilesTransferred) &&
        Objects.equals(this.bytesTransferred, processGroupStatusSnapshotDTO.bytesTransferred) &&
        Objects.equals(this.transferred, processGroupStatusSnapshotDTO.transferred) &&
        Objects.equals(this.bytesReceived, processGroupStatusSnapshotDTO.bytesReceived) &&
        Objects.equals(this.flowFilesReceived, processGroupStatusSnapshotDTO.flowFilesReceived) &&
        Objects.equals(this.received, processGroupStatusSnapshotDTO.received) &&
        Objects.equals(this.bytesSent, processGroupStatusSnapshotDTO.bytesSent) &&
        Objects.equals(this.flowFilesSent, processGroupStatusSnapshotDTO.flowFilesSent) &&
        Objects.equals(this.sent, processGroupStatusSnapshotDTO.sent) &&
        Objects.equals(this.activeThreadCount, processGroupStatusSnapshotDTO.activeThreadCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, connectionStatusSnapshots, processorStatusSnapshots, processGroupStatusSnapshots, remoteProcessGroupStatusSnapshots, inputPortStatusSnapshots, outputPortStatusSnapshots, flowFilesIn, bytesIn, input, flowFilesQueued, bytesQueued, queued, queuedCount, queuedSize, bytesRead, read, bytesWritten, written, flowFilesOut, bytesOut, output, flowFilesTransferred, bytesTransferred, transferred, bytesReceived, flowFilesReceived, received, bytesSent, flowFilesSent, sent, activeThreadCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessGroupStatusSnapshotDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    connectionStatusSnapshots: ").append(toIndentedString(connectionStatusSnapshots)).append("\n");
    sb.append("    processorStatusSnapshots: ").append(toIndentedString(processorStatusSnapshots)).append("\n");
    sb.append("    processGroupStatusSnapshots: ").append(toIndentedString(processGroupStatusSnapshots)).append("\n");
    sb.append("    remoteProcessGroupStatusSnapshots: ").append(toIndentedString(remoteProcessGroupStatusSnapshots)).append("\n");
    sb.append("    inputPortStatusSnapshots: ").append(toIndentedString(inputPortStatusSnapshots)).append("\n");
    sb.append("    outputPortStatusSnapshots: ").append(toIndentedString(outputPortStatusSnapshots)).append("\n");
    sb.append("    flowFilesIn: ").append(toIndentedString(flowFilesIn)).append("\n");
    sb.append("    bytesIn: ").append(toIndentedString(bytesIn)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    flowFilesQueued: ").append(toIndentedString(flowFilesQueued)).append("\n");
    sb.append("    bytesQueued: ").append(toIndentedString(bytesQueued)).append("\n");
    sb.append("    queued: ").append(toIndentedString(queued)).append("\n");
    sb.append("    queuedCount: ").append(toIndentedString(queuedCount)).append("\n");
    sb.append("    queuedSize: ").append(toIndentedString(queuedSize)).append("\n");
    sb.append("    bytesRead: ").append(toIndentedString(bytesRead)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    bytesWritten: ").append(toIndentedString(bytesWritten)).append("\n");
    sb.append("    written: ").append(toIndentedString(written)).append("\n");
    sb.append("    flowFilesOut: ").append(toIndentedString(flowFilesOut)).append("\n");
    sb.append("    bytesOut: ").append(toIndentedString(bytesOut)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    flowFilesTransferred: ").append(toIndentedString(flowFilesTransferred)).append("\n");
    sb.append("    bytesTransferred: ").append(toIndentedString(bytesTransferred)).append("\n");
    sb.append("    transferred: ").append(toIndentedString(transferred)).append("\n");
    sb.append("    bytesReceived: ").append(toIndentedString(bytesReceived)).append("\n");
    sb.append("    flowFilesReceived: ").append(toIndentedString(flowFilesReceived)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    bytesSent: ").append(toIndentedString(bytesSent)).append("\n");
    sb.append("    flowFilesSent: ").append(toIndentedString(flowFilesSent)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
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

