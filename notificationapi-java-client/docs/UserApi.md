# UserApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdUsersUserIdUnsubscribePost**](UserApi.md#envIdUsersUserIdUnsubscribePost) | **POST** /{envId}/users/{userId}/unsubscribe | Unsubscribe |



## envIdUsersUserIdUnsubscribePost

> String envIdUsersUserIdUnsubscribePost(envId, userId, channel)

Unsubscribe

Unsubscribe a user from a specific type of notification and channel.  CHANNEL_TYPE is specified in query string and is either of:  - EMAIL      - INAPP_WEB      - SMS      - CALL      - PUSH      - WEB_PUSH

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        UserApi apiInstance = new UserApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String userId = "<string>"; // String | (Required) 
        String channel = "CHANNEL_TYPE"; // String | 
        try {
            String result = apiInstance.envIdUsersUserIdUnsubscribePost(envId, userId, channel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#envIdUsersUserIdUnsubscribePost");
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
| **channel** | **String**|  | [optional] |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

