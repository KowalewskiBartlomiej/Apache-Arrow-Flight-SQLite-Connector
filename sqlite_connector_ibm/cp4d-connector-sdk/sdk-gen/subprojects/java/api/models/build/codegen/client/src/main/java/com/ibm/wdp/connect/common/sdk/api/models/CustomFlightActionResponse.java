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
import com.ibm.wdp.connect.common.sdk.api.models.ConnectionActionResponse;
import com.ibm.wdp.connect.common.sdk.api.models.CustomFlightAssetDescriptor;
import com.ibm.wdp.connect.common.sdk.api.models.CustomFlightDatasourceTypes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Results of the DoAction RPC method from a custom Arrow Flight service.
 */
@Schema(description = "Results of the DoAction RPC method from a custom Arrow Flight service.")

public class CustomFlightActionResponse {
  @JsonProperty("datasource_types")
  @SerializedName("datasource_types")
  private CustomFlightDatasourceTypes datasourceTypes = null;

  @JsonProperty("response_properties")
  @SerializedName("response_properties")
  private ConnectionActionResponse responseProperties = null;

  @JsonProperty("asset")
  @SerializedName("asset")
  private CustomFlightAssetDescriptor asset = null;

  public CustomFlightActionResponse datasourceTypes(CustomFlightDatasourceTypes datasourceTypes) {
    this.datasourceTypes = datasourceTypes;
    return this;
  }

   /**
   * Get datasourceTypes
   * @return datasourceTypes
  **/
  @Schema(description = "")
  public CustomFlightDatasourceTypes getDatasourceTypes() {
    return datasourceTypes;
  }

  public void setDatasourceTypes(CustomFlightDatasourceTypes datasourceTypes) {
    this.datasourceTypes = datasourceTypes;
  }

  public CustomFlightActionResponse responseProperties(ConnectionActionResponse responseProperties) {
    this.responseProperties = responseProperties;
    return this;
  }

   /**
   * Get responseProperties
   * @return responseProperties
  **/
  @Schema(description = "")
  public ConnectionActionResponse getResponseProperties() {
    return responseProperties;
  }

  public void setResponseProperties(ConnectionActionResponse responseProperties) {
    this.responseProperties = responseProperties;
  }

  public CustomFlightActionResponse asset(CustomFlightAssetDescriptor asset) {
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @Schema(description = "")
  public CustomFlightAssetDescriptor getAsset() {
    return asset;
  }

  public void setAsset(CustomFlightAssetDescriptor asset) {
    this.asset = asset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFlightActionResponse customFlightActionResponse = (CustomFlightActionResponse) o;
    return Objects.equals(this.datasourceTypes, customFlightActionResponse.datasourceTypes) &&
        Objects.equals(this.responseProperties, customFlightActionResponse.responseProperties) &&
        Objects.equals(this.asset, customFlightActionResponse.asset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasourceTypes, responseProperties, asset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFlightActionResponse {\n");
    
    sb.append("    datasourceTypes: ").append(toIndentedString(datasourceTypes)).append("\n");
    sb.append("    responseProperties: ").append(toIndentedString(responseProperties)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
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
