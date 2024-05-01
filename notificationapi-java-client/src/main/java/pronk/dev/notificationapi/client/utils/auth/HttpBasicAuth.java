/*
 * NotificationAPI api
 * ## 👋 Introduction  Welcome to the [NotificationAPI](https://notificationapi.com/) API Docs 🚀  ## 🛟 Help and support  We are gradually documenting our APIs 🐢 If you don't see something, just send us a message in the chat, and we'll get it updated in minutes 🐇  ## Glossary  - `envId` refers to the account or environment you are modifying - `user` refers to an end-user, the recipient of notifications - `member` refers to your team members with access to the dashboard - `notification` refers to a notification type that you configure in our dashboard, for example: `new_comment_notification`
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package pronk.dev.notificationapi.client.utils.auth;

import pronk.dev.notificationapi.client.utils.Pair;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class HttpBasicAuth implements Authentication {
  private String username;
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams) {
    if (username == null && password == null) {
      return;
    }
    String str = (username == null ? "" : username) + ":" + (password == null ? "" : password);
    headerParams.put("Authorization", "Basic " + Base64.getEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8)));
  }
}
