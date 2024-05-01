# UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdNotificationsNotificationIdTemplatesChannelTemplateIdDelete**](UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi.md#envIdNotificationsNotificationIdTemplatesChannelTemplateIdDelete) | **DELETE** /{envId}/notifications/{notificationId}/templates/{channel}/{templateId} | /:envId/notifications/:notificationId/templates/:channel/:templateId |
| [**envIdNotificationsNotificationIdTemplatesChannelTemplateIdGet**](UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi.md#envIdNotificationsNotificationIdTemplatesChannelTemplateIdGet) | **GET** /{envId}/notifications/{notificationId}/templates/{channel}/{templateId} | /:envId/notifications/:notificationId/templates/:channel/:templateId |
| [**envIdNotificationsNotificationIdTemplatesChannelTemplateIdOptions**](UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi.md#envIdNotificationsNotificationIdTemplatesChannelTemplateIdOptions) | **OPTIONS** /{envId}/notifications/{notificationId}/templates/{channel}/{templateId} | /:envId/notifications/:notificationId/templates/:channel/:templateId |
| [**envIdNotificationsNotificationIdTemplatesChannelTemplateIdPatch**](UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi.md#envIdNotificationsNotificationIdTemplatesChannelTemplateIdPatch) | **PATCH** /{envId}/notifications/{notificationId}/templates/{channel}/{templateId} | /:envId/notifications/:notificationId/templates/:channel/:templateId |



## envIdNotificationsNotificationIdTemplatesChannelTemplateIdDelete

> String envIdNotificationsNotificationIdTemplatesChannelTemplateIdDelete(envId, notificationId, channel, templateId)

/:envId/notifications/:notificationId/templates/:channel/:templateId

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi apiInstance = new UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String notificationId = "<string>"; // String | (Required) 
        String channel = "<string>"; // String | (Required) 
        String templateId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdNotificationsNotificationIdTemplatesChannelTemplateIdDelete(envId, notificationId, channel, templateId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi#envIdNotificationsNotificationIdTemplatesChannelTemplateIdDelete");
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
| **templateId** | **String**| (Required)  | |

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
| **204** | No Content |  -  |
| **404** | Not Found |  -  |


## envIdNotificationsNotificationIdTemplatesChannelTemplateIdGet

> Object envIdNotificationsNotificationIdTemplatesChannelTemplateIdGet(envId, notificationId, channel, templateId, accept)

/:envId/notifications/:notificationId/templates/:channel/:templateId

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi apiInstance = new UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String notificationId = "<string>"; // String | (Required) 
        String channel = "<string>"; // String | (Required) 
        String templateId = "<string>"; // String | (Required) 
        String accept = "application/json"; // String | 
        try {
            Object result = apiInstance.envIdNotificationsNotificationIdTemplatesChannelTemplateIdGet(envId, notificationId, channel, templateId, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi#envIdNotificationsNotificationIdTemplatesChannelTemplateIdGet");
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
| **templateId** | **String**| (Required)  | |
| **accept** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Content-Type -  <br>  |
| **404** | Not Found |  -  |


## envIdNotificationsNotificationIdTemplatesChannelTemplateIdOptions

> String envIdNotificationsNotificationIdTemplatesChannelTemplateIdOptions(envId, notificationId, channel, templateId)

/:envId/notifications/:notificationId/templates/:channel/:templateId

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");

        UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi apiInstance = new UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String notificationId = "<string>"; // String | (Required) 
        String channel = "<string>"; // String | (Required) 
        String templateId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdNotificationsNotificationIdTemplatesChannelTemplateIdOptions(envId, notificationId, channel, templateId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi#envIdNotificationsNotificationIdTemplatesChannelTemplateIdOptions");
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
| **templateId** | **String**| (Required)  | |

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


## envIdNotificationsNotificationIdTemplatesChannelTemplateIdPatch

> Object envIdNotificationsNotificationIdTemplatesChannelTemplateIdPatch(envId, notificationId, channel, templateId, contentType, accept, body)

/:envId/notifications/:notificationId/templates/:channel/:templateId

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi apiInstance = new UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String notificationId = "<string>"; // String | (Required) 
        String channel = "<string>"; // String | (Required) 
        String templateId = "<string>"; // String | (Required) 
        String contentType = "application/json"; // String | 
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.envIdNotificationsNotificationIdTemplatesChannelTemplateIdPatch(envId, notificationId, channel, templateId, contentType, accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi#envIdNotificationsNotificationIdTemplatesChannelTemplateIdPatch");
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
| **templateId** | **String**| (Required)  | |
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

