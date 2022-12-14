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
import org.threeten.bp.LocalDate;

/**
 * InlineResponse20057Dates
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20057Dates {
  @SerializedName("maximum")
  private LocalDate maximum = null;

  @SerializedName("minimum")
  private LocalDate minimum = null;

  public InlineResponse20057Dates maximum(LocalDate maximum) {
    this.maximum = maximum;
    return this;
  }

   /**
   * Get maximum
   * @return maximum
  **/
  @ApiModelProperty(value = "")
  public LocalDate getMaximum() {
    return maximum;
  }

  public void setMaximum(LocalDate maximum) {
    this.maximum = maximum;
  }

  public InlineResponse20057Dates minimum(LocalDate minimum) {
    this.minimum = minimum;
    return this;
  }

   /**
   * Get minimum
   * @return minimum
  **/
  @ApiModelProperty(value = "")
  public LocalDate getMinimum() {
    return minimum;
  }

  public void setMinimum(LocalDate minimum) {
    this.minimum = minimum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20057Dates inlineResponse20057Dates = (InlineResponse20057Dates) o;
    return Objects.equals(this.maximum, inlineResponse20057Dates.maximum) &&
        Objects.equals(this.minimum, inlineResponse20057Dates.minimum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximum, minimum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20057Dates {\n");
    
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
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

