# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **Integer** | The transaction ID |  [optional]
**dateTime** | **String** | The transaction time iso-8601 |  [optional]
**isRefund** | **Boolean** | The transaction is a refund |  [optional]
**amount** | **String** | The transaction amount |  [optional]
**type** | **String** | credit | cash | other | triPos |  [optional]
**cardTransactionId** | **String** | The payment gateway transaction identifier |  [optional]
**cardType** | **String** | The payment credit card type code |  [optional]
**cardLastFour** | **String** | The payment credit card last four digits |  [optional]
**cardName** | **String** | The payment credit card customer name on card |  [optional]
**referenceTransactionId** | **String** | Applicable to refund transaction, reference to the original &#x60;cardTransactionId&#x60; |  [optional]
**billStreet** | **String** | Billing street address |  [optional]
**billCity** | **String** | Billing city |  [optional]
**billStateProvince** | **String** | Billing state or province |  [optional]
**billPostalCode** | **String** | Billing post code / zip |  [optional]
**billCountry** | **String** | Billing country |  [optional]
**refundReason** | **String** | Applicable to refund transactions |  [optional]
