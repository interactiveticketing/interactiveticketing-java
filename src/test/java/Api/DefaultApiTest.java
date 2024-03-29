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

package Api;

import Models.Event;
import Models.Order;
import Models.PaginatedCartEmails;
import Models.PaginatedOrders;
import Models.ScanRequest;
import Models.ScanResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Query Abandoned Shopping Cart Data
     *
     * Returns paginated list of cart data from the event. The &#x60;cartEmailId&#x60; is not unique across all events. Use &#x60;fromCartEmailId&#x60; parameter to loop through orders if you are pulling down all data.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void eventsEventIdAbandonedShoppingCartsGetTest() throws Exception {
        Integer eventId = null;
        Integer fromCartEmailId = null;
        Integer email = null;
        Integer start = null;
        Integer limit = null;
        PaginatedCartEmails response = api.eventsEventIdAbandonedShoppingCartsGet(eventId, fromCartEmailId, email, start, limit);

        // TODO: test validations
    }
    /**
     * Fetch Event by ID
     *
     * Get single event with &#x60;eventId&#x60;.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void eventsEventIdGetTest() throws Exception {
        Long eventId = null;
        Event response = api.eventsEventIdGet(eventId);

        // TODO: test validations
    }
    /**
     * Fetch Order by Barcode
     *
     * Get single order with &#x60;eventId&#x60; and &#x60;barcode&#x60;.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void eventsEventIdOrdersBarcodeBarcodeGetTest() throws Exception {
        Long eventId = null;
        String barcode = null;
        Order response = api.eventsEventIdOrdersBarcodeBarcodeGet(eventId, barcode);

        // TODO: test validations
    }
    /**
     * Query Orders
     *
     * Returns paginated list of orders from the event. The &#x60;orderId&#x60; is not unique across all events. Use &#x60;fromOrderId&#x60; parameter to loop through orders if you are pulling down all data.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void eventsEventIdOrdersGetTest() throws Exception {
        Integer eventId = null;
        Integer fromOrderId = null;
        Integer start = null;
        Integer limit = null;
        Boolean testMode = null;
        String orderType = null;
        PaginatedOrders response = api.eventsEventIdOrdersGet(eventId, fromOrderId, start, limit, testMode, orderType);

        // TODO: test validations
    }
    /**
     * Fetch Order by ID
     *
     * Get single order with &#x60;eventId&#x60; and &#x60;orderId&#x60;.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void eventsEventIdOrdersOrderIdGetTest() throws Exception {
        Long eventId = null;
        Long orderId = null;
        Order response = api.eventsEventIdOrdersOrderIdGet(eventId, orderId);

        // TODO: test validations
    }
    /**
     * List All Events
     *
     * Get list of all your events with their &#x60;eventId&#x60;.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void eventsGetTest() throws Exception {
        List<Event> response = api.eventsGet();

        // TODO: test validations
    }
    /**
     * Scan Ticket
     *
     * Scan a ticket or third party barcode.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void scanPostTest() throws Exception {
        ScanRequest body = null;
        ScanResponse response = api.scanPost(body);

        // TODO: test validations
    }
}
