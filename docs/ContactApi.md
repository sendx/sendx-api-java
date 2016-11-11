# ContactApi

All URIs are relative to *https://app.sendx.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contactIdentifyPost**](ContactApi.md#contactIdentifyPost) | **POST** /contact/identify | Identify a contact as user
[**contactTrackPost**](ContactApi.md#contactTrackPost) | **POST** /contact/track | Add tracking info using tags to a contact


<a name="contactIdentifyPost"></a>
# **contactIdentifyPost**
> ContactResponse contactIdentifyPost(apiKey, teamId, body)

Identify a contact as user



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContactApi;


ContactApi apiInstance = new ContactApi();
String apiKey = "apiKey_example"; // String | 
String teamId = "teamId_example"; // String | 
Contact body = new Contact(); // Contact | Contact details
try {
    ContactResponse result = apiInstance.contactIdentifyPost(apiKey, teamId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#contactIdentifyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **teamId** | **String**|  |
 **body** | [**Contact**](Contact.md)| Contact details |

### Return type

[**ContactResponse**](ContactResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactTrackPost"></a>
# **contactTrackPost**
> TrackResponse contactTrackPost(apiKey, teamId, contactId, tag)

Add tracking info using tags to a contact



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContactApi;


ContactApi apiInstance = new ContactApi();
String apiKey = "apiKey_example"; // String | 
String teamId = "teamId_example"; // String | 
String contactId = "contactId_example"; // String | 
String tag = "tag_example"; // String | 
try {
    TrackResponse result = apiInstance.contactTrackPost(apiKey, teamId, contactId, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#contactTrackPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **teamId** | **String**|  |
 **contactId** | **String**|  |
 **tag** | **String**|  |

### Return type

[**TrackResponse**](TrackResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

