/*
 * Developer API
 * Get your API Key from the [Dashboard](/dashboard/).<br/>Send all API requests with http header `X-API-Key: YOUR-API-KEY-HERE`.<br/>Base URL: `https://secure.interactiveticketing.com/developers/api/v4`<br/>Contact support@interactiveticketing.com for help.
 *
 * OpenAPI spec version: v4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package Models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ScanPoint
 */


public class ScanPoint {
  @SerializedName("scanPointId")
  private Integer scanPointId = null;

  @SerializedName("name")
  private String name = null;

  public ScanPoint scanPointId(Integer scanPointId) {
    this.scanPointId = scanPointId;
    return this;
  }

   /**
   * The Scan Point ID
   * @return scanPointId
  **/
  @Schema(description = "The Scan Point ID")
  public Integer getScanPointId() {
    return scanPointId;
  }

  public void setScanPointId(Integer scanPointId) {
    this.scanPointId = scanPointId;
  }

  public ScanPoint name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The Scan Point name
   * @return name
  **/
  @Schema(description = "The Scan Point name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScanPoint scanPoint = (ScanPoint) o;
    return Objects.equals(this.scanPointId, scanPoint.scanPointId) &&
        Objects.equals(this.name, scanPoint.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scanPointId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScanPoint {\n");
    
    sb.append("    scanPointId: ").append(toIndentedString(scanPointId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
