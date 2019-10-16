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
import Models.Department;
import Models.Scan;
import Models.ScanPointConfig;
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
 * Ticket
 */


public class Ticket {
  @SerializedName("ticketId")
  private Integer ticketId = null;

  @SerializedName("orderId")
  private Integer orderId = null;

  @SerializedName("barcode")
  private String barcode = null;

  @SerializedName("canceled")
  private Boolean canceled = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("details")
  private String details = null;

  @SerializedName("price")
  private String price = null;

  @SerializedName("slotDate")
  private String slotDate = null;

  @SerializedName("slotTime")
  private String slotTime = null;

  @SerializedName("slotAllDay")
  private Boolean slotAllDay = null;

  @SerializedName("nameOnTicket")
  private String nameOnTicket = null;

  @SerializedName("seatEventTitle")
  private String seatEventTitle = null;

  @SerializedName("seatVenueTitle")
  private String seatVenueTitle = null;

  @SerializedName("seatSection")
  private String seatSection = null;

  @SerializedName("seatCustom1")
  private String seatCustom1 = null;

  @SerializedName("seatCustom2")
  private String seatCustom2 = null;

  @SerializedName("seatRow")
  private String seatRow = null;

  @SerializedName("seatRowLabel")
  private String seatRowLabel = null;

  @SerializedName("seatNumber")
  private Integer seatNumber = null;

  @SerializedName("seatNumberLabel")
  private String seatNumberLabel = null;

  @SerializedName("seatText")
  private String seatText = null;

  @SerializedName("noPrint")
  private Boolean noPrint = null;

  @SerializedName("noBarcode")
  private Boolean noBarcode = null;

  @SerializedName("discount")
  private String discount = null;

  @SerializedName("fee")
  private String fee = null;

  @SerializedName("tax")
  private String tax = null;

  @SerializedName("refund")
  private String refund = null;

  @SerializedName("promoCode")
  private String promoCode = null;

  @SerializedName("promoName")
  private String promoName = null;

  @SerializedName("promoDescription")
  private String promoDescription = null;

  @SerializedName("_department")
  private Department _department = null;

  @SerializedName("_scans")
  private List<Scan> _scans = null;

  @SerializedName("_scanPointConfig")
  private ScanPointConfig _scanPointConfig = null;

  public Ticket ticketId(Integer ticketId) {
    this.ticketId = ticketId;
    return this;
  }

   /**
   * The ticket ID
   * @return ticketId
  **/
  @Schema(description = "The ticket ID")
  public Integer getTicketId() {
    return ticketId;
  }

  public void setTicketId(Integer ticketId) {
    this.ticketId = ticketId;
  }

  public Ticket orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * The ticket order ID
   * @return orderId
  **/
  @Schema(description = "The ticket order ID")
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public Ticket barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

   /**
   * The ticket barcode
   * @return barcode
  **/
  @Schema(description = "The ticket barcode")
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public Ticket canceled(Boolean canceled) {
    this.canceled = canceled;
    return this;
  }

   /**
   * Canceled / Voided ticket
   * @return canceled
  **/
  @Schema(description = "Canceled / Voided ticket")
  public Boolean isCanceled() {
    return canceled;
  }

  public void setCanceled(Boolean canceled) {
    this.canceled = canceled;
  }

