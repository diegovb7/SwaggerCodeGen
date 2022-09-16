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

/**
 * Body10
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-13T09:38:01.485+02:00")
public class Body10 {
  /**
   * Gets or Sets mediaType
   */
  @JsonAdapter(MediaTypeEnum.Adapter.class)
  public enum MediaTypeEnum {
    MOVIE("movie"),
    
    TV("tv");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MediaTypeEnum fromValue(String text) {
      for (MediaTypeEnum b : MediaTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MediaTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MediaTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MediaTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MediaTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("media_type")
  private MediaTypeEnum mediaType = null;

  @SerializedName("media_id")
  private Integer mediaId = null;

  @SerializedName("favorite")
  private Boolean favorite = null;

  public Body10 mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @ApiModelProperty(required = true, value = "")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }

  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  public Body10 mediaId(Integer mediaId) {
    this.mediaId = mediaId;
    return this;
  }

   /**
   * Get mediaId
   * @return mediaId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getMediaId() {
    return mediaId;
  }

  public void setMediaId(Integer mediaId) {
    this.mediaId = mediaId;
  }

  public Body10 favorite(Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

   /**
   * Get favorite
   * @return favorite
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isFavorite() {
    return favorite;
  }

  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body10 body10 = (Body10) o;
    return Objects.equals(this.mediaType, body10.mediaType) &&
        Objects.equals(this.mediaId, body10.mediaId) &&
        Objects.equals(this.favorite, body10.favorite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, mediaId, favorite);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body10 {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
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
