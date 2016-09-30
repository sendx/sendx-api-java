# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CampaignApi;

import java.io.File;
import java.util.*;

public class CampaignApiExample {

    public static void main(String[] args) {
        
        CampaignApi apiInstance = new CampaignApi();
        String apiKey = "apiKey_example"; // String | 
        Long campaignId = 789L; // Long | Campaign ID to delete
        try {
            apiInstance.campaignCampaignIdDelete(apiKey, campaignId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#campaignCampaignIdDelete");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://api.sendx.io/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CampaignApi* | [**campaignCampaignIdDelete**](docs/CampaignApi.md#campaignCampaignIdDelete) | **DELETE** /campaign/{campaignId} | Deletes a campaign
*CampaignApi* | [**campaignCampaignIdGet**](docs/CampaignApi.md#campaignCampaignIdGet) | **GET** /campaign/{campaignId} | Find campaign by ID
*CampaignApi* | [**campaignCampaignIdPut**](docs/CampaignApi.md#campaignCampaignIdPut) | **PUT** /campaign/{campaignId} | Update a campaign by ID
*CampaignApi* | [**campaignGet**](docs/CampaignApi.md#campaignGet) | **GET** /campaign | Get information about all campaigns
*CampaignApi* | [**campaignPost**](docs/CampaignApi.md#campaignPost) | **POST** /campaign | Add a new campaign
*ContactApi* | [**contactBulkPost**](docs/ContactApi.md#contactBulkPost) | **POST** /contact/bulk | Add a bulk of contacts in a request
*ContactApi* | [**contactContactIdCustomfieldPost**](docs/ContactApi.md#contactContactIdCustomfieldPost) | **POST** /contact/{contactId}/customfield | Add Customfield data for a contact
*ContactApi* | [**contactContactIdDelete**](docs/ContactApi.md#contactContactIdDelete) | **DELETE** /contact/{contactId} | Deletes a contact
*ContactApi* | [**contactContactIdGet**](docs/ContactApi.md#contactContactIdGet) | **GET** /contact/{contactId} | Find contact by ID
*ContactApi* | [**contactContactIdPut**](docs/ContactApi.md#contactContactIdPut) | **PUT** /contact/{contactId} | Update a contact by ID
*ContactApi* | [**contactGet**](docs/ContactApi.md#contactGet) | **GET** /contact | Get information about all contacts
*ContactApi* | [**contactPost**](docs/ContactApi.md#contactPost) | **POST** /contact | Add a new contact
*CustomfieldApi* | [**customfieldCustomfieldIdGet**](docs/CustomfieldApi.md#customfieldCustomfieldIdGet) | **GET** /customfield/{customfieldId} | Find customfield by ID
*CustomfieldApi* | [**customfieldGet**](docs/CustomfieldApi.md#customfieldGet) | **GET** /customfield | Get information about all customfield
*CustomfieldApi* | [**customfieldPost**](docs/CustomfieldApi.md#customfieldPost) | **POST** /customfield | Add a new Customfield
*ListApi* | [**listGet**](docs/ListApi.md#listGet) | **GET** /list | Get information about all lists
*ListApi* | [**listListIdContactDelete**](docs/ListApi.md#listListIdContactDelete) | **DELETE** /list/{listId}/contact | Remove a contact from a list
*ListApi* | [**listListIdContactPost**](docs/ListApi.md#listListIdContactPost) | **POST** /list/{listId}/contact | Add a contact to a list
*ListApi* | [**listListIdContactsGet**](docs/ListApi.md#listListIdContactsGet) | **GET** /list/{listId}/contacts | Find contacts belonging to a list
*ListApi* | [**listListIdDelete**](docs/ListApi.md#listListIdDelete) | **DELETE** /list/{listId} | Deletes a list
*ListApi* | [**listListIdGet**](docs/ListApi.md#listListIdGet) | **GET** /list/{listId} | Find list by ID
*ListApi* | [**listListIdPut**](docs/ListApi.md#listListIdPut) | **PUT** /list/{listId} | Update a list by ID
*ListApi* | [**listPost**](docs/ListApi.md#listPost) | **POST** /list | Add a new list
*SegmentApi* | [**segmentGet**](docs/SegmentApi.md#segmentGet) | **GET** /segment | Get information about all segments
*TagApi* | [**tagGet**](docs/TagApi.md#tagGet) | **GET** /tag | Get information about all tags
*TagApi* | [**tagPost**](docs/TagApi.md#tagPost) | **POST** /tag | Add a new tag
*TagApi* | [**tagTagIdContactDelete**](docs/TagApi.md#tagTagIdContactDelete) | **DELETE** /tag/{tagId}/contact | Remove a contact from a tag
*TagApi* | [**tagTagIdContactPost**](docs/TagApi.md#tagTagIdContactPost) | **POST** /tag/{tagId}/contact | Add a contact to a tag
*TagApi* | [**tagTagIdContactsGet**](docs/TagApi.md#tagTagIdContactsGet) | **GET** /tag/{tagId}/contacts | Find contacts belonging to a tag
*TagApi* | [**tagTagIdDelete**](docs/TagApi.md#tagTagIdDelete) | **DELETE** /tag/{tagId} | Deletes a tag
*TagApi* | [**tagTagIdGet**](docs/TagApi.md#tagTagIdGet) | **GET** /tag/{tagId} | Find tag by ID
*TagApi* | [**tagTagIdPut**](docs/TagApi.md#tagTagIdPut) | **PUT** /tag/{tagId} | Update a tag by ID
*TeamApi* | [**teamGet**](docs/TeamApi.md#teamGet) | **GET** /team | Get information about all teams
*TeamApi* | [**teamPost**](docs/TeamApi.md#teamPost) | **POST** /team | Add a new team
*TeamApi* | [**teamTeamIdCampaignsGet**](docs/TeamApi.md#teamTeamIdCampaignsGet) | **GET** /team/{teamId}/campaigns | Find campaigns of a team by ID
*TeamApi* | [**teamTeamIdContactsGet**](docs/TeamApi.md#teamTeamIdContactsGet) | **GET** /team/{teamId}/contacts | Find contacts of a team by ID
*TeamApi* | [**teamTeamIdDelete**](docs/TeamApi.md#teamTeamIdDelete) | **DELETE** /team/{teamId} | Deletes a team
*TeamApi* | [**teamTeamIdGet**](docs/TeamApi.md#teamTeamIdGet) | **GET** /team/{teamId} | Find team by ID
*TeamApi* | [**teamTeamIdListsGet**](docs/TeamApi.md#teamTeamIdListsGet) | **GET** /team/{teamId}/lists | Find lists of a team by ID
*TeamApi* | [**teamTeamIdPut**](docs/TeamApi.md#teamTeamIdPut) | **PUT** /team/{teamId} | Update a team by ID
*TeamApi* | [**teamTeamIdTagsGet**](docs/TeamApi.md#teamTeamIdTagsGet) | **GET** /team/{teamId}/tags | Find tags of a team by ID


## Documentation for Models

 - [BulkContact](docs/BulkContact.md)
 - [Campaign](docs/Campaign.md)
 - [CampaignAddUpdate](docs/CampaignAddUpdate.md)
 - [Contact](docs/Contact.md)
 - [ContactAddUpdate](docs/ContactAddUpdate.md)
 - [ContactAddUpdateCustomFields](docs/ContactAddUpdateCustomFields.md)
 - [ContactCustomfield](docs/ContactCustomfield.md)
 - [Customfield](docs/Customfield.md)
 - [CustomfieldAddUpdate](docs/CustomfieldAddUpdate.md)
 - [DeepListEmailContact](docs/DeepListEmailContact.md)
 - [DeepTeamEmailContact](docs/DeepTeamEmailContact.md)
 - [EContent](docs/EContent.md)
 - [EMessage](docs/EMessage.md)
 - [Email](docs/Email.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse20010](docs/InlineResponse20010.md)
 - [InlineResponse20011](docs/InlineResponse20011.md)
 - [InlineResponse20012](docs/InlineResponse20012.md)
 - [InlineResponse20013](docs/InlineResponse20013.md)
 - [InlineResponse20014](docs/InlineResponse20014.md)
 - [InlineResponse20015](docs/InlineResponse20015.md)
 - [InlineResponse20016](docs/InlineResponse20016.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2009](docs/InlineResponse2009.md)
 - [Link](docs/Link.md)
 - [LinkAddUpdate](docs/LinkAddUpdate.md)
 - [ListAddUpdate](docs/ListAddUpdate.md)
 - [ListContact](docs/ListContact.md)
 - [ListContactId](docs/ListContactId.md)
 - [Segment](docs/Segment.md)
 - [Tag](docs/Tag.md)
 - [TagAddUpdate](docs/TagAddUpdate.md)
 - [TagContact](docs/TagContact.md)
 - [TagContactId](docs/TagContactId.md)
 - [Team](docs/Team.md)
 - [TeamAddUpdate](docs/TeamAddUpdate.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



