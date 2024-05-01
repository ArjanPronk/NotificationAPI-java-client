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
public class UndocumentedNotificationsNotificationIdSubNotificationsSubNotificationIdApi {
  private ApiClient apiClient;

  public UndocumentedNotificationsNotificationIdSubNotificationsSubNotificationIdApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UndocumentedNotificationsNotificationIdSubNotificationsSubNotificationIdApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * /:envId/notifications/:notificationId/subNotifications/:subNotificationId
   * 
   * @param envId (Required)  (required)
   * @param notificationId (Required)  (required)
   * @param subNotificationId (Required)  (required)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String envIdNotificationsNotificationIdSubNotificationsSubNotificationIdOptions(String envId, String notificationId, String subNotificationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envId' is set
    if (envId == null) {
      throw new ApiException(400, "Missing the required parameter 'envId' when calling envIdNotificationsNotificationIdSubNotificationsSubNotificationIdOptions");
    }
    
    // verify the required parameter 'notificationId' is set
    if (notificationId == null) {
      throw new ApiException(400, "Missing the required parameter 'notificationId' when calling envIdNotificationsNotificationIdSubNotificationsSubNotificationIdOptions");
    }
    
    // verify the required parameter 'subNotificationId' is set
    if (subNotificationId == null) {
      throw new ApiException(400, "Missing the required parameter 'subNotificationId' when calling envIdNotificationsNotificationIdSubNotificationsSubNotificationIdOptions");
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

    String[] localVarAuthNames = new String[] {  };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "OPTIONS", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
