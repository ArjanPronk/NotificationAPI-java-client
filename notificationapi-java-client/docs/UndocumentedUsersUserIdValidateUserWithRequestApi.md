# UndocumentedUsersUserIdValidateUserWithRequestApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdUsersUserIdValidateUserWithRequestGet**](UndocumentedUsersUserIdValidateUserWithRequestApi.md#envIdUsersUserIdValidateUserWithRequestGet) | **GET** /{envId}/users/{userId}/validateUserWithRequest | /:envId/users/:userId/validateUserWithRequest |
| [**envIdUsersUserIdValidateUserWithRequestOptions**](UndocumentedUsersUserIdValidateUserWithRequestApi.md#envIdUsersUserIdValidateUserWithRequestOptions) | **OPTIONS** /{envId}/users/{userId}/validateUserWithRequest | /:envId/users/:userId/validateUserWithRequest |



## envIdUsersUserIdValidateUserWithRequestGet

> String envIdUsersUserIdValidateUserWithRequestGet(envId, userId)

/:envId/users/:userId/validateUserWithRequest

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedUsersUserIdValidateUserWithRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedUsersUserIdValidateUserWithRequestApi apiInstance = new UndocumentedUsersUserIdValidateUserWithRequestApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String userId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdUsersUserIdValidateUserWithRequestGet(envId, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedUsersUserIdValidateUserWithRequestApi#envIdUsersUserIdValidateUserWithRequestGet");
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


## envIdUsersUserIdValidateUserWithRequestOptions

> String envIdUsersUserIdValidateUserWithRequestOptions(envId, userId)

/:envId/users/:userId/validateUserWithRequest

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.UndocumentedUsersUserIdValidateUserWithRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");

        UndocumentedUsersUserIdValidateUserWithRequestApi apiInstance = new UndocumentedUsersUserIdValidateUserWithRequestApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String userId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdUsersUserIdValidateUserWithRequestOptions(envId, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedUsersUserIdValidateUserWithRequestApi#envIdUsersUserIdValidateUserWithRequestOptions");
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

