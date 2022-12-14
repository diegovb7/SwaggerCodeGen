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
import io.swagger.client.model.InlineResponse20067Data;
import java.io.IOException;

/**
 * InlineResponse20067Translations
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20067Translations {
  @SerializedName("iso_639_1")
  private String iso6391 = null;

  @SerializedName("iso_3166_1")
  private String iso31661 = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("data")
  private InlineResponse20067Data data = null;

  @SerializedName("english_name")
  private String englishName = null;

  public InlineResponse20067Translations iso6391(String iso6391) {
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

  public InlineResponse20067Translations iso31661(String iso31661) {
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

  public InlineResponse20067Translations name(String name) {
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

  public InlineResponse20067Translations data(InlineResponse20067Data data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public InlineResponse20067Data getData() {
    return data;
  }

  public void setData(InlineResponse20067Data data) {
    this.data = data;
  }

  public InlineResponse20067Translations englishName(String englishName) {
    this.englishName = englishName;
    return this;
  }

   /**
   * Get englishName
   * @return englishName
  **/
  @ApiModelProperty(value = "")
  public String getEnglishName() {
    return englishName;
  }

  public void setEnglishName(String englishName) {
    this.englishName = englishName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20067Translations inlineResponse20067Translations = (InlineResponse20067Translations) o;
    return Objects.equals(this.iso6391, inlineResponse20067Translations.iso6391) &&
        Objects.equals(this.iso31661, inlineResponse20067Translations.iso31661) &&
        Objects.equals(this.name, inlineResponse20067Translations.name) &&
        Objects.equals(this.data, inlineResponse20067Translations.data) &&
        Objects.equals(this.englishName, inlineResponse20067Translations.englishName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iso6391, iso31661, name, data, englishName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20067Translations {\n");
    
    sb.append("    iso6391: ").append(toIndentedString(iso6391)).append("\n");
    sb.append("    iso31661: ").append(toIndentedString(iso31661)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    englishName: ").append(toIndentedString(englishName)).append("\n");
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

