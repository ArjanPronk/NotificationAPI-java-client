# UndocumentedTestApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdTestOptions**](UndocumentedTestApi.md#envIdTestOptions) | **OPTIONS** /{envId}/test | /:envId/test |
| [**envIdTestPost**](UndocumentedTestApi.md#envIdTestPost) | **POST** /{envId}/test | /:envId/test |



## envIdTestOptions

> String envIdTestOptions(envId)

/:envId/test

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedTestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");

        UndocumentedTestApi apiInstance = new UndocumentedTestApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdTestOptions(envId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedTestApi#envIdTestOptions");
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


## envIdTestPost

> String envIdTestPost(envId, contentType, body)

/:envId/test

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedTestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");

        UndocumentedTestApi apiInstance = new UndocumentedTestApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String contentType = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            String result = apiInstance.envIdTestPost(envId, contentType, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedTestApi#envIdTestPost");
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

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

