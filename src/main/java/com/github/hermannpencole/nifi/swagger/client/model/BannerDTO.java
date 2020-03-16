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
 * BannerDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class BannerDTO {
  @SerializedName("headerText")
  private String headerText = null;

  @SerializedName("footerText")
  private String footerText = null;

  public BannerDTO headerText(String headerText) {
    this.headerText = headerText;
    return this;
  }

   /**
   * The header text.
   * @return headerText
  **/
  @ApiModelProperty(value = "The header text.")
  public String getHeaderText() {
    return headerText;
  }

  public void setHeaderText(String headerText) {
    this.headerText = headerText;
  }

  public BannerDTO footerText(String footerText) {
    this.footerText = footerText;
    return this;
  }

   /**
   * The footer text.
   * @return footerText
  **/
  @ApiModelProperty(value = "The footer text.")
  public String getFooterText() {
    return footerText;
  }

  public void setFooterText(String footerText) {
    this.footerText = footerText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BannerDTO bannerDTO = (BannerDTO) o;
    return Objects.equals(this.headerText, bannerDTO.headerText) &&
        Objects.equals(this.footerText, bannerDTO.footerText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerText, footerText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BannerDTO {\n");
    
    sb.append("    headerText: ").append(toIndentedString(headerText)).append("\n");
    sb.append("    footerText: ").append(toIndentedString(footerText)).append("\n");
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

