package dev.pronk.notificationapi.client;

import dev.pronk.notificationapi.client.utils.ApiException;
import dev.pronk.notificationapi.client.utils.ApiClient;
import dev.pronk.notificationapi.client.utils.Configuration;
import dev.pronk.notificationapi.client.utils.Pair;

import javax.ws.rs.core.GenericType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class SendingApi {
  private ApiClient apiClient;

  public SendingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SendingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete a scheduled notification
   * Deletes a notification that has been scheduled using the \&quot;scheduled\&quot; field.
   * @param clientId  (required)
   * @param trackingId (Required)  (required)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String clientIdScheduleTrackingIdDelete(String clientId, String trackingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling clientIdScheduleTrackingIdDelete");
    }
    
    // verify the required parameter 'trackingId' is set
    if (trackingId == null) {
      throw new ApiException(400, "Missing the required parameter 'trackingId' when calling clientIdScheduleTrackingIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/{clientId}/schedule/{trackingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()))
      .replaceAll("\\{" + "trackingId" + "\\}", apiClient.escapeString(trackingId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a scheduled notification
   * Update an already scheduled notification. The Request Body is similar to the Body when triggering the notification, but only with fields that you want to override or update.
   * @param clientId  (required)
   * @param trackingId (Required)  (required)
   * @param contentType  (optional)
   * @param body  (optional)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String clientIdScheduleTrackingIdPatch(String clientId, String trackingId, String contentType, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling clientIdScheduleTrackingIdPatch");
    }
    
    // verify the required parameter 'trackingId' is set
    if (trackingId == null) {
      throw new ApiException(400, "Missing the required parameter 'trackingId' when calling clientIdScheduleTrackingIdPatch");
    }
    
    // create path and map variables
    String localVarPath = "/{clientId}/schedule/{trackingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()))
      .replaceAll("\\{" + "trackingId" + "\\}", apiClient.escapeString(trackingId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (contentType != null)
      localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));

    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apikeyAuth" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Send a notification
   * For a detailed description of parameters and options, visit [here](https://docs.notificationapi.com/reference/server#send).
   * @param clientId  (required)
   * @param contentType  (optional)
   * @param accept  (optional)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public void clientIdSenderPost(String clientId, String contentType, String accept, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling clientIdSenderPost");
    }
    
    // create path and map variables
    String localVarPath = "/{clientId}/sender".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (contentType != null)
      localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));
if (accept != null)
      localVarHeaderParams.put("Accept", apiClient.parameterToString(accept));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete In-App Notification
   * 
   * @param envId (Required)  (required)
   * @param contentType  (optional)
   * @param body  (optional)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String envIdSenderRetractPost(String envId, String contentType, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'envId' is set
    if (envId == null) {
      throw new ApiException(400, "Missing the required parameter 'envId' when calling envIdSenderRetractPost");
    }
    
    // create path and map variables
    String localVarPath = "/{envId}/sender/retract".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "envId" + "\\}", apiClient.escapeString(envId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (contentType != null)
      localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));

    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
