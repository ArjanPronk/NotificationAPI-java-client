# AuthenticationApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clientIdAuthValidateAuthenticateGet**](AuthenticationApi.md#clientIdAuthValidateAuthenticateGet) | **GET** /{clientId}/auth/validateAuthenticate | Client ID &amp; Client Secret Example |
| [**clientIdUsersUserIdValidateUserGet**](AuthenticationApi.md#clientIdUsersUserIdValidateUserGet) | **GET** /{clientId}/users/{userId}/validateUser | Client ID and User ID Secure Mode Example |



## clientIdAuthValidateAuthenticateGet

> clientIdAuthValidateAuthenticateGet(clientId)

Client ID &amp; Client Secret Example

Generally used for **server-to-server** connections where you have control over the client secret, for example, in your back-end.  This method uses the BASIC authorization model:  &#x60;&#x60;&#x60; Authorization: BASIC BASE64(\&quot;CLIENT_ID:CLIENT_SECRET\&quot;)   &#x60;&#x60;&#x60;  Example in JavaScript:  &#x60;&#x60;&#x60; javascript Authorization: Buffer.from(&#x60;${clientId}:${clientSecret}&#x60;).toString(\&quot;base64\&quot;)   &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        String clientId = "clientId_example"; // String | 
        try {
            apiInstance.clientIdAuthValidateAuthenticateGet(clientId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#clientIdAuthValidateAuthenticateGet");
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
| **clientId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## clientIdUsersUserIdValidateUserGet

> clientIdUsersUserIdValidateUserGet(clientId, userId)

Client ID and User ID Secure Mode Example

To prevent users from impersonating each other, you can enable secure mode ([learn more](https://docs.notificationapi.com/guides/secure-mode)). In secure mode, you need to append the user&#39;s hashedUserId to the string that is being encoded:  &#x60;&#x60;&#x60; Authorization: BASIC BASE64(\&quot;CLIENT_ID:USER_ID:HASHED_USER_ID\&quot;)   &#x60;&#x60;&#x60;  Example in JavaScript:  &#x60;&#x60;&#x60; javascript Authorization: BASIC Buffer.from(&#x60;${clientId}:${userId}:${hashedUserId}&#x60;).toString(\&quot;base64\&quot;)   &#x60;&#x60;&#x60;  To test secure mode correctly, you need to enable Secure Mode in your account.

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        String clientId = "clientId_example"; // String | 
        String userId = "userId_example"; // String | 
        try {
            apiInstance.clientIdUsersUserIdValidateUserGet(clientId, userId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#clientIdUsersUserIdValidateUserGet");
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
| **clientId** | **String**|  | |
| **userId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

