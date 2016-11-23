# JAVA SendX API

**NOTE:** All API calls contain 2 parameters - 'api_key' and 'team_id'. These can be inferred from your settings page 'https://app.sendx.io/setting' under the sections 'Api Key' and 'Team Id' respectively.

SendX API has two methods:

* [Identify](#identify_api)
* [Track](#track_api)

## <a name="identify_api"></a> Identify API Method

Identify API Method is used to attach data to a visitor. If a contact is not yet created then we will create the contact. In case contact already exists then we update it.

**Example Request:**

> 
    {
      email: "john.doe@gmail.com",  
      firstName: "John",
      lastName: "Doe",
      birthday: "1989-03-03",
      customFields: { "Designation": "Software Engineer", "Age": "27", "Experience": "5"},  
      tags: ["Developer", "API Team"],  
     }


Note that tags are an array of strings. In case they don't exist previously then API will create them and associate them with the contact.

Similarly if a custom field doesn't exist then it is first created and then associated with the contact along-with the corresponding value. In case custom field exists already then we simply update the value of it for the aforementioned contact.

We don't delete any of the properties based on identify call. What this means is that if for the same contact you did two API calls like:


**API Call A**
 
> 
    {
       email: "john.doe@gmail.com", 
       firstName: "John",
       birthday: "1989-03-03",
       customFields: { "Designation": "Software Engineer"},  
       tags: ["Developer"],  
    }


**API Call B**

> 
    {  
      email: "john.doe@gmail.com",  
      customFields: { "Age": "29"},  
      tags: ["API Team"],  
    }


The final contact will have firstName as **John**, birthday as **1989-03-03** present. Also both tags **Developer** and **API Team** shall be present alongwith custom fields **Designation** and **Age**.


**Properties:**

* **firstName**: type string
* **lastName**: type string
* **email**: type string  
* **newEmail**: type string  
* **company**: type string  
* **birthday**: type string with format **YYYY-MM-DD** eg: 2016-11-21  
* **customFields**: type map[string]string   
* **tags**: type array of string 


In case email of an already existing contact needs to be updated then specify current email under email property and updated email under newEmail property.

**Response:**

> 
{
  "status": "200",
  "message": "OK",
  "data": {
    "encryptedTeamId": "CLdh9Ig5GLIN1u8gTRvoja",
    "encryptedId": "c9QF63nrBenCaAXe660byz",
    "tags": [
      "API Team",
      "Tech"
    ],
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@gmail.com",
    "company": "",
    "birthday": "1989-03-03",
    "customFields": {
      "Age": "29",
      "Designation": "Software Engineer"
    }
  }
}


## <a name="track_api"></a> Track API Method


Track API Method is used to track a contact. In the track API object you can:

* **addTags**:
* **removeTags**:

You can have automation rules based on tag addition as well as tag removal and they will get executed. For eg:

* On **user registration** tag start onboarding drip for him / her.
* **Account Upgrade** tag start add user to paid user list and start account expansion drip. 
* On removal of **trial user** tag start upsell trial completed users drip.


**Example Request:**

>
  {
     "addTags": ["blogger", "female"]
  }


>
  {
     "addTags": ["paid user"],
     "removeTags": ["trial user"]
  }


**Response:**

>
   {
    "status": "200",
    "message": "OK",
    "data": "success"
   }

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
import io.swagger.client.api.ContactApi;

import java.io.File;
import java.util.*;

public class ContactApiExample {

    public static void main(String[] args) {
        
        ContactApi apiInstance = new ContactApi();
        String apiKey = "apiKey_example"; // String | 
        String teamId = "teamId_example"; // String | 
        ContactRequest contactDetails = new ContactRequest(); // ContactRequest | Contact details
        try {
            ContactResponse result = apiInstance.contactIdentifyPost(apiKey, teamId, contactDetails);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactApi#contactIdentifyPost");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://app.sendx.io/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ContactApi* | [**contactIdentifyPost**](docs/ContactApi.md#contactIdentifyPost) | **POST** /contact/identify | Identify a contact as user
*ContactApi* | [**contactTrackPost**](docs/ContactApi.md#contactTrackPost) | **POST** /contact/track | Add tracking info using tags to a contact


## Documentation for Models

 - [Contact](docs/Contact.md)
 - [ContactRequest](docs/ContactRequest.md)
 - [ContactResponse](docs/ContactResponse.md)
 - [TrackRequest](docs/TrackRequest.md)
 - [TrackResponse](docs/TrackResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



