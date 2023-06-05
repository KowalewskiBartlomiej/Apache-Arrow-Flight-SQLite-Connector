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
import com.ibm.wdp.connect.common.sdk.api.models.CustomDatasourceTypeActionProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The definition of a custom data source type action.
 */
@Schema(description = "The definition of a custom data source type action.")

public class CustomDatasourceTypeAction {
  @JsonProperty("name")
  @SerializedName("name")
  private String name = null;

  @JsonProperty("description")
  @SerializedName("description")
  private String description = null;

  @JsonProperty("properties")
  @SerializedName("properties")
  private CustomDatasourceTypeActionProperties properties = null;

  public CustomDatasourceTypeAction name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The action name.
   * @return name
  **/
  @Schema(description = "The action name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomDatasourceTypeAction description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the action.
   * @return description
  **/
  @Schema(description = "A description of the action.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CustomDatasourceTypeAction properties(CustomDatasourceTypeActionProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @Schema(description = "")
  public CustomDatasourceTypeActionProperties getProperties() {
    return properties;
  }

  public void setProperties(CustomDatasourceTypeActionProperties properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDatasourceTypeAction customDatasourceTypeAction = (CustomDatasourceTypeAction) o;
    return Objects.equals(this.name, customDatasourceTypeAction.name) &&
        Objects.equals(this.description, customDatasourceTypeAction.description) &&
        Objects.equals(this.properties, customDatasourceTypeAction.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDatasourceTypeAction {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
