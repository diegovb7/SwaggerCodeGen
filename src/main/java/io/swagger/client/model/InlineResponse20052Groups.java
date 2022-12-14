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
import io.swagger.client.model.InlineResponse20052Episodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20052Groups
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class InlineResponse20052Groups {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("episodes")
  private List<InlineResponse20052Episodes> episodes = null;

  @SerializedName("locked")
  private Boolean locked = null;

  public InlineResponse20052Groups id(String id) {
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

  public InlineResponse20052Groups name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse20052Groups order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public InlineResponse20052Groups episodes(List<InlineResponse20052Episodes> episodes) {
    this.episodes = episodes;
    return this;
  }

  public InlineResponse20052Groups addEpisodesItem(InlineResponse20052Episodes episodesItem) {
    if (this.episodes == null) {
      this.episodes = new ArrayList<InlineResponse20052Episodes>();
    }
    this.episodes.add(episodesItem);
    return this;
  }

   /**
   * Get episodes
   * @return episodes
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20052Episodes> getEpisodes() {
    return episodes;
  }

  public void setEpisodes(List<InlineResponse20052Episodes> episodes) {
    this.episodes = episodes;
  }

  public InlineResponse20052Groups locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @ApiModelProperty(value = "")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20052Groups inlineResponse20052Groups = (InlineResponse20052Groups) o;
    return Objects.equals(this.id, inlineResponse20052Groups.id) &&
        Objects.equals(this.name, inlineResponse20052Groups.name) &&
        Objects.equals(this.order, inlineResponse20052Groups.order) &&
        Objects.equals(this.episodes, inlineResponse20052Groups.episodes) &&
        Objects.equals(this.locked, inlineResponse20052Groups.locked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, order, episodes, locked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20052Groups {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    episodes: ").append(toIndentedString(episodes)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
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

