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
import com.github.hermannpencole.nifi.swagger.client.model.PortStatusSnapshotDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PortStatusSnapshotEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-30T11:46:30.825+02:00")
public class PortStatusSnapshotEntity {
  @SerializedName("id")
  private String id = null;

  @SerializedName("portStatusSnapshot")
  private PortStatusSnapshotDTO portStatusSnapshot = null;

  @SerializedName("canRead")
  private Boolean canRead = false;

  public PortStatusSnapshotEntity id(String id) {
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

  public PortStatusSnapshotEntity portStatusSnapshot(PortStatusSnapshotDTO portStatusSnapshot) {
    this.portStatusSnapshot = portStatusSnapshot;
    return this;
  }

   /**
   * Get portStatusSnapshot
   * @return portStatusSnapshot
  **/
  @ApiModelProperty(example = "null", value = "")
  public PortStatusSnapshotDTO getPortStatusSnapshot() {
    return portStatusSnapshot;
  }

  public void setPortStatusSnapshot(PortStatusSnapshotDTO portStatusSnapshot) {
    this.portStatusSnapshot = portStatusSnapshot;
  }

   /**
   * Indicates whether the user can read a given resource.
   * @return canRead
  **/
  @ApiModelProperty(example = "null", value = "Indicates whether the user can read a given resource.")
  public Boolean getCanRead() {
    return canRead;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortStatusSnapshotEntity portStatusSnapshotEntity = (PortStatusSnapshotEntity) o;
    return Objects.equals(this.id, portStatusSnapshotEntity.id) &&
        Objects.equals(this.portStatusSnapshot, portStatusSnapshotEntity.portStatusSnapshot) &&
        Objects.equals(this.canRead, portStatusSnapshotEntity.canRead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, portStatusSnapshot, canRead);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortStatusSnapshotEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    portStatusSnapshot: ").append(toIndentedString(portStatusSnapshot)).append("\n");
    sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
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

