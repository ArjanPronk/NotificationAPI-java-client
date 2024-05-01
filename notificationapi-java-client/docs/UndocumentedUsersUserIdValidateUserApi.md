# UndocumentedUsersUserIdValidateUserApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envIdUsersUserIdValidateUserGet**](UndocumentedUsersUserIdValidateUserApi.md#envIdUsersUserIdValidateUserGet) | **GET** /{envId}/users/{userId}/validateUser | /:envId/users/:userId/validateUser |
| [**envIdUsersUserIdValidateUserOptions**](UndocumentedUsersUserIdValidateUserApi.md#envIdUsersUserIdValidateUserOptions) | **OPTIONS** /{envId}/users/{userId}/validateUser | /:envId/users/:userId/validateUser |



## envIdUsersUserIdValidateUserGet

> String envIdUsersUserIdValidateUserGet(envId, userId)

/:envId/users/:userId/validateUser

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedUsersUserIdValidateUserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        UndocumentedUsersUserIdValidateUserApi apiInstance = new UndocumentedUsersUserIdValidateUserApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String userId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdUsersUserIdValidateUserGet(envId, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedUsersUserIdValidateUserApi#envIdUsersUserIdValidateUserGet");
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


## envIdUsersUserIdValidateUserOptions

> String envIdUsersUserIdValidateUserOptions(envId, userId)

/:envId/users/:userId/validateUser

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.UndocumentedUsersUserIdValidateUserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");

        UndocumentedUsersUserIdValidateUserApi apiInstance = new UndocumentedUsersUserIdValidateUserApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String userId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdUsersUserIdValidateUserOptions(envId, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UndocumentedUsersUserIdValidateUserApi#envIdUsersUserIdValidateUserOptions");
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

