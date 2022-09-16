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
import io.swagger.client.model.InlineResponse2001ResultsARFlatrate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20087ResultsAT
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20087ResultsAT {
  @SerializedName("link")
  private String link = null;

  @SerializedName("rent")
  private List<InlineResponse2001ResultsARFlatrate> rent = null;

  @SerializedName("buy")
  private List<InlineResponse2001ResultsARFlatrate> buy = null;

  public InlineResponse20087ResultsAT link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public InlineResponse20087ResultsAT rent(List<InlineResponse2001ResultsARFlatrate> rent) {
    this.rent = rent;
    return this;
  }

  public InlineResponse20087ResultsAT addRentItem(InlineResponse2001ResultsARFlatrate rentItem) {
    if (this.rent == null) {
      this.rent = new ArrayList<InlineResponse2001ResultsARFlatrate>();
    }
    this.rent.add(rentItem);
    return this;
  }

   /**
   * Get rent
   * @return rent
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2001ResultsARFlatrate> getRent() {
    return rent;
  }

  public void setRent(List<InlineResponse2001ResultsARFlatrate> rent) {
    this.rent = rent;
  }

  public InlineResponse20087ResultsAT buy(List<InlineResponse2001ResultsARFlatrate> buy) {
    this.buy = buy;
    return this;
  }

  public InlineResponse20087ResultsAT addBuyItem(InlineResponse2001ResultsARFlatrate buyItem) {
    if (this.buy == null) {
      this.buy = new ArrayList<InlineResponse2001ResultsARFlatrate>();
    }
    this.buy.add(buyItem);
    return this;
  }

   /**
   * Get buy
   * @return buy
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2001ResultsARFlatrate> getBuy() {
    return buy;
  }

  public void setBuy(List<InlineResponse2001ResultsARFlatrate> buy) {
    this.buy = buy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20087ResultsAT inlineResponse20087ResultsAT = (InlineResponse20087ResultsAT) o;
    return Objects.equals(this.link, inlineResponse20087ResultsAT.link) &&
        Objects.equals(this.rent, inlineResponse20087ResultsAT.rent) &&
        Objects.equals(this.buy, inlineResponse20087ResultsAT.buy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, rent, buy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20087ResultsAT {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    rent: ").append(toIndentedString(rent)).append("\n");
    sb.append("    buy: ").append(toIndentedString(buy)).append("\n");
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
