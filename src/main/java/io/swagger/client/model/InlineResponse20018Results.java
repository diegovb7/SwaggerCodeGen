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
import io.swagger.client.model.ImagePath;
import java.io.IOException;

/**
 * InlineResponse20018Results
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20018Results {
  @SerializedName("air_date")
  private String airDate = null;

  @SerializedName("episode_number")
  private Integer episodeNumber = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("overview")
  private String overview = null;

  @SerializedName("season_number")
  private Integer seasonNumber = null;

  @SerializedName("show_id")
  private Integer showId = null;

  @SerializedName("still_path")
  private ImagePath stillPath = null;

  @SerializedName("vote_count")
  private Integer voteCount = null;

  public InlineResponse20018Results airDate(String airDate) {
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

  public InlineResponse20018Results episodeNumber(Integer episodeNumber) {
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

  public InlineResponse20018Results id(Integer id) {
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

  public InlineResponse20018Results name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse20018Results overview(String overview) {
    this.overview = overview;
    return this;
  }

   /**
   * Get overview
   * @return overview
  **/
  @ApiModelProperty(value = "")
  public String getOverview() {
    return overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public InlineResponse20018Results seasonNumber(Integer seasonNumber) {
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

  public InlineResponse20018Results showId(Integer showId) {
    this.showId = showId;
    return this;
  }

   /**
   * Get showId
   * @return showId
  **/
  @ApiModelProperty(value = "")
  public Integer getShowId() {
    return showId;
  }

  public void setShowId(Integer showId) {
    this.showId = showId;
  }

  public InlineResponse20018Results stillPath(ImagePath stillPath) {
    this.stillPath = stillPath;
    return this;
  }

   /**
   * Get stillPath
   * @return stillPath
  **/
  @ApiModelProperty(value = "")
  public ImagePath getStillPath() {
    return stillPath;
  }

  public void setStillPath(ImagePath stillPath) {
    this.stillPath = stillPath;
  }

  public InlineResponse20018Results voteCount(Integer voteCount) {
    this.voteCount = voteCount;
    return this;
  }

   /**
   * Get voteCount
   * @return voteCount
  **/
  @ApiModelProperty(value = "")
  public Integer getVoteCount() {
    return voteCount;
  }

  public void setVoteCount(Integer voteCount) {
    this.voteCount = voteCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20018Results inlineResponse20018Results = (InlineResponse20018Results) o;
    return Objects.equals(this.airDate, inlineResponse20018Results.airDate) &&
        Objects.equals(this.episodeNumber, inlineResponse20018Results.episodeNumber) &&
        Objects.equals(this.id, inlineResponse20018Results.id) &&
        Objects.equals(this.name, inlineResponse20018Results.name) &&
        Objects.equals(this.overview, inlineResponse20018Results.overview) &&
        Objects.equals(this.seasonNumber, inlineResponse20018Results.seasonNumber) &&
        Objects.equals(this.showId, inlineResponse20018Results.showId) &&
        Objects.equals(this.stillPath, inlineResponse20018Results.stillPath) &&
        Objects.equals(this.voteCount, inlineResponse20018Results.voteCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airDate, episodeNumber, id, name, overview, seasonNumber, showId, stillPath, voteCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20018Results {\n");
    
    sb.append("    airDate: ").append(toIndentedString(airDate)).append("\n");
    sb.append("    episodeNumber: ").append(toIndentedString(episodeNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    seasonNumber: ").append(toIndentedString(seasonNumber)).append("\n");
    sb.append("    showId: ").append(toIndentedString(showId)).append("\n");
    sb.append("    stillPath: ").append(toIndentedString(stillPath)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
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

