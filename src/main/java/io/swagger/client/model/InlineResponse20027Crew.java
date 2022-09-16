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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20027Crew
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20027Crew {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("department")
  private String department = null;

  @SerializedName("original_language")
  private String originalLanguage = null;

  @SerializedName("original_title")
  private String originalTitle = null;

  @SerializedName("job")
  private String job = null;

  @SerializedName("overview")
  private String overview = null;

  @SerializedName("vote_count")
  private Integer voteCount = null;

  @SerializedName("video")
  private Boolean video = null;

  @SerializedName("poster_path")
  private ImagePath posterPath = null;

  @SerializedName("backdrop_path")
  private ImagePath backdropPath = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("popularity")
  private BigDecimal popularity = null;

  @SerializedName("genre_ids")
  private List<Integer> genreIds = null;

  @SerializedName("vote_average")
  private BigDecimal voteAverage = null;

  @SerializedName("adult")
  private Boolean adult = null;

  @SerializedName("release_date")
  private String releaseDate = null;

  @SerializedName("credit_id")
  private String creditId = null;

  public InlineResponse20027Crew id(Integer id) {
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

  public InlineResponse20027Crew department(String department) {
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @ApiModelProperty(value = "")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public InlineResponse20027Crew originalLanguage(String originalLanguage) {
    this.originalLanguage = originalLanguage;
    return this;
  }

   /**
   * Get originalLanguage
   * @return originalLanguage
  **/
  @ApiModelProperty(value = "")
  public String getOriginalLanguage() {
    return originalLanguage;
  }

  public void setOriginalLanguage(String originalLanguage) {
    this.originalLanguage = originalLanguage;
  }

  public InlineResponse20027Crew originalTitle(String originalTitle) {
    this.originalTitle = originalTitle;
    return this;
  }

   /**
   * Get originalTitle
   * @return originalTitle
  **/
  @ApiModelProperty(value = "")
  public String getOriginalTitle() {
    return originalTitle;
  }

  public void setOriginalTitle(String originalTitle) {
    this.originalTitle = originalTitle;
  }

  public InlineResponse20027Crew job(String job) {
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @ApiModelProperty(value = "")
  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public InlineResponse20027Crew overview(String overview) {
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

  public InlineResponse20027Crew voteCount(Integer voteCount) {
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

  public InlineResponse20027Crew video(Boolean video) {
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @ApiModelProperty(value = "")
  public Boolean isVideo() {
    return video;
  }

  public void setVideo(Boolean video) {
    this.video = video;
  }

  public InlineResponse20027Crew posterPath(ImagePath posterPath) {
    this.posterPath = posterPath;
    return this;
  }

   /**
   * Get posterPath
   * @return posterPath
  **/
  @ApiModelProperty(value = "")
  public ImagePath getPosterPath() {
    return posterPath;
  }

  public void setPosterPath(ImagePath posterPath) {
    this.posterPath = posterPath;
  }

  public InlineResponse20027Crew backdropPath(ImagePath backdropPath) {
    this.backdropPath = backdropPath;
    return this;
  }

   /**
   * Get backdropPath
   * @return backdropPath
  **/
  @ApiModelProperty(value = "")
  public ImagePath getBackdropPath() {
    return backdropPath;
  }

  public void setBackdropPath(ImagePath backdropPath) {
    this.backdropPath = backdropPath;
  }

  public InlineResponse20027Crew title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public InlineResponse20027Crew popularity(BigDecimal popularity) {
    this.popularity = popularity;
    return this;
  }

   /**
   * Get popularity
   * @return popularity
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPopularity() {
    return popularity;
  }

  public void setPopularity(BigDecimal popularity) {
    this.popularity = popularity;
  }

  public InlineResponse20027Crew genreIds(List<Integer> genreIds) {
    this.genreIds = genreIds;
    return this;
  }

  public InlineResponse20027Crew addGenreIdsItem(Integer genreIdsItem) {
    if (this.genreIds == null) {
      this.genreIds = new ArrayList<Integer>();
    }
    this.genreIds.add(genreIdsItem);
    return this;
  }

   /**
   * Get genreIds
   * @return genreIds
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getGenreIds() {
    return genreIds;
  }

  public void setGenreIds(List<Integer> genreIds) {
    this.genreIds = genreIds;
  }

  public InlineResponse20027Crew voteAverage(BigDecimal voteAverage) {
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

  public InlineResponse20027Crew adult(Boolean adult) {
    this.adult = adult;
    return this;
  }

   /**
   * Get adult
   * @return adult
  **/
  @ApiModelProperty(value = "")
  public Boolean isAdult() {
    return adult;
  }

  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

  public InlineResponse20027Crew releaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Get releaseDate
   * @return releaseDate
  **/
  @ApiModelProperty(value = "")
  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public InlineResponse20027Crew creditId(String creditId) {
    this.creditId = creditId;
    return this;
  }

   /**
   * Get creditId
   * @return creditId
  **/
  @ApiModelProperty(value = "")
  public String getCreditId() {
    return creditId;
  }

  public void setCreditId(String creditId) {
    this.creditId = creditId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20027Crew inlineResponse20027Crew = (InlineResponse20027Crew) o;
    return Objects.equals(this.id, inlineResponse20027Crew.id) &&
        Objects.equals(this.department, inlineResponse20027Crew.department) &&
        Objects.equals(this.originalLanguage, inlineResponse20027Crew.originalLanguage) &&
        Objects.equals(this.originalTitle, inlineResponse20027Crew.originalTitle) &&
        Objects.equals(this.job, inlineResponse20027Crew.job) &&
        Objects.equals(this.overview, inlineResponse20027Crew.overview) &&
        Objects.equals(this.voteCount, inlineResponse20027Crew.voteCount) &&
        Objects.equals(this.video, inlineResponse20027Crew.video) &&
        Objects.equals(this.posterPath, inlineResponse20027Crew.posterPath) &&
        Objects.equals(this.backdropPath, inlineResponse20027Crew.backdropPath) &&
        Objects.equals(this.title, inlineResponse20027Crew.title) &&
        Objects.equals(this.popularity, inlineResponse20027Crew.popularity) &&
        Objects.equals(this.genreIds, inlineResponse20027Crew.genreIds) &&
        Objects.equals(this.voteAverage, inlineResponse20027Crew.voteAverage) &&
        Objects.equals(this.adult, inlineResponse20027Crew.adult) &&
        Objects.equals(this.releaseDate, inlineResponse20027Crew.releaseDate) &&
        Objects.equals(this.creditId, inlineResponse20027Crew.creditId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, department, originalLanguage, originalTitle, job, overview, voteCount, video, posterPath, backdropPath, title, popularity, genreIds, voteAverage, adult, releaseDate, creditId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20027Crew {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    originalLanguage: ").append(toIndentedString(originalLanguage)).append("\n");
    sb.append("    originalTitle: ").append(toIndentedString(originalTitle)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    posterPath: ").append(toIndentedString(posterPath)).append("\n");
    sb.append("    backdropPath: ").append(toIndentedString(backdropPath)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    genreIds: ").append(toIndentedString(genreIds)).append("\n");
    sb.append("    voteAverage: ").append(toIndentedString(voteAverage)).append("\n");
    sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    creditId: ").append(toIndentedString(creditId)).append("\n");
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
