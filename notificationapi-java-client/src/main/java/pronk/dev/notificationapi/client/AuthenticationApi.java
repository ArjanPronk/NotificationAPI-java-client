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
public class AuthenticationApi {
  private ApiClient apiClient;

  public AuthenticationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthenticationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Client ID &amp; Client Secret Example
   * Generally used for **server-to-server** connections where you have control over the client secret, for example, in your back-end.  This method uses the BASIC authorization model:  &#x60;&#x60;&#x60; Authorization: BASIC BASE64(\&quot;CLIENT_ID:CLIENT_SECRET\&quot;)   &#x60;&#x60;&#x60;  Example in JavaScript:  &#x60;&#x60;&#x60; javascript Authorization: Buffer.from(&#x60;${clientId}:${clientSecret}&#x60;).toString(\&quot;base64\&quot;)   &#x60;&#x60;&#x60;
   * @param clientId  (required)
   * @throws ApiException if fails to make API call
   */
  public void clientIdAuthValidateAuthenticateGet(String clientId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling clientIdAuthValidateAuthenticateGet");
    }
    
    // create path and map variables
    String localVarPath = "/{clientId}/auth/validateAuthenticate".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Client ID and User ID Secure Mode Example
   * To prevent users from impersonating each other, you can enable secure mode ([learn more](https://docs.notificationapi.com/guides/secure-mode)). In secure mode, you need to append the user&#39;s hashedUserId to the string that is being encoded:  &#x60;&#x60;&#x60; Authorization: BASIC BASE64(\&quot;CLIENT_ID:USER_ID:HASHED_USER_ID\&quot;)   &#x60;&#x60;&#x60;  Example in JavaScript:  &#x60;&#x60;&#x60; javascript Authorization: BASIC Buffer.from(&#x60;${clientId}:${userId}:${hashedUserId}&#x60;).toString(\&quot;base64\&quot;)   &#x60;&#x60;&#x60;  To test secure mode correctly, you need to enable Secure Mode in your account.
   * @param clientId  (required)
   * @param userId  (required)
   * @throws ApiException if fails to make API call
   */
  public void clientIdUsersUserIdValidateUserGet(String clientId, String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling clientIdUsersUserIdValidateUserGet");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling clientIdUsersUserIdValidateUserGet");
    }
    
    // create path and map variables
    String localVarPath = "/{clientId}/users/{userId}/validateUser".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
