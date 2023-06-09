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
import com.ibm.wdp.connect.common.sdk.api.models.ConnectionActionConfiguration;
import com.ibm.wdp.connect.common.sdk.api.models.ConnectionProperties;
import com.ibm.wdp.connect.common.sdk.api.models.CustomFlightAssetDescriptor;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The body of a request to the DoAction RPC method of a custom Arrow Flight service.
 */
@Schema(description = "The body of a request to the DoAction RPC method of a custom Arrow Flight service.")

public class CustomFlightActionRequest {
  @JsonProperty("datasource_type_name")
  @SerializedName("datasource_type_name")
  private String datasourceTypeName = null;

  @JsonProperty("connection_properties")
  @SerializedName("connection_properties")
  private ConnectionProperties connectionProperties = null;

  @JsonProperty("request_properties")
  @SerializedName("request_properties")
  private ConnectionActionConfiguration requestProperties = null;

  @JsonProperty("asset")
  @SerializedName("asset")
  private CustomFlightAssetDescriptor asset = null;

  public CustomFlightActionRequest datasourceTypeName(String datasourceTypeName) {
    this.datasourceTypeName = datasourceTypeName;
    return this;
  }

   /**
   * The unique name of the custom Arrow Flight data source type.
   * @return datasourceTypeName
  **/
  @Schema(description = "The unique name of the custom Arrow Flight data source type.")
  public String getDatasourceTypeName() {
    return datasourceTypeName;
  }

  public void setDatasourceTypeName(String datasourceTypeName) {
    this.datasourceTypeName = datasourceTypeName;
  }

  public CustomFlightActionRequest connectionProperties(ConnectionProperties connectionProperties) {
    this.connectionProperties = connectionProperties;
    return this;
  }

   /**
   * Get connectionProperties
   * @return connectionProperties
  **/
  @Schema(description = "")
  public ConnectionProperties getConnectionProperties() {
    return connectionProperties;
  }

  public void setConnectionProperties(ConnectionProperties connectionProperties) {
    this.connectionProperties = connectionProperties;
  }

  public CustomFlightActionRequest requestProperties(ConnectionActionConfiguration requestProperties) {
    this.requestProperties = requestProperties;
    return this;
  }

   /**
   * Get requestProperties
   * @return requestProperties
  **/
  @Schema(description = "")
  public ConnectionActionConfiguration getRequestProperties() {
    return requestProperties;
  }

  public void setRequestProperties(ConnectionActionConfiguration requestProperties) {
    this.requestProperties = requestProperties;
  }

  public CustomFlightActionRequest asset(CustomFlightAssetDescriptor asset) {
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
    CustomFlightActionRequest customFlightActionRequest = (CustomFlightActionRequest) o;
    return Objects.equals(this.datasourceTypeName, customFlightActionRequest.datasourceTypeName) &&
        Objects.equals(this.connectionProperties, customFlightActionRequest.connectionProperties) &&
        Objects.equals(this.requestProperties, customFlightActionRequest.requestProperties) &&
        Objects.equals(this.asset, customFlightActionRequest.asset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasourceTypeName, connectionProperties, requestProperties, asset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFlightActionRequest {\n");
    
    sb.append("    datasourceTypeName: ").append(toIndentedString(datasourceTypeName)).append("\n");
    sb.append("    connectionProperties: ").append(toIndentedString(connectionProperties)).append("\n");
    sb.append("    requestProperties: ").append(toIndentedString(requestProperties)).append("\n");
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
