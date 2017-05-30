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
import com.github.hermannpencole.nifi.swagger.client.model.SystemDiagnosticsSnapshotDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NodeSystemDiagnosticsSnapshotDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-30T10:58:58.550+02:00")
public class NodeSystemDiagnosticsSnapshotDTO {
  @SerializedName("nodeId")
  private String nodeId = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("apiPort")
  private Integer apiPort = null;

  @SerializedName("snapshot")
  private SystemDiagnosticsSnapshotDTO snapshot = null;

  public NodeSystemDiagnosticsSnapshotDTO nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * The unique ID that identifies the node
   * @return nodeId
  **/
  @ApiModelProperty(example = "null", value = "The unique ID that identifies the node")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public NodeSystemDiagnosticsSnapshotDTO address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The API address of the node
   * @return address
  **/
  @ApiModelProperty(example = "null", value = "The API address of the node")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public NodeSystemDiagnosticsSnapshotDTO apiPort(Integer apiPort) {
    this.apiPort = apiPort;
    return this;
  }

   /**
   * The API port used to communicate with the node
   * @return apiPort
  **/
  @ApiModelProperty(example = "null", value = "The API port used to communicate with the node")
  public Integer getApiPort() {
    return apiPort;
  }

  public void setApiPort(Integer apiPort) {
    this.apiPort = apiPort;
  }

  public NodeSystemDiagnosticsSnapshotDTO snapshot(SystemDiagnosticsSnapshotDTO snapshot) {
    this.snapshot = snapshot;
    return this;
  }

   /**
   * The System Diagnostics snapshot from the node.
   * @return snapshot
  **/
  @ApiModelProperty(example = "null", value = "The System Diagnostics snapshot from the node.")
  public SystemDiagnosticsSnapshotDTO getSnapshot() {
    return snapshot;
  }

  public void setSnapshot(SystemDiagnosticsSnapshotDTO snapshot) {
    this.snapshot = snapshot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeSystemDiagnosticsSnapshotDTO nodeSystemDiagnosticsSnapshotDTO = (NodeSystemDiagnosticsSnapshotDTO) o;
    return Objects.equals(this.nodeId, nodeSystemDiagnosticsSnapshotDTO.nodeId) &&
        Objects.equals(this.address, nodeSystemDiagnosticsSnapshotDTO.address) &&
        Objects.equals(this.apiPort, nodeSystemDiagnosticsSnapshotDTO.apiPort) &&
        Objects.equals(this.snapshot, nodeSystemDiagnosticsSnapshotDTO.snapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, address, apiPort, snapshot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeSystemDiagnosticsSnapshotDTO {\n");
    
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    apiPort: ").append(toIndentedString(apiPort)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
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

