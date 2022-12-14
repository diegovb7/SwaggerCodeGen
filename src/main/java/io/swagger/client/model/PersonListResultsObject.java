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
 * PersonListResultsObject
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class PersonListResultsObject {
  @SerializedName("profile_path")
  private ImagePath profilePath = null;

  @SerializedName("adult")
  private Boolean adult = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("known_for")
  private List<Object> knownFor = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("popularity")
  private BigDecimal popularity = null;

  public PersonListResultsObject profilePath(ImagePath profilePath) {
    this.profilePath = profilePath;
    return this;
  }

   /**
   * Get profilePath
   * @return profilePath
  **/
  @ApiModelProperty(value = "")
  public ImagePath getProfilePath() {
    return profilePath;
  }

  public void setProfilePath(ImagePath profilePath) {
    this.profilePath = profilePath;
  }

  public PersonListResultsObject adult(Boolean adult) {
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

  public PersonListResultsObject id(Integer id) {
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

  public PersonListResultsObject knownFor(List<Object> knownFor) {
    this.knownFor = knownFor;
    return this;
  }

  public PersonListResultsObject addKnownForItem(Object knownForItem) {
    if (this.knownFor == null) {
      this.knownFor = new ArrayList<Object>();
    }
    this.knownFor.add(knownForItem);
    return this;
  }

   /**
   * Get knownFor
   * @return knownFor
  **/
  @ApiModelProperty(value = "")
  public List<Object> getKnownFor() {
    return knownFor;
  }

  public void setKnownFor(List<Object> knownFor) {
    this.knownFor = knownFor;
  }

  public PersonListResultsObject name(String name) {
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

  public PersonListResultsObject popularity(BigDecimal popularity) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonListResultsObject personListResultsObject = (PersonListResultsObject) o;
    return Objects.equals(this.profilePath, personListResultsObject.profilePath) &&
        Objects.equals(this.adult, personListResultsObject.adult) &&
        Objects.equals(this.id, personListResultsObject.id) &&
        Objects.equals(this.knownFor, personListResultsObject.knownFor) &&
        Objects.equals(this.name, personListResultsObject.name) &&
        Objects.equals(this.popularity, personListResultsObject.popularity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profilePath, adult, id, knownFor, name, popularity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonListResultsObject {\n");
    
    sb.append("    profilePath: ").append(toIndentedString(profilePath)).append("\n");
    sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    knownFor: ").append(toIndentedString(knownFor)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
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

