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
import io.swagger.client.model.InlineResponse20069Changes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20069
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20069 {
  @SerializedName("changes")
  private List<InlineResponse20069Changes> changes = null;

  public InlineResponse20069 changes(List<InlineResponse20069Changes> changes) {
    this.changes = changes;
    return this;
  }

  public InlineResponse20069 addChangesItem(InlineResponse20069Changes changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<InlineResponse20069Changes>();
    }
    this.changes.add(changesItem);
    return this;
  }

   /**
   * Get changes
   * @return changes
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20069Changes> getChanges() {
    return changes;
  }

  public void setChanges(List<InlineResponse20069Changes> changes) {
    this.changes = changes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20069 inlineResponse20069 = (InlineResponse20069) o;
    return Objects.equals(this.changes, inlineResponse20069.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20069 {\n");
    
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
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

