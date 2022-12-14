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
import io.swagger.client.model.InlineResponse20054Certifications;
import java.io.IOException;

/**
 * InlineResponse20054
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20054 {
  @SerializedName("certifications")
  private InlineResponse20054Certifications certifications = null;

  public InlineResponse20054 certifications(InlineResponse20054Certifications certifications) {
    this.certifications = certifications;
    return this;
  }

   /**
   * Get certifications
   * @return certifications
  **/
  @ApiModelProperty(value = "")
  public InlineResponse20054Certifications getCertifications() {
    return certifications;
  }

  public void setCertifications(InlineResponse20054Certifications certifications) {
    this.certifications = certifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20054 inlineResponse20054 = (InlineResponse20054) o;
    return Objects.equals(this.certifications, inlineResponse20054.certifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20054 {\n");
    
    sb.append("    certifications: ").append(toIndentedString(certifications)).append("\n");
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

