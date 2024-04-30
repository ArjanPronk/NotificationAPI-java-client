# UndocumentedEnvironmentsApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdEnvironmentsOptions**](UndocumentedEnvironmentsApi.md#envIdEnvironmentsOptions) | **OPTIONS** /{envId}/environments | /:envId/environments |
| [**envIdEnvironmentsPost**](UndocumentedEnvironmentsApi.md#envIdEnvironmentsPost) | **POST** /{envId}/environments | /:envId/environments |



## envIdEnvironmentsOptions

> String envIdEnvironmentsOptions(envId)

/:envId/environments

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");

        UndocumentedEnvironmentsApi apiInstance = new UndocumentedEnvironmentsApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdEnvironmentsOptions(envId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedEnvironmentsApi#envIdEnvironmentsOptions");
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


## envIdEnvironmentsPost

> Object envIdEnvironmentsPost(envId, contentType, accept, body)

/:envId/environments

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedEnvironmentsApi apiInstance = new UndocumentedEnvironmentsApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String contentType = "application/json"; // String | 
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.envIdEnvironmentsPost(envId, contentType, accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedEnvironmentsApi#envIdEnvironmentsPost");
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

