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
 * InlineResponse20022Results
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20022Results {
  @SerializedName("iso_639_1")
  private String iso6391 = null;

  @SerializedName("iso_3166_1")
  private String iso31661 = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("site")
  private String site = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("official")
  private Boolean official = null;

  @SerializedName("published_at")
  private String publishedAt = null;

  @SerializedName("id")
  private String id = null;

  public InlineResponse20022Results iso6391(String iso6391) {
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

  public InlineResponse20022Results iso31661(String iso31661) {
    this.iso31661 = iso31661;
    return this;
  }

   /**
   * Get iso31661
   * @return iso31661
  **/
  @ApiModelProperty(value = "")
  public String getIso31661() {
    return iso31661;
  }

  public void setIso31661(String iso31661) {
    this.iso31661 = iso31661;
  }

  public InlineResponse20022Results name(String name) {
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

  public InlineResponse20022Results key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public InlineResponse20022Results site(String site) {
    this.site = site;
    return this;
  }

   /**
   * Get site
   * @return site
  **/
  @ApiModelProperty(value = "")
  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public InlineResponse20022Results size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public InlineResponse20022Results type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InlineResponse20022Results official(Boolean official) {
    this.official = official;
    return this;
  }

   /**
   * Get official
   * @return official
  **/
  @ApiModelProperty(value = "")
  public Boolean isOfficial() {
    return official;
  }

  public void setOfficial(Boolean official) {
    this.official = official;
  }

  public InlineResponse20022Results publishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

   /**
   * Get publishedAt
   * @return publishedAt
  **/
  @ApiModelProperty(value = "")
  public String getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
  }

  public InlineResponse20022Results id(String id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20022Results inlineResponse20022Results = (InlineResponse20022Results) o;
    return Objects.equals(this.iso6391, inlineResponse20022Results.iso6391) &&
        Objects.equals(this.iso31661, inlineResponse20022Results.iso31661) &&
        Objects.equals(this.name, inlineResponse20022Results.name) &&
        Objects.equals(this.key, inlineResponse20022Results.key) &&
        Objects.equals(this.site, inlineResponse20022Results.site) &&
        Objects.equals(this.size, inlineResponse20022Results.size) &&
        Objects.equals(this.type, inlineResponse20022Results.type) &&
        Objects.equals(this.official, inlineResponse20022Results.official) &&
        Objects.equals(this.publishedAt, inlineResponse20022Results.publishedAt) &&
        Objects.equals(this.id, inlineResponse20022Results.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iso6391, iso31661, name, key, site, size, type, official, publishedAt, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20022Results {\n");
    
    sb.append("    iso6391: ").append(toIndentedString(iso6391)).append("\n");
    sb.append("    iso31661: ").append(toIndentedString(iso31661)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    official: ").append(toIndentedString(official)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
