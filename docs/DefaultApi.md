# DefaultApi

All URIs are relative to *https://secure.interactiveticketing.com/developers/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventsEventIdGet**](DefaultApi.md#eventsEventIdGet) | **GET** /events/{eventId} | Single Event
[**eventsEventIdOrdersGet**](DefaultApi.md#eventsEventIdOrdersGet) | **GET** /events/{eventId}/orders | Search Orders
[**eventsEventIdOrdersOrderIdGet**](DefaultApi.md#eventsEventIdOrdersOrderIdGet) | **GET** /events/{eventId}/orders/{orderId} | Single Order
[**eventsGet**](DefaultApi.md#eventsGet) | **GET** /events | All Events

<a name="eventsEventIdGet"></a>
# **eventsEventIdGet**
> Event eventsEventIdGet(eventId)

Single Event

Get single event with &#x60;eventId&#x60;

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

<a name="eventsEventIdOrdersGet"></a>
# **eventsEventIdOrdersGet**
> PaginatedOrders eventsEventIdOrdersGet(eventId, fromOrderId, start, limit, testMode, orderType)

Search Orders

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

Single Order

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

All Events

Get list of all events with their &#x60;eventId&#x60; for your user key

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

