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
public class UndocumentedSmsTestApi {
  private ApiClient apiClient;

  public UndocumentedSmsTestApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UndocumentedSmsTestApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * /:envId/sms/test
   * 
   * @param envId (Required)  (required)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String envIdSmsTestOptions(String envId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envId' is set
    if (envId == null) {
      throw new ApiException(400, "Missing the required parameter 'envId' when calling envIdSmsTestOptions");
    }
    
    // create path and map variables
    String localVarPath = "/{envId}/sms/test".replaceAll("\\{format\\}","json")
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
   * /:envId/sms/test
   * 
   * @param envId (Required)  (required)
   * @throws ApiException if fails to make API call
   */
  public void envIdSmsTestPost(String envId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envId' is set
    if (envId == null) {
      throw new ApiException(400, "Missing the required parameter 'envId' when calling envIdSmsTestPost");
    }
    
    // create path and map variables
    String localVarPath = "/{envId}/sms/test".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "envId" + "\\}", apiClient.escapeString(envId.toString()));

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

    String[] localVarAuthNames = new String[] { "apikeyAuth" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
