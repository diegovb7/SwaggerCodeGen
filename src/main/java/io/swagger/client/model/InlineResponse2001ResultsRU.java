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
import io.swagger.client.model.InlineResponse2001ResultsARFlatrate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2001ResultsRU
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse2001ResultsRU {
  @SerializedName("link")
  private String link = null;

  @SerializedName("flatrate")
  private List<InlineResponse2001ResultsARFlatrate> flatrate = null;

  @SerializedName("free")
  private List<InlineResponse2001ResultsARFlatrate> free = null;

  public InlineResponse2001ResultsRU link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public InlineResponse2001ResultsRU flatrate(List<InlineResponse2001ResultsARFlatrate> flatrate) {
    this.flatrate = flatrate;
    return this;
  }

  public InlineResponse2001ResultsRU addFlatrateItem(InlineResponse2001ResultsARFlatrate flatrateItem) {
    if (this.flatrate == null) {
      this.flatrate = new ArrayList<InlineResponse2001ResultsARFlatrate>();
    }
    this.flatrate.add(flatrateItem);
    return this;
  }

   /**
   * Get flatrate
   * @return flatrate
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2001ResultsARFlatrate> getFlatrate() {
    return flatrate;
  }

  public void setFlatrate(List<InlineResponse2001ResultsARFlatrate> flatrate) {
    this.flatrate = flatrate;
  }

  public InlineResponse2001ResultsRU free(List<InlineResponse2001ResultsARFlatrate> free) {
    this.free = free;
    return this;
  }

  public InlineResponse2001ResultsRU addFreeItem(InlineResponse2001ResultsARFlatrate freeItem) {
    if (this.free == null) {
      this.free = new ArrayList<InlineResponse2001ResultsARFlatrate>();
    }
    this.free.add(freeItem);
    return this;
  }

   /**
   * Get free
   * @return free
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2001ResultsARFlatrate> getFree() {
    return free;
  }

  public void setFree(List<InlineResponse2001ResultsARFlatrate> free) {
    this.free = free;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001ResultsRU inlineResponse2001ResultsRU = (InlineResponse2001ResultsRU) o;
    return Objects.equals(this.link, inlineResponse2001ResultsRU.link) &&
        Objects.equals(this.flatrate, inlineResponse2001ResultsRU.flatrate) &&
        Objects.equals(this.free, inlineResponse2001ResultsRU.free);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, flatrate, free);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001ResultsRU {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    flatrate: ").append(toIndentedString(flatrate)).append("\n");
    sb.append("    free: ").append(toIndentedString(free)).append("\n");
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

