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
import com.github.hermannpencole.nifi.swagger.client.model.AffectedComponentEntity;
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
 * VariableDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class VariableDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("processGroupId")
  private String processGroupId = null;

  @SerializedName("affectedComponents")
  private List<AffectedComponentEntity> affectedComponents = null;

  public VariableDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the variable
   * @return name
  **/
  @ApiModelProperty(value = "The name of the variable")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VariableDTO value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the variable
   * @return value
  **/
  @ApiModelProperty(value = "The value of the variable")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

   /**
   * The ID of the Process Group where this Variable is defined
   * @return processGroupId
  **/
  @ApiModelProperty(value = "The ID of the Process Group where this Variable is defined")
  public String getProcessGroupId() {
    return processGroupId;
  }

   /**
   * A set of all components that will be affected if the value of this variable is changed
   * @return affectedComponents
  **/
  @ApiModelProperty(value = "A set of all components that will be affected if the value of this variable is changed")
  public List<AffectedComponentEntity> getAffectedComponents() {
    return affectedComponents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableDTO variableDTO = (VariableDTO) o;
    return Objects.equals(this.name, variableDTO.name) &&
        Objects.equals(this.value, variableDTO.value) &&
        Objects.equals(this.processGroupId, variableDTO.processGroupId) &&
        Objects.equals(this.affectedComponents, variableDTO.affectedComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, processGroupId, affectedComponents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    processGroupId: ").append(toIndentedString(processGroupId)).append("\n");
    sb.append("    affectedComponents: ").append(toIndentedString(affectedComponents)).append("\n");
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

