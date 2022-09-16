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
 * InlineResponse20044MediaSeasons
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20044MediaSeasons {
  @SerializedName("air_date")
  private String airDate = null;

  @SerializedName("poster_path")
  private String posterPath = null;

  @SerializedName("season_number")
  private Integer seasonNumber = null;

  public InlineResponse20044MediaSeasons airDate(String airDate) {
    this.airDate = airDate;
    return this;
  }

   /**
   * Get airDate
   * @return airDate
  **/
  @ApiModelProperty(value = "")
  public String getAirDate() {
    return airDate;
  }

  public void setAirDate(String airDate) {
    this.airDate = airDate;
  }

  public InlineResponse20044MediaSeasons posterPath(String posterPath) {
    this.posterPath = posterPath;
    return this;
  }

   /**
   * Get posterPath
   * @return posterPath
  **/
  @ApiModelProperty(value = "")
  public String getPosterPath() {
    return posterPath;
  }

  public void setPosterPath(String posterPath) {
    this.posterPath = posterPath;
  }

  public InlineResponse20044MediaSeasons seasonNumber(Integer seasonNumber) {
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
    InlineResponse20044MediaSeasons inlineResponse20044MediaSeasons = (InlineResponse20044MediaSeasons) o;
    return Objects.equals(this.airDate, inlineResponse20044MediaSeasons.airDate) &&
        Objects.equals(this.posterPath, inlineResponse20044MediaSeasons.posterPath) &&
        Objects.equals(this.seasonNumber, inlineResponse20044MediaSeasons.seasonNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airDate, posterPath, seasonNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20044MediaSeasons {\n");
    
    sb.append("    airDate: ").append(toIndentedString(airDate)).append("\n");
    sb.append("    posterPath: ").append(toIndentedString(posterPath)).append("\n");
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

