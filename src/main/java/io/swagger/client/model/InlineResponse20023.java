/*
 * API
 * ## Welcome  This is a place to put general notes and extra information, for internal use.  To get started designing/documenting this API, select a version on the left. # Title No Description
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.InlineResponse20023Logos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20023
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20023 {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("logos")
  private List<InlineResponse20023Logos> logos = null;

  public InlineResponse20023 id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InlineResponse20023 logos(List<InlineResponse20023Logos> logos) {
    this.logos = logos;
    return this;
  }

  public InlineResponse20023 addLogosItem(InlineResponse20023Logos logosItem) {
    if (this.logos == null) {
      this.logos = new ArrayList<InlineResponse20023Logos>();
    }
    this.logos.add(logosItem);
    return this;
  }

   /**
   * Get logos
   * @return logos
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20023Logos> getLogos() {
    return logos;
  }

  public void setLogos(List<InlineResponse20023Logos> logos) {
    this.logos = logos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20023 inlineResponse20023 = (InlineResponse20023) o;
    return Objects.equals(this.id, inlineResponse20023.id) &&
        Objects.equals(this.logos, inlineResponse20023.logos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, logos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20023 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logos: ").append(toIndentedString(logos)).append("\n");
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
