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
import com.github.hermannpencole.nifi.swagger.client.model.RevisionDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UpdateControllerServiceReferenceRequestEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-30T11:46:30.825+02:00")
public class UpdateControllerServiceReferenceRequestEntity {
  @SerializedName("id")
  private String id = null;

  /**
   * The new state of the references for the controller service.
   */
  public enum StateEnum {
    @SerializedName("ENABLED")
    ENABLED("ENABLED"),
    
    @SerializedName("DISABLED")
    DISABLED("DISABLED"),
    
    @SerializedName("RUNNING")
    RUNNING("RUNNING"),
    
    @SerializedName("STOPPED")
    STOPPED("STOPPED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("referencingComponentRevisions")
  private Map<String, RevisionDTO> referencingComponentRevisions = new HashMap<String, RevisionDTO>();

  public UpdateControllerServiceReferenceRequestEntity id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier of the Controller Service.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The identifier of the Controller Service.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdateControllerServiceReferenceRequestEntity state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The new state of the references for the controller service.
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "The new state of the references for the controller service.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public UpdateControllerServiceReferenceRequestEntity referencingComponentRevisions(Map<String, RevisionDTO> referencingComponentRevisions) {
    this.referencingComponentRevisions = referencingComponentRevisions;
    return this;
  }

  public UpdateControllerServiceReferenceRequestEntity putReferencingComponentRevisionsItem(String key, RevisionDTO referencingComponentRevisionsItem) {
    this.referencingComponentRevisions.put(key, referencingComponentRevisionsItem);
    return this;
  }

   /**
   * The revisions for all referencing components.
   * @return referencingComponentRevisions
  **/
  @ApiModelProperty(example = "null", value = "The revisions for all referencing components.")
  public Map<String, RevisionDTO> getReferencingComponentRevisions() {
    return referencingComponentRevisions;
  }

  public void setReferencingComponentRevisions(Map<String, RevisionDTO> referencingComponentRevisions) {
    this.referencingComponentRevisions = referencingComponentRevisions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateControllerServiceReferenceRequestEntity updateControllerServiceReferenceRequestEntity = (UpdateControllerServiceReferenceRequestEntity) o;
    return Objects.equals(this.id, updateControllerServiceReferenceRequestEntity.id) &&
        Objects.equals(this.state, updateControllerServiceReferenceRequestEntity.state) &&
        Objects.equals(this.referencingComponentRevisions, updateControllerServiceReferenceRequestEntity.referencingComponentRevisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, referencingComponentRevisions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateControllerServiceReferenceRequestEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    referencingComponentRevisions: ").append(toIndentedString(referencingComponentRevisions)).append("\n");
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

