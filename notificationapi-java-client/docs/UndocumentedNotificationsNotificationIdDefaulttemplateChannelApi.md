# UndocumentedNotificationsNotificationIdDefaulttemplateChannelApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdNotificationsNotificationIdDefaulttemplateChannelOptions**](UndocumentedNotificationsNotificationIdDefaulttemplateChannelApi.md#envIdNotificationsNotificationIdDefaulttemplateChannelOptions) | **OPTIONS** /{envId}/notifications/{notificationId}/defaulttemplate/{channel} | /:envId/notifications/:notificationId/defaulttemplate/:channel |
| [**envIdNotificationsNotificationIdDefaulttemplateChannelPatch**](UndocumentedNotificationsNotificationIdDefaulttemplateChannelApi.md#envIdNotificationsNotificationIdDefaulttemplateChannelPatch) | **PATCH** /{envId}/notifications/{notificationId}/defaulttemplate/{channel} | /:envId/notifications/:notificationId/defaulttemplate/:channel |



## envIdNotificationsNotificationIdDefaulttemplateChannelOptions

> String envIdNotificationsNotificationIdDefaulttemplateChannelOptions(envId, notificationId, channel)

/:envId/notifications/:notificationId/defaulttemplate/:channel

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedNotificationsNotificationIdDefaulttemplateChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");

        UndocumentedNotificationsNotificationIdDefaulttemplateChannelApi apiInstance = new UndocumentedNotificationsNotificationIdDefaulttemplateChannelApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String notificationId = "<string>"; // String | (Required) 
        String channel = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdNotificationsNotificationIdDefaulttemplateChannelOptions(envId, notificationId, channel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedNotificationsNotificationIdDefaulttemplateChannelApi#envIdNotificationsNotificationIdDefaulttemplateChannelOptions");
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
| **channel** | **String**| (Required)  | |

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


## envIdNotificationsNotificationIdDefaulttemplateChannelPatch

> Object envIdNotificationsNotificationIdDefaulttemplateChannelPatch(envId, notificationId, channel, contentType, accept, body)

/:envId/notifications/:notificationId/defaulttemplate/:channel

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedNotificationsNotificationIdDefaulttemplateChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedNotificationsNotificationIdDefaulttemplateChannelApi apiInstance = new UndocumentedNotificationsNotificationIdDefaulttemplateChannelApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String notificationId = "<string>"; // String | (Required) 
        String channel = "<string>"; // String | (Required) 
        String contentType = "application/json"; // String | 
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.envIdNotificationsNotificationIdDefaulttemplateChannelPatch(envId, notificationId, channel, contentType, accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedNotificationsNotificationIdDefaulttemplateChannelApi#envIdNotificationsNotificationIdDefaulttemplateChannelPatch");
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
| **channel** | **String**| (Required)  | |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

**Object**

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Content-Type -  <br>  |
| **404** | Not Found |  -  |

