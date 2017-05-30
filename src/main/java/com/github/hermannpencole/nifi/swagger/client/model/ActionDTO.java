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
import com.github.hermannpencole.nifi.swagger.client.model.ActionDetailsDTO;
import com.github.hermannpencole.nifi.swagger.client.model.ComponentDetailsDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * ActionDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-30T10:58:58.550+02:00")
public class ActionDTO {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("userIdentity")
  private String userIdentity = null;

  @SerializedName("timestamp")
  private DateTime timestamp = null;

  @SerializedName("sourceId")
  private String sourceId = null;

  @SerializedName("sourceName")
  private String sourceName = null;

  @SerializedName("sourceType")
  private String sourceType = null;

  @SerializedName("componentDetails")
  private ComponentDetailsDTO componentDetails = null;

  @SerializedName("operation")
  private String operation = null;

  @SerializedName("actionDetails")
  private ActionDetailsDTO actionDetails = null;

  public ActionDTO id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The action id.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The action id.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ActionDTO userIdentity(String userIdentity) {
    this.userIdentity = userIdentity;
    return this;
  }

   /**
   * The identity of the user that performed the action.
   * @return userIdentity
  **/
  @ApiModelProperty(example = "null", value = "The identity of the user that performed the action.")
  public String getUserIdentity() {
    return userIdentity;
  }

  public void setUserIdentity(String userIdentity) {
    this.userIdentity = userIdentity;
  }

  public ActionDTO timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp of the action.
   * @return timestamp
  **/
  @ApiModelProperty(example = "null", value = "The timestamp of the action.")
  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }

  public ActionDTO sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * The id of the source component.
   * @return sourceId
  **/
  @ApiModelProperty(example = "null", value = "The id of the source component.")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public ActionDTO sourceName(String sourceName) {
    this.sourceName = sourceName;
    return this;
  }

   /**
   * The name of the source component.
   * @return sourceName
  **/
  @ApiModelProperty(example = "null", value = "The name of the source component.")
  public String getSourceName() {
    return sourceName;
  }

  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }

  public ActionDTO sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * The type of the source component.
   * @return sourceType
  **/
  @ApiModelProperty(example = "null", value = "The type of the source component.")
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public ActionDTO componentDetails(ComponentDetailsDTO componentDetails) {
    this.componentDetails = componentDetails;
    return this;
  }

   /**
   * The details of the source component.
   * @return componentDetails
  **/
  @ApiModelProperty(example = "null", value = "The details of the source component.")
  public ComponentDetailsDTO getComponentDetails() {
    return componentDetails;
  }

  public void setComponentDetails(ComponentDetailsDTO componentDetails) {
    this.componentDetails = componentDetails;
  }

  public ActionDTO operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * The operation that was performed.
   * @return operation
  **/
  @ApiModelProperty(example = "null", value = "The operation that was performed.")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public ActionDTO actionDetails(ActionDetailsDTO actionDetails) {
    this.actionDetails = actionDetails;
    return this;
  }

   /**
   * The details of the action.
   * @return actionDetails
  **/
  @ApiModelProperty(example = "null", value = "The details of the action.")
  public ActionDetailsDTO getActionDetails() {
    return actionDetails;
  }

  public void setActionDetails(ActionDetailsDTO actionDetails) {
    this.actionDetails = actionDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionDTO actionDTO = (ActionDTO) o;
    return Objects.equals(this.id, actionDTO.id) &&
        Objects.equals(this.userIdentity, actionDTO.userIdentity) &&
        Objects.equals(this.timestamp, actionDTO.timestamp) &&
        Objects.equals(this.sourceId, actionDTO.sourceId) &&
        Objects.equals(this.sourceName, actionDTO.sourceName) &&
        Objects.equals(this.sourceType, actionDTO.sourceType) &&
        Objects.equals(this.componentDetails, actionDTO.componentDetails) &&
        Objects.equals(this.operation, actionDTO.operation) &&
        Objects.equals(this.actionDetails, actionDTO.actionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userIdentity, timestamp, sourceId, sourceName, sourceType, componentDetails, operation, actionDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userIdentity: ").append(toIndentedString(userIdentity)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    componentDetails: ").append(toIndentedString(componentDetails)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    actionDetails: ").append(toIndentedString(actionDetails)).append("\n");
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

