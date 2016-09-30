# CustomfieldApi

All URIs are relative to *http://api.sendx.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customfieldCustomfieldIdGet**](CustomfieldApi.md#customfieldCustomfieldIdGet) | **GET** /customfield/{customfieldId} | Find customfield by ID
[**customfieldGet**](CustomfieldApi.md#customfieldGet) | **GET** /customfield | Get information about all customfield
[**customfieldPost**](CustomfieldApi.md#customfieldPost) | **POST** /customfield | Add a new Customfield


<a name="customfieldCustomfieldIdGet"></a>
# **customfieldCustomfieldIdGet**
> Customfield customfieldCustomfieldIdGet(apiKey, customfieldId)

Find customfield by ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomfieldApi;


CustomfieldApi apiInstance = new CustomfieldApi();
String apiKey = "apiKey_example"; // String | 
Long customfieldId = 789L; // Long | ID of customfield that needs to be fetched
try {
    Customfield result = apiInstance.customfieldCustomfieldIdGet(apiKey, customfieldId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomfieldApi#customfieldCustomfieldIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **customfieldId** | **Long**| ID of customfield that needs to be fetched |

### Return type

[**Customfield**](Customfield.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customfieldGet"></a>
# **customfieldGet**
> InlineResponse2006 customfieldGet(apiKey)

Get information about all customfield



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomfieldApi;


CustomfieldApi apiInstance = new CustomfieldApi();
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse2006 result = apiInstance.customfieldGet(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomfieldApi#customfieldGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customfieldPost"></a>
# **customfieldPost**
> InlineResponse2007 customfieldPost(apiKey, body)

Add a new Customfield



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomfieldApi;


CustomfieldApi apiInstance = new CustomfieldApi();
String apiKey = "apiKey_example"; // String | 
CustomfieldAddUpdate body = new CustomfieldAddUpdate(); // CustomfieldAddUpdate | Customfield object that needs to be added
try {
    InlineResponse2007 result = apiInstance.customfieldPost(apiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomfieldApi#customfieldPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **body** | [**CustomfieldAddUpdate**](CustomfieldAddUpdate.md)| Customfield object that needs to be added |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

