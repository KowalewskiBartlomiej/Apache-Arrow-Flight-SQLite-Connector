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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The definition of a Discovery asset type.
 */
@Schema(description = "The definition of a Discovery asset type.")

public class DiscoveryAssetType {
  @JsonProperty("name")
  @SerializedName("name")
  private String name = null;

  @JsonProperty("label")
  @SerializedName("label")
  private String label = null;

  @JsonProperty("next_level_filters")
  @SerializedName("next_level_filters")
  private List<String> nextLevelFilters = null;

  public DiscoveryAssetType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the asset type.
   * @return name
  **/
  @Schema(description = "The name of the asset type.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DiscoveryAssetType label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The label of the asset type.
   * @return label
  **/
  @Schema(description = "The label of the asset type.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public DiscoveryAssetType nextLevelFilters(List<String> nextLevelFilters) {
    this.nextLevelFilters = nextLevelFilters;
    return this;
  }

  public DiscoveryAssetType addNextLevelFiltersItem(String nextLevelFiltersItem) {
    if (this.nextLevelFilters == null) {
      this.nextLevelFilters = new ArrayList<>();
    }
    this.nextLevelFilters.add(nextLevelFiltersItem);
    return this;
  }

   /**
   * The filters which can be used to discover the next level of assets.
   * @return nextLevelFilters
  **/
  @Schema(description = "The filters which can be used to discover the next level of assets.")
  public List<String> getNextLevelFilters() {
    return nextLevelFilters;
  }

  public void setNextLevelFilters(List<String> nextLevelFilters) {
    this.nextLevelFilters = nextLevelFilters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscoveryAssetType discoveryAssetType = (DiscoveryAssetType) o;
    return Objects.equals(this.name, discoveryAssetType.name) &&
        Objects.equals(this.label, discoveryAssetType.label) &&
        Objects.equals(this.nextLevelFilters, discoveryAssetType.nextLevelFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, label, nextLevelFilters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscoveryAssetType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    nextLevelFilters: ").append(toIndentedString(nextLevelFilters)).append("\n");
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
