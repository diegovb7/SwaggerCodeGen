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
import io.swagger.client.model.InlineResponse20047Results;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20047
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20047 {
  @SerializedName("page")
  private Integer page = null;

  @SerializedName("results")
  private List<InlineResponse20047Results> results = null;

  @SerializedName("total_pages")
  private Integer totalPages = null;

  @SerializedName("total_results")
  private Integer totalResults = null;

  public InlineResponse20047 page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public InlineResponse20047 results(List<InlineResponse20047Results> results) {
    this.results = results;
    return this;
  }

  public InlineResponse20047 addResultsItem(InlineResponse20047Results resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<InlineResponse20047Results>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20047Results> getResults() {
    return results;
  }

  public void setResults(List<InlineResponse20047Results> results) {
    this.results = results;
  }

  public InlineResponse20047 totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public InlineResponse20047 totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

   /**
   * Get totalResults
   * @return totalResults
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20047 inlineResponse20047 = (InlineResponse20047) o;
    return Objects.equals(this.page, inlineResponse20047.page) &&
        Objects.equals(this.results, inlineResponse20047.results) &&
        Objects.equals(this.totalPages, inlineResponse20047.totalPages) &&
        Objects.equals(this.totalResults, inlineResponse20047.totalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, results, totalPages, totalResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20047 {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
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

