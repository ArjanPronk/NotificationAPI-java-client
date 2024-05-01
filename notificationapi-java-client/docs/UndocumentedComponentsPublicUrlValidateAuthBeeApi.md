# UndocumentedComponentsPublicUrlValidateAuthBeeApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdComponentsPublicUrlValidateAuthBeeGet**](UndocumentedComponentsPublicUrlValidateAuthBeeApi.md#envIdComponentsPublicUrlValidateAuthBeeGet) | **GET** /{envId}/components_public_url/validateAuthBee | /:envId/components_public_url/validateAuthBee |
| [**envIdComponentsPublicUrlValidateAuthBeeOptions**](UndocumentedComponentsPublicUrlValidateAuthBeeApi.md#envIdComponentsPublicUrlValidateAuthBeeOptions) | **OPTIONS** /{envId}/components_public_url/validateAuthBee | /:envId/components_public_url/validateAuthBee |



## envIdComponentsPublicUrlValidateAuthBeeGet

> String envIdComponentsPublicUrlValidateAuthBeeGet(envId)

/:envId/components_public_url/validateAuthBee

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedComponentsPublicUrlValidateAuthBeeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedComponentsPublicUrlValidateAuthBeeApi apiInstance = new UndocumentedComponentsPublicUrlValidateAuthBeeApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdComponentsPublicUrlValidateAuthBeeGet(envId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedComponentsPublicUrlValidateAuthBeeApi#envIdComponentsPublicUrlValidateAuthBeeGet");
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

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## envIdComponentsPublicUrlValidateAuthBeeOptions

> String envIdComponentsPublicUrlValidateAuthBeeOptions(envId)

/:envId/components_public_url/validateAuthBee

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedComponentsPublicUrlValidateAuthBeeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");

        UndocumentedComponentsPublicUrlValidateAuthBeeApi apiInstance = new UndocumentedComponentsPublicUrlValidateAuthBeeApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdComponentsPublicUrlValidateAuthBeeOptions(envId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedComponentsPublicUrlValidateAuthBeeApi#envIdComponentsPublicUrlValidateAuthBeeOptions");
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

