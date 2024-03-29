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
import Models.Order;
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
 * PaginatedOrders
 */


public class PaginatedOrders {
  @SerializedName("results")
  private List<Order> results = null;

  @SerializedName("start")
  private Integer start = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("limitMax")
  private Integer limitMax = null;

  @SerializedName("length")
  private Integer length = null;

  @SerializedName("total")
  private Integer total = null;

  public PaginatedOrders results(List<Order> results) {
    this.results = results;
    return this;
  }

  public PaginatedOrders addResultsItem(Order resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Order>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Page of orders
   * @return results
  **/
  @Schema(description = "Page of orders")
  public List<Order> getResults() {
    return results;
  }

  public void setResults(List<Order> results) {
    this.results = results;
  }

  public PaginatedOrders start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * The start index position in query results page
   * @return start
  **/
  @Schema(description = "The start index position in query results page")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public PaginatedOrders limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The number of items per page
   * @return limit
  **/
  @Schema(description = "The number of items per page")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public PaginatedOrders limitMax(Integer limitMax) {
    this.limitMax = limitMax;
    return this;
  }

   /**
   * The maximum number of items per page supported by the endpoint
   * @return limitMax
  **/
  @Schema(description = "The maximum number of items per page supported by the endpoint")
  public Integer getLimitMax() {
    return limitMax;
  }

  public void setLimitMax(Integer limitMax) {
    this.limitMax = limitMax;
  }

  public PaginatedOrders length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * The number of items on current page
   * @return length
  **/
  @Schema(description = "The number of items on current page")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public PaginatedOrders total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * The total number of items on all pages
   * @return total
  **/
  @Schema(description = "The total number of items on all pages")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedOrders paginatedOrders = (PaginatedOrders) o;
    return Objects.equals(this.results, paginatedOrders.results) &&
        Objects.equals(this.start, paginatedOrders.start) &&
        Objects.equals(this.limit, paginatedOrders.limit) &&
        Objects.equals(this.limitMax, paginatedOrders.limitMax) &&
        Objects.equals(this.length, paginatedOrders.length) &&
        Objects.equals(this.total, paginatedOrders.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, start, limit, limitMax, length, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedOrders {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    limitMax: ").append(toIndentedString(limitMax)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
