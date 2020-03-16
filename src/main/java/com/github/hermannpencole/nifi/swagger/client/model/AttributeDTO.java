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
 * AttributeDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class AttributeDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("previousValue")
  private String previousValue = null;

  public AttributeDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The attribute name.
   * @return name
  **/
  @ApiModelProperty(value = "The attribute name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AttributeDTO value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The attribute value.
   * @return value
  **/
  @ApiModelProperty(value = "The attribute value.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public AttributeDTO previousValue(String previousValue) {
    this.previousValue = previousValue;
    return this;
  }

   /**
   * The value of the attribute before the event took place.
   * @return previousValue
  **/
  @ApiModelProperty(value = "The value of the attribute before the event took place.")
  public String getPreviousValue() {
    return previousValue;
  }

  public void setPreviousValue(String previousValue) {
    this.previousValue = previousValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeDTO attributeDTO = (AttributeDTO) o;
    return Objects.equals(this.name, attributeDTO.name) &&
        Objects.equals(this.value, attributeDTO.value) &&
        Objects.equals(this.previousValue, attributeDTO.previousValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, previousValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    previousValue: ").append(toIndentedString(previousValue)).append("\n");
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

