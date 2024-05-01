# UndocumentedEmailerSendersSenderApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdEmailerSendersSenderDelete**](UndocumentedEmailerSendersSenderApi.md#envIdEmailerSendersSenderDelete) | **DELETE** /{envId}/emailer/senders/{sender} | /:envId/emailer/senders/:sender |
| [**envIdEmailerSendersSenderOptions**](UndocumentedEmailerSendersSenderApi.md#envIdEmailerSendersSenderOptions) | **OPTIONS** /{envId}/emailer/senders/{sender} | /:envId/emailer/senders/:sender |



## envIdEmailerSendersSenderDelete

> String envIdEmailerSendersSenderDelete(envId, sender)

/:envId/emailer/senders/:sender

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedEmailerSendersSenderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedEmailerSendersSenderApi apiInstance = new UndocumentedEmailerSendersSenderApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String sender = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdEmailerSendersSenderDelete(envId, sender);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedEmailerSendersSenderApi#envIdEmailerSendersSenderDelete");
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
| **sender** | **String**| (Required)  | |

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
| **200** | OK |  -  |


## envIdEmailerSendersSenderOptions

> String envIdEmailerSendersSenderOptions(envId, sender)

/:envId/emailer/senders/:sender

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedEmailerSendersSenderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");

        UndocumentedEmailerSendersSenderApi apiInstance = new UndocumentedEmailerSendersSenderApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String sender = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdEmailerSendersSenderOptions(envId, sender);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedEmailerSendersSenderApi#envIdEmailerSendersSenderOptions");
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
| **sender** | **String**| (Required)  | |

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

