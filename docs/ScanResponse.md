# ScanResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**valid** | **Boolean** | True indicates scan passed validation |  [optional]
**code** | **String** | Returns code string |  [optional]
**message** | **String** | Returns message |  [optional]
**details** | **String** | Returns details |  [optional]
**scanTime** | **String** | Returns current time used for the scan |  [optional]
**method** | **String** | single, mobile, or passbook based on suffix on barcodes |  [optional]
**barcode** | **String** | The barcode for the scan |  [optional]
**scanPointId** | **String** | The scanPointId for the scan |  [optional]
**testMode** | **Boolean** | True if test mode is used |  [optional]
**event** | [**Event**](Event.md) |  |  [optional]
**ticket** | [**Ticket**](Ticket.md) |  |  [optional]
**offlineTicket** | [**OfflineTicket**](OfflineTicket.md) |  |  [optional]
**thirdPartyTicket** | [**ThirdPartyTicket**](ThirdPartyTicket.md) |  |  [optional]
