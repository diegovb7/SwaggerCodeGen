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
import io.swagger.client.model.InlineResponse20075ReleaseDates;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20075Results
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20075Results {
  @SerializedName("iso_3166_1")
  private String iso31661 = null;

  @SerializedName("release_dates")
  private List<InlineResponse20075ReleaseDates> releaseDates = null;

  public InlineResponse20075Results iso31661(String iso31661) {
    this.iso31661 = iso31661;
    return this;
  }

   /**
   * Get iso31661
   * @return iso31661
  **/
  @ApiModelProperty(value = "")
  public String getIso31661() {
    return iso31661;
  }

  public void setIso31661(String iso31661) {
    this.iso31661 = iso31661;
  }

  public InlineResponse20075Results releaseDates(List<InlineResponse20075ReleaseDates> releaseDates) {
    this.releaseDates = releaseDates;
    return this;
  }

  public InlineResponse20075Results addReleaseDatesItem(InlineResponse20075ReleaseDates releaseDatesItem) {
    if (this.releaseDates == null) {
      this.releaseDates = new ArrayList<InlineResponse20075ReleaseDates>();
    }
    this.releaseDates.add(releaseDatesItem);
    return this;
  }

   /**
   * Get releaseDates
   * @return releaseDates
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20075ReleaseDates> getReleaseDates() {
    return releaseDates;
  }

  public void setReleaseDates(List<InlineResponse20075ReleaseDates> releaseDates) {
    this.releaseDates = releaseDates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20075Results inlineResponse20075Results = (InlineResponse20075Results) o;
    return Objects.equals(this.iso31661, inlineResponse20075Results.iso31661) &&
        Objects.equals(this.releaseDates, inlineResponse20075Results.releaseDates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iso31661, releaseDates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20075Results {\n");
    
    sb.append("    iso31661: ").append(toIndentedString(iso31661)).append("\n");
    sb.append("    releaseDates: ").append(toIndentedString(releaseDates)).append("\n");
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

