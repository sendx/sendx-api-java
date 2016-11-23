# ContactApi

All URIs are relative to *https://app.sendx.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contactIdentifyPost**](ContactApi.md#contactIdentifyPost) | **POST** /contact/identify | Identify a contact as user
[**contactTrackPost**](ContactApi.md#contactTrackPost) | **POST** /contact/track | Add tracking info using tags to a contact


<a name="contactIdentifyPost"></a>
# **contactIdentifyPost**
> ContactResponse contactIdentifyPost(apiKey, teamId, contactDetails)

Identify a contact as user



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContactApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **teamId** | **String**|  |
 **contactDetails** | [**ContactRequest**](ContactRequest.md)| Contact details |

### Return type

[**ContactResponse**](ContactResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactTrackPost"></a>
# **contactTrackPost**
> TrackResponse contactTrackPost(apiKey, teamId, email, trackDetails)

Add tracking info using tags to a contact



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContactApi;


ContactApi apiInstance = new ContactApi();
String apiKey = "apiKey_example"; // String | 
String teamId = "teamId_example"; // String | 
String email = "email_example"; // String | 
TrackRequest trackDetails = new TrackRequest(); // TrackRequest | Track Details
try {
    TrackResponse result = apiInstance.contactTrackPost(apiKey, teamId, email, trackDetails);
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
 **email** | **String**|  |
 **trackDetails** | [**TrackRequest**](TrackRequest.md)| Track Details |

### Return type

[**TrackResponse**](TrackResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

