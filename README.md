# SendX Java Client

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
    <version>1.1.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.1.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.1.0.jar
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
 - [TrackResponse](docs/TrackResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



