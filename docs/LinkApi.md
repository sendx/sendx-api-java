# LinkApi

All URIs are relative to *http://127.0.0.1:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**linkGet**](LinkApi.md#linkGet) | **GET** /link | Get information about all links
[**linkLinkIdDelete**](LinkApi.md#linkLinkIdDelete) | **DELETE** /link/{linkId} | Deletes a link
[**linkLinkIdGet**](LinkApi.md#linkLinkIdGet) | **GET** /link/{linkId} | Find link by ID
[**linkLinkIdPut**](LinkApi.md#linkLinkIdPut) | **PUT** /link/{linkId} | Update a link by ID
[**linkPost**](LinkApi.md#linkPost) | **POST** /link | Add a new link


<a name="linkGet"></a>
# **linkGet**
> InlineResponse2005 linkGet(apiKey)

Get information about all links



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LinkApi;


LinkApi apiInstance = new LinkApi();
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse2005 result = apiInstance.linkGet(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkApi#linkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkLinkIdDelete"></a>
# **linkLinkIdDelete**
> linkLinkIdDelete(apiKey, linkId)

Deletes a link



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LinkApi;


LinkApi apiInstance = new LinkApi();
String apiKey = "apiKey_example"; // String | 
Long linkId = 789L; // Long | Link ID to delete
try {
    apiInstance.linkLinkIdDelete(apiKey, linkId);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkApi#linkLinkIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **linkId** | **Long**| Link ID to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkLinkIdGet"></a>
# **linkLinkIdGet**
> Link linkLinkIdGet(apiKey, linkId)

Find link by ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LinkApi;


LinkApi apiInstance = new LinkApi();
String apiKey = "apiKey_example"; // String | 
Long linkId = 789L; // Long | ID of link that needs to be fetched
try {
    Link result = apiInstance.linkLinkIdGet(apiKey, linkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkApi#linkLinkIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **linkId** | **Long**| ID of link that needs to be fetched |

### Return type

[**Link**](Link.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkLinkIdPut"></a>
# **linkLinkIdPut**
> InlineResponse2002 linkLinkIdPut(apiKey, linkId, body)

Update a link by ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LinkApi;


LinkApi apiInstance = new LinkApi();
String apiKey = "apiKey_example"; // String | 
Long linkId = 789L; // Long | ID of link that needs to be updated
LinkAddUpdate body = new LinkAddUpdate(); // LinkAddUpdate | Link object that needs to be added
try {
    InlineResponse2002 result = apiInstance.linkLinkIdPut(apiKey, linkId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkApi#linkLinkIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **linkId** | **Long**| ID of link that needs to be updated |
 **body** | [**LinkAddUpdate**](LinkAddUpdate.md)| Link object that needs to be added |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkPost"></a>
# **linkPost**
> InlineResponse2006 linkPost(apiKey, body)

Add a new link



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LinkApi;


LinkApi apiInstance = new LinkApi();
String apiKey = "apiKey_example"; // String | 
LinkAddUpdate body = new LinkAddUpdate(); // LinkAddUpdate | Link object that needs to be added
try {
    InlineResponse2006 result = apiInstance.linkPost(apiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkApi#linkPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **body** | [**LinkAddUpdate**](LinkAddUpdate.md)| Link object that needs to be added |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

