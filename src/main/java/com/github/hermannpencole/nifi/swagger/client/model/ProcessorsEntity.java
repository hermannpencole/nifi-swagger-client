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
import com.github.hermannpencole.nifi.swagger.client.model.ProcessorEntity;
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
 * ProcessorsEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class ProcessorsEntity {
  @SerializedName("processors")
  private List<ProcessorEntity> processors = null;

  public ProcessorsEntity processors(List<ProcessorEntity> processors) {
    this.processors = processors;
    return this;
  }

  public ProcessorsEntity addProcessorsItem(ProcessorEntity processorsItem) {
    if (this.processors == null) {
      this.processors = new ArrayList<ProcessorEntity>();
    }
    this.processors.add(processorsItem);
    return this;
  }

   /**
   * Get processors
   * @return processors
  **/
  @ApiModelProperty(value = "")
  public List<ProcessorEntity> getProcessors() {
    return processors;
  }

  public void setProcessors(List<ProcessorEntity> processors) {
    this.processors = processors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorsEntity processorsEntity = (ProcessorsEntity) o;
    return Objects.equals(this.processors, processorsEntity.processors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorsEntity {\n");
    
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
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

