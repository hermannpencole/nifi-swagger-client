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
import com.github.hermannpencole.nifi.swagger.client.model.RevisionDTO;
import com.github.hermannpencole.nifi.swagger.client.model.VersionedFlowUpdateRequestDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VersionedFlowUpdateRequestEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class VersionedFlowUpdateRequestEntity {
  @SerializedName("request")
  private VersionedFlowUpdateRequestDTO request = null;

  @SerializedName("processGroupRevision")
  private RevisionDTO processGroupRevision = null;

  public VersionedFlowUpdateRequestEntity request(VersionedFlowUpdateRequestDTO request) {
    this.request = request;
    return this;
  }

   /**
   * The Versioned Flow Update Request
   * @return request
  **/
  @ApiModelProperty(value = "The Versioned Flow Update Request")
  public VersionedFlowUpdateRequestDTO getRequest() {
    return request;
  }

  public void setRequest(VersionedFlowUpdateRequestDTO request) {
    this.request = request;
  }

  public VersionedFlowUpdateRequestEntity processGroupRevision(RevisionDTO processGroupRevision) {
    this.processGroupRevision = processGroupRevision;
    return this;
  }

   /**
   * The revision for the Process Group that owns this variable registry.
   * @return processGroupRevision
  **/
  @ApiModelProperty(value = "The revision for the Process Group that owns this variable registry.")
  public RevisionDTO getProcessGroupRevision() {
    return processGroupRevision;
  }

  public void setProcessGroupRevision(RevisionDTO processGroupRevision) {
    this.processGroupRevision = processGroupRevision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedFlowUpdateRequestEntity versionedFlowUpdateRequestEntity = (VersionedFlowUpdateRequestEntity) o;
    return Objects.equals(this.request, versionedFlowUpdateRequestEntity.request) &&
        Objects.equals(this.processGroupRevision, versionedFlowUpdateRequestEntity.processGroupRevision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, processGroupRevision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedFlowUpdateRequestEntity {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    processGroupRevision: ").append(toIndentedString(processGroupRevision)).append("\n");
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

