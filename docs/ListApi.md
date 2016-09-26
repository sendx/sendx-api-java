# ListApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listGet**](ListApi.md#listGet) | **GET** /list | Get information about all lists
[**listListIdContactDelete**](ListApi.md#listListIdContactDelete) | **DELETE** /list/{listId}/contact | Remove a contact from a list
[**listListIdContactPost**](ListApi.md#listListIdContactPost) | **POST** /list/{listId}/contact | Add a contact to a list
[**listListIdContactsGet**](ListApi.md#listListIdContactsGet) | **GET** /list/{listId}/contacts | Find contacts belonging to a list
[**listListIdDelete**](ListApi.md#listListIdDelete) | **DELETE** /list/{listId} | Deletes a list
[**listListIdGet**](ListApi.md#listListIdGet) | **GET** /list/{listId} | Find list by ID
[**listListIdPut**](ListApi.md#listListIdPut) | **PUT** /list/{listId} | Update a list by ID
[**listPost**](ListApi.md#listPost) | **POST** /list | Add a new list


<a name="listGet"></a>
# **listGet**
> InlineResponse2008 listGet(apiKey)

Get information about all lists



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ListApi;


ListApi apiInstance = new ListApi();
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse2008 result = apiInstance.listGet(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#listGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listListIdContactDelete"></a>
# **listListIdContactDelete**
> listListIdContactDelete(apiKey, listId, body)

Remove a contact from a list



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ListApi;


ListApi apiInstance = new ListApi();
String apiKey = "apiKey_example"; // String | 
Long listId = 789L; // Long | ID of list for which contact needs to be remove
ListContact body = new ListContact(); // ListContact | Contact email and team id
try {
    apiInstance.listListIdContactDelete(apiKey, listId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#listListIdContactDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **listId** | **Long**| ID of list for which contact needs to be remove |
 **body** | [**ListContact**](ListContact.md)| Contact email and team id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listListIdContactPost"></a>
# **listListIdContactPost**
> InlineResponse20015 listListIdContactPost(apiKey, listId, body)

Add a contact to a list



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ListApi;


ListApi apiInstance = new ListApi();
String apiKey = "apiKey_example"; // String | 
Long listId = 789L; // Long | ID of list for which the contact needs to be added
ListContact body = new ListContact(); // ListContact | Contact email and team id
try {
    InlineResponse20015 result = apiInstance.listListIdContactPost(apiKey, listId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#listListIdContactPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **listId** | **Long**| ID of list for which the contact needs to be added |
 **body** | [**ListContact**](ListContact.md)| Contact email and team id |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listListIdContactsGet"></a>
# **listListIdContactsGet**
> List&lt;DeepListEmailContact&gt; listListIdContactsGet(apiKey, listId, limit, offset, contactType, search)

Find contacts belonging to a list



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ListApi;


ListApi apiInstance = new ListApi();
String apiKey = "apiKey_example"; // String | 
Long listId = 789L; // Long | ID of list that needs to be fetched
Integer limit = 56; // Integer | Maximum number of contacts to be returned. Note that limit maximum value is 100 and default value is 10.
Integer offset = 56; // Integer | Offset from where we contacts should be retrieved. Default value is 0.
String contactType = "contactType_example"; // String | Can be any of the following - all, confirmed, unconfirmed, unsubscribed, bounced, markedspam. Default contact_type is all
String search = "search_example"; // String | search term which shall be run against contact's first name, last name and email.
try {
    List<DeepListEmailContact> result = apiInstance.listListIdContactsGet(apiKey, listId, limit, offset, contactType, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#listListIdContactsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **listId** | **Long**| ID of list that needs to be fetched |
 **limit** | **Integer**| Maximum number of contacts to be returned. Note that limit maximum value is 100 and default value is 10. | [optional]
 **offset** | **Integer**| Offset from where we contacts should be retrieved. Default value is 0. | [optional]
 **contactType** | **String**| Can be any of the following - all, confirmed, unconfirmed, unsubscribed, bounced, markedspam. Default contact_type is all | [optional]
 **search** | **String**| search term which shall be run against contact&#39;s first name, last name and email. | [optional]

### Return type

[**List&lt;DeepListEmailContact&gt;**](DeepListEmailContact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listListIdDelete"></a>
# **listListIdDelete**
> listListIdDelete(apiKey, listId)

Deletes a list



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ListApi;


ListApi apiInstance = new ListApi();
String apiKey = "apiKey_example"; // String | 
Long listId = 789L; // Long | List ID to delete
try {
    apiInstance.listListIdDelete(apiKey, listId);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#listListIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **listId** | **Long**| List ID to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listListIdGet"></a>
# **listListIdGet**
> List listListIdGet(apiKey, listId)

Find list by ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ListApi;


ListApi apiInstance = new ListApi();
String apiKey = "apiKey_example"; // String | 
Long listId = 789L; // Long | ID of list that needs to be fetched
try {
    List result = apiInstance.listListIdGet(apiKey, listId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#listListIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **listId** | **Long**| ID of list that needs to be fetched |

### Return type

[**List**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listListIdPut"></a>
# **listListIdPut**
> InlineResponse2002 listListIdPut(apiKey, listId, body)

Update a list by ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ListApi;


ListApi apiInstance = new ListApi();
String apiKey = "apiKey_example"; // String | 
Long listId = 789L; // Long | ID of list that needs to be updated
ListAddUpdate body = new ListAddUpdate(); // ListAddUpdate | List object that needs to be added
try {
    InlineResponse2002 result = apiInstance.listListIdPut(apiKey, listId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#listListIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **listId** | **Long**| ID of list that needs to be updated |
 **body** | [**ListAddUpdate**](ListAddUpdate.md)| List object that needs to be added |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPost"></a>
# **listPost**
> InlineResponse2009 listPost(apiKey, body)

Add a new list

Adding a new list with all the fields. List type can be 0 - Single OptIn 1 - Double OptIn

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ListApi;


ListApi apiInstance = new ListApi();
String apiKey = "apiKey_example"; // String | 
ListAddUpdate body = new ListAddUpdate(); // ListAddUpdate | List object that needs to be added
try {
    InlineResponse2009 result = apiInstance.listPost(apiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#listPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **body** | [**ListAddUpdate**](ListAddUpdate.md)| List object that needs to be added |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

