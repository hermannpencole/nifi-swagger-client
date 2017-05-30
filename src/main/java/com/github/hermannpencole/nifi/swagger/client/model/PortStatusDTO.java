/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.2.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.hermannpencole.nifi.swagger.client.model;

import java.util.Objects;
import com.github.hermannpencole.nifi.swagger.client.model.NodePortStatusSnapshotDTO;
import com.github.hermannpencole.nifi.swagger.client.model.PortStatusSnapshotDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PortStatusDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-30T11:46:30.825+02:00")
public class PortStatusDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("transmitting")
  private Boolean transmitting = false;

  @SerializedName("runStatus")
  private String runStatus = null;

  @SerializedName("statsLastRefreshed")
  private String statsLastRefreshed = null;

  @SerializedName("aggregateSnapshot")
  private PortStatusSnapshotDTO aggregateSnapshot = null;

  @SerializedName("nodeSnapshots")
  private List<NodePortStatusSnapshotDTO> nodeSnapshots = new ArrayList<NodePortStatusSnapshotDTO>();

  public PortStatusDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the port.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the port.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PortStatusDTO groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The id of the parent process group of the port.
   * @return groupId
  **/
  @ApiModelProperty(example = "null", value = "The id of the parent process group of the port.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public PortStatusDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the port.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the port.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PortStatusDTO transmitting(Boolean transmitting) {
    this.transmitting = transmitting;
    return this;
  }

   /**
   * Whether the port has incoming or outgoing connections to a remote NiFi.
   * @return transmitting
  **/
  @ApiModelProperty(example = "null", value = "Whether the port has incoming or outgoing connections to a remote NiFi.")
  public Boolean getTransmitting() {
    return transmitting;
  }

  public void setTransmitting(Boolean transmitting) {
    this.transmitting = transmitting;
  }

  public PortStatusDTO runStatus(String runStatus) {
    this.runStatus = runStatus;
    return this;
  }

   /**
   * The run status of the port.
   * @return runStatus
  **/
  @ApiModelProperty(example = "null", value = "The run status of the port.")
  public String getRunStatus() {
    return runStatus;
  }

  public void setRunStatus(String runStatus) {
    this.runStatus = runStatus;
  }

  public PortStatusDTO statsLastRefreshed(String statsLastRefreshed) {
    this.statsLastRefreshed = statsLastRefreshed;
    return this;
  }

   /**
   * The time the status for the process group was last refreshed.
   * @return statsLastRefreshed
  **/
  @ApiModelProperty(example = "null", value = "The time the status for the process group was last refreshed.")
  public String getStatsLastRefreshed() {
    return statsLastRefreshed;
  }

  public void setStatsLastRefreshed(String statsLastRefreshed) {
    this.statsLastRefreshed = statsLastRefreshed;
  }

  public PortStatusDTO aggregateSnapshot(PortStatusSnapshotDTO aggregateSnapshot) {
    this.aggregateSnapshot = aggregateSnapshot;
    return this;
  }

   /**
   * A status snapshot that represents the aggregate stats of all nodes in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this represents the stats of the single instance.
   * @return aggregateSnapshot
  **/
  @ApiModelProperty(example = "null", value = "A status snapshot that represents the aggregate stats of all nodes in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this represents the stats of the single instance.")
  public PortStatusSnapshotDTO getAggregateSnapshot() {
    return aggregateSnapshot;
  }

  public void setAggregateSnapshot(PortStatusSnapshotDTO aggregateSnapshot) {
    this.aggregateSnapshot = aggregateSnapshot;
  }

  public PortStatusDTO nodeSnapshots(List<NodePortStatusSnapshotDTO> nodeSnapshots) {
    this.nodeSnapshots = nodeSnapshots;
    return this;
  }

  public PortStatusDTO addNodeSnapshotsItem(NodePortStatusSnapshotDTO nodeSnapshotsItem) {
    this.nodeSnapshots.add(nodeSnapshotsItem);
    return this;
  }

   /**
   * A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null.
   * @return nodeSnapshots
  **/
  @ApiModelProperty(example = "null", value = "A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null.")
  public List<NodePortStatusSnapshotDTO> getNodeSnapshots() {
    return nodeSnapshots;
  }

  public void setNodeSnapshots(List<NodePortStatusSnapshotDTO> nodeSnapshots) {
    this.nodeSnapshots = nodeSnapshots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortStatusDTO portStatusDTO = (PortStatusDTO) o;
    return Objects.equals(this.id, portStatusDTO.id) &&
        Objects.equals(this.groupId, portStatusDTO.groupId) &&
        Objects.equals(this.name, portStatusDTO.name) &&
        Objects.equals(this.transmitting, portStatusDTO.transmitting) &&
        Objects.equals(this.runStatus, portStatusDTO.runStatus) &&
        Objects.equals(this.statsLastRefreshed, portStatusDTO.statsLastRefreshed) &&
        Objects.equals(this.aggregateSnapshot, portStatusDTO.aggregateSnapshot) &&
        Objects.equals(this.nodeSnapshots, portStatusDTO.nodeSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, name, transmitting, runStatus, statsLastRefreshed, aggregateSnapshot, nodeSnapshots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortStatusDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    transmitting: ").append(toIndentedString(transmitting)).append("\n");
    sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
    sb.append("    statsLastRefreshed: ").append(toIndentedString(statsLastRefreshed)).append("\n");
    sb.append("    aggregateSnapshot: ").append(toIndentedString(aggregateSnapshot)).append("\n");
    sb.append("    nodeSnapshots: ").append(toIndentedString(nodeSnapshots)).append("\n");
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

