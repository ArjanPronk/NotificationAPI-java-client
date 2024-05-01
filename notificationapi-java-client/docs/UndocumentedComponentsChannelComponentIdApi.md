# UndocumentedComponentsChannelComponentIdApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdComponentsChannelComponentIdDelete**](UndocumentedComponentsChannelComponentIdApi.md#envIdComponentsChannelComponentIdDelete) | **DELETE** /{envId}/components/{channel}/{componentId} | /:envId/components/:channel/:componentId |
| [**envIdComponentsChannelComponentIdGet**](UndocumentedComponentsChannelComponentIdApi.md#envIdComponentsChannelComponentIdGet) | **GET** /{envId}/components/{channel}/{componentId} | /:envId/components/:channel/:componentId |
| [**envIdComponentsChannelComponentIdPatch**](UndocumentedComponentsChannelComponentIdApi.md#envIdComponentsChannelComponentIdPatch) | **PATCH** /{envId}/components/{channel}/{componentId} | /:envId/components/:channel/:componentId |



## envIdComponentsChannelComponentIdDelete

> Object envIdComponentsChannelComponentIdDelete(envId, channel, componentId, accept)

/:envId/components/:channel/:componentId

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedComponentsChannelComponentIdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedComponentsChannelComponentIdApi apiInstance = new UndocumentedComponentsChannelComponentIdApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String channel = "<string>"; // String | (Required) 
        String componentId = "<string>"; // String | (Required) 
        String accept = "application/json"; // String | 
        try {
            Object result = apiInstance.envIdComponentsChannelComponentIdDelete(envId, channel, componentId, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedComponentsChannelComponentIdApi#envIdComponentsChannelComponentIdDelete");
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
| **channel** | **String**| (Required)  | |
| **componentId** | **String**| (Required)  | |
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


## envIdComponentsChannelComponentIdGet

> Object envIdComponentsChannelComponentIdGet(envId, channel, componentId, accept)

/:envId/components/:channel/:componentId

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedComponentsChannelComponentIdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedComponentsChannelComponentIdApi apiInstance = new UndocumentedComponentsChannelComponentIdApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String channel = "<string>"; // String | (Required) 
        String componentId = "<string>"; // String | (Required) 
        String accept = "application/json"; // String | 
        try {
            Object result = apiInstance.envIdComponentsChannelComponentIdGet(envId, channel, componentId, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedComponentsChannelComponentIdApi#envIdComponentsChannelComponentIdGet");
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
| **channel** | **String**| (Required)  | |
| **componentId** | **String**| (Required)  | |
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


## envIdComponentsChannelComponentIdPatch

> Object envIdComponentsChannelComponentIdPatch(envId, channel, componentId, contentType, accept, body)

/:envId/components/:channel/:componentId

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedComponentsChannelComponentIdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedComponentsChannelComponentIdApi apiInstance = new UndocumentedComponentsChannelComponentIdApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String channel = "<string>"; // String | (Required) 
        String componentId = "<string>"; // String | (Required) 
        String contentType = "application/json"; // String | 
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.envIdComponentsChannelComponentIdPatch(envId, channel, componentId, contentType, accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedComponentsChannelComponentIdApi#envIdComponentsChannelComponentIdPatch");
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
| **channel** | **String**| (Required)  | |
| **componentId** | **String**| (Required)  | |
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

