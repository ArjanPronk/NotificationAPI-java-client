# UndocumentedComponentsPublicUrlChannelApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdComponentsPublicUrlChannelGet**](UndocumentedComponentsPublicUrlChannelApi.md#envIdComponentsPublicUrlChannelGet) | **GET** /{envId}/components_public_url/{channel} | /:envId/components_public_url/:channel |
| [**envIdComponentsPublicUrlChannelOptions**](UndocumentedComponentsPublicUrlChannelApi.md#envIdComponentsPublicUrlChannelOptions) | **OPTIONS** /{envId}/components_public_url/{channel} | /:envId/components_public_url/:channel |



## envIdComponentsPublicUrlChannelGet

> Object envIdComponentsPublicUrlChannelGet(envId, channel, accept)

/:envId/components_public_url/:channel

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedComponentsPublicUrlChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedComponentsPublicUrlChannelApi apiInstance = new UndocumentedComponentsPublicUrlChannelApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String channel = "<string>"; // String | (Required) 
        String accept = "application/json"; // String | 
        try {
            Object result = apiInstance.envIdComponentsPublicUrlChannelGet(envId, channel, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedComponentsPublicUrlChannelApi#envIdComponentsPublicUrlChannelGet");
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


## envIdComponentsPublicUrlChannelOptions

> String envIdComponentsPublicUrlChannelOptions(envId, channel)

/:envId/components_public_url/:channel

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedComponentsPublicUrlChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");

        UndocumentedComponentsPublicUrlChannelApi apiInstance = new UndocumentedComponentsPublicUrlChannelApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String channel = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdComponentsPublicUrlChannelOptions(envId, channel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedComponentsPublicUrlChannelApi#envIdComponentsPublicUrlChannelOptions");
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

