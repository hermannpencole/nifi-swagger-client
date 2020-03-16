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
import com.github.hermannpencole.nifi.swagger.client.model.NodeSearchResultDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClusterSearchResultsEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class ClusterSearchResultsEntity {
  @SerializedName("nodeResults")
  private List<NodeSearchResultDTO> nodeResults = null;

  public ClusterSearchResultsEntity nodeResults(List<NodeSearchResultDTO> nodeResults) {
    this.nodeResults = nodeResults;
    return this;
  }

  public ClusterSearchResultsEntity addNodeResultsItem(NodeSearchResultDTO nodeResultsItem) {
    if (this.nodeResults == null) {
      this.nodeResults = new ArrayList<NodeSearchResultDTO>();
    }
    this.nodeResults.add(nodeResultsItem);
    return this;
  }

   /**
   * Get nodeResults
   * @return nodeResults
  **/
  @ApiModelProperty(value = "")
  public List<NodeSearchResultDTO> getNodeResults() {
    return nodeResults;
  }

  public void setNodeResults(List<NodeSearchResultDTO> nodeResults) {
    this.nodeResults = nodeResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterSearchResultsEntity clusterSearchResultsEntity = (ClusterSearchResultsEntity) o;
    return Objects.equals(this.nodeResults, clusterSearchResultsEntity.nodeResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterSearchResultsEntity {\n");
    
    sb.append("    nodeResults: ").append(toIndentedString(nodeResults)).append("\n");
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

