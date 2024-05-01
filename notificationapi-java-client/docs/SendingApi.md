# SendingApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clientIdScheduleTrackingIdDelete**](SendingApi.md#clientIdScheduleTrackingIdDelete) | **DELETE** /{clientId}/schedule/{trackingId} | Delete a scheduled notification |
| [**clientIdScheduleTrackingIdPatch**](SendingApi.md#clientIdScheduleTrackingIdPatch) | **PATCH** /{clientId}/schedule/{trackingId} | Update a scheduled notification |
| [**clientIdSenderPost**](SendingApi.md#clientIdSenderPost) | **POST** /{clientId}/sender | Send a notification |
| [**envIdSenderRetractPost**](SendingApi.md#envIdSenderRetractPost) | **POST** /{envId}/sender/retract | Delete In-App Notification |



## clientIdScheduleTrackingIdDelete

> String clientIdScheduleTrackingIdDelete(clientId, trackingId)

Delete a scheduled notification

Deletes a notification that has been scheduled using the \&quot;scheduled\&quot; field.

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.SendingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        SendingApi apiInstance = new SendingApi(defaultClient);
        String clientId = "clientId_example"; // String | 
        String trackingId = "<string>"; // String | (Required) 
        try {
            String result = apiInstance.clientIdScheduleTrackingIdDelete(clientId, trackingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SendingApi#clientIdScheduleTrackingIdDelete");
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
| **trackingId** | **String**| (Required)  | |

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


## clientIdScheduleTrackingIdPatch

> String clientIdScheduleTrackingIdPatch(clientId, trackingId, contentType, body)

Update a scheduled notification

Update an already scheduled notification. The Request Body is similar to the Body when triggering the notification, but only with fields that you want to override or update.

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.SendingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        

        SendingApi apiInstance = new SendingApi(defaultClient);
        String clientId = "clientId_example"; // String | 
        String trackingId = "<string>"; // String | (Required) 
        String contentType = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            String result = apiInstance.clientIdScheduleTrackingIdPatch(clientId, trackingId, contentType, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SendingApi#clientIdScheduleTrackingIdPatch");
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
| **trackingId** | **String**| (Required)  | |
| **contentType** | **String**|  | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

**String**

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## clientIdSenderPost

> clientIdSenderPost(clientId, contentType, accept, body)

Send a notification

For a detailed description of parameters and options, visit [here](https://docs.notificationapi.com/reference/server#send).

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.SendingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        SendingApi apiInstance = new SendingApi(defaultClient);
        String clientId = "clientId_example"; // String | 
        String contentType = "application/json"; // String | 
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            apiInstance.clientIdSenderPost(clientId, contentType, accept, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling SendingApi#clientIdSenderPost");
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
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | Internal Server Error |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * x-amz-apigw-id -  <br>  * X-Amzn-Trace-Id -  <br>  |


## envIdSenderRetractPost

> String envIdSenderRetractPost(envId, contentType, body)

Delete In-App Notification

### Example

```java
// Import classes:
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.auth.*;
import pronk.dev.notificationapi.client.utils.models.*;
import pronk.dev.notificationapi.client.SendingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        SendingApi apiInstance = new SendingApi(defaultClient);
        String envId = "<string>"; // String | (Required) 
        String contentType = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            String result = apiInstance.envIdSenderRetractPost(envId, contentType, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SendingApi#envIdSenderRetractPost");
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
| **contentType** | **String**|  | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

