# UndocumentedComponentsChannelApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdComponentsChannelGet**](UndocumentedComponentsChannelApi.md#envIdComponentsChannelGet) | **GET** /{envId}/components/{channel} | /:envId/components/:channel |
| [**envIdComponentsChannelPost**](UndocumentedComponentsChannelApi.md#envIdComponentsChannelPost) | **POST** /{envId}/components/{channel} | /:envId/components/:channel |



## envIdComponentsChannelGet

> Object envIdComponentsChannelGet(envId, channel, accept)

/:envId/components/:channel

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedComponentsChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedComponentsChannelApi apiInstance = new UndocumentedComponentsChannelApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String channel = "<string>"; // String | (Required) 
        String accept = "application/json"; // String | 
        try {
            Object result = apiInstance.envIdComponentsChannelGet(envId, channel, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedComponentsChannelApi#envIdComponentsChannelGet");
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


## envIdComponentsChannelPost

> Object envIdComponentsChannelPost(envId, channel, contentType, accept, body)

/:envId/components/:channel

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedComponentsChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedComponentsChannelApi apiInstance = new UndocumentedComponentsChannelApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String channel = "<string>"; // String | (Required) 
        String contentType = "application/json"; // String | 
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.envIdComponentsChannelPost(envId, channel, contentType, accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedComponentsChannelApi#envIdComponentsChannelPost");
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

