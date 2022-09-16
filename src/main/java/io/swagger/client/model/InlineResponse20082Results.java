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
import io.swagger.client.model.InlineResponse20082AuthorDetails;
import java.io.IOException;

/**
 * InlineResponse20082Results
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20082Results {
  @SerializedName("author")
  private String author = null;

  @SerializedName("author_details")
  private InlineResponse20082AuthorDetails authorDetails = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  @SerializedName("url")
  private String url = null;

  public InlineResponse20082Results author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(value = "")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public InlineResponse20082Results authorDetails(InlineResponse20082AuthorDetails authorDetails) {
    this.authorDetails = authorDetails;
    return this;
  }

   /**
   * Get authorDetails
   * @return authorDetails
  **/
  @ApiModelProperty(value = "")
  public InlineResponse20082AuthorDetails getAuthorDetails() {
    return authorDetails;
  }

  public void setAuthorDetails(InlineResponse20082AuthorDetails authorDetails) {
    this.authorDetails = authorDetails;
  }

  public InlineResponse20082Results content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public InlineResponse20082Results createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public InlineResponse20082Results id(String id) {
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

  public InlineResponse20082Results updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public InlineResponse20082Results url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20082Results inlineResponse20082Results = (InlineResponse20082Results) o;
    return Objects.equals(this.author, inlineResponse20082Results.author) &&
        Objects.equals(this.authorDetails, inlineResponse20082Results.authorDetails) &&
        Objects.equals(this.content, inlineResponse20082Results.content) &&
        Objects.equals(this.createdAt, inlineResponse20082Results.createdAt) &&
        Objects.equals(this.id, inlineResponse20082Results.id) &&
        Objects.equals(this.updatedAt, inlineResponse20082Results.updatedAt) &&
        Objects.equals(this.url, inlineResponse20082Results.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, authorDetails, content, createdAt, id, updatedAt, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20082Results {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authorDetails: ").append(toIndentedString(authorDetails)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

