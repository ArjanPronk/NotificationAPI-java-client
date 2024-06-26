# notificationapi-java-client

NotificationAPI api

- API version: 1.0.0

- Generator version: 7.5.0

## 👋 Introduction

Welcome to the [NotificationAPI](https://notificationapi.com/) API Docs 🚀

## 🛟 Help and support

We are gradually documenting our APIs 🐢 If you don't see something, just send us a message in the chat, and we'll get it updated in minutes 🐇

## Glossary

- `envId` refers to the account or environment you are modifying
- `user` refers to an end-user, the recipient of notifications
- `member` refers to your team members with access to the dashboard
- `notification` refers to a notification type that you configure in our dashboard, for example: `new_comment_notification`


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>dev.pronk</groupId>
  <artifactId>notificationapi-java-client</artifactId>
  <version>1.0.0-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'notificationapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'notificationapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "dev.pronk:notificationapi-java-client:1.0.0-SNAPSHOT"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/notificationapi-java-client-1.0.0-SNAPSHOT.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import dev.pronk.notificationapi.client.utils.*;
import dev.pronk.notificationapi.client.utils.auth.*;
import dev.pronk.notificationapi.client.model.*;
import dev.pronk.notificationapi.client.AuthenticationApi;

public class AuthenticationApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://}");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        String clientId = "clientId_example"; // String | 
        try {
            apiInstance.clientIdAuthValidateAuthenticateGet(clientId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#clientIdAuthValidateAuthenticateGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://}*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**clientIdAuthValidateAuthenticateGet**](docs/AuthenticationApi.md#clientIdAuthValidateAuthenticateGet) | **GET** /{clientId}/auth/validateAuthenticate | Client ID &amp; Client Secret Example
*AuthenticationApi* | [**clientIdUsersUserIdValidateUserGet**](docs/AuthenticationApi.md#clientIdUsersUserIdValidateUserGet) | **GET** /{clientId}/users/{userId}/validateUser | Client ID and User ID Secure Mode Example
*DefaultApi* | [**healthGet**](docs/DefaultApi.md#healthGet) | **GET** /health | /health
*InAppApi* | [**clientIdUsersUserIdNotificationsINAPPWEBGet**](docs/InAppApi.md#clientIdUsersUserIdNotificationsINAPPWEBGet) | **GET** /{clientId}/users/{userId}/notifications/INAPP_WEB | Get in-app notifications
*InAppApi* | [**clientIdUsersUserIdUnreadINAPPWEBGet**](docs/InAppApi.md#clientIdUsersUserIdUnreadINAPPWEBGet) | **GET** /{clientId}/users/{userId}/unread/INAPP_WEB | Get unread count
*InAppApi* | [**clientIdUsersUserIdUnreadINAPPWEBPatch**](docs/InAppApi.md#clientIdUsersUserIdUnreadINAPPWEBPatch) | **PATCH** /{clientId}/users/{userId}/unread/INAPP_WEB | Mark notification as read
*PreferencesApi* | [**clientIdUserPreferencesUserIdPost**](docs/PreferencesApi.md#clientIdUserPreferencesUserIdPost) | **POST** /{clientId}/user_preferences/{userId} | Update User Preferences
*PreferencesSubNotificationsApi* | [**clientIdNotificationsNotificationIdSubNotificationsSubNotificationIdPut**](docs/PreferencesSubNotificationsApi.md#clientIdNotificationsNotificationIdSubNotificationsSubNotificationIdPut) | **PUT** /{clientId}/notifications/{notificationId}/subNotifications/{subNotificationId} | Create subNotification
*PreferencesSubNotificationsApi* | [**envIdNotificationsNotificationIdSubNotificationsSubNotificationIdDelete**](docs/PreferencesSubNotificationsApi.md#envIdNotificationsNotificationIdSubNotificationsSubNotificationIdDelete) | **DELETE** /{envId}/notifications/{notificationId}/subNotifications/{subNotificationId} | Delete subNotification
*SendingApi* | [**clientIdScheduleTrackingIdDelete**](docs/SendingApi.md#clientIdScheduleTrackingIdDelete) | **DELETE** /{clientId}/schedule/{trackingId} | Delete a scheduled notification
*SendingApi* | [**clientIdScheduleTrackingIdPatch**](docs/SendingApi.md#clientIdScheduleTrackingIdPatch) | **PATCH** /{clientId}/schedule/{trackingId} | Update a scheduled notification
*SendingApi* | [**clientIdSenderPost**](docs/SendingApi.md#clientIdSenderPost) | **POST** /{clientId}/sender | Send a notification
*SendingApi* | [**envIdSenderRetractPost**](docs/SendingApi.md#envIdSenderRetractPost) | **POST** /{envId}/sender/retract | Delete In-App Notification
*UndocumentedApi* | [**envIdGet**](docs/UndocumentedApi.md#envIdGet) | **GET** /{envId} | /:envId
*UndocumentedApi* | [**envIdPatch**](docs/UndocumentedApi.md#envIdPatch) | **PATCH** /{envId} | /:envId
*UndocumentedComponentsChannelApi* | [**envIdComponentsChannelGet**](docs/UndocumentedComponentsChannelApi.md#envIdComponentsChannelGet) | **GET** /{envId}/components/{channel} | /:envId/components/:channel
*UndocumentedComponentsChannelApi* | [**envIdComponentsChannelPost**](docs/UndocumentedComponentsChannelApi.md#envIdComponentsChannelPost) | **POST** /{envId}/components/{channel} | /:envId/components/:channel
*UndocumentedComponentsChannelComponentIdApi* | [**envIdComponentsChannelComponentIdDelete**](docs/UndocumentedComponentsChannelComponentIdApi.md#envIdComponentsChannelComponentIdDelete) | **DELETE** /{envId}/components/{channel}/{componentId} | /:envId/components/:channel/:componentId
*UndocumentedComponentsChannelComponentIdApi* | [**envIdComponentsChannelComponentIdGet**](docs/UndocumentedComponentsChannelComponentIdApi.md#envIdComponentsChannelComponentIdGet) | **GET** /{envId}/components/{channel}/{componentId} | /:envId/components/:channel/:componentId
*UndocumentedComponentsChannelComponentIdApi* | [**envIdComponentsChannelComponentIdPatch**](docs/UndocumentedComponentsChannelComponentIdApi.md#envIdComponentsChannelComponentIdPatch) | **PATCH** /{envId}/components/{channel}/{componentId} | /:envId/components/:channel/:componentId
*UndocumentedComponentsPublicUrlChannelApi* | [**envIdComponentsPublicUrlChannelGet**](docs/UndocumentedComponentsPublicUrlChannelApi.md#envIdComponentsPublicUrlChannelGet) | **GET** /{envId}/components_public_url/{channel} | /:envId/components_public_url/:channel
*UndocumentedComponentsPublicUrlChannelApi* | [**envIdComponentsPublicUrlChannelOptions**](docs/UndocumentedComponentsPublicUrlChannelApi.md#envIdComponentsPublicUrlChannelOptions) | **OPTIONS** /{envId}/components_public_url/{channel} | /:envId/components_public_url/:channel
*UndocumentedComponentsPublicUrlValidateAuthBeeApi* | [**envIdComponentsPublicUrlValidateAuthBeeGet**](docs/UndocumentedComponentsPublicUrlValidateAuthBeeApi.md#envIdComponentsPublicUrlValidateAuthBeeGet) | **GET** /{envId}/components_public_url/validateAuthBee | /:envId/components_public_url/validateAuthBee
*UndocumentedComponentsPublicUrlValidateAuthBeeApi* | [**envIdComponentsPublicUrlValidateAuthBeeOptions**](docs/UndocumentedComponentsPublicUrlValidateAuthBeeApi.md#envIdComponentsPublicUrlValidateAuthBeeOptions) | **OPTIONS** /{envId}/components_public_url/validateAuthBee | /:envId/components_public_url/validateAuthBee
*UndocumentedEmailerSendersApi* | [**envIdEmailerSendersGet**](docs/UndocumentedEmailerSendersApi.md#envIdEmailerSendersGet) | **GET** /{envId}/emailer/senders | /:envId/emailer/senders
*UndocumentedEmailerSendersApi* | [**envIdEmailerSendersOptions**](docs/UndocumentedEmailerSendersApi.md#envIdEmailerSendersOptions) | **OPTIONS** /{envId}/emailer/senders | /:envId/emailer/senders
*UndocumentedEmailerSendersApi* | [**envIdEmailerSendersPost**](docs/UndocumentedEmailerSendersApi.md#envIdEmailerSendersPost) | **POST** /{envId}/emailer/senders | /:envId/emailer/senders
*UndocumentedEmailerSendersSenderApi* | [**envIdEmailerSendersSenderDelete**](docs/UndocumentedEmailerSendersSenderApi.md#envIdEmailerSendersSenderDelete) | **DELETE** /{envId}/emailer/senders/{sender} | /:envId/emailer/senders/:sender
*UndocumentedEmailerSendersSenderApi* | [**envIdEmailerSendersSenderOptions**](docs/UndocumentedEmailerSendersSenderApi.md#envIdEmailerSendersSenderOptions) | **OPTIONS** /{envId}/emailer/senders/{sender} | /:envId/emailer/senders/:sender
*UndocumentedEmailerTestApi* | [**envIdEmailerTestOptions**](docs/UndocumentedEmailerTestApi.md#envIdEmailerTestOptions) | **OPTIONS** /{envId}/emailer/test | /:envId/emailer/test
*UndocumentedEmailerTestApi* | [**envIdEmailerTestPost**](docs/UndocumentedEmailerTestApi.md#envIdEmailerTestPost) | **POST** /{envId}/emailer/test | /:envId/emailer/test
*UndocumentedEnvironmentsApi* | [**envIdEnvironmentsOptions**](docs/UndocumentedEnvironmentsApi.md#envIdEnvironmentsOptions) | **OPTIONS** /{envId}/environments | /:envId/environments
*UndocumentedEnvironmentsApi* | [**envIdEnvironmentsPost**](docs/UndocumentedEnvironmentsApi.md#envIdEnvironmentsPost) | **POST** /{envId}/environments | /:envId/environments
*UndocumentedInsightsApi* | [**envIdInsightsOptions**](docs/UndocumentedInsightsApi.md#envIdInsightsOptions) | **OPTIONS** /{envId}/insights | /:envId/insights
*UndocumentedInsightsApi* | [**envIdInsightsPost**](docs/UndocumentedInsightsApi.md#envIdInsightsPost) | **POST** /{envId}/insights | /:envId/insights
*UndocumentedLogsRetentionApi* | [**envIdLogsRetentionGet**](docs/UndocumentedLogsRetentionApi.md#envIdLogsRetentionGet) | **GET** /{envId}/logs/retention | /:envId/logs/retention
*UndocumentedLogsRetentionApi* | [**envIdLogsRetentionOptions**](docs/UndocumentedLogsRetentionApi.md#envIdLogsRetentionOptions) | **OPTIONS** /{envId}/logs/retention | /:envId/logs/retention
*UndocumentedMembersApi* | [**envIdMembersGet**](docs/UndocumentedMembersApi.md#envIdMembersGet) | **GET** /{envId}/members | /:envId/members
*UndocumentedMembersApi* | [**envIdMembersOptions**](docs/UndocumentedMembersApi.md#envIdMembersOptions) | **OPTIONS** /{envId}/members | /:envId/members
*UndocumentedMembersApi* | [**envIdMembersPost**](docs/UndocumentedMembersApi.md#envIdMembersPost) | **POST** /{envId}/members | /:envId/members
*UndocumentedMembersUserIdApi* | [**envIdMembersUserIdDelete**](docs/UndocumentedMembersUserIdApi.md#envIdMembersUserIdDelete) | **DELETE** /{envId}/members/{userId} | /:envId/members/:userId
*UndocumentedMembersUserIdApi* | [**envIdMembersUserIdOptions**](docs/UndocumentedMembersUserIdApi.md#envIdMembersUserIdOptions) | **OPTIONS** /{envId}/members/{userId} | /:envId/members/:userId
*UndocumentedNotificationsApi* | [**envIdNotificationsGet**](docs/UndocumentedNotificationsApi.md#envIdNotificationsGet) | **GET** /{envId}/notifications | /:envId/notifications
*UndocumentedNotificationsApi* | [**envIdNotificationsOptions**](docs/UndocumentedNotificationsApi.md#envIdNotificationsOptions) | **OPTIONS** /{envId}/notifications | /:envId/notifications
*UndocumentedNotificationsApi* | [**envIdNotificationsPost**](docs/UndocumentedNotificationsApi.md#envIdNotificationsPost) | **POST** /{envId}/notifications | /:envId/notifications
*UndocumentedNotificationsNotificationIdApi* | [**envIdNotificationsNotificationIdDelete**](docs/UndocumentedNotificationsNotificationIdApi.md#envIdNotificationsNotificationIdDelete) | **DELETE** /{envId}/notifications/{notificationId} | /:envId/notifications/:notificationId
*UndocumentedNotificationsNotificationIdApi* | [**envIdNotificationsNotificationIdGet**](docs/UndocumentedNotificationsNotificationIdApi.md#envIdNotificationsNotificationIdGet) | **GET** /{envId}/notifications/{notificationId} | /:envId/notifications/:notificationId
*UndocumentedNotificationsNotificationIdApi* | [**envIdNotificationsNotificationIdOptions**](docs/UndocumentedNotificationsNotificationIdApi.md#envIdNotificationsNotificationIdOptions) | **OPTIONS** /{envId}/notifications/{notificationId} | /:envId/notifications/:notificationId
*UndocumentedNotificationsNotificationIdApi* | [**envIdNotificationsNotificationIdPatch**](docs/UndocumentedNotificationsNotificationIdApi.md#envIdNotificationsNotificationIdPatch) | **PATCH** /{envId}/notifications/{notificationId} | /:envId/notifications/:notificationId
*UndocumentedNotificationsNotificationIdDefaulttemplateApi* | [**envIdNotificationsNotificationIdDefaulttemplateOptions**](docs/UndocumentedNotificationsNotificationIdDefaulttemplateApi.md#envIdNotificationsNotificationIdDefaulttemplateOptions) | **OPTIONS** /{envId}/notifications/{notificationId}/defaulttemplate | /:envId/notifications/:notificationId/defaulttemplate
*UndocumentedNotificationsNotificationIdDefaulttemplateApi* | [**envIdNotificationsNotificationIdDefaulttemplatePost**](docs/UndocumentedNotificationsNotificationIdDefaulttemplateApi.md#envIdNotificationsNotificationIdDefaulttemplatePost) | **POST** /{envId}/notifications/{notificationId}/defaulttemplate | /:envId/notifications/:notificationId/defaulttemplate
*UndocumentedNotificationsNotificationIdDefaulttemplateChannelApi* | [**envIdNotificationsNotificationIdDefaulttemplateChannelOptions**](docs/UndocumentedNotificationsNotificationIdDefaulttemplateChannelApi.md#envIdNotificationsNotificationIdDefaulttemplateChannelOptions) | **OPTIONS** /{envId}/notifications/{notificationId}/defaulttemplate/{channel} | /:envId/notifications/:notificationId/defaulttemplate/:channel
*UndocumentedNotificationsNotificationIdDefaulttemplateChannelApi* | [**envIdNotificationsNotificationIdDefaulttemplateChannelPatch**](docs/UndocumentedNotificationsNotificationIdDefaulttemplateChannelApi.md#envIdNotificationsNotificationIdDefaulttemplateChannelPatch) | **PATCH** /{envId}/notifications/{notificationId}/defaulttemplate/{channel} | /:envId/notifications/:notificationId/defaulttemplate/:channel
*UndocumentedNotificationsNotificationIdSubNotificationsSubNotificationIdApi* | [**envIdNotificationsNotificationIdSubNotificationsSubNotificationIdOptions**](docs/UndocumentedNotificationsNotificationIdSubNotificationsSubNotificationIdApi.md#envIdNotificationsNotificationIdSubNotificationsSubNotificationIdOptions) | **OPTIONS** /{envId}/notifications/{notificationId}/subNotifications/{subNotificationId} | /:envId/notifications/:notificationId/subNotifications/:subNotificationId
*UndocumentedNotificationsNotificationIdTemplatesChannelApi* | [**envIdNotificationsNotificationIdTemplatesChannelGet**](docs/UndocumentedNotificationsNotificationIdTemplatesChannelApi.md#envIdNotificationsNotificationIdTemplatesChannelGet) | **GET** /{envId}/notifications/{notificationId}/templates/{channel} | /:envId/notifications/:notificationId/templates/:channel
*UndocumentedNotificationsNotificationIdTemplatesChannelApi* | [**envIdNotificationsNotificationIdTemplatesChannelOptions**](docs/UndocumentedNotificationsNotificationIdTemplatesChannelApi.md#envIdNotificationsNotificationIdTemplatesChannelOptions) | **OPTIONS** /{envId}/notifications/{notificationId}/templates/{channel} | /:envId/notifications/:notificationId/templates/:channel
*UndocumentedNotificationsNotificationIdTemplatesChannelApi* | [**envIdNotificationsNotificationIdTemplatesChannelPost**](docs/UndocumentedNotificationsNotificationIdTemplatesChannelApi.md#envIdNotificationsNotificationIdTemplatesChannelPost) | **POST** /{envId}/notifications/{notificationId}/templates/{channel} | /:envId/notifications/:notificationId/templates/:channel
*UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi* | [**envIdNotificationsNotificationIdTemplatesChannelTemplateIdDelete**](docs/UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi.md#envIdNotificationsNotificationIdTemplatesChannelTemplateIdDelete) | **DELETE** /{envId}/notifications/{notificationId}/templates/{channel}/{templateId} | /:envId/notifications/:notificationId/templates/:channel/:templateId
*UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi* | [**envIdNotificationsNotificationIdTemplatesChannelTemplateIdGet**](docs/UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi.md#envIdNotificationsNotificationIdTemplatesChannelTemplateIdGet) | **GET** /{envId}/notifications/{notificationId}/templates/{channel}/{templateId} | /:envId/notifications/:notificationId/templates/:channel/:templateId
*UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi* | [**envIdNotificationsNotificationIdTemplatesChannelTemplateIdOptions**](docs/UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi.md#envIdNotificationsNotificationIdTemplatesChannelTemplateIdOptions) | **OPTIONS** /{envId}/notifications/{notificationId}/templates/{channel}/{templateId} | /:envId/notifications/:notificationId/templates/:channel/:templateId
*UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi* | [**envIdNotificationsNotificationIdTemplatesChannelTemplateIdPatch**](docs/UndocumentedNotificationsNotificationIdTemplatesChannelTemplateIdApi.md#envIdNotificationsNotificationIdTemplatesChannelTemplateIdPatch) | **PATCH** /{envId}/notifications/{notificationId}/templates/{channel}/{templateId} | /:envId/notifications/:notificationId/templates/:channel/:templateId
*UndocumentedSmsTestApi* | [**envIdSmsTestOptions**](docs/UndocumentedSmsTestApi.md#envIdSmsTestOptions) | **OPTIONS** /{envId}/sms/test | /:envId/sms/test
*UndocumentedSmsTestApi* | [**envIdSmsTestPost**](docs/UndocumentedSmsTestApi.md#envIdSmsTestPost) | **POST** /{envId}/sms/test | /:envId/sms/test
*UndocumentedTestApi* | [**envIdTestOptions**](docs/UndocumentedTestApi.md#envIdTestOptions) | **OPTIONS** /{envId}/test | /:envId/test
*UndocumentedTestApi* | [**envIdTestPost**](docs/UndocumentedTestApi.md#envIdTestPost) | **POST** /{envId}/test | /:envId/test
*UndocumentedUserPreferencesUserIdApi* | [**envIdUserPreferencesUserIdOptions**](docs/UndocumentedUserPreferencesUserIdApi.md#envIdUserPreferencesUserIdOptions) | **OPTIONS** /{envId}/user_preferences/{userId} | /:envId/user_preferences/:userId
*UndocumentedUsersUserIdApi* | [**envIdUsersUserIdOptions**](docs/UndocumentedUsersUserIdApi.md#envIdUsersUserIdOptions) | **OPTIONS** /{envId}/users/{userId} | /:envId/users/:userId
*UndocumentedUsersUserIdApi* | [**envIdUsersUserIdPost**](docs/UndocumentedUsersUserIdApi.md#envIdUsersUserIdPost) | **POST** /{envId}/users/{userId} | /:envId/users/:userId
*UndocumentedUsersUserIdUnsubscribeApi* | [**envIdUsersUserIdUnsubscribeOptions**](docs/UndocumentedUsersUserIdUnsubscribeApi.md#envIdUsersUserIdUnsubscribeOptions) | **OPTIONS** /{envId}/users/{userId}/unsubscribe | /:envId/users/:userId/unsubscribe
*UndocumentedUsersUserIdValidateUserApi* | [**envIdUsersUserIdValidateUserGet**](docs/UndocumentedUsersUserIdValidateUserApi.md#envIdUsersUserIdValidateUserGet) | **GET** /{envId}/users/{userId}/validateUser | /:envId/users/:userId/validateUser
*UndocumentedUsersUserIdValidateUserApi* | [**envIdUsersUserIdValidateUserOptions**](docs/UndocumentedUsersUserIdValidateUserApi.md#envIdUsersUserIdValidateUserOptions) | **OPTIONS** /{envId}/users/{userId}/validateUser | /:envId/users/:userId/validateUser
*UndocumentedUsersUserIdValidateUserWithRequestApi* | [**envIdUsersUserIdValidateUserWithRequestGet**](docs/UndocumentedUsersUserIdValidateUserWithRequestApi.md#envIdUsersUserIdValidateUserWithRequestGet) | **GET** /{envId}/users/{userId}/validateUserWithRequest | /:envId/users/:userId/validateUserWithRequest
*UndocumentedUsersUserIdValidateUserWithRequestApi* | [**envIdUsersUserIdValidateUserWithRequestOptions**](docs/UndocumentedUsersUserIdValidateUserWithRequestApi.md#envIdUsersUserIdValidateUserWithRequestOptions) | **OPTIONS** /{envId}/users/{userId}/validateUserWithRequest | /:envId/users/:userId/validateUserWithRequest
*UserApi* | [**envIdUsersUserIdUnsubscribePost**](docs/UserApi.md#envIdUsersUserIdUnsubscribePost) | **POST** /{envId}/users/{userId}/unsubscribe | Unsubscribe


## Documentation for Models



<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="basicAuth"></a>
### basicAuth


- **Type**: HTTP basic authentication

<a id="apikeyAuth"></a>
### apikeyAuth



## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



