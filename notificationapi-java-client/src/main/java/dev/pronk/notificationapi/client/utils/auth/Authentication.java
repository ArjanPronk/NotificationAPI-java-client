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


package dev.pronk.notificationapi.client.utils.auth;

import dev.pronk.notificationapi.client.utils.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams List of query parameters
     * @param headerParams Map of header parameters
     * @param cookieParams Map of cookie parameters
     */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams);
}