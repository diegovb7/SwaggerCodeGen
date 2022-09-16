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
import java.math.BigDecimal;

/**
 * InlineResponse20041Stills
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20041Stills {
  @SerializedName("aspect_ratio")
  private BigDecimal aspectRatio = null;

  @SerializedName("file_path")
  private String filePath = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("vote_count")
  private Integer voteCount = null;

  @SerializedName("width")
  private Integer width = null;

  public InlineResponse20041Stills aspectRatio(BigDecimal aspectRatio) {
    this.aspectRatio = aspectRatio;
    return this;
  }

   /**
   * Get aspectRatio
   * @return aspectRatio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAspectRatio() {
    return aspectRatio;
  }

  public void setAspectRatio(BigDecimal aspectRatio) {
    this.aspectRatio = aspectRatio;
  }

  public InlineResponse20041Stills filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

   /**
   * Get filePath
   * @return filePath
  **/
  @ApiModelProperty(value = "")
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public InlineResponse20041Stills height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public InlineResponse20041Stills voteCount(Integer voteCount) {
    this.voteCount = voteCount;
    return this;
  }

   /**
   * Get voteCount
   * @return voteCount
  **/
  @ApiModelProperty(value = "")
  public Integer getVoteCount() {
    return voteCount;
  }

  public void setVoteCount(Integer voteCount) {
    this.voteCount = voteCount;
  }

  public InlineResponse20041Stills width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(value = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20041Stills inlineResponse20041Stills = (InlineResponse20041Stills) o;
    return Objects.equals(this.aspectRatio, inlineResponse20041Stills.aspectRatio) &&
        Objects.equals(this.filePath, inlineResponse20041Stills.filePath) &&
        Objects.equals(this.height, inlineResponse20041Stills.height) &&
        Objects.equals(this.voteCount, inlineResponse20041Stills.voteCount) &&
        Objects.equals(this.width, inlineResponse20041Stills.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspectRatio, filePath, height, voteCount, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20041Stills {\n");
    
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

