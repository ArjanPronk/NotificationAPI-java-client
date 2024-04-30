# UndocumentedNotificationsNotificationIdSubNotificationsSubNotificationIdApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdNotificationsNotificationIdSubNotificationsSubNotificationIdOptions**](UndocumentedNotificationsNotificationIdSubNotificationsSubNotificationIdApi.md#envIdNotificationsNotificationIdSubNotificationsSubNotificationIdOptions) | **OPTIONS** /{envId}/notifications/{notificationId}/subNotifications/{subNotificationId} | /:envId/notifications/:notificationId/subNotifications/:subNotificationId |



## envIdNotificationsNotificationIdSubNotificationsSubNotificationIdOptions

> String envIdNotificationsNotificationIdSubNotificationsSubNotificationIdOptions(envId, notificationId, subNotificationId)

/:envId/notifications/:notificationId/subNotifications/:subNotificationId

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedNotificationsNotificationIdSubNotificationsSubNotificationIdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");

        UndocumentedNotificationsNotificationIdSubNotificationsSubNotificationIdApi apiInstance = new UndocumentedNotificationsNotificationIdSubNotificationsSubNotificationIdApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String notificationId = "<string>"; // String | (Required) 
        String subNotificationId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdNotificationsNotificationIdSubNotificationsSubNotificationIdOptions(envId, notificationId, subNotificationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedNotificationsNotificationIdSubNotificationsSubNotificationIdApi#envIdNotificationsNotificationIdSubNotificationsSubNotificationIdOptions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **envId** | **String**| (Required)  | |
| **notificationId** | **String**| (Required)  | |
| **subNotificationId** | **String**| (Required)  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

