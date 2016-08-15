# TagApi

All URIs are relative to *http://127.0.0.1:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tagGet**](TagApi.md#tagGet) | **GET** /tag | Get information about all tags
[**tagPost**](TagApi.md#tagPost) | **POST** /tag | Add a new tag
[**tagTagIdContactDelete**](TagApi.md#tagTagIdContactDelete) | **DELETE** /tag/{tagId}/contact | Remove a contact from a tag
[**tagTagIdContactPost**](TagApi.md#tagTagIdContactPost) | **POST** /tag/{tagId}/contact | Add a contact to a tag
[**tagTagIdContactsGet**](TagApi.md#tagTagIdContactsGet) | **GET** /tag/{tagId}/contacts | Find contacts belonging to a tag
[**tagTagIdDelete**](TagApi.md#tagTagIdDelete) | **DELETE** /tag/{tagId} | Deletes a tag
[**tagTagIdGet**](TagApi.md#tagTagIdGet) | **GET** /tag/{tagId} | Find tag by ID
[**tagTagIdPut**](TagApi.md#tagTagIdPut) | **PUT** /tag/{tagId} | Update a tag by ID


<a name="tagGet"></a>
# **tagGet**
> InlineResponse2009 tagGet(apiKey)

Get information about all tags



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagApi;


TagApi apiInstance = new TagApi();
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse2009 result = apiInstance.tagGet(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#tagGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tagPost"></a>
# **tagPost**
> InlineResponse20010 tagPost(apiKey, body)

Add a new tag



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagApi;


TagApi apiInstance = new TagApi();
String apiKey = "apiKey_example"; // String | 
TagAddUpdate body = new TagAddUpdate(); // TagAddUpdate | Tag object that needs to be added
try {
    InlineResponse20010 result = apiInstance.tagPost(apiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#tagPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **body** | [**TagAddUpdate**](TagAddUpdate.md)| Tag object that needs to be added |

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tagTagIdContactDelete"></a>
# **tagTagIdContactDelete**
> tagTagIdContactDelete(apiKey, tagId, body)

Remove a contact from a tag



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagApi;


TagApi apiInstance = new TagApi();
String apiKey = "apiKey_example"; // String | 
Long tagId = 789L; // Long | ID of tag for which contact needs to be remove
TagContact body = new TagContact(); // TagContact | Contact email and team id
try {
    apiInstance.tagTagIdContactDelete(apiKey, tagId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#tagTagIdContactDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **tagId** | **Long**| ID of tag for which contact needs to be remove |
 **body** | [**TagContact**](TagContact.md)| Contact email and team id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tagTagIdContactPost"></a>
# **tagTagIdContactPost**
> InlineResponse20011 tagTagIdContactPost(apiKey, tagId, body)

Add a contact to a tag



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagApi;


TagApi apiInstance = new TagApi();
String apiKey = "apiKey_example"; // String | 
Long tagId = 789L; // Long | ID of tag for which the contact needs to be added
TagContact body = new TagContact(); // TagContact | Contact email and team id
try {
    InlineResponse20011 result = apiInstance.tagTagIdContactPost(apiKey, tagId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#tagTagIdContactPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **tagId** | **Long**| ID of tag for which the contact needs to be added |
 **body** | [**TagContact**](TagContact.md)| Contact email and team id |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tagTagIdContactsGet"></a>
# **tagTagIdContactsGet**
> List&lt;DeepTeamEmailContact&gt; tagTagIdContactsGet(apiKey, tagId, limit, offset, contactType, search)

Find contacts belonging to a tag



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagApi;


TagApi apiInstance = new TagApi();
String apiKey = "apiKey_example"; // String | 
Long tagId = 789L; // Long | ID of tag that needs to be fetched
Integer limit = 56; // Integer | Maximum number of contacts to be returned. Note that limit maximum value is 100 and default value is 10.
Integer offset = 56; // Integer | Offset from where we contacts should be retrieved. Default value is 0.
String contactType = "contactType_example"; // String | Can be any of the following - all, confirmed, unconfirmed, unsubscribed, bounced, markedspam. Default contact_type is all
String search = "search_example"; // String | search term which shall be run against contact's first name, last name and email.
try {
    List<DeepTeamEmailContact> result = apiInstance.tagTagIdContactsGet(apiKey, tagId, limit, offset, contactType, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#tagTagIdContactsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **tagId** | **Long**| ID of tag that needs to be fetched |
 **limit** | **Integer**| Maximum number of contacts to be returned. Note that limit maximum value is 100 and default value is 10. | [optional]
 **offset** | **Integer**| Offset from where we contacts should be retrieved. Default value is 0. | [optional]
 **contactType** | **String**| Can be any of the following - all, confirmed, unconfirmed, unsubscribed, bounced, markedspam. Default contact_type is all | [optional]
 **search** | **String**| search term which shall be run against contact&#39;s first name, last name and email. | [optional]

### Return type

[**List&lt;DeepTeamEmailContact&gt;**](DeepTeamEmailContact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tagTagIdDelete"></a>
# **tagTagIdDelete**
> tagTagIdDelete(apiKey, tagId)

Deletes a tag



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagApi;


TagApi apiInstance = new TagApi();
String apiKey = "apiKey_example"; // String | 
Long tagId = 789L; // Long | Tag ID to delete
try {
    apiInstance.tagTagIdDelete(apiKey, tagId);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#tagTagIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **tagId** | **Long**| Tag ID to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tagTagIdGet"></a>
# **tagTagIdGet**
> Tag tagTagIdGet(apiKey, tagId)

Find tag by ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagApi;


TagApi apiInstance = new TagApi();
String apiKey = "apiKey_example"; // String | 
Long tagId = 789L; // Long | ID of tag that needs to be fetched
try {
    Tag result = apiInstance.tagTagIdGet(apiKey, tagId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#tagTagIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **tagId** | **Long**| ID of tag that needs to be fetched |

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tagTagIdPut"></a>
# **tagTagIdPut**
> InlineResponse2002 tagTagIdPut(apiKey, tagId, body)

Update a tag by ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagApi;


TagApi apiInstance = new TagApi();
String apiKey = "apiKey_example"; // String | 
Long tagId = 789L; // Long | ID of tag that needs to be updated
TagAddUpdate body = new TagAddUpdate(); // TagAddUpdate | Tag object that needs to be added
try {
    InlineResponse2002 result = apiInstance.tagTagIdPut(apiKey, tagId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#tagTagIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **tagId** | **Long**| ID of tag that needs to be updated |
 **body** | [**TagAddUpdate**](TagAddUpdate.md)| Tag object that needs to be added |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

