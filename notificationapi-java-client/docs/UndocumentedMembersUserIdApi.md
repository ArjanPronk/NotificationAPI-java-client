# UndocumentedMembersUserIdApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdMembersUserIdDelete**](UndocumentedMembersUserIdApi.md#envIdMembersUserIdDelete) | **DELETE** /{envId}/members/{userId} | /:envId/members/:userId |
| [**envIdMembersUserIdOptions**](UndocumentedMembersUserIdApi.md#envIdMembersUserIdOptions) | **OPTIONS** /{envId}/members/{userId} | /:envId/members/:userId |



## envIdMembersUserIdDelete

> String envIdMembersUserIdDelete(envId, userId)

/:envId/members/:userId

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedMembersUserIdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedMembersUserIdApi apiInstance = new UndocumentedMembersUserIdApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String userId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdMembersUserIdDelete(envId, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedMembersUserIdApi#envIdMembersUserIdDelete");
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
| **userId** | **String**| (Required)  | |

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


## envIdMembersUserIdOptions

> String envIdMembersUserIdOptions(envId, userId)

/:envId/members/:userId

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedMembersUserIdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");

        UndocumentedMembersUserIdApi apiInstance = new UndocumentedMembersUserIdApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String userId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdMembersUserIdOptions(envId, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedMembersUserIdApi#envIdMembersUserIdOptions");
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
| **userId** | **String**| (Required)  | |

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