  public Ticket name(String name) {
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

  public Ticket details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Details about the ticket
   * @return details
  **/
  @Schema(description = "Details about the ticket")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public Ticket price(String price) {
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

  public Ticket slotDate(String slotDate) {
    this.slotDate = slotDate;
    return this;
  }

   /**
   * Applicable to timed ticketing
   * @return slotDate
  **/
  @Schema(description = "Applicable to timed ticketing")
  public String getSlotDate() {
    return slotDate;
  }

  public void setSlotDate(String slotDate) {
    this.slotDate = slotDate;
  }

  public Ticket slotTime(String slotTime) {
    this.slotTime = slotTime;
    return this;
  }

   /**
   * Applicable to timed ticketing
   * @return slotTime
  **/
  @Schema(description = "Applicable to timed ticketing")
  public String getSlotTime() {
    return slotTime;
  }

  public void setSlotTime(String slotTime) {
    this.slotTime = slotTime;
  }

  public Ticket slotAllDay(Boolean slotAllDay) {
    this.slotAllDay = slotAllDay;
    return this;
  }

   /**
   * Applicable to timed ticketing
   * @return slotAllDay
  **/
  @Schema(description = "Applicable to timed ticketing")
  public Boolean isSlotAllDay() {
    return slotAllDay;
  }

  public void setSlotAllDay(Boolean slotAllDay) {
    this.slotAllDay = slotAllDay;
  }

  public Ticket nameOnTicket(String nameOnTicket) {
    this.nameOnTicket = nameOnTicket;
    return this;
  }

   /**
   * Customer name printed on ticket
   * @return nameOnTicket
  **/
  @Schema(description = "Customer name printed on ticket")
  public String getNameOnTicket() {
    return nameOnTicket;
  }

  public void setNameOnTicket(String nameOnTicket) {
    this.nameOnTicket = nameOnTicket;
  }

  public Ticket seatEventTitle(String seatEventTitle) {
    this.seatEventTitle = seatEventTitle;
    return this;
  }

   /**
   * Applicable to reserved seating
   * @return seatEventTitle
  **/
  @Schema(description = "Applicable to reserved seating")
  public String getSeatEventTitle() {
    return seatEventTitle;
  }

  public void setSeatEventTitle(String seatEventTitle) {
    this.seatEventTitle = seatEventTitle;
  }

  public Ticket seatVenueTitle(String seatVenueTitle) {
    this.seatVenueTitle = seatVenueTitle;
    return this;
  }

   /**
   * Applicable to reserved seating
   * @return seatVenueTitle
  **/
  @Schema(description = "Applicable to reserved seating")
  public String getSeatVenueTitle() {
    return seatVenueTitle;
  }

  public void setSeatVenueTitle(String seatVenueTitle) {
    this.seatVenueTitle = seatVenueTitle;
  }

  public Ticket seatSection(String seatSection) {
    this.seatSection = seatSection;
    return this;
  }

   /**
   * Applicable to reserved seating
   * @return seatSection
  **/
  @Schema(description = "Applicable to reserved seating")
  public String getSeatSection() {
    return seatSection;
  }

  public void setSeatSection(String seatSection) {
    this.seatSection = seatSection;
  }

  public Ticket seatCustom1(String seatCustom1) {
    this.seatCustom1 = seatCustom1;
    return this;
  }

   /**
   * Applicable to reserved seating
   * @return seatCustom1
  **/
  @Schema(description = "Applicable to reserved seating")
  public String getSeatCustom1() {
    return seatCustom1;
  }

  public void setSeatCustom1(String seatCustom1) {
    this.seatCustom1 = seatCustom1;
  }

  public Ticket seatCustom2(String seatCustom2) {
    this.seatCustom2 = seatCustom2;
    return this;
  }

   /**
   * Applicable to reserved seating
   * @return seatCustom2
  **/
  @Schema(description = "Applicable to reserved seating")
  public String getSeatCustom2() {
    return seatCustom2;
  }

  public void setSeatCustom2(String seatCustom2) {
    this.seatCustom2 = seatCustom2;
  }

  public Ticket seatRow(String seatRow) {
    this.seatRow = seatRow;
    return this;
  }

   /**
   * Applicable to reserved seating
   * @return seatRow
  **/
  @Schema(description = "Applicable to reserved seating")
  public String getSeatRow() {
    return seatRow;
  }

  public void setSeatRow(String seatRow) {
    this.seatRow = seatRow;
  }

  public Ticket seatRowLabel(String seatRowLabel) {
    this.seatRowLabel = seatRowLabel;
    return this;
  }

   /**
   * Applicable to reserved seating
   * @return seatRowLabel
  **/
  @Schema(description = "Applicable to reserved seating")
  public String getSeatRowLabel() {
    return seatRowLabel;
  }

  public void setSeatRowLabel(String seatRowLabel) {
    this.seatRowLabel = seatRowLabel;
  }

  public Ticket seatNumber(Integer seatNumber) {
    this.seatNumber = seatNumber;
    return this;
  }

   /**
   * Applicable to reserved seating
   * @return seatNumber
  **/
  @Schema(description = "Applicable to reserved seating")
  public Integer getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(Integer seatNumber) {
    this.seatNumber = seatNumber;
  }

  public Ticket seatNumberLabel(String seatNumberLabel) {
    this.seatNumberLabel = seatNumberLabel;
    return this;
  }

   /**
   * Applicable to reserved seating
   * @return seatNumberLabel
  **/
  @Schema(description = "Applicable to reserved seating")
  public String getSeatNumberLabel() {
    return seatNumberLabel;
  }

  public void setSeatNumberLabel(String seatNumberLabel) {
    this.seatNumberLabel = seatNumberLabel;
  }

  public Ticket seatText(String seatText) {
    this.seatText = seatText;
    return this;
  }

   /**
   * Applicable to reserved seating
   * @return seatText
  **/
  @Schema(description = "Applicable to reserved seating")
  public String getSeatText() {
    return seatText;
  }

  public void setSeatText(String seatText) {
    this.seatText = seatText;
  }

  public Ticket noPrint(Boolean noPrint) {
    this.noPrint = noPrint;
    return this;
  }

   /**
   * Indicates tickets that should not be printed
   * @return noPrint
  **/
  @Schema(description = "Indicates tickets that should not be printed")
  public Boolean isNoPrint() {
    return noPrint;
  }

  public void setNoPrint(Boolean noPrint) {
    this.noPrint = noPrint;
  }

  public Ticket noBarcode(Boolean noBarcode) {
    this.noBarcode = noBarcode;
    return this;
  }

   /**
   * Indicates tickets that should not be barcoded
   * @return noBarcode
  **/
  @Schema(description = "Indicates tickets that should not be barcoded")
  public Boolean isNoBarcode() {
    return noBarcode;
  }

  public void setNoBarcode(Boolean noBarcode) {
    this.noBarcode = noBarcode;
  }

  public Ticket discount(String discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Discounts applied to the ticket
   * @return discount
  **/
  @Schema(description = "Discounts applied to the ticket")
  public String getDiscount() {
    return discount;
  }

  public void setDiscount(String discount) {
    this.discount = discount;
  }

  public Ticket fee(String fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Oranization charged service fee
   * @return fee
  **/
  @Schema(description = "Oranization charged service fee")
  public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
  }

  public Ticket tax(String tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Oranization chaarged tax
   * @return tax
  **/
  @Schema(description = "Oranization chaarged tax")
  public String getTax() {
    return tax;
  }

  public void setTax(String tax) {
    this.tax = tax;
  }

  public Ticket refund(String refund) {
    this.refund = refund;
    return this;
  }

   /**
   * Alloted refund back to ticket (for reports)
   * @return refund
  **/
  @Schema(description = "Alloted refund back to ticket (for reports)")
  public String getRefund() {
    return refund;
  }

  public void setRefund(String refund) {
    this.refund = refund;
  }

  public Ticket promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

   /**
   * Applicable to promo code discounts
   * @return promoCode
  **/
  @Schema(description = "Applicable to promo code discounts")
  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  public Ticket promoName(String promoName) {
    this.promoName = promoName;
    return this;
  }

   /**
   * Applicable to promo code discounts
   * @return promoName
  **/
  @Schema(description = "Applicable to promo code discounts")
  public String getPromoName() {
    return promoName;
  }

  public void setPromoName(String promoName) {
    this.promoName = promoName;
  }

  public Ticket promoDescription(String promoDescription) {
    this.promoDescription = promoDescription;
    return this;
  }

   /**
   * Applicable to promo code discounts
   * @return promoDescription
  **/
  @Schema(description = "Applicable to promo code discounts")
  public String getPromoDescription() {
    return promoDescription;
  }

  public void setPromoDescription(String promoDescription) {
    this.promoDescription = promoDescription;
  }

  public Ticket _department(Department _department) {
    this._department = _department;
    return this;
  }

   /**
   * Get _department
   * @return _department
  **/
  @Schema(description = "")
  public Department getDepartment() {
    return _department;
  }

  public void setDepartment(Department _department) {
    this._department = _department;
  }

  public Ticket _scans(List<Scan> _scans) {
    this._scans = _scans;
    return this;
  }

  public Ticket addScansItem(Scan _scansItem) {
    if (this._scans == null) {
      this._scans = new ArrayList<Scan>();
    }
    this._scans.add(_scansItem);
    return this;
  }

   /**
   * Array of ticket scan activity
   * @return _scans
  **/
  @Schema(description = "Array of ticket scan activity")
  public List<Scan> getScans() {
    return _scans;
  }

  public void setScans(List<Scan> _scans) {
    this._scans = _scans;
  }

  public Ticket _scanPointConfig(ScanPointConfig _scanPointConfig) {
    this._scanPointConfig = _scanPointConfig;
    return this;
  }

   /**
   * Get _scanPointConfig
   * @return _scanPointConfig
  **/
  @Schema(description = "")
  public ScanPointConfig getScanPointConfig() {
    return _scanPointConfig;
  }

  public void setScanPointConfig(ScanPointConfig _scanPointConfig) {
    this._scanPointConfig = _scanPointConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ticket ticket = (Ticket) o;
    return Objects.equals(this.ticketId, ticket.ticketId) &&
        Objects.equals(this.orderId, ticket.orderId) &&
        Objects.equals(this.barcode, ticket.barcode) &&
        Objects.equals(this.canceled, ticket.canceled) &&
        Objects.equals(this.name, ticket.name) &&
        Objects.equals(this.details, ticket.details) &&
        Objects.equals(this.price, ticket.price) &&
        Objects.equals(this.slotDate, ticket.slotDate) &&
        Objects.equals(this.slotTime, ticket.slotTime) &&
        Objects.equals(this.slotAllDay, ticket.slotAllDay) &&
        Objects.equals(this.nameOnTicket, ticket.nameOnTicket) &&
        Objects.equals(this.seatEventTitle, ticket.seatEventTitle) &&
        Objects.equals(this.seatVenueTitle, ticket.seatVenueTitle) &&
        Objects.equals(this.seatSection, ticket.seatSection) &&
        Objects.equals(this.seatCustom1, ticket.seatCustom1) &&
        Objects.equals(this.seatCustom2, ticket.seatCustom2) &&
        Objects.equals(this.seatRow, ticket.seatRow) &&
        Objects.equals(this.seatRowLabel, ticket.seatRowLabel) &&
        Objects.equals(this.seatNumber, ticket.seatNumber) &&
        Objects.equals(this.seatNumberLabel, ticket.seatNumberLabel) &&
        Objects.equals(this.seatText, ticket.seatText) &&
        Objects.equals(this.noPrint, ticket.noPrint) &&
        Objects.equals(this.noBarcode, ticket.noBarcode) &&
        Objects.equals(this.discount, ticket.discount) &&
        Objects.equals(this.fee, ticket.fee) &&
        Objects.equals(this.tax, ticket.tax) &&
        Objects.equals(this.refund, ticket.refund) &&
        Objects.equals(this.promoCode, ticket.promoCode) &&
        Objects.equals(this.promoName, ticket.promoName) &&
        Objects.equals(this.promoDescription, ticket.promoDescription) &&
        Objects.equals(this._department, ticket._department) &&
        Objects.equals(this._scans, ticket._scans) &&
        Objects.equals(this._scanPointConfig, ticket._scanPointConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticketId, orderId, barcode, canceled, name, details, price, slotDate, slotTime, slotAllDay, nameOnTicket, seatEventTitle, seatVenueTitle, seatSection, seatCustom1, seatCustom2, seatRow, seatRowLabel, seatNumber, seatNumberLabel, seatText, noPrint, noBarcode, discount, fee, tax, refund, promoCode, promoName, promoDescription, _department, _scans, _scanPointConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ticket {\n");
    
    sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    slotDate: ").append(toIndentedString(slotDate)).append("\n");
    sb.append("    slotTime: ").append(toIndentedString(slotTime)).append("\n");
    sb.append("    slotAllDay: ").append(toIndentedString(slotAllDay)).append("\n");
    sb.append("    nameOnTicket: ").append(toIndentedString(nameOnTicket)).append("\n");
    sb.append("    seatEventTitle: ").append(toIndentedString(seatEventTitle)).append("\n");
    sb.append("    seatVenueTitle: ").append(toIndentedString(seatVenueTitle)).append("\n");
    sb.append("    seatSection: ").append(toIndentedString(seatSection)).append("\n");
    sb.append("    seatCustom1: ").append(toIndentedString(seatCustom1)).append("\n");
    sb.append("    seatCustom2: ").append(toIndentedString(seatCustom2)).append("\n");
    sb.append("    seatRow: ").append(toIndentedString(seatRow)).append("\n");
    sb.append("    seatRowLabel: ").append(toIndentedString(seatRowLabel)).append("\n");
    sb.append("    seatNumber: ").append(toIndentedString(seatNumber)).append("\n");
    sb.append("    seatNumberLabel: ").append(toIndentedString(seatNumberLabel)).append("\n");
    sb.append("    seatText: ").append(toIndentedString(seatText)).append("\n");
    sb.append("    noPrint: ").append(toIndentedString(noPrint)).append("\n");
    sb.append("    noBarcode: ").append(toIndentedString(noBarcode)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    promoName: ").append(toIndentedString(promoName)).append("\n");
    sb.append("    promoDescription: ").append(toIndentedString(promoDescription)).append("\n");
    sb.append("    _department: ").append(toIndentedString(_department)).append("\n");
    sb.append("    _scans: ").append(toIndentedString(_scans)).append("\n");
    sb.append("    _scanPointConfig: ").append(toIndentedString(_scanPointConfig)).append("\n");
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
