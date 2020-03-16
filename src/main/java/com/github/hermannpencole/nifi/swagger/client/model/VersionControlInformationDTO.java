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
 * VersionControlInformationDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class VersionControlInformationDTO {
  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("registryId")
  private String registryId = null;

  @SerializedName("registryName")
  private String registryName = null;

  @SerializedName("bucketId")
  private String bucketId = null;

  @SerializedName("bucketName")
  private String bucketName = null;

  @SerializedName("flowId")
  private String flowId = null;

  @SerializedName("flowName")
  private String flowName = null;

  @SerializedName("flowDescription")
  private String flowDescription = null;

  @SerializedName("version")
  private Integer version = null;

  /**
   * The current state of the Process Group, as it relates to the Versioned Flow
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    LOCALLY_MODIFIED_DESCENDANT("LOCALLY_MODIFIED_DESCENDANT"),
    
    LOCALLY_MODIFIED("LOCALLY_MODIFIED"),
    
    STALE("STALE"),
    
    LOCALLY_MODIFIED_AND_STALE("LOCALLY_MODIFIED_AND_STALE"),
    
    UP_TO_DATE("UP_TO_DATE");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("stateExplanation")
  private String stateExplanation = null;

  public VersionControlInformationDTO groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The ID of the Process Group that is under version control
   * @return groupId
  **/
  @ApiModelProperty(value = "The ID of the Process Group that is under version control")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public VersionControlInformationDTO registryId(String registryId) {
    this.registryId = registryId;
    return this;
  }

   /**
   * The ID of the registry that the flow is stored in
   * @return registryId
  **/
  @ApiModelProperty(value = "The ID of the registry that the flow is stored in")
  public String getRegistryId() {
    return registryId;
  }

  public void setRegistryId(String registryId) {
    this.registryId = registryId;
  }

   /**
   * The name of the registry that the flow is stored in
   * @return registryName
  **/
  @ApiModelProperty(value = "The name of the registry that the flow is stored in")
  public String getRegistryName() {
    return registryName;
  }

  public VersionControlInformationDTO bucketId(String bucketId) {
    this.bucketId = bucketId;
    return this;
  }

   /**
   * The ID of the bucket that the flow is stored in
   * @return bucketId
  **/
  @ApiModelProperty(value = "The ID of the bucket that the flow is stored in")
  public String getBucketId() {
    return bucketId;
  }

  public void setBucketId(String bucketId) {
    this.bucketId = bucketId;
  }

   /**
   * The name of the bucket that the flow is stored in
   * @return bucketName
  **/
  @ApiModelProperty(value = "The name of the bucket that the flow is stored in")
  public String getBucketName() {
    return bucketName;
  }

  public VersionControlInformationDTO flowId(String flowId) {
    this.flowId = flowId;
    return this;
  }

   /**
   * The ID of the flow
   * @return flowId
  **/
  @ApiModelProperty(value = "The ID of the flow")
  public String getFlowId() {
    return flowId;
  }

  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }

  public VersionControlInformationDTO flowName(String flowName) {
    this.flowName = flowName;
    return this;
  }

   /**
   * The name of the flow
   * @return flowName
  **/
  @ApiModelProperty(value = "The name of the flow")
  public String getFlowName() {
    return flowName;
  }

  public void setFlowName(String flowName) {
    this.flowName = flowName;
  }

  public VersionControlInformationDTO flowDescription(String flowDescription) {
    this.flowDescription = flowDescription;
    return this;
  }

   /**
   * The description of the flow
   * @return flowDescription
  **/
  @ApiModelProperty(value = "The description of the flow")
  public String getFlowDescription() {
    return flowDescription;
  }

  public void setFlowDescription(String flowDescription) {
    this.flowDescription = flowDescription;
  }

  public VersionControlInformationDTO version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the flow
   * @return version
  **/
  @ApiModelProperty(value = "The version of the flow")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

   /**
   * The current state of the Process Group, as it relates to the Versioned Flow
   * @return state
  **/
  @ApiModelProperty(value = "The current state of the Process Group, as it relates to the Versioned Flow")
  public StateEnum getState() {
    return state;
  }

   /**
   * Explanation of why the group is in the specified state
   * @return stateExplanation
  **/
  @ApiModelProperty(value = "Explanation of why the group is in the specified state")
  public String getStateExplanation() {
    return stateExplanation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionControlInformationDTO versionControlInformationDTO = (VersionControlInformationDTO) o;
    return Objects.equals(this.groupId, versionControlInformationDTO.groupId) &&
        Objects.equals(this.registryId, versionControlInformationDTO.registryId) &&
        Objects.equals(this.registryName, versionControlInformationDTO.registryName) &&
        Objects.equals(this.bucketId, versionControlInformationDTO.bucketId) &&
        Objects.equals(this.bucketName, versionControlInformationDTO.bucketName) &&
        Objects.equals(this.flowId, versionControlInformationDTO.flowId) &&
        Objects.equals(this.flowName, versionControlInformationDTO.flowName) &&
        Objects.equals(this.flowDescription, versionControlInformationDTO.flowDescription) &&
        Objects.equals(this.version, versionControlInformationDTO.version) &&
        Objects.equals(this.state, versionControlInformationDTO.state) &&
        Objects.equals(this.stateExplanation, versionControlInformationDTO.stateExplanation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, registryId, registryName, bucketId, bucketName, flowId, flowName, flowDescription, version, state, stateExplanation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionControlInformationDTO {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    registryId: ").append(toIndentedString(registryId)).append("\n");
    sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
    sb.append("    bucketId: ").append(toIndentedString(bucketId)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    flowName: ").append(toIndentedString(flowName)).append("\n");
    sb.append("    flowDescription: ").append(toIndentedString(flowDescription)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateExplanation: ").append(toIndentedString(stateExplanation)).append("\n");
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

