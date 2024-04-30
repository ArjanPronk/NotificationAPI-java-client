# UndocumentedApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdGet**](UndocumentedApi.md#envIdGet) | **GET** /{envId} | /:envId |
| [**envIdPatch**](UndocumentedApi.md#envIdPatch) | **PATCH** /{envId} | /:envId |



## envIdGet

> Object envIdGet(envId, accept)

/:envId

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedApi apiInstance = new UndocumentedApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String accept = "application/json"; // String | 
        try {
            Object result = apiInstance.envIdGet(envId, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedApi#envIdGet");
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


## envIdPatch

> String envIdPatch(envId, contentType, body)

/:envId

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedApi apiInstance = new UndocumentedApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String contentType = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            String result = apiInstance.envIdPatch(envId, contentType, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedApi#envIdPatch");
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
| **contentType** | **String**|  | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

**String**

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

