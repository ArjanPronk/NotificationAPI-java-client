# InAppApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clientIdUsersUserIdNotificationsINAPPWEBGet**](InAppApi.md#clientIdUsersUserIdNotificationsINAPPWEBGet) | **GET** /{clientId}/users/{userId}/notifications/INAPP_WEB | Get in-app notifications |
| [**clientIdUsersUserIdUnreadINAPPWEBGet**](InAppApi.md#clientIdUsersUserIdUnreadINAPPWEBGet) | **GET** /{clientId}/users/{userId}/unread/INAPP_WEB | Get unread count |
| [**clientIdUsersUserIdUnreadINAPPWEBPatch**](InAppApi.md#clientIdUsersUserIdUnreadINAPPWEBPatch) | **PATCH** /{clientId}/users/{userId}/unread/INAPP_WEB | Mark notification as read |



## clientIdUsersUserIdNotificationsINAPPWEBGet

> Object clientIdUsersUserIdNotificationsINAPPWEBGet(clientId, userId, accept)

Get in-app notifications

Gets the user&#39;s in-app notifications from newest to oldest.  The before parameter is optional and is used for the pagination. Recommended workflow:  1. Request the first page of notifications (no before) 2. Store the timestamp of the oldest notification (the last notification in the response array since the array is sorted chronologically) 3. Pass that value as the \&quot;before\&quot; parameter for the next API call       The \&quot;before\&quot; parameter is inclusive (less than and equals) to ensure notifications that are stored within one millisecond are not missed. This results in repeated notifications being returned. Make sure to drop response notifications with the same ID.

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.InAppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        InAppApi apiInstance = new InAppApi(defaultClient);
        String clientId = "clientId_example"; // String | 
        String userId = "userId_example"; // String | 
        String accept = "application/json"; // String | 
        try {
            Object result = apiInstance.clientIdUsersUserIdNotificationsINAPPWEBGet(clientId, userId, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppApi#clientIdUsersUserIdNotificationsINAPPWEBGet");
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
| **accept** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * x-amz-apigw-id -  <br>  * X-Amzn-Trace-Id -  <br>  |


## clientIdUsersUserIdUnreadINAPPWEBGet

> Object clientIdUsersUserIdUnreadINAPPWEBGet(clientId, userId, accept)

Get unread count

Returns the number of unread in-app notifications.

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.InAppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        InAppApi apiInstance = new InAppApi(defaultClient);
        String clientId = "clientId_example"; // String | 
        String userId = "userId_example"; // String | 
        String accept = "application/json"; // String | 
        try {
            Object result = apiInstance.clientIdUsersUserIdUnreadINAPPWEBGet(clientId, userId, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppApi#clientIdUsersUserIdUnreadINAPPWEBGet");
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
| **accept** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * x-amz-apigw-id -  <br>  * X-Amzn-Trace-Id -  <br>  |


## clientIdUsersUserIdUnreadINAPPWEBPatch

> Object clientIdUsersUserIdUnreadINAPPWEBPatch(clientId, userId, body)

Mark notification as read

This method is used to mark one or all notifications of the user as read.  - To mark all as read: pass an empty object in body: &#x60;{}&#x60;      - To mark a single notification, use the notification&#39;s &#x60;trackingId&#x60; in the body

### Example

```java
// Import classes:
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.utils.models.*;
import dev.pronk.notificationapi.client.InAppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        InAppApi apiInstance = new InAppApi(defaultClient);
        String clientId = "clientId_example"; // String | 
        String userId = "userId_example"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.clientIdUsersUserIdUnreadINAPPWEBPatch(clientId, userId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppApi#clientIdUsersUserIdUnreadINAPPWEBPatch");
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
| **body** | **Object**|  | [optional] |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * x-amz-apigw-id -  <br>  * X-Amzn-Trace-Id -  <br>  |

