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
import java.io.IOException;

/**
 * InlineResponse20083Results
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20083Results {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("episode_number")
  private Integer episodeNumber = null;

  @SerializedName("season_number")
  private Integer seasonNumber = null;

  public InlineResponse20083Results id(Integer id) {
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

  public InlineResponse20083Results episodeNumber(Integer episodeNumber) {
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

  public InlineResponse20083Results seasonNumber(Integer seasonNumber) {
    this.seasonNumber = seasonNumber;
    return this;
  }

   /**
   * Get seasonNumber
   * @return seasonNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getSeasonNumber() {
    return seasonNumber;
  }

  public void setSeasonNumber(Integer seasonNumber) {
    this.seasonNumber = seasonNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20083Results inlineResponse20083Results = (InlineResponse20083Results) o;
    return Objects.equals(this.id, inlineResponse20083Results.id) &&
        Objects.equals(this.episodeNumber, inlineResponse20083Results.episodeNumber) &&
        Objects.equals(this.seasonNumber, inlineResponse20083Results.seasonNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, episodeNumber, seasonNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20083Results {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    episodeNumber: ").append(toIndentedString(episodeNumber)).append("\n");
    sb.append("    seasonNumber: ").append(toIndentedString(seasonNumber)).append("\n");
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

