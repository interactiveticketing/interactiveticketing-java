# DefaultApi

All URIs are relative to *https://secure.interactiveticketing.com/developers/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventsEventIdAbandonedShoppingCartsGet**](DefaultApi.md#eventsEventIdAbandonedShoppingCartsGet) | **GET** /events/{eventId}/abandonedShoppingCarts | Query Abandoned Shopping Cart Data
[**eventsEventIdGet**](DefaultApi.md#eventsEventIdGet) | **GET** /events/{eventId} | Fetch Event by ID
[**eventsEventIdOrdersBarcodeBarcodeGet**](DefaultApi.md#eventsEventIdOrdersBarcodeBarcodeGet) | **GET** /events/{eventId}/orders/barcode/{barcode} | Fetch Order by Barcode
[**eventsEventIdOrdersGet**](DefaultApi.md#eventsEventIdOrdersGet) | **GET** /events/{eventId}/orders | Query Orders
[**eventsEventIdOrdersOrderIdGet**](DefaultApi.md#eventsEventIdOrdersOrderIdGet) | **GET** /events/{eventId}/orders/{orderId} | Fetch Order by ID
[**eventsGet**](DefaultApi.md#eventsGet) | **GET** /events | List All Events
[**scanPost**](DefaultApi.md#scanPost) | **POST** /scan | Scan Ticket

<a name="eventsEventIdAbandonedShoppingCartsGet"></a>
# **eventsEventIdAbandonedShoppingCartsGet**
> PaginatedCartEmails eventsEventIdAbandonedShoppingCartsGet(eventId, fromCartEmailId, email, start, limit)

Query Abandoned Shopping Cart Data

Returns paginated list of cart data from the event. The &#x60;cartEmailId&#x60; is not unique across all events. Use &#x60;fromCartEmailId&#x60; parameter to loop through orders if you are pulling down all data.

### Example
```java
// Import classes:
//import InteractiveTicketing.ApiException;
//import Api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer eventId = 56; // Integer | ID of event to return
Integer fromCartEmailId = 56; // Integer | Return entries with `cartEmailId` greater than `fromCartEmailId`.
Integer email = 56; // Integer | Return entries with matching email address.
Integer start = 56; // Integer | For pagination, return orders from `start` row index.
Integer limit = 56; // Integer | For pagination, limit results to `limit` number of rows.
try {
    PaginatedCartEmails result = apiInstance.eventsEventIdAbandonedShoppingCartsGet(eventId, fromCartEmailId, email, start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#eventsEventIdAbandonedShoppingCartsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **Integer**| ID of event to return |
 **fromCartEmailId** | **Integer**| Return entries with &#x60;cartEmailId&#x60; greater than &#x60;fromCartEmailId&#x60;. | [optional]
 **email** | **Integer**| Return entries with matching email address. | [optional]
 **start** | **Integer**| For pagination, return orders from &#x60;start&#x60; row index. | [optional]
 **limit** | **Integer**| For pagination, limit results to &#x60;limit&#x60; number of rows. | [optional]

### Return type

[**PaginatedCartEmails**](PaginatedCartEmails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventsEventIdGet"></a>
# **eventsEventIdGet**
> Event eventsEventIdGet(eventId)

Fetch Event by ID

Get single event with &#x60;eventId&#x60;.

### Example
```java
// Import classes:
//import InteractiveTicketing.ApiException;
//import Api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Long eventId = 789L; // Long | ID of event to return
try {
    Event result = apiInstance.eventsEventIdGet(eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#eventsEventIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **Long**| ID of event to return |

### Return type

[**Event**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventsEventIdOrdersBarcodeBarcodeGet"></a>
# **eventsEventIdOrdersBarcodeBarcodeGet**
> Order eventsEventIdOrdersBarcodeBarcodeGet(eventId, barcode)

Fetch Order by Barcode

Get single order with &#x60;eventId&#x60; and &#x60;barcode&#x60;.

### Example
```java
// Import classes:
//import InteractiveTicketing.ApiException;
//import Api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Long eventId = 789L; // Long | ID of event to return
String barcode = "barcode_example"; // String | Barcode from ticket of the order to return
try {
    Order result = apiInstance.eventsEventIdOrdersBarcodeBarcodeGet(eventId, barcode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#eventsEventIdOrdersBarcodeBarcodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **Long**| ID of event to return |
 **barcode** | **String**| Barcode from ticket of the order to return |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventsEventIdOrdersGet"></a>
# **eventsEventIdOrdersGet**
> PaginatedOrders eventsEventIdOrdersGet(eventId, fromOrderId, start, limit, testMode, orderType)

Query Orders

Returns paginated list of orders from the event. The &#x60;orderId&#x60; is not unique across all events. Use &#x60;fromOrderId&#x60; parameter to loop through orders if you are pulling down all data.

### Example
```java
// Import classes:
//import InteractiveTicketing.ApiException;
//import Api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer eventId = 56; // Integer | ID of event to return
Integer fromOrderId = 56; // Integer | Return orders with `orderId` greater than `fromOrderId`.
Integer start = 56; // Integer | For pagination, return orders from `start` row index.
Integer limit = 56; // Integer | For pagination, limit results to `limit` number of rows.
Boolean testMode = true; // Boolean | Query test orders only.
String orderType = "orderType_example"; // String | To query only `web`, `pos`, or `kiosk` orders.
try {
    PaginatedOrders result = apiInstance.eventsEventIdOrdersGet(eventId, fromOrderId, start, limit, testMode, orderType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#eventsEventIdOrdersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **Integer**| ID of event to return |
 **fromOrderId** | **Integer**| Return orders with &#x60;orderId&#x60; greater than &#x60;fromOrderId&#x60;. | [optional]
 **start** | **Integer**| For pagination, return orders from &#x60;start&#x60; row index. | [optional]
 **limit** | **Integer**| For pagination, limit results to &#x60;limit&#x60; number of rows. | [optional]
 **testMode** | **Boolean**| Query test orders only. | [optional]
 **orderType** | **String**| To query only &#x60;web&#x60;, &#x60;pos&#x60;, or &#x60;kiosk&#x60; orders. | [optional]

### Return type

[**PaginatedOrders**](PaginatedOrders.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventsEventIdOrdersOrderIdGet"></a>
# **eventsEventIdOrdersOrderIdGet**
> Order eventsEventIdOrdersOrderIdGet(eventId, orderId)

Fetch Order by ID

Get single order with &#x60;eventId&#x60; and &#x60;orderId&#x60;.

### Example
```java
// Import classes:
//import InteractiveTicketing.ApiException;
//import Api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Long eventId = 789L; // Long | ID of event to return
Long orderId = 789L; // Long | ID of order to return
try {
    Order result = apiInstance.eventsEventIdOrdersOrderIdGet(eventId, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#eventsEventIdOrdersOrderIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **Long**| ID of event to return |
 **orderId** | **Long**| ID of order to return |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventsGet"></a>
# **eventsGet**
> List&lt;Event&gt; eventsGet()

List All Events

Get list of all your events with their &#x60;eventId&#x60;.

### Example
```java
// Import classes:
//import InteractiveTicketing.ApiException;
//import Api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Event> result = apiInstance.eventsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#eventsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Event&gt;**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="scanPost"></a>
# **scanPost**
> ScanResponse scanPost(body)

Scan Ticket

Scan a ticket or third party barcode.

### Example
```java
// Import classes:
//import InteractiveTicketing.ApiException;
//import Api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
ScanRequest body = new ScanRequest(); // ScanRequest | List of user object
try {
    ScanResponse result = apiInstance.scanPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#scanPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ScanRequest**](ScanRequest.md)| List of user object |

### Return type

[**ScanResponse**](ScanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

