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
public class PreferencesSubNotificationsApi {
  private ApiClient apiClient;

  public PreferencesSubNotificationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PreferencesSubNotificationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create subNotification
   * 
   * @param clientId  (required)
   * @param notificationId  (required)
   * @param subNotificationId  (required)
   * @param contentType  (optional)
   * @param accept  (optional)
   * @param body  (optional)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object clientIdNotificationsNotificationIdSubNotificationsSubNotificationIdPut(String clientId, String notificationId, String subNotificationId, String contentType, String accept, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling clientIdNotificationsNotificationIdSubNotificationsSubNotificationIdPut");
    }
    
    // verify the required parameter 'notificationId' is set
    if (notificationId == null) {
      throw new ApiException(400, "Missing the required parameter 'notificationId' when calling clientIdNotificationsNotificationIdSubNotificationsSubNotificationIdPut");
    }
    
    // verify the required parameter 'subNotificationId' is set
    if (subNotificationId == null) {
      throw new ApiException(400, "Missing the required parameter 'subNotificationId' when calling clientIdNotificationsNotificationIdSubNotificationsSubNotificationIdPut");
    }
    
    // create path and map variables
    String localVarPath = "/{clientId}/notifications/{notificationId}/subNotifications/{subNotificationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()))
      .replaceAll("\\{" + "notificationId" + "\\}", apiClient.escapeString(notificationId.toString()))
      .replaceAll("\\{" + "subNotificationId" + "\\}", apiClient.escapeString(subNotificationId.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete subNotification
   * 
   * @param envId (Required)  (required)
   * @param notificationId (Required)  (required)
   * @param subNotificationId (Required)  (required)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String envIdNotificationsNotificationIdSubNotificationsSubNotificationIdDelete(String envId, String notificationId, String subNotificationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envId' is set
    if (envId == null) {
      throw new ApiException(400, "Missing the required parameter 'envId' when calling envIdNotificationsNotificationIdSubNotificationsSubNotificationIdDelete");
    }
    
    // verify the required parameter 'notificationId' is set
    if (notificationId == null) {
      throw new ApiException(400, "Missing the required parameter 'notificationId' when calling envIdNotificationsNotificationIdSubNotificationsSubNotificationIdDelete");
    }
    
    // verify the required parameter 'subNotificationId' is set
    if (subNotificationId == null) {
      throw new ApiException(400, "Missing the required parameter 'subNotificationId' when calling envIdNotificationsNotificationIdSubNotificationsSubNotificationIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/{envId}/notifications/{notificationId}/subNotifications/{subNotificationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "envId" + "\\}", apiClient.escapeString(envId.toString()))
      .replaceAll("\\{" + "notificationId" + "\\}", apiClient.escapeString(notificationId.toString()))
      .replaceAll("\\{" + "subNotificationId" + "\\}", apiClient.escapeString(subNotificationId.toString()));

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

    String[] localVarAuthNames = new String[] { "apikeyAuth" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
