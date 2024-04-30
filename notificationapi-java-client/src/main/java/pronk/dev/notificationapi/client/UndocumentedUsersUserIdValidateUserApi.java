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
public class UndocumentedUsersUserIdValidateUserApi {
  private ApiClient apiClient;

  public UndocumentedUsersUserIdValidateUserApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UndocumentedUsersUserIdValidateUserApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * /:envId/users/:userId/validateUser
   * 
   * @param envId (Required)  (required)
   * @param userId (Required)  (required)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String envIdUsersUserIdValidateUserGet(String envId, String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envId' is set
    if (envId == null) {
      throw new ApiException(400, "Missing the required parameter 'envId' when calling envIdUsersUserIdValidateUserGet");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling envIdUsersUserIdValidateUserGet");
    }
    
    // create path and map variables
    String localVarPath = "/{envId}/users/{userId}/validateUser".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "apikeyAuth" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * /:envId/users/:userId/validateUser
   * 
   * @param envId (Required)  (required)
   * @param userId (Required)  (required)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String envIdUsersUserIdValidateUserOptions(String envId, String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envId' is set
    if (envId == null) {
      throw new ApiException(400, "Missing the required parameter 'envId' when calling envIdUsersUserIdValidateUserOptions");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling envIdUsersUserIdValidateUserOptions");
    }
    
    // create path and map variables
    String localVarPath = "/{envId}/users/{userId}/validateUser".replaceAll("\\{format\\}","json")
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
}
