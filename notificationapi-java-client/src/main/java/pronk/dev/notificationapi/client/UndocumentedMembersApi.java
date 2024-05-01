package pronk.dev.notificationapi.client;

import pronk.dev.notificationapi.client.utils.ApiException;
import pronk.dev.notificationapi.client.utils.ApiClient;
import pronk.dev.notificationapi.client.utils.Configuration;
import pronk.dev.notificationapi.client.utils.Pair;

import javax.ws.rs.core.GenericType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class UndocumentedMembersApi {
  private ApiClient apiClient;

  public UndocumentedMembersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UndocumentedMembersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * /:envId/members
   * 
   * @param envId (Required)  (required)
   * @param accept  (optional)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object envIdMembersGet(String envId, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envId' is set
    if (envId == null) {
      throw new ApiException(400, "Missing the required parameter 'envId' when calling envIdMembersGet");
    }
    
    // create path and map variables
    String localVarPath = "/{envId}/members".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "envId" + "\\}", apiClient.escapeString(envId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (accept != null)
      localVarHeaderParams.put("Accept", apiClient.parameterToString(accept));

    
    
    final String[] localVarAccepts = {
      "application/json"
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
   * /:envId/members
   * 
   * @param envId (Required)  (required)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String envIdMembersOptions(String envId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envId' is set
    if (envId == null) {
      throw new ApiException(400, "Missing the required parameter 'envId' when calling envIdMembersOptions");
    }
    
    // create path and map variables
    String localVarPath = "/{envId}/members".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "envId" + "\\}", apiClient.escapeString(envId.toString()));

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
   * /:envId/members
   * 
   * @param envId (Required)  (required)
   * @param contentType  (optional)
   * @param body  (optional)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String envIdMembersPost(String envId, String contentType, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'envId' is set
    if (envId == null) {
      throw new ApiException(400, "Missing the required parameter 'envId' when calling envIdMembersPost");
    }
    
    // create path and map variables
    String localVarPath = "/{envId}/members".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "apikeyAuth" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
