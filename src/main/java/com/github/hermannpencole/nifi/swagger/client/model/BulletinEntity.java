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
import com.github.hermannpencole.nifi.swagger.client.model.BulletinDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * BulletinEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-30T10:58:58.550+02:00")
public class BulletinEntity {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("sourceId")
  private String sourceId = null;

  @SerializedName("timestamp")
  private DateTime timestamp = null;

  @SerializedName("nodeAddress")
  private String nodeAddress = null;

  @SerializedName("canRead")
  private Boolean canRead = null;

  @SerializedName("bulletin")
  private BulletinDTO bulletin = null;

  public BulletinEntity id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BulletinEntity groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public BulletinEntity sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public BulletinEntity timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }

  public BulletinEntity nodeAddress(String nodeAddress) {
    this.nodeAddress = nodeAddress;
    return this;
  }

   /**
   * Get nodeAddress
   * @return nodeAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNodeAddress() {
    return nodeAddress;
  }

  public void setNodeAddress(String nodeAddress) {
    this.nodeAddress = nodeAddress;
  }

   /**
   * Indicates whether the user can read a given resource.
   * @return canRead
  **/
  @ApiModelProperty(example = "null", value = "Indicates whether the user can read a given resource.")
  public Boolean getCanRead() {
    return canRead;
  }

  public BulletinEntity bulletin(BulletinDTO bulletin) {
    this.bulletin = bulletin;
    return this;
  }

   /**
   * Get bulletin
   * @return bulletin
  **/
  @ApiModelProperty(example = "null", value = "")
  public BulletinDTO getBulletin() {
    return bulletin;
  }

  public void setBulletin(BulletinDTO bulletin) {
    this.bulletin = bulletin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulletinEntity bulletinEntity = (BulletinEntity) o;
    return Objects.equals(this.id, bulletinEntity.id) &&
        Objects.equals(this.groupId, bulletinEntity.groupId) &&
        Objects.equals(this.sourceId, bulletinEntity.sourceId) &&
        Objects.equals(this.timestamp, bulletinEntity.timestamp) &&
        Objects.equals(this.nodeAddress, bulletinEntity.nodeAddress) &&
        Objects.equals(this.canRead, bulletinEntity.canRead) &&
        Objects.equals(this.bulletin, bulletinEntity.bulletin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, sourceId, timestamp, nodeAddress, canRead, bulletin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulletinEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    nodeAddress: ").append(toIndentedString(nodeAddress)).append("\n");
    sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
    sb.append("    bulletin: ").append(toIndentedString(bulletin)).append("\n");
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

