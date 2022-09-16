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
 * InlineResponse20068Items
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20068Items {
  @SerializedName("id")
  private String id = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("time")
  private String time = null;

  @SerializedName("iso_639_1")
  private String iso6391 = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("original_value")
  private String originalValue = null;

  public InlineResponse20068Items id(String id) {
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

  public InlineResponse20068Items action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(value = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public InlineResponse20068Items time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(value = "")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public InlineResponse20068Items iso6391(String iso6391) {
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

  public InlineResponse20068Items value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public InlineResponse20068Items originalValue(String originalValue) {
    this.originalValue = originalValue;
    return this;
  }

   /**
   * Get originalValue
   * @return originalValue
  **/
  @ApiModelProperty(value = "")
  public String getOriginalValue() {
    return originalValue;
  }

  public void setOriginalValue(String originalValue) {
    this.originalValue = originalValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20068Items inlineResponse20068Items = (InlineResponse20068Items) o;
    return Objects.equals(this.id, inlineResponse20068Items.id) &&
        Objects.equals(this.action, inlineResponse20068Items.action) &&
        Objects.equals(this.time, inlineResponse20068Items.time) &&
        Objects.equals(this.iso6391, inlineResponse20068Items.iso6391) &&
        Objects.equals(this.value, inlineResponse20068Items.value) &&
        Objects.equals(this.originalValue, inlineResponse20068Items.originalValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, action, time, iso6391, value, originalValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20068Items {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    iso6391: ").append(toIndentedString(iso6391)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
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

