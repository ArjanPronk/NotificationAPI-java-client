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
public class UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi {
  private ApiClient apiClient;

  public UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * /:envId/notifications/:notificationId/templates/:channel/:templateId
   * 
   * @param envId (Required)  (required)
   * @param notificationId (Required)  (required)
   * @param channel (Required)  (required)
   * @param templateId (Required)  (required)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String envIdNotificationsNotificationIdTemplatesChannelTemplateIdDelete(String envId, String notificationId, String channel, String templateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envId' is set
    if (envId == null) {
      throw new ApiException(400, "Missing the required parameter 'envId' when calling envIdNotificationsNotificationIdTemplatesChannelTemplateIdDelete");
    }
    
    // verify the required parameter 'notificationId' is set
    if (notificationId == null) {
      throw new ApiException(400, "Missing the required parameter 'notificationId' when calling envIdNotificationsNotificationIdTemplatesChannelTemplateIdDelete");
    }
    
    // verify the required parameter 'channel' is set
    if (channel == null) {
      throw new ApiException(400, "Missing the required parameter 'channel' when calling envIdNotificationsNotificationIdTemplatesChannelTemplateIdDelete");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling envIdNotificationsNotificationIdTemplatesChannelTemplateIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/{envId}/notifications/{notificationId}/templates/{channel}/{templateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "envId" + "\\}", apiClient.escapeString(envId.toString()))
      .replaceAll("\\{" + "notificationId" + "\\}", apiClient.escapeString(notificationId.toString()))
      .replaceAll("\\{" + "channel" + "\\}", apiClient.escapeString(channel.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
  /**
   * /:envId/notifications/:notificationId/templates/:channel/:templateId
   * 
   * @param envId (Required)  (required)
   * @param notificationId (Required)  (required)
   * @param channel (Required)  (required)
   * @param templateId (Required)  (required)
   * @param accept  (optional)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object envIdNotificationsNotificationIdTemplatesChannelTemplateIdGet(String envId, String notificationId, String channel, String templateId, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envId' is set
    if (envId == null) {
      throw new ApiException(400, "Missing the required parameter 'envId' when calling envIdNotificationsNotificationIdTemplatesChannelTemplateIdGet");
    }
    
    // verify the required parameter 'notificationId' is set
    if (notificationId == null) {
      throw new ApiException(400, "Missing the required parameter 'notificationId' when calling envIdNotificationsNotificationIdTemplatesChannelTemplateIdGet");
    }
    
    // verify the required parameter 'channel' is set
    if (channel == null) {
      throw new ApiException(400, "Missing the required parameter 'channel' when calling envIdNotificationsNotificationIdTemplatesChannelTemplateIdGet");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling envIdNotificationsNotificationIdTemplatesChannelTemplateIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/{envId}/notifications/{notificationId}/templates/{channel}/{templateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "envId" + "\\}", apiClient.escapeString(envId.toString()))
      .replaceAll("\\{" + "notificationId" + "\\}", apiClient.escapeString(notificationId.toString()))
      .replaceAll("\\{" + "channel" + "\\}", apiClient.escapeString(channel.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (accept != null)
      localVarHeaderParams.put("Accept", apiClient.parameterToString(accept));

    
    
    final String[] localVarAccepts = {
      "application/json", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apikeyAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * /:envId/notifications/:notificationId/templates/:channel/:templateId
   * 
   * @param envId (Required)  (required)
   * @param notificationId (Required)  (required)
   * @param channel (Required)  (required)
   * @param templateId (Required)  (required)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String envIdNotificationsNotificationIdTemplatesChannelTemplateIdOptions(String envId, String notificationId, String channel, String templateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envId' is set
    if (envId == null) {
      throw new ApiException(400, "Missing the required parameter 'envId' when calling envIdNotificationsNotificationIdTemplatesChannelTemplateIdOptions");
    }
    
    // verify the required parameter 'notificationId' is set
    if (notificationId == null) {
      throw new ApiException(400, "Missing the required parameter 'notificationId' when calling envIdNotificationsNotificationIdTemplatesChannelTemplateIdOptions");
    }
    
    // verify the required parameter 'channel' is set
    if (channel == null) {
      throw new ApiException(400, "Missing the required parameter 'channel' when calling envIdNotificationsNotificationIdTemplatesChannelTemplateIdOptions");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling envIdNotificationsNotificationIdTemplatesChannelTemplateIdOptions");
    }
    
    // create path and map variables
    String localVarPath = "/{envId}/notifications/{notificationId}/templates/{channel}/{templateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "envId" + "\\}", apiClient.escapeString(envId.toString()))
      .replaceAll("\\{" + "notificationId" + "\\}", apiClient.escapeString(notificationId.toString()))
      .replaceAll("\\{" + "channel" + "\\}", apiClient.escapeString(channel.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
  /**
   * /:envId/notifications/:notificationId/templates/:channel/:templateId
   * 
   * @param envId (Required)  (required)
   * @param notificationId (Required)  (required)
   * @param channel (Required)  (required)
   * @param templateId (Required)  (required)
   * @param contentType  (optional)
   * @param accept  (optional)
   * @param body  (optional)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object envIdNotificationsNotificationIdTemplatesChannelTemplateIdPatch(String envId, String notificationId, String channel, String templateId, String contentType, String accept, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'envId' is set
    if (envId == null) {
      throw new ApiException(400, "Missing the required parameter 'envId' when calling envIdNotificationsNotificationIdTemplatesChannelTemplateIdPatch");
    }
    
    // verify the required parameter 'notificationId' is set
    if (notificationId == null) {
      throw new ApiException(400, "Missing the required parameter 'notificationId' when calling envIdNotificationsNotificationIdTemplatesChannelTemplateIdPatch");
    }
    
    // verify the required parameter 'channel' is set
    if (channel == null) {
      throw new ApiException(400, "Missing the required parameter 'channel' when calling envIdNotificationsNotificationIdTemplatesChannelTemplateIdPatch");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling envIdNotificationsNotificationIdTemplatesChannelTemplateIdPatch");
    }
    
    // create path and map variables
    String localVarPath = "/{envId}/notifications/{notificationId}/templates/{channel}/{templateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "envId" + "\\}", apiClient.escapeString(envId.toString()))
      .replaceAll("\\{" + "notificationId" + "\\}", apiClient.escapeString(notificationId.toString()))
      .replaceAll("\\{" + "channel" + "\\}", apiClient.escapeString(channel.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
      "application/json", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apikeyAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
