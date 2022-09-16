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
import io.swagger.client.model.InlineResponse20017Crew;
import io.swagger.client.model.InlineResponse20017GuestStars;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * InlineResponse20017
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20017 {
  @SerializedName("air_date")
  private LocalDate airDate = null;

  @SerializedName("crew")
  private List<InlineResponse20017Crew> crew = null;

  @SerializedName("episode_number")
  private Integer episodeNumber = null;

  @SerializedName("guest_stars")
  private List<InlineResponse20017GuestStars> guestStars = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("overview")
  private String overview = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("season_number")
  private Integer seasonNumber = null;

  @SerializedName("still_path")
  private ImagePath stillPath = null;

  @SerializedName("vote_average")
  private BigDecimal voteAverage = null;

  @SerializedName("vote_count")
  private Integer voteCount = null;

  public InlineResponse20017 airDate(LocalDate airDate) {
    this.airDate = airDate;
    return this;
  }

   /**
   * Get airDate
   * @return airDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getAirDate() {
    return airDate;
  }

  public void setAirDate(LocalDate airDate) {
    this.airDate = airDate;
  }

  public InlineResponse20017 crew(List<InlineResponse20017Crew> crew) {
    this.crew = crew;
    return this;
  }

  public InlineResponse20017 addCrewItem(InlineResponse20017Crew crewItem) {
    if (this.crew == null) {
      this.crew = new ArrayList<InlineResponse20017Crew>();
    }
    this.crew.add(crewItem);
    return this;
  }

   /**
   * Get crew
   * @return crew
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20017Crew> getCrew() {
    return crew;
  }

  public void setCrew(List<InlineResponse20017Crew> crew) {
    this.crew = crew;
  }

  public InlineResponse20017 episodeNumber(Integer episodeNumber) {
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

  public InlineResponse20017 guestStars(List<InlineResponse20017GuestStars> guestStars) {
    this.guestStars = guestStars;
    return this;
  }

  public InlineResponse20017 addGuestStarsItem(InlineResponse20017GuestStars guestStarsItem) {
    if (this.guestStars == null) {
      this.guestStars = new ArrayList<InlineResponse20017GuestStars>();
    }
    this.guestStars.add(guestStarsItem);
    return this;
  }

   /**
   * Get guestStars
   * @return guestStars
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20017GuestStars> getGuestStars() {
    return guestStars;
  }

  public void setGuestStars(List<InlineResponse20017GuestStars> guestStars) {
    this.guestStars = guestStars;
  }

  public InlineResponse20017 name(String name) {
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

  public InlineResponse20017 overview(String overview) {
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

  public InlineResponse20017 id(Integer id) {
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

  public InlineResponse20017 seasonNumber(Integer seasonNumber) {
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

  public InlineResponse20017 stillPath(ImagePath stillPath) {
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

  public InlineResponse20017 voteAverage(BigDecimal voteAverage) {
    this.voteAverage = voteAverage;
    return this;
  }

   /**
   * Get voteAverage
   * @return voteAverage
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getVoteAverage() {
    return voteAverage;
  }

  public void setVoteAverage(BigDecimal voteAverage) {
    this.voteAverage = voteAverage;
  }

  public InlineResponse20017 voteCount(Integer voteCount) {
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
    InlineResponse20017 inlineResponse20017 = (InlineResponse20017) o;
    return Objects.equals(this.airDate, inlineResponse20017.airDate) &&
        Objects.equals(this.crew, inlineResponse20017.crew) &&
        Objects.equals(this.episodeNumber, inlineResponse20017.episodeNumber) &&
        Objects.equals(this.guestStars, inlineResponse20017.guestStars) &&
        Objects.equals(this.name, inlineResponse20017.name) &&
        Objects.equals(this.overview, inlineResponse20017.overview) &&
        Objects.equals(this.id, inlineResponse20017.id) &&
        Objects.equals(this.seasonNumber, inlineResponse20017.seasonNumber) &&
        Objects.equals(this.stillPath, inlineResponse20017.stillPath) &&
        Objects.equals(this.voteAverage, inlineResponse20017.voteAverage) &&
        Objects.equals(this.voteCount, inlineResponse20017.voteCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airDate, crew, episodeNumber, guestStars, name, overview, id, seasonNumber, stillPath, voteAverage, voteCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20017 {\n");
    
    sb.append("    airDate: ").append(toIndentedString(airDate)).append("\n");
    sb.append("    crew: ").append(toIndentedString(crew)).append("\n");
    sb.append("    episodeNumber: ").append(toIndentedString(episodeNumber)).append("\n");
    sb.append("    guestStars: ").append(toIndentedString(guestStars)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    seasonNumber: ").append(toIndentedString(seasonNumber)).append("\n");
    sb.append("    stillPath: ").append(toIndentedString(stillPath)).append("\n");
    sb.append("    voteAverage: ").append(toIndentedString(voteAverage)).append("\n");
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

