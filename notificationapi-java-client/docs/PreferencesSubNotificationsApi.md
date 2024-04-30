# PreferencesSubNotificationsApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clientIdNotificationsNotificationIdSubNotificationsSubNotificationIdPut**](PreferencesSubNotificationsApi.md#clientIdNotificationsNotificationIdSubNotificationsSubNotificationIdPut) | **PUT** /{clientId}/notifications/{notificationId}/subNotifications/{subNotificationId} | Create subNotification |
| [**envIdNotificationsNotificationIdSubNotificationsSubNotificationIdDelete**](PreferencesSubNotificationsApi.md#envIdNotificationsNotificationIdSubNotificationsSubNotificationIdDelete) | **DELETE** /{envId}/notifications/{notificationId}/subNotifications/{subNotificationId} | Delete subNotification |



## clientIdNotificationsNotificationIdSubNotificationsSubNotificationIdPut

> Object clientIdNotificationsNotificationIdSubNotificationsSubNotificationIdPut(clientId, notificationId, subNotificationId, contentType, accept, body)

Create subNotification

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.PreferencesSubNotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        PreferencesSubNotificationsApi apiInstance = new PreferencesSubNotificationsApi(defaultClient);
        String clientId = "clientId_example"; // String | 
        String notificationId = "notificationId_example"; // String | 
        String subNotificationId = "subNotificationId_example"; // String | 
        String contentType = "application/json"; // String | 
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.clientIdNotificationsNotificationIdSubNotificationsSubNotificationIdPut(clientId, notificationId, subNotificationId, contentType, accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PreferencesSubNotificationsApi#clientIdNotificationsNotificationIdSubNotificationsSubNotificationIdPut");
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
| **notificationId** | **String**|  | |
| **subNotificationId** | **String**|  | |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
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
| **200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * x-amz-apigw-id -  <br>  * X-Amzn-Trace-Id -  <br>  |


## envIdNotificationsNotificationIdSubNotificationsSubNotificationIdDelete

> String envIdNotificationsNotificationIdSubNotificationsSubNotificationIdDelete(envId, notificationId, subNotificationId)

Delete subNotification

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.PreferencesSubNotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        PreferencesSubNotificationsApi apiInstance = new PreferencesSubNotificationsApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String notificationId = "<string>"; // String | (Required) 
        String subNotificationId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.envIdNotificationsNotificationIdSubNotificationsSubNotificationIdDelete(envId, notificationId, subNotificationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PreferencesSubNotificationsApi#envIdNotificationsNotificationIdSubNotificationsSubNotificationIdDelete");
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
| **notificationId** | **String**| (Required)  | |
| **subNotificationId** | **String**| (Required)  | |

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
| **204** | No Content |  -  |
| **404** | Not Found |  -  |

