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
import io.swagger.client.model.InlineResponse20034Crew;
import io.swagger.client.model.InlineResponse20038Cast;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20038
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20038 {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("cast")
  private List<InlineResponse20038Cast> cast = null;

  @SerializedName("crew")
  private List<InlineResponse20034Crew> crew = null;

  public InlineResponse20038 id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InlineResponse20038 cast(List<InlineResponse20038Cast> cast) {
    this.cast = cast;
    return this;
  }

  public InlineResponse20038 addCastItem(InlineResponse20038Cast castItem) {
    if (this.cast == null) {
      this.cast = new ArrayList<InlineResponse20038Cast>();
    }
    this.cast.add(castItem);
    return this;
  }

   /**
   * Get cast
   * @return cast
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20038Cast> getCast() {
    return cast;
  }

  public void setCast(List<InlineResponse20038Cast> cast) {
    this.cast = cast;
  }

  public InlineResponse20038 crew(List<InlineResponse20034Crew> crew) {
    this.crew = crew;
    return this;
  }

  public InlineResponse20038 addCrewItem(InlineResponse20034Crew crewItem) {
    if (this.crew == null) {
      this.crew = new ArrayList<InlineResponse20034Crew>();
    }
    this.crew.add(crewItem);
    return this;
  }

   /**
   * Get crew
   * @return crew
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20034Crew> getCrew() {
    return crew;
  }

  public void setCrew(List<InlineResponse20034Crew> crew) {
    this.crew = crew;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20038 inlineResponse20038 = (InlineResponse20038) o;
    return Objects.equals(this.id, inlineResponse20038.id) &&
        Objects.equals(this.cast, inlineResponse20038.cast) &&
        Objects.equals(this.crew, inlineResponse20038.crew);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cast, crew);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20038 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cast: ").append(toIndentedString(cast)).append("\n");
    sb.append("    crew: ").append(toIndentedString(crew)).append("\n");
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

