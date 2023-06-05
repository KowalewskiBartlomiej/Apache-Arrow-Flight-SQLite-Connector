/*
 * 
 * 
 *
 * 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.ibm.wdp.connect.common.sdk.api.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.wdp.connect.common.sdk.api.models.DiscoveryPathSegment;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The definition of a Discovery path property.
 */
@Schema(description = "The definition of a Discovery path property.")

public class DiscoveryPathProperty {
  @JsonProperty("property_name")
  @SerializedName("property_name")
  private String propertyName = null;

  @JsonProperty("segments")
  @SerializedName("segments")
  private List<DiscoveryPathSegment> segments = null;

  public DiscoveryPathProperty propertyName(String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

   /**
   * The name of the path property.
   * @return propertyName
  **/
  @Schema(description = "The name of the path property.")
  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public DiscoveryPathProperty segments(List<DiscoveryPathSegment> segments) {
    this.segments = segments;
    return this;
  }

  public DiscoveryPathProperty addSegmentsItem(DiscoveryPathSegment segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
    this.segments.add(segmentsItem);
    return this;
  }

   /**
   * The segments of the path property.
   * @return segments
  **/
  @Schema(description = "The segments of the path property.")
  public List<DiscoveryPathSegment> getSegments() {
    return segments;
  }

  public void setSegments(List<DiscoveryPathSegment> segments) {
    this.segments = segments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscoveryPathProperty discoveryPathProperty = (DiscoveryPathProperty) o;
    return Objects.equals(this.propertyName, discoveryPathProperty.propertyName) &&
        Objects.equals(this.segments, discoveryPathProperty.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyName, segments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscoveryPathProperty {\n");
    
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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
