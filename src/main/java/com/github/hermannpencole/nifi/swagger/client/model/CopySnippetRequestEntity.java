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
 * CopySnippetRequestEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class CopySnippetRequestEntity {
  @SerializedName("snippetId")
  private String snippetId = null;

  @SerializedName("originX")
  private Double originX = null;

  @SerializedName("originY")
  private Double originY = null;

  public CopySnippetRequestEntity snippetId(String snippetId) {
    this.snippetId = snippetId;
    return this;
  }

   /**
   * The identifier of the snippet.
   * @return snippetId
  **/
  @ApiModelProperty(value = "The identifier of the snippet.")
  public String getSnippetId() {
    return snippetId;
  }

  public void setSnippetId(String snippetId) {
    this.snippetId = snippetId;
  }

  public CopySnippetRequestEntity originX(Double originX) {
    this.originX = originX;
    return this;
  }

   /**
   * The x coordinate of the origin of the bounding box where the new components will be placed.
   * @return originX
  **/
  @ApiModelProperty(value = "The x coordinate of the origin of the bounding box where the new components will be placed.")
  public Double getOriginX() {
    return originX;
  }

  public void setOriginX(Double originX) {
    this.originX = originX;
  }

  public CopySnippetRequestEntity originY(Double originY) {
    this.originY = originY;
    return this;
  }

   /**
   * The y coordinate of the origin of the bounding box where the new components will be placed.
   * @return originY
  **/
  @ApiModelProperty(value = "The y coordinate of the origin of the bounding box where the new components will be placed.")
  public Double getOriginY() {
    return originY;
  }

  public void setOriginY(Double originY) {
    this.originY = originY;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopySnippetRequestEntity copySnippetRequestEntity = (CopySnippetRequestEntity) o;
    return Objects.equals(this.snippetId, copySnippetRequestEntity.snippetId) &&
        Objects.equals(this.originX, copySnippetRequestEntity.originX) &&
        Objects.equals(this.originY, copySnippetRequestEntity.originY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snippetId, originX, originY);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopySnippetRequestEntity {\n");
    
    sb.append("    snippetId: ").append(toIndentedString(snippetId)).append("\n");
    sb.append("    originX: ").append(toIndentedString(originX)).append("\n");
    sb.append("    originY: ").append(toIndentedString(originY)).append("\n");
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

