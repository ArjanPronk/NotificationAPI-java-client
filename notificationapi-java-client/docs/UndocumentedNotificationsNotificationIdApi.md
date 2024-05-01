# UndocumentedNotificationsNotificationIdApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdNotificationsNotificationIdDelete**](UndocumentedNotificationsNotificationIdApi.md#envIdNotificationsNotificationIdDelete) | **DELETE** /{envId}/notifications/{notificationId} | /:envId/notifications/:notificationId |
| [**envIdNotificationsNotificationIdGet**](UndocumentedNotificationsNotificationIdApi.md#envIdNotificationsNotificationIdGet) | **GET** /{envId}/notifications/{notificationId} | /:envId/notifications/:notificationId |
| [**envIdNotificationsNotificationIdOptions**](UndocumentedNotificationsNotificationIdApi.md#envIdNotificationsNotificationIdOptions) | **OPTIONS** /{envId}/notifications/{notificationId} | /:envId/notifications/:notificationId |
| [**envIdNotificationsNotificationIdPatch**](UndocumentedNotificationsNotificationIdApi.md#envIdNotificationsNotificationIdPatch) | **PATCH** /{envId}/notifications/{notificationId} | /:envId/notifications/:notificationId |



## envIdNotificationsNotificationIdDelete

> String envIdNotificationsNotificationIdDelete(envId, notificationId)

/:envId/notifications/:notificationId

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedNotificationsNotificationIdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedNotificationsNotificationIdApi apiInstance = new UndocumentedNotificationsNotificationIdApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String notificationId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdNotificationsNotificationIdDelete(envId, notificationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedNotificationsNotificationIdApi#envIdNotificationsNotificationIdDelete");
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
| **204** | No Content |  -  |
| **404** | Not Found |  -  |


## envIdNotificationsNotificationIdGet

> envIdNotificationsNotificationIdGet(envId, notificationId)

/:envId/notifications/:notificationId

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedNotificationsNotificationIdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedNotificationsNotificationIdApi apiInstance = new UndocumentedNotificationsNotificationIdApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String notificationId = "<string>"; // String | (Required) 
        try {
            apiInstance.envIdNotificationsNotificationIdGet(envId, notificationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedNotificationsNotificationIdApi#envIdNotificationsNotificationIdGet");
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

null (empty response body)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## envIdNotificationsNotificationIdOptions

> String envIdNotificationsNotificationIdOptions(envId, notificationId)

/:envId/notifications/:notificationId

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedNotificationsNotificationIdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");

        UndocumentedNotificationsNotificationIdApi apiInstance = new UndocumentedNotificationsNotificationIdApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String notificationId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdNotificationsNotificationIdOptions(envId, notificationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedNotificationsNotificationIdApi#envIdNotificationsNotificationIdOptions");
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


## envIdNotificationsNotificationIdPatch

> Object envIdNotificationsNotificationIdPatch(envId, notificationId, contentType, accept, body)

/:envId/notifications/:notificationId

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedNotificationsNotificationIdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedNotificationsNotificationIdApi apiInstance = new UndocumentedNotificationsNotificationIdApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String notificationId = "<string>"; // String | (Required) 
        String contentType = "application/json"; // String | 
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.envIdNotificationsNotificationIdPatch(envId, notificationId, contentType, accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedNotificationsNotificationIdApi#envIdNotificationsNotificationIdPatch");
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

