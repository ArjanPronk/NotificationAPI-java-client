# UndocumentedSmsTestApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdSmsTestOptions**](UndocumentedSmsTestApi.md#envIdSmsTestOptions) | **OPTIONS** /{envId}/sms/test | /:envId/sms/test |
| [**envIdSmsTestPost**](UndocumentedSmsTestApi.md#envIdSmsTestPost) | **POST** /{envId}/sms/test | /:envId/sms/test |



## envIdSmsTestOptions

> String envIdSmsTestOptions(envId)

/:envId/sms/test

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedSmsTestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");

        UndocumentedSmsTestApi apiInstance = new UndocumentedSmsTestApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdSmsTestOptions(envId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedSmsTestApi#envIdSmsTestOptions");
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


## envIdSmsTestPost

> envIdSmsTestPost(envId)

/:envId/sms/test

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedSmsTestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedSmsTestApi apiInstance = new UndocumentedSmsTestApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        try {
            apiInstance.envIdSmsTestPost(envId);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedSmsTestApi#envIdSmsTestPost");
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

