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
import com.github.hermannpencole.nifi.swagger.client.model.StateMapDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComponentStateDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class ComponentStateDTO {
  @SerializedName("componentId")
  private String componentId = null;

  @SerializedName("stateDescription")
  private String stateDescription = null;

  @SerializedName("clusterState")
  private StateMapDTO clusterState = null;

  @SerializedName("localState")
  private StateMapDTO localState = null;

  public ComponentStateDTO componentId(String componentId) {
    this.componentId = componentId;
    return this;
  }

   /**
   * The component identifier.
   * @return componentId
  **/
  @ApiModelProperty(value = "The component identifier.")
  public String getComponentId() {
    return componentId;
  }

  public void setComponentId(String componentId) {
    this.componentId = componentId;
  }

  public ComponentStateDTO stateDescription(String stateDescription) {
    this.stateDescription = stateDescription;
    return this;
  }

   /**
   * Description of the state this component persists.
   * @return stateDescription
  **/
  @ApiModelProperty(value = "Description of the state this component persists.")
  public String getStateDescription() {
    return stateDescription;
  }

  public void setStateDescription(String stateDescription) {
    this.stateDescription = stateDescription;
  }

  public ComponentStateDTO clusterState(StateMapDTO clusterState) {
    this.clusterState = clusterState;
    return this;
  }

   /**
   * The cluster state for this component, or null if this NiFi is a standalone instance.
   * @return clusterState
  **/
  @ApiModelProperty(value = "The cluster state for this component, or null if this NiFi is a standalone instance.")
  public StateMapDTO getClusterState() {
    return clusterState;
  }

  public void setClusterState(StateMapDTO clusterState) {
    this.clusterState = clusterState;
  }

  public ComponentStateDTO localState(StateMapDTO localState) {
    this.localState = localState;
    return this;
  }

   /**
   * The local state for this component.
   * @return localState
  **/
  @ApiModelProperty(value = "The local state for this component.")
  public StateMapDTO getLocalState() {
    return localState;
  }

  public void setLocalState(StateMapDTO localState) {
    this.localState = localState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentStateDTO componentStateDTO = (ComponentStateDTO) o;
    return Objects.equals(this.componentId, componentStateDTO.componentId) &&
        Objects.equals(this.stateDescription, componentStateDTO.stateDescription) &&
        Objects.equals(this.clusterState, componentStateDTO.clusterState) &&
        Objects.equals(this.localState, componentStateDTO.localState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentId, stateDescription, clusterState, localState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentStateDTO {\n");
    
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    stateDescription: ").append(toIndentedString(stateDescription)).append("\n");
    sb.append("    clusterState: ").append(toIndentedString(clusterState)).append("\n");
    sb.append("    localState: ").append(toIndentedString(localState)).append("\n");
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

