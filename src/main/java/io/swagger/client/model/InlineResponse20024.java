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
import io.swagger.client.model.InlineResponse20024Backdrops;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20024
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20024 {
  @SerializedName("backdrops")
  private List<InlineResponse20024Backdrops> backdrops = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("posters")
  private List<InlineResponse20024Backdrops> posters = null;

  public InlineResponse20024 backdrops(List<InlineResponse20024Backdrops> backdrops) {
    this.backdrops = backdrops;
    return this;
  }

  public InlineResponse20024 addBackdropsItem(InlineResponse20024Backdrops backdropsItem) {
    if (this.backdrops == null) {
      this.backdrops = new ArrayList<InlineResponse20024Backdrops>();
    }
    this.backdrops.add(backdropsItem);
    return this;
  }

   /**
   * Get backdrops
   * @return backdrops
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20024Backdrops> getBackdrops() {
    return backdrops;
  }

  public void setBackdrops(List<InlineResponse20024Backdrops> backdrops) {
    this.backdrops = backdrops;
  }

  public InlineResponse20024 id(Integer id) {
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

  public InlineResponse20024 posters(List<InlineResponse20024Backdrops> posters) {
    this.posters = posters;
    return this;
  }

  public InlineResponse20024 addPostersItem(InlineResponse20024Backdrops postersItem) {
    if (this.posters == null) {
      this.posters = new ArrayList<InlineResponse20024Backdrops>();
    }
    this.posters.add(postersItem);
    return this;
  }

   /**
   * Get posters
   * @return posters
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20024Backdrops> getPosters() {
    return posters;
  }

  public void setPosters(List<InlineResponse20024Backdrops> posters) {
    this.posters = posters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20024 inlineResponse20024 = (InlineResponse20024) o;
    return Objects.equals(this.backdrops, inlineResponse20024.backdrops) &&
        Objects.equals(this.id, inlineResponse20024.id) &&
        Objects.equals(this.posters, inlineResponse20024.posters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backdrops, id, posters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20024 {\n");
    
    sb.append("    backdrops: ").append(toIndentedString(backdrops)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    posters: ").append(toIndentedString(posters)).append("\n");
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

