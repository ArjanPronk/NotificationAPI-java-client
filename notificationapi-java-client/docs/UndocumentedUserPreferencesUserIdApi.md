# UndocumentedUserPreferencesUserIdApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdUserPreferencesUserIdOptions**](UndocumentedUserPreferencesUserIdApi.md#envIdUserPreferencesUserIdOptions) | **OPTIONS** /{envId}/user_preferences/{userId} | /:envId/user_preferences/:userId |



## envIdUserPreferencesUserIdOptions

> String envIdUserPreferencesUserIdOptions(envId, userId)

/:envId/user_preferences/:userId

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedUserPreferencesUserIdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");

        UndocumentedUserPreferencesUserIdApi apiInstance = new UndocumentedUserPreferencesUserIdApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String userId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdUserPreferencesUserIdOptions(envId, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedUserPreferencesUserIdApi#envIdUserPreferencesUserIdOptions");
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

