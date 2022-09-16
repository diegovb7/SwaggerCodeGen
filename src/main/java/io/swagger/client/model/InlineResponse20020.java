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
import io.swagger.client.model.InlineResponse20020Translations;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20020
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20020 {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("translations")
  private List<InlineResponse20020Translations> translations = null;

  public InlineResponse20020 id(Integer id) {
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

  public InlineResponse20020 translations(List<InlineResponse20020Translations> translations) {
    this.translations = translations;
    return this;
  }

  public InlineResponse20020 addTranslationsItem(InlineResponse20020Translations translationsItem) {
    if (this.translations == null) {
      this.translations = new ArrayList<InlineResponse20020Translations>();
    }
    this.translations.add(translationsItem);
    return this;
  }

   /**
   * Get translations
   * @return translations
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20020Translations> getTranslations() {
    return translations;
  }

  public void setTranslations(List<InlineResponse20020Translations> translations) {
    this.translations = translations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20020 inlineResponse20020 = (InlineResponse20020) o;
    return Objects.equals(this.id, inlineResponse20020.id) &&
        Objects.equals(this.translations, inlineResponse20020.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, translations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20020 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
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
