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
import io.swagger.client.model.InlineResponse20060Posters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20060
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20060 {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("posters")
  private List<InlineResponse20060Posters> posters = null;

  public InlineResponse20060 id(Integer id) {
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

  public InlineResponse20060 posters(List<InlineResponse20060Posters> posters) {
    this.posters = posters;
    return this;
  }

  public InlineResponse20060 addPostersItem(InlineResponse20060Posters postersItem) {
    if (this.posters == null) {
      this.posters = new ArrayList<InlineResponse20060Posters>();
    }
    this.posters.add(postersItem);
    return this;
  }

   /**
   * Get posters
   * @return posters
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20060Posters> getPosters() {
    return posters;
  }

  public void setPosters(List<InlineResponse20060Posters> posters) {
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
    InlineResponse20060 inlineResponse20060 = (InlineResponse20060) o;
    return Objects.equals(this.id, inlineResponse20060.id) &&
        Objects.equals(this.posters, inlineResponse20060.posters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, posters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20060 {\n");
    
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

