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
import io.swagger.client.model.InlineResponse20085Items;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20085Changes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20085Changes {
  @SerializedName("key")
  private String key = null;

  @SerializedName("items")
  private List<InlineResponse20085Items> items = null;

  public InlineResponse20085Changes key(String key) {
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

  public InlineResponse20085Changes items(List<InlineResponse20085Items> items) {
    this.items = items;
    return this;
  }

  public InlineResponse20085Changes addItemsItem(InlineResponse20085Items itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<InlineResponse20085Items>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20085Items> getItems() {
    return items;
  }

  public void setItems(List<InlineResponse20085Items> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20085Changes inlineResponse20085Changes = (InlineResponse20085Changes) o;
    return Objects.equals(this.key, inlineResponse20085Changes.key) &&
        Objects.equals(this.items, inlineResponse20085Changes.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20085Changes {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
