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
 * ControllerStatusDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class ControllerStatusDTO {
  @SerializedName("activeThreadCount")
  private Integer activeThreadCount = null;

  @SerializedName("queued")
  private String queued = null;

  @SerializedName("flowFilesQueued")
  private Integer flowFilesQueued = null;

  @SerializedName("bytesQueued")
  private Long bytesQueued = null;

  @SerializedName("runningCount")
  private Integer runningCount = null;

  @SerializedName("stoppedCount")
  private Integer stoppedCount = null;

  @SerializedName("invalidCount")
  private Integer invalidCount = null;

  @SerializedName("disabledCount")
  private Integer disabledCount = null;

  @SerializedName("activeRemotePortCount")
  private Integer activeRemotePortCount = null;

  @SerializedName("inactiveRemotePortCount")
  private Integer inactiveRemotePortCount = null;

  @SerializedName("upToDateCount")
  private Integer upToDateCount = null;

  @SerializedName("locallyModifiedCount")
  private Integer locallyModifiedCount = null;

  @SerializedName("staleCount")
  private Integer staleCount = null;

  @SerializedName("locallyModifiedAndStaleCount")
  private Integer locallyModifiedAndStaleCount = null;

  @SerializedName("syncFailureCount")
  private Integer syncFailureCount = null;

  public ControllerStatusDTO activeThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
    return this;
  }

   /**
   * The number of active threads in the NiFi.
   * @return activeThreadCount
  **/
  @ApiModelProperty(value = "The number of active threads in the NiFi.")
  public Integer getActiveThreadCount() {
    return activeThreadCount;
  }

  public void setActiveThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
  }

  public ControllerStatusDTO queued(String queued) {
    this.queued = queued;
    return this;
  }

   /**
   * The number of flowfiles queued in the NiFi.
   * @return queued
  **/
  @ApiModelProperty(value = "The number of flowfiles queued in the NiFi.")
  public String getQueued() {
    return queued;
  }

  public void setQueued(String queued) {
    this.queued = queued;
  }

  public ControllerStatusDTO flowFilesQueued(Integer flowFilesQueued) {
    this.flowFilesQueued = flowFilesQueued;
    return this;
  }

   /**
   * The number of FlowFiles queued across the entire flow
   * @return flowFilesQueued
  **/
  @ApiModelProperty(value = "The number of FlowFiles queued across the entire flow")
  public Integer getFlowFilesQueued() {
    return flowFilesQueued;
  }

  public void setFlowFilesQueued(Integer flowFilesQueued) {
    this.flowFilesQueued = flowFilesQueued;
  }

  public ControllerStatusDTO bytesQueued(Long bytesQueued) {
    this.bytesQueued = bytesQueued;
    return this;
  }

   /**
   * The size of the FlowFiles queued across the entire flow
   * @return bytesQueued
  **/
  @ApiModelProperty(value = "The size of the FlowFiles queued across the entire flow")
  public Long getBytesQueued() {
    return bytesQueued;
  }

  public void setBytesQueued(Long bytesQueued) {
    this.bytesQueued = bytesQueued;
  }

  public ControllerStatusDTO runningCount(Integer runningCount) {
    this.runningCount = runningCount;
    return this;
  }

   /**
   * The number of running components in the NiFi.
   * @return runningCount
  **/
  @ApiModelProperty(value = "The number of running components in the NiFi.")
  public Integer getRunningCount() {
    return runningCount;
  }

  public void setRunningCount(Integer runningCount) {
    this.runningCount = runningCount;
  }

  public ControllerStatusDTO stoppedCount(Integer stoppedCount) {
    this.stoppedCount = stoppedCount;
    return this;
  }

   /**
   * The number of stopped components in the NiFi.
   * @return stoppedCount
  **/
  @ApiModelProperty(value = "The number of stopped components in the NiFi.")
  public Integer getStoppedCount() {
    return stoppedCount;
  }

  public void setStoppedCount(Integer stoppedCount) {
    this.stoppedCount = stoppedCount;
  }

  public ControllerStatusDTO invalidCount(Integer invalidCount) {
    this.invalidCount = invalidCount;
    return this;
  }

   /**
   * The number of invalid components in the NiFi.
   * @return invalidCount
  **/
  @ApiModelProperty(value = "The number of invalid components in the NiFi.")
  public Integer getInvalidCount() {
    return invalidCount;
  }

  public void setInvalidCount(Integer invalidCount) {
    this.invalidCount = invalidCount;
  }

  public ControllerStatusDTO disabledCount(Integer disabledCount) {
    this.disabledCount = disabledCount;
    return this;
  }

   /**
   * The number of disabled components in the NiFi.
   * @return disabledCount
  **/
  @ApiModelProperty(value = "The number of disabled components in the NiFi.")
  public Integer getDisabledCount() {
    return disabledCount;
  }

  public void setDisabledCount(Integer disabledCount) {
    this.disabledCount = disabledCount;
  }

  public ControllerStatusDTO activeRemotePortCount(Integer activeRemotePortCount) {
    this.activeRemotePortCount = activeRemotePortCount;
    return this;
  }

   /**
   * The number of active remote ports in the NiFi.
   * @return activeRemotePortCount
  **/
  @ApiModelProperty(value = "The number of active remote ports in the NiFi.")
  public Integer getActiveRemotePortCount() {
    return activeRemotePortCount;
  }

  public void setActiveRemotePortCount(Integer activeRemotePortCount) {
    this.activeRemotePortCount = activeRemotePortCount;
  }

  public ControllerStatusDTO inactiveRemotePortCount(Integer inactiveRemotePortCount) {
    this.inactiveRemotePortCount = inactiveRemotePortCount;
    return this;
  }

   /**
   * The number of inactive remote ports in the NiFi.
   * @return inactiveRemotePortCount
  **/
  @ApiModelProperty(value = "The number of inactive remote ports in the NiFi.")
  public Integer getInactiveRemotePortCount() {
    return inactiveRemotePortCount;
  }

  public void setInactiveRemotePortCount(Integer inactiveRemotePortCount) {
    this.inactiveRemotePortCount = inactiveRemotePortCount;
  }

  public ControllerStatusDTO upToDateCount(Integer upToDateCount) {
    this.upToDateCount = upToDateCount;
    return this;
  }

   /**
   * The number of up to date versioned process groups in the NiFi.
   * @return upToDateCount
  **/
  @ApiModelProperty(value = "The number of up to date versioned process groups in the NiFi.")
  public Integer getUpToDateCount() {
    return upToDateCount;
  }

  public void setUpToDateCount(Integer upToDateCount) {
    this.upToDateCount = upToDateCount;
  }

  public ControllerStatusDTO locallyModifiedCount(Integer locallyModifiedCount) {
    this.locallyModifiedCount = locallyModifiedCount;
    return this;
  }

   /**
   * The number of locally modified versioned process groups in the NiFi.
   * @return locallyModifiedCount
  **/
  @ApiModelProperty(value = "The number of locally modified versioned process groups in the NiFi.")
  public Integer getLocallyModifiedCount() {
    return locallyModifiedCount;
  }

  public void setLocallyModifiedCount(Integer locallyModifiedCount) {
    this.locallyModifiedCount = locallyModifiedCount;
  }

  public ControllerStatusDTO staleCount(Integer staleCount) {
    this.staleCount = staleCount;
    return this;
  }

   /**
   * The number of stale versioned process groups in the NiFi.
   * @return staleCount
  **/
  @ApiModelProperty(value = "The number of stale versioned process groups in the NiFi.")
  public Integer getStaleCount() {
    return staleCount;
  }

  public void setStaleCount(Integer staleCount) {
    this.staleCount = staleCount;
  }

  public ControllerStatusDTO locallyModifiedAndStaleCount(Integer locallyModifiedAndStaleCount) {
    this.locallyModifiedAndStaleCount = locallyModifiedAndStaleCount;
    return this;
  }

   /**
   * The number of locally modified and stale versioned process groups in the NiFi.
   * @return locallyModifiedAndStaleCount
  **/
  @ApiModelProperty(value = "The number of locally modified and stale versioned process groups in the NiFi.")
  public Integer getLocallyModifiedAndStaleCount() {
    return locallyModifiedAndStaleCount;
  }

  public void setLocallyModifiedAndStaleCount(Integer locallyModifiedAndStaleCount) {
    this.locallyModifiedAndStaleCount = locallyModifiedAndStaleCount;
  }

  public ControllerStatusDTO syncFailureCount(Integer syncFailureCount) {
    this.syncFailureCount = syncFailureCount;
    return this;
  }

   /**
   * The number of versioned process groups in the NiFi that are unable to sync to a registry.
   * @return syncFailureCount
  **/
  @ApiModelProperty(value = "The number of versioned process groups in the NiFi that are unable to sync to a registry.")
  public Integer getSyncFailureCount() {
    return syncFailureCount;
  }

  public void setSyncFailureCount(Integer syncFailureCount) {
    this.syncFailureCount = syncFailureCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerStatusDTO controllerStatusDTO = (ControllerStatusDTO) o;
    return Objects.equals(this.activeThreadCount, controllerStatusDTO.activeThreadCount) &&
        Objects.equals(this.queued, controllerStatusDTO.queued) &&
        Objects.equals(this.flowFilesQueued, controllerStatusDTO.flowFilesQueued) &&
        Objects.equals(this.bytesQueued, controllerStatusDTO.bytesQueued) &&
        Objects.equals(this.runningCount, controllerStatusDTO.runningCount) &&
        Objects.equals(this.stoppedCount, controllerStatusDTO.stoppedCount) &&
        Objects.equals(this.invalidCount, controllerStatusDTO.invalidCount) &&
        Objects.equals(this.disabledCount, controllerStatusDTO.disabledCount) &&
        Objects.equals(this.activeRemotePortCount, controllerStatusDTO.activeRemotePortCount) &&
        Objects.equals(this.inactiveRemotePortCount, controllerStatusDTO.inactiveRemotePortCount) &&
        Objects.equals(this.upToDateCount, controllerStatusDTO.upToDateCount) &&
        Objects.equals(this.locallyModifiedCount, controllerStatusDTO.locallyModifiedCount) &&
        Objects.equals(this.staleCount, controllerStatusDTO.staleCount) &&
        Objects.equals(this.locallyModifiedAndStaleCount, controllerStatusDTO.locallyModifiedAndStaleCount) &&
        Objects.equals(this.syncFailureCount, controllerStatusDTO.syncFailureCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeThreadCount, queued, flowFilesQueued, bytesQueued, runningCount, stoppedCount, invalidCount, disabledCount, activeRemotePortCount, inactiveRemotePortCount, upToDateCount, locallyModifiedCount, staleCount, locallyModifiedAndStaleCount, syncFailureCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerStatusDTO {\n");
    
    sb.append("    activeThreadCount: ").append(toIndentedString(activeThreadCount)).append("\n");
    sb.append("    queued: ").append(toIndentedString(queued)).append("\n");
    sb.append("    flowFilesQueued: ").append(toIndentedString(flowFilesQueued)).append("\n");
    sb.append("    bytesQueued: ").append(toIndentedString(bytesQueued)).append("\n");
    sb.append("    runningCount: ").append(toIndentedString(runningCount)).append("\n");
    sb.append("    stoppedCount: ").append(toIndentedString(stoppedCount)).append("\n");
    sb.append("    invalidCount: ").append(toIndentedString(invalidCount)).append("\n");
    sb.append("    disabledCount: ").append(toIndentedString(disabledCount)).append("\n");
    sb.append("    activeRemotePortCount: ").append(toIndentedString(activeRemotePortCount)).append("\n");
    sb.append("    inactiveRemotePortCount: ").append(toIndentedString(inactiveRemotePortCount)).append("\n");
    sb.append("    upToDateCount: ").append(toIndentedString(upToDateCount)).append("\n");
    sb.append("    locallyModifiedCount: ").append(toIndentedString(locallyModifiedCount)).append("\n");
    sb.append("    staleCount: ").append(toIndentedString(staleCount)).append("\n");
    sb.append("    locallyModifiedAndStaleCount: ").append(toIndentedString(locallyModifiedAndStaleCount)).append("\n");
    sb.append("    syncFailureCount: ").append(toIndentedString(syncFailureCount)).append("\n");
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

