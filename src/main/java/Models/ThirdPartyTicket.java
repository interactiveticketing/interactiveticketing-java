/*
 * Developer API
 * Get your API Key from the [Dashboard](/dashboard/).<br/>Send all API requests with http header `X-API-Key: YOUR-API-KEY-HERE`.<br/>Base URL: `https://secure.interactiveticketing.com/developers/api/v2`<br/>Contact support@interactiveticketing.com for help.
 *
 * OpenAPI spec version: v2
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
 * ThirdPartyTicket
 */


public class ThirdPartyTicket {
  @SerializedName("name")
  private String name = null;

  @SerializedName("price")
  private String price = null;

  public ThirdPartyTicket name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of ticket
   * @return name
  **/
  @Schema(description = "Name of ticket")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ThirdPartyTicket price(String price) {
    this.price = price;
    return this;
  }

   /**
   * Purchase price for the ticket
   * @return price
  **/
  @Schema(description = "Purchase price for the ticket")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdPartyTicket thirdPartyTicket = (ThirdPartyTicket) o;
    return Objects.equals(this.name, thirdPartyTicket.name) &&
        Objects.equals(this.price, thirdPartyTicket.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyTicket {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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