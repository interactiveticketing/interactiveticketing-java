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
import Models.Event;
import Models.OfflineTicket;
import Models.ThirdPartyTicket;
import Models.Ticket;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ScanResponse
 */


public class ScanResponse {
  @SerializedName("valid")
  private Boolean valid = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("details")
  private String details = null;

  @SerializedName("scanTime")
  private String scanTime = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("barcode")
  private String barcode = null;

  @SerializedName("scanPointId")
  private String scanPointId = null;

  @SerializedName("testMode")
  private Boolean testMode = null;

  @SerializedName("event")
  private Event event = null;

  @SerializedName("ticket")
  private Ticket ticket = null;

  @SerializedName("offlineTicket")
  private OfflineTicket offlineTicket = null;

  @SerializedName("thirdPartyTicket")
  private ThirdPartyTicket thirdPartyTicket = null;

  public ScanResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * True indicates scan passed validation
   * @return valid
  **/
  @Schema(description = "True indicates scan passed validation")
  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public ScanResponse code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Returns code string
   * @return code
  **/
  @Schema(description = "Returns code string")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ScanResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Returns message
   * @return message
  **/
  @Schema(description = "Returns message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ScanResponse details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Returns details
   * @return details
  **/
  @Schema(description = "Returns details")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public ScanResponse scanTime(String scanTime) {
    this.scanTime = scanTime;
    return this;
  }

   /**
   * Returns current time used for the scan
   * @return scanTime
  **/
  @Schema(description = "Returns current time used for the scan")
  public String getScanTime() {
    return scanTime;
  }

  public void setScanTime(String scanTime) {
    this.scanTime = scanTime;
  }

  public ScanResponse method(String method) {
    this.method = method;
    return this;
  }

   /**
   * single, mobile, or passbook based on suffix on barcodes
   * @return method
  **/
  @Schema(description = "single, mobile, or passbook based on suffix on barcodes")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public ScanResponse barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

   /**
   * The barcode for the scan
   * @return barcode
  **/
  @Schema(description = "The barcode for the scan")
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public ScanResponse scanPointId(String scanPointId) {
    this.scanPointId = scanPointId;
    return this;
  }

   /**
   * The scanPointId for the scan
   * @return scanPointId
  **/
  @Schema(description = "The scanPointId for the scan")
  public String getScanPointId() {
    return scanPointId;
  }

  public void setScanPointId(String scanPointId) {
    this.scanPointId = scanPointId;
  }

  public ScanResponse testMode(Boolean testMode) {
    this.testMode = testMode;
    return this;
  }

   /**
   * True if test mode is used
   * @return testMode
  **/
  @Schema(description = "True if test mode is used")
  public Boolean isTestMode() {
    return testMode;
  }

  public void setTestMode(Boolean testMode) {
    this.testMode = testMode;
  }

  public ScanResponse event(Event event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @Schema(description = "")
  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }

  public ScanResponse ticket(Ticket ticket) {
    this.ticket = ticket;
    return this;
  }

   /**
   * Get ticket
   * @return ticket
  **/
  @Schema(description = "")
  public Ticket getTicket() {
    return ticket;
  }

  public void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }

  public ScanResponse offlineTicket(OfflineTicket offlineTicket) {
    this.offlineTicket = offlineTicket;
    return this;
  }

   /**
   * Get offlineTicket
   * @return offlineTicket
  **/
  @Schema(description = "")
  public OfflineTicket getOfflineTicket() {
    return offlineTicket;
  }

  public void setOfflineTicket(OfflineTicket offlineTicket) {
    this.offlineTicket = offlineTicket;
  }

  public ScanResponse thirdPartyTicket(ThirdPartyTicket thirdPartyTicket) {
    this.thirdPartyTicket = thirdPartyTicket;
    return this;
  }

   /**
   * Get thirdPartyTicket
   * @return thirdPartyTicket
  **/
  @Schema(description = "")
  public ThirdPartyTicket getThirdPartyTicket() {
    return thirdPartyTicket;
  }

  public void setThirdPartyTicket(ThirdPartyTicket thirdPartyTicket) {
    this.thirdPartyTicket = thirdPartyTicket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScanResponse scanResponse = (ScanResponse) o;
    return Objects.equals(this.valid, scanResponse.valid) &&
        Objects.equals(this.code, scanResponse.code) &&
        Objects.equals(this.message, scanResponse.message) &&
        Objects.equals(this.details, scanResponse.details) &&
        Objects.equals(this.scanTime, scanResponse.scanTime) &&
        Objects.equals(this.method, scanResponse.method) &&
        Objects.equals(this.barcode, scanResponse.barcode) &&
        Objects.equals(this.scanPointId, scanResponse.scanPointId) &&
        Objects.equals(this.testMode, scanResponse.testMode) &&
        Objects.equals(this.event, scanResponse.event) &&
        Objects.equals(this.ticket, scanResponse.ticket) &&
        Objects.equals(this.offlineTicket, scanResponse.offlineTicket) &&
        Objects.equals(this.thirdPartyTicket, scanResponse.thirdPartyTicket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, code, message, details, scanTime, method, barcode, scanPointId, testMode, event, ticket, offlineTicket, thirdPartyTicket);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScanResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    scanPointId: ").append(toIndentedString(scanPointId)).append("\n");
    sb.append("    testMode: ").append(toIndentedString(testMode)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    ticket: ").append(toIndentedString(ticket)).append("\n");
    sb.append("    offlineTicket: ").append(toIndentedString(offlineTicket)).append("\n");
    sb.append("    thirdPartyTicket: ").append(toIndentedString(thirdPartyTicket)).append("\n");
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
