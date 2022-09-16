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
 * TvListResultWithRatingObject
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class TvListResultWithRatingObject {
  @SerializedName("backdrop_path")
  private ImagePath backdropPath = null;

  @SerializedName("first_air_date")
  private String firstAirDate = null;

  @SerializedName("genre_ids")
  private List<Integer> genreIds = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("original_language")
  private String originalLanguage = null;

  @SerializedName("original_name")
  private String originalName = null;

  @SerializedName("overview")
  private String overview = null;

  @SerializedName("origin_country")
  private List<String> originCountry = null;

  @SerializedName("poster_path")
  private ImagePath posterPath = null;

  @SerializedName("popularity")
  private BigDecimal popularity = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("vote_average")
  private BigDecimal voteAverage = null;

  @SerializedName("vote_count")
  private Integer voteCount = null;

  @SerializedName("rating")
  private Integer rating = null;

  public TvListResultWithRatingObject backdropPath(ImagePath backdropPath) {
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

  public TvListResultWithRatingObject firstAirDate(String firstAirDate) {
    this.firstAirDate = firstAirDate;
    return this;
  }

   /**
   * Get firstAirDate
   * @return firstAirDate
  **/
  @ApiModelProperty(value = "")
  public String getFirstAirDate() {
    return firstAirDate;
  }

  public void setFirstAirDate(String firstAirDate) {
    this.firstAirDate = firstAirDate;
  }

  public TvListResultWithRatingObject genreIds(List<Integer> genreIds) {
    this.genreIds = genreIds;
    return this;
  }

  public TvListResultWithRatingObject addGenreIdsItem(Integer genreIdsItem) {
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

  public TvListResultWithRatingObject id(Integer id) {
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

  public TvListResultWithRatingObject originalLanguage(String originalLanguage) {
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

  public TvListResultWithRatingObject originalName(String originalName) {
    this.originalName = originalName;
    return this;
  }

   /**
   * Get originalName
   * @return originalName
  **/
  @ApiModelProperty(value = "")
  public String getOriginalName() {
    return originalName;
  }

  public void setOriginalName(String originalName) {
    this.originalName = originalName;
  }

  public TvListResultWithRatingObject overview(String overview) {
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

  public TvListResultWithRatingObject originCountry(List<String> originCountry) {
    this.originCountry = originCountry;
    return this;
  }

  public TvListResultWithRatingObject addOriginCountryItem(String originCountryItem) {
    if (this.originCountry == null) {
      this.originCountry = new ArrayList<String>();
    }
    this.originCountry.add(originCountryItem);
    return this;
  }

   /**
   * Get originCountry
   * @return originCountry
  **/
  @ApiModelProperty(value = "")
  public List<String> getOriginCountry() {
    return originCountry;
  }

  public void setOriginCountry(List<String> originCountry) {
    this.originCountry = originCountry;
  }

  public TvListResultWithRatingObject posterPath(ImagePath posterPath) {
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

  public TvListResultWithRatingObject popularity(BigDecimal popularity) {
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

  public TvListResultWithRatingObject name(String name) {
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

  public TvListResultWithRatingObject voteAverage(BigDecimal voteAverage) {
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

  public TvListResultWithRatingObject voteCount(Integer voteCount) {
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

  public TvListResultWithRatingObject rating(Integer rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(value = "")
  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TvListResultWithRatingObject tvListResultWithRatingObject = (TvListResultWithRatingObject) o;
    return Objects.equals(this.backdropPath, tvListResultWithRatingObject.backdropPath) &&
        Objects.equals(this.firstAirDate, tvListResultWithRatingObject.firstAirDate) &&
        Objects.equals(this.genreIds, tvListResultWithRatingObject.genreIds) &&
        Objects.equals(this.id, tvListResultWithRatingObject.id) &&
        Objects.equals(this.originalLanguage, tvListResultWithRatingObject.originalLanguage) &&
        Objects.equals(this.originalName, tvListResultWithRatingObject.originalName) &&
        Objects.equals(this.overview, tvListResultWithRatingObject.overview) &&
        Objects.equals(this.originCountry, tvListResultWithRatingObject.originCountry) &&
        Objects.equals(this.posterPath, tvListResultWithRatingObject.posterPath) &&
        Objects.equals(this.popularity, tvListResultWithRatingObject.popularity) &&
        Objects.equals(this.name, tvListResultWithRatingObject.name) &&
        Objects.equals(this.voteAverage, tvListResultWithRatingObject.voteAverage) &&
        Objects.equals(this.voteCount, tvListResultWithRatingObject.voteCount) &&
        Objects.equals(this.rating, tvListResultWithRatingObject.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backdropPath, firstAirDate, genreIds, id, originalLanguage, originalName, overview, originCountry, posterPath, popularity, name, voteAverage, voteCount, rating);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TvListResultWithRatingObject {\n");
    
    sb.append("    backdropPath: ").append(toIndentedString(backdropPath)).append("\n");
    sb.append("    firstAirDate: ").append(toIndentedString(firstAirDate)).append("\n");
    sb.append("    genreIds: ").append(toIndentedString(genreIds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    originalLanguage: ").append(toIndentedString(originalLanguage)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    originCountry: ").append(toIndentedString(originCountry)).append("\n");
    sb.append("    posterPath: ").append(toIndentedString(posterPath)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    voteAverage: ").append(toIndentedString(voteAverage)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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
