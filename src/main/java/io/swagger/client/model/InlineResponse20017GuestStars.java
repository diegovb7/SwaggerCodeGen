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
 * InlineResponse20017GuestStars
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20017GuestStars {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("credit_id")
  private String creditId = null;

  @SerializedName("character")
  private String character = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("profile_path")
  private ImagePath profilePath = null;

  public InlineResponse20017GuestStars id(Integer id) {
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

  public InlineResponse20017GuestStars name(String name) {
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

  public InlineResponse20017GuestStars creditId(String creditId) {
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

  public InlineResponse20017GuestStars character(String character) {
    this.character = character;
    return this;
  }

   /**
   * Get character
   * @return character
  **/
  @ApiModelProperty(value = "")
  public String getCharacter() {
    return character;
  }

  public void setCharacter(String character) {
    this.character = character;
  }

  public InlineResponse20017GuestStars order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public InlineResponse20017GuestStars profilePath(ImagePath profilePath) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20017GuestStars inlineResponse20017GuestStars = (InlineResponse20017GuestStars) o;
    return Objects.equals(this.id, inlineResponse20017GuestStars.id) &&
        Objects.equals(this.name, inlineResponse20017GuestStars.name) &&
        Objects.equals(this.creditId, inlineResponse20017GuestStars.creditId) &&
        Objects.equals(this.character, inlineResponse20017GuestStars.character) &&
        Objects.equals(this.order, inlineResponse20017GuestStars.order) &&
        Objects.equals(this.profilePath, inlineResponse20017GuestStars.profilePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, creditId, character, order, profilePath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20017GuestStars {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creditId: ").append(toIndentedString(creditId)).append("\n");
    sb.append("    character: ").append(toIndentedString(character)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    profilePath: ").append(toIndentedString(profilePath)).append("\n");
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
