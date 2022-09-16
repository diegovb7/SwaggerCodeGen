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
import io.swagger.client.model.InlineResponse20055Rated;
import java.io.IOException;

/**
 * InlineResponse20055Results
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20055Results {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("episode_number")
  private Integer episodeNumber = null;

  @SerializedName("rated")
  private InlineResponse20055Rated rated = null;

  public InlineResponse20055Results id(Integer id) {
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

  public InlineResponse20055Results episodeNumber(Integer episodeNumber) {
    this.episodeNumber = episodeNumber;
    return this;
  }

   /**
   * Get episodeNumber
   * @return episodeNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getEpisodeNumber() {
    return episodeNumber;
  }

  public void setEpisodeNumber(Integer episodeNumber) {
    this.episodeNumber = episodeNumber;
  }

  public InlineResponse20055Results rated(InlineResponse20055Rated rated) {
    this.rated = rated;
    return this;
  }

   /**
   * Get rated
   * @return rated
  **/
  @ApiModelProperty(value = "")
  public InlineResponse20055Rated getRated() {
    return rated;
  }

  public void setRated(InlineResponse20055Rated rated) {
    this.rated = rated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20055Results inlineResponse20055Results = (InlineResponse20055Results) o;
    return Objects.equals(this.id, inlineResponse20055Results.id) &&
        Objects.equals(this.episodeNumber, inlineResponse20055Results.episodeNumber) &&
        Objects.equals(this.rated, inlineResponse20055Results.rated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, episodeNumber, rated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20055Results {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    episodeNumber: ").append(toIndentedString(episodeNumber)).append("\n");
    sb.append("    rated: ").append(toIndentedString(rated)).append("\n");
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

