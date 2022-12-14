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
 * InlineResponse2007Results
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse2007Results {
  @SerializedName("description")
  private String description = null;

  @SerializedName("favorite_count")
  private Integer favoriteCount = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("item_count")
  private Integer itemCount = null;

  @SerializedName("iso_639_1")
  private String iso6391 = null;

  @SerializedName("list_type")
  private String listType = null;

  @SerializedName("name")
  private String name = null;

  public InlineResponse2007Results description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InlineResponse2007Results favoriteCount(Integer favoriteCount) {
    this.favoriteCount = favoriteCount;
    return this;
  }

   /**
   * Get favoriteCount
   * @return favoriteCount
  **/
  @ApiModelProperty(value = "")
  public Integer getFavoriteCount() {
    return favoriteCount;
  }

  public void setFavoriteCount(Integer favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  public InlineResponse2007Results id(Integer id) {
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

  public InlineResponse2007Results itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

   /**
   * Get itemCount
   * @return itemCount
  **/
  @ApiModelProperty(value = "")
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  public InlineResponse2007Results iso6391(String iso6391) {
    this.iso6391 = iso6391;
    return this;
  }

   /**
   * Get iso6391
   * @return iso6391
  **/
  @ApiModelProperty(value = "")
  public String getIso6391() {
    return iso6391;
  }

  public void setIso6391(String iso6391) {
    this.iso6391 = iso6391;
  }

  public InlineResponse2007Results listType(String listType) {
    this.listType = listType;
    return this;
  }

   /**
   * Get listType
   * @return listType
  **/
  @ApiModelProperty(value = "")
  public String getListType() {
    return listType;
  }

  public void setListType(String listType) {
    this.listType = listType;
  }

  public InlineResponse2007Results name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007Results inlineResponse2007Results = (InlineResponse2007Results) o;
    return Objects.equals(this.description, inlineResponse2007Results.description) &&
        Objects.equals(this.favoriteCount, inlineResponse2007Results.favoriteCount) &&
        Objects.equals(this.id, inlineResponse2007Results.id) &&
        Objects.equals(this.itemCount, inlineResponse2007Results.itemCount) &&
        Objects.equals(this.iso6391, inlineResponse2007Results.iso6391) &&
        Objects.equals(this.listType, inlineResponse2007Results.listType) &&
        Objects.equals(this.name, inlineResponse2007Results.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, favoriteCount, id, itemCount, iso6391, listType, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007Results {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    favoriteCount: ").append(toIndentedString(favoriteCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    iso6391: ").append(toIndentedString(iso6391)).append("\n");
    sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

