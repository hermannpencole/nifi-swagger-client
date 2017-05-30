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
import com.github.hermannpencole.nifi.swagger.client.model.ClusterSummaryDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClusteSummaryEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-30T11:46:30.825+02:00")
public class ClusteSummaryEntity {
  @SerializedName("clusterSummary")
  private ClusterSummaryDTO clusterSummary = null;

  public ClusteSummaryEntity clusterSummary(ClusterSummaryDTO clusterSummary) {
    this.clusterSummary = clusterSummary;
    return this;
  }

   /**
   * Get clusterSummary
   * @return clusterSummary
  **/
  @ApiModelProperty(example = "null", value = "")
  public ClusterSummaryDTO getClusterSummary() {
    return clusterSummary;
  }

  public void setClusterSummary(ClusterSummaryDTO clusterSummary) {
    this.clusterSummary = clusterSummary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusteSummaryEntity clusteSummaryEntity = (ClusteSummaryEntity) o;
    return Objects.equals(this.clusterSummary, clusteSummaryEntity.clusterSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterSummary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusteSummaryEntity {\n");
    
    sb.append("    clusterSummary: ").append(toIndentedString(clusterSummary)).append("\n");
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

