# UndocumentedNotificationsNotificationIdDefaulttemplateApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdNotificationsNotificationIdDefaulttemplateOptions**](UndocumentedNotificationsNotificationIdDefaulttemplateApi.md#envIdNotificationsNotificationIdDefaulttemplateOptions) | **OPTIONS** /{envId}/notifications/{notificationId}/defaulttemplate | /:envId/notifications/:notificationId/defaulttemplate |
| [**envIdNotificationsNotificationIdDefaulttemplatePost**](UndocumentedNotificationsNotificationIdDefaulttemplateApi.md#envIdNotificationsNotificationIdDefaulttemplatePost) | **POST** /{envId}/notifications/{notificationId}/defaulttemplate | /:envId/notifications/:notificationId/defaulttemplate |



## envIdNotificationsNotificationIdDefaulttemplateOptions

> String envIdNotificationsNotificationIdDefaulttemplateOptions(envId, notificationId)

/:envId/notifications/:notificationId/defaulttemplate

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedNotificationsNotificationIdDefaulttemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");

        UndocumentedNotificationsNotificationIdDefaulttemplateApi apiInstance = new UndocumentedNotificationsNotificationIdDefaulttemplateApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String notificationId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdNotificationsNotificationIdDefaulttemplateOptions(envId, notificationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedNotificationsNotificationIdDefaulttemplateApi#envIdNotificationsNotificationIdDefaulttemplateOptions");
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


## envIdNotificationsNotificationIdDefaulttemplatePost

> String envIdNotificationsNotificationIdDefaulttemplatePost(envId, notificationId)

/:envId/notifications/:notificationId/defaulttemplate

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedNotificationsNotificationIdDefaulttemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedNotificationsNotificationIdDefaulttemplateApi apiInstance = new UndocumentedNotificationsNotificationIdDefaulttemplateApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String notificationId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdNotificationsNotificationIdDefaulttemplatePost(envId, notificationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedNotificationsNotificationIdDefaulttemplateApi#envIdNotificationsNotificationIdDefaulttemplatePost");
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

### Return type

**String**

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

