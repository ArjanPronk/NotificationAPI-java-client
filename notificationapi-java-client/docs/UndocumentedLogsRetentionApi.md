# UndocumentedLogsRetentionApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdLogsRetentionGet**](UndocumentedLogsRetentionApi.md#envIdLogsRetentionGet) | **GET** /{envId}/logs/retention | /:envId/logs/retention |
| [**envIdLogsRetentionOptions**](UndocumentedLogsRetentionApi.md#envIdLogsRetentionOptions) | **OPTIONS** /{envId}/logs/retention | /:envId/logs/retention |



## envIdLogsRetentionGet

> Object envIdLogsRetentionGet(envId, accept)

/:envId/logs/retention

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedLogsRetentionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedLogsRetentionApi apiInstance = new UndocumentedLogsRetentionApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String accept = "application/json"; // String | 
        try {
            Object result = apiInstance.envIdLogsRetentionGet(envId, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedLogsRetentionApi#envIdLogsRetentionGet");
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


## envIdLogsRetentionOptions

> String envIdLogsRetentionOptions(envId)

/:envId/logs/retention

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedLogsRetentionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");

        UndocumentedLogsRetentionApi apiInstance = new UndocumentedLogsRetentionApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdLogsRetentionOptions(envId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedLogsRetentionApi#envIdLogsRetentionOptions");
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

