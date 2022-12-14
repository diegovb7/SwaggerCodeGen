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
import io.swagger.client.model.InlineResponse20049CertificationsUS;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20054Certifications
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20054Certifications {
  @SerializedName("US")
  private List<InlineResponse20049CertificationsUS> US = null;

  @SerializedName("CA")
  private List<InlineResponse20049CertificationsUS> CA = null;

  @SerializedName("DE")
  private List<InlineResponse20049CertificationsUS> DE = null;

  @SerializedName("GB")
  private List<InlineResponse20049CertificationsUS> GB = null;

  @SerializedName("AU")
  private List<InlineResponse20049CertificationsUS> AU = null;

  @SerializedName("BR")
  private List<InlineResponse20049CertificationsUS> BR = null;

  @SerializedName("FR")
  private List<InlineResponse20049CertificationsUS> FR = null;

  @SerializedName("NZ")
  private List<InlineResponse20049CertificationsUS> NZ = null;

  @SerializedName("IN")
  private List<InlineResponse20049CertificationsUS> IN = null;

  public InlineResponse20054Certifications US(List<InlineResponse20049CertificationsUS> US) {
    this.US = US;
    return this;
  }

  public InlineResponse20054Certifications addUSItem(InlineResponse20049CertificationsUS USItem) {
    if (this.US == null) {
      this.US = new ArrayList<InlineResponse20049CertificationsUS>();
    }
    this.US.add(USItem);
    return this;
  }

   /**
   * Get US
   * @return US
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20049CertificationsUS> getUS() {
    return US;
  }

  public void setUS(List<InlineResponse20049CertificationsUS> US) {
    this.US = US;
  }

  public InlineResponse20054Certifications CA(List<InlineResponse20049CertificationsUS> CA) {
    this.CA = CA;
    return this;
  }

  public InlineResponse20054Certifications addCAItem(InlineResponse20049CertificationsUS CAItem) {
    if (this.CA == null) {
      this.CA = new ArrayList<InlineResponse20049CertificationsUS>();
    }
    this.CA.add(CAItem);
    return this;
  }

   /**
   * Get CA
   * @return CA
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20049CertificationsUS> getCA() {
    return CA;
  }

  public void setCA(List<InlineResponse20049CertificationsUS> CA) {
    this.CA = CA;
  }

  public InlineResponse20054Certifications DE(List<InlineResponse20049CertificationsUS> DE) {
    this.DE = DE;
    return this;
  }

  public InlineResponse20054Certifications addDEItem(InlineResponse20049CertificationsUS DEItem) {
    if (this.DE == null) {
      this.DE = new ArrayList<InlineResponse20049CertificationsUS>();
    }
    this.DE.add(DEItem);
    return this;
  }

   /**
   * Get DE
   * @return DE
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20049CertificationsUS> getDE() {
    return DE;
  }

  public void setDE(List<InlineResponse20049CertificationsUS> DE) {
    this.DE = DE;
  }

  public InlineResponse20054Certifications GB(List<InlineResponse20049CertificationsUS> GB) {
    this.GB = GB;
    return this;
  }

  public InlineResponse20054Certifications addGBItem(InlineResponse20049CertificationsUS GBItem) {
    if (this.GB == null) {
      this.GB = new ArrayList<InlineResponse20049CertificationsUS>();
    }
    this.GB.add(GBItem);
    return this;
  }

   /**
   * Get GB
   * @return GB
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20049CertificationsUS> getGB() {
    return GB;
  }

  public void setGB(List<InlineResponse20049CertificationsUS> GB) {
    this.GB = GB;
  }

  public InlineResponse20054Certifications AU(List<InlineResponse20049CertificationsUS> AU) {
    this.AU = AU;
    return this;
  }

  public InlineResponse20054Certifications addAUItem(InlineResponse20049CertificationsUS AUItem) {
    if (this.AU == null) {
      this.AU = new ArrayList<InlineResponse20049CertificationsUS>();
    }
    this.AU.add(AUItem);
    return this;
  }

   /**
   * Get AU
   * @return AU
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20049CertificationsUS> getAU() {
    return AU;
  }

  public void setAU(List<InlineResponse20049CertificationsUS> AU) {
    this.AU = AU;
  }

  public InlineResponse20054Certifications BR(List<InlineResponse20049CertificationsUS> BR) {
    this.BR = BR;
    return this;
  }

  public InlineResponse20054Certifications addBRItem(InlineResponse20049CertificationsUS BRItem) {
    if (this.BR == null) {
      this.BR = new ArrayList<InlineResponse20049CertificationsUS>();
    }
    this.BR.add(BRItem);
    return this;
  }

   /**
   * Get BR
   * @return BR
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20049CertificationsUS> getBR() {
    return BR;
  }

  public void setBR(List<InlineResponse20049CertificationsUS> BR) {
    this.BR = BR;
  }

  public InlineResponse20054Certifications FR(List<InlineResponse20049CertificationsUS> FR) {
    this.FR = FR;
    return this;
  }

  public InlineResponse20054Certifications addFRItem(InlineResponse20049CertificationsUS FRItem) {
    if (this.FR == null) {
      this.FR = new ArrayList<InlineResponse20049CertificationsUS>();
    }
    this.FR.add(FRItem);
    return this;
  }

   /**
   * Get FR
   * @return FR
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20049CertificationsUS> getFR() {
    return FR;
  }

  public void setFR(List<InlineResponse20049CertificationsUS> FR) {
    this.FR = FR;
  }

  public InlineResponse20054Certifications NZ(List<InlineResponse20049CertificationsUS> NZ) {
    this.NZ = NZ;
    return this;
  }

  public InlineResponse20054Certifications addNZItem(InlineResponse20049CertificationsUS NZItem) {
    if (this.NZ == null) {
      this.NZ = new ArrayList<InlineResponse20049CertificationsUS>();
    }
    this.NZ.add(NZItem);
    return this;
  }

   /**
   * Get NZ
   * @return NZ
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20049CertificationsUS> getNZ() {
    return NZ;
  }

  public void setNZ(List<InlineResponse20049CertificationsUS> NZ) {
    this.NZ = NZ;
  }

  public InlineResponse20054Certifications IN(List<InlineResponse20049CertificationsUS> IN) {
    this.IN = IN;
    return this;
  }

  public InlineResponse20054Certifications addINItem(InlineResponse20049CertificationsUS INItem) {
    if (this.IN == null) {
      this.IN = new ArrayList<InlineResponse20049CertificationsUS>();
    }
    this.IN.add(INItem);
    return this;
  }

   /**
   * Get IN
   * @return IN
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20049CertificationsUS> getIN() {
    return IN;
  }

  public void setIN(List<InlineResponse20049CertificationsUS> IN) {
    this.IN = IN;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20054Certifications inlineResponse20054Certifications = (InlineResponse20054Certifications) o;
    return Objects.equals(this.US, inlineResponse20054Certifications.US) &&
        Objects.equals(this.CA, inlineResponse20054Certifications.CA) &&
        Objects.equals(this.DE, inlineResponse20054Certifications.DE) &&
        Objects.equals(this.GB, inlineResponse20054Certifications.GB) &&
        Objects.equals(this.AU, inlineResponse20054Certifications.AU) &&
        Objects.equals(this.BR, inlineResponse20054Certifications.BR) &&
        Objects.equals(this.FR, inlineResponse20054Certifications.FR) &&
        Objects.equals(this.NZ, inlineResponse20054Certifications.NZ) &&
        Objects.equals(this.IN, inlineResponse20054Certifications.IN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(US, CA, DE, GB, AU, BR, FR, NZ, IN);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20054Certifications {\n");
    
    sb.append("    US: ").append(toIndentedString(US)).append("\n");
    sb.append("    CA: ").append(toIndentedString(CA)).append("\n");
    sb.append("    DE: ").append(toIndentedString(DE)).append("\n");
    sb.append("    GB: ").append(toIndentedString(GB)).append("\n");
    sb.append("    AU: ").append(toIndentedString(AU)).append("\n");
    sb.append("    BR: ").append(toIndentedString(BR)).append("\n");
    sb.append("    FR: ").append(toIndentedString(FR)).append("\n");
    sb.append("    NZ: ").append(toIndentedString(NZ)).append("\n");
    sb.append("    IN: ").append(toIndentedString(IN)).append("\n");
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

