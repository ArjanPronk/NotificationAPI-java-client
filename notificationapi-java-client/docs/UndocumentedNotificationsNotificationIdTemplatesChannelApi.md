# UndocumentedNotificationsNotificationIdTemplatesChannelApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdNotificationsNotificationIdTemplatesChannelGet**](UndocumentedNotificationsNotificationIdTemplatesChannelApi.md#envIdNotificationsNotificationIdTemplatesChannelGet) | **GET** /{envId}/notifications/{notificationId}/templates/{channel} | /:envId/notifications/:notificationId/templates/:channel |
| [**envIdNotificationsNotificationIdTemplatesChannelOptions**](UndocumentedNotificationsNotificationIdTemplatesChannelApi.md#envIdNotificationsNotificationIdTemplatesChannelOptions) | **OPTIONS** /{envId}/notifications/{notificationId}/templates/{channel} | /:envId/notifications/:notificationId/templates/:channel |
| [**envIdNotificationsNotificationIdTemplatesChannelPost**](UndocumentedNotificationsNotificationIdTemplatesChannelApi.md#envIdNotificationsNotificationIdTemplatesChannelPost) | **POST** /{envId}/notifications/{notificationId}/templates/{channel} | /:envId/notifications/:notificationId/templates/:channel |



## envIdNotificationsNotificationIdTemplatesChannelGet

> Object envIdNotificationsNotificationIdTemplatesChannelGet(envId, notificationId, channel, accept)

/:envId/notifications/:notificationId/templates/:channel

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedNotificationsNotificationIdTemplatesChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedNotificationsNotificationIdTemplatesChannelApi apiInstance = new UndocumentedNotificationsNotificationIdTemplatesChannelApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String notificationId = "<string>"; // String | (Required) 
        String channel = "<string>"; // String | (Required) 
        String accept = "application/json"; // String | 
        try {
            Object result = apiInstance.envIdNotificationsNotificationIdTemplatesChannelGet(envId, notificationId, channel, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedNotificationsNotificationIdTemplatesChannelApi#envIdNotificationsNotificationIdTemplatesChannelGet");
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
| **accept** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Content-Type -  <br>  |


## envIdNotificationsNotificationIdTemplatesChannelOptions

> String envIdNotificationsNotificationIdTemplatesChannelOptions(envId, notificationId, channel)

/:envId/notifications/:notificationId/templates/:channel

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedNotificationsNotificationIdTemplatesChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");

        UndocumentedNotificationsNotificationIdTemplatesChannelApi apiInstance = new UndocumentedNotificationsNotificationIdTemplatesChannelApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String notificationId = "<string>"; // String | (Required) 
        String channel = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdNotificationsNotificationIdTemplatesChannelOptions(envId, notificationId, channel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedNotificationsNotificationIdTemplatesChannelApi#envIdNotificationsNotificationIdTemplatesChannelOptions");
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


## envIdNotificationsNotificationIdTemplatesChannelPost

> Object envIdNotificationsNotificationIdTemplatesChannelPost(envId, notificationId, channel, contentType, accept, body)

/:envId/notifications/:notificationId/templates/:channel

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedNotificationsNotificationIdTemplatesChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedNotificationsNotificationIdTemplatesChannelApi apiInstance = new UndocumentedNotificationsNotificationIdTemplatesChannelApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String notificationId = "<string>"; // String | (Required) 
        String channel = "<string>"; // String | (Required) 
        String contentType = "application/json"; // String | 
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.envIdNotificationsNotificationIdTemplatesChannelPost(envId, notificationId, channel, contentType, accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedNotificationsNotificationIdTemplatesChannelApi#envIdNotificationsNotificationIdTemplatesChannelPost");
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
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Content-Type -  <br>  |

