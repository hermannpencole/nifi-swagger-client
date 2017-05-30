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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PermissionsDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-30T11:46:30.825+02:00")
public class PermissionsDTO {
  @SerializedName("canRead")
  private Boolean canRead = false;

  @SerializedName("canWrite")
  private Boolean canWrite = false;

   /**
   * Indicates whether the user can read a given resource.
   * @return canRead
  **/
  @ApiModelProperty(example = "null", value = "Indicates whether the user can read a given resource.")
  public Boolean getCanRead() {
    return canRead;
  }

   /**
   * Indicates whether the user can write a given resource.
   * @return canWrite
  **/
  @ApiModelProperty(example = "null", value = "Indicates whether the user can write a given resource.")
  public Boolean getCanWrite() {
    return canWrite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionsDTO permissionsDTO = (PermissionsDTO) o;
    return Objects.equals(this.canRead, permissionsDTO.canRead) &&
        Objects.equals(this.canWrite, permissionsDTO.canWrite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canRead, canWrite);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionsDTO {\n");
    
    sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
    sb.append("    canWrite: ").append(toIndentedString(canWrite)).append("\n");
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

