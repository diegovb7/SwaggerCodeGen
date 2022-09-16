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
import io.swagger.client.model.MovieListObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20031
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20031 {
  @SerializedName("created_by")
  private String createdBy = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("favorite_count")
  private Integer favoriteCount = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("items")
  private List<MovieListObject> items = null;

  @SerializedName("item_count")
  private Integer itemCount = null;

  @SerializedName("iso_639_1")
  private String iso6391 = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("poster_path")
  private ImagePath posterPath = null;

  public InlineResponse20031 createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public InlineResponse20031 description(String description) {
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

  public InlineResponse20031 favoriteCount(Integer favoriteCount) {
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

  public InlineResponse20031 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse20031 items(List<MovieListObject> items) {
    this.items = items;
    return this;
  }

  public InlineResponse20031 addItemsItem(MovieListObject itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<MovieListObject>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<MovieListObject> getItems() {
    return items;
  }

  public void setItems(List<MovieListObject> items) {
    this.items = items;
  }

  public InlineResponse20031 itemCount(Integer itemCount) {
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

  public InlineResponse20031 iso6391(String iso6391) {
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

  public InlineResponse20031 name(String name) {
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

  public InlineResponse20031 posterPath(ImagePath posterPath) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20031 inlineResponse20031 = (InlineResponse20031) o;
    return Objects.equals(this.createdBy, inlineResponse20031.createdBy) &&
        Objects.equals(this.description, inlineResponse20031.description) &&
        Objects.equals(this.favoriteCount, inlineResponse20031.favoriteCount) &&
        Objects.equals(this.id, inlineResponse20031.id) &&
        Objects.equals(this.items, inlineResponse20031.items) &&
        Objects.equals(this.itemCount, inlineResponse20031.itemCount) &&
        Objects.equals(this.iso6391, inlineResponse20031.iso6391) &&
        Objects.equals(this.name, inlineResponse20031.name) &&
        Objects.equals(this.posterPath, inlineResponse20031.posterPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, description, favoriteCount, id, items, itemCount, iso6391, name, posterPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20031 {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    favoriteCount: ").append(toIndentedString(favoriteCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    iso6391: ").append(toIndentedString(iso6391)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    posterPath: ").append(toIndentedString(posterPath)).append("\n");
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
