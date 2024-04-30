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
public class UndocumentedUsersUserIdApi {
  private ApiClient apiClient;

  public UndocumentedUsersUserIdApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UndocumentedUsersUserIdApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * /:envId/users/:userId
   * 
   * @param envId (Required)  (required)
   * @param userId (Required)  (required)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String envIdUsersUserIdOptions(String envId, String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envId' is set
    if (envId == null) {
      throw new ApiException(400, "Missing the required parameter 'envId' when calling envIdUsersUserIdOptions");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling envIdUsersUserIdOptions");
    }
    
    // create path and map variables
    String localVarPath = "/{envId}/users/{userId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "envId" + "\\}", apiClient.escapeString(envId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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
   * /:envId/users/:userId
   * 
   * @param envId (Required)  (required)
   * @param userId (Required)  (required)
   * @param contentType  (optional)
   * @param accept  (optional)
   * @param body  (optional)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object envIdUsersUserIdPost(String envId, String userId, String contentType, String accept, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'envId' is set
    if (envId == null) {
      throw new ApiException(400, "Missing the required parameter 'envId' when calling envIdUsersUserIdPost");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling envIdUsersUserIdPost");
    }
    
    // create path and map variables
    String localVarPath = "/{envId}/users/{userId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "envId" + "\\}", apiClient.escapeString(envId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    String[] localVarAuthNames = new String[] { "apikeyAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
