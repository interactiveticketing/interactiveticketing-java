# interactiveticketing-java

Developer API
- API version: v1

Get your API Key from the [Dashboard](/dashboard/).<br/>Send all API requests with http header `X-API-Key: YOUR-API-KEY-HERE`.<br/>Base URL: `https://secure.interactiveticketing.com/developers/api/v1`<br/>Contact support@interactiveticketing.com for help.


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.interactiveticketing</groupId>
  <artifactId>interactiveticketing-java</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.interactiveticketing:interactiveticketing-java:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/interactiveticketing-java-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import InteractiveTicketing.*;
import InteractiveTicketing.auth.*;
import Models.*;
import Api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        Long eventId = 789L; // Long | ID of event to return
        try {
            Event result = apiInstance.eventsEventIdGet(eventId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#eventsEventIdGet");
            e.printStackTrace();
        }
    }
}
import InteractiveTicketing.*;
import InteractiveTicketing.auth.*;
import Models.*;
import Api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
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
    }
}
import InteractiveTicketing.*;
import InteractiveTicketing.auth.*;
import Models.*;
import Api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
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
    }
}
import InteractiveTicketing.*;
import InteractiveTicketing.auth.*;
import Models.*;
import Api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        try {
            List<Event> result = apiInstance.eventsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#eventsGet");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://secure.interactiveticketing.com/developers/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**eventsEventIdGet**](docs/DefaultApi.md#eventsEventIdGet) | **GET** /events/{eventId} | Single Event
*DefaultApi* | [**eventsEventIdOrdersGet**](docs/DefaultApi.md#eventsEventIdOrdersGet) | **GET** /events/{eventId}/orders | Search Orders
*DefaultApi* | [**eventsEventIdOrdersOrderIdGet**](docs/DefaultApi.md#eventsEventIdOrdersOrderIdGet) | **GET** /events/{eventId}/orders/{orderId} | Single Order
*DefaultApi* | [**eventsGet**](docs/DefaultApi.md#eventsGet) | **GET** /events | All Events

## Documentation for Models

 - [Client](docs/Client.md)
 - [Device](docs/Device.md)
 - [Event](docs/Event.md)
 - [Order](docs/Order.md)
 - [PaginatedOrders](docs/PaginatedOrders.md)
 - [Scan](docs/Scan.md)
 - [ScanPoint](docs/ScanPoint.md)
 - [ScanPointConfig](docs/ScanPointConfig.md)
 - [Survey](docs/Survey.md)
 - [Ticket](docs/Ticket.md)
 - [Transaction](docs/Transaction.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

