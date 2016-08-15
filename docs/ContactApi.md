# ContactApi

All URIs are relative to *http://127.0.0.1:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contactContactIdDelete**](ContactApi.md#contactContactIdDelete) | **DELETE** /contact/{contactId} | Deletes a contact
[**contactContactIdGet**](ContactApi.md#contactContactIdGet) | **GET** /contact/{contactId} | Find contact by ID
[**contactContactIdPut**](ContactApi.md#contactContactIdPut) | **PUT** /contact/{contactId} | Update a contact by ID
[**contactGet**](ContactApi.md#contactGet) | **GET** /contact | Get information about all contacts
[**contactPost**](ContactApi.md#contactPost) | **POST** /contact | Add a new contact


<a name="contactContactIdDelete"></a>
# **contactContactIdDelete**
> contactContactIdDelete(apiKey, contactId)

Deletes a contact



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContactApi;


ContactApi apiInstance = new ContactApi();
String apiKey = "apiKey_example"; // String | 
Long contactId = 789L; // Long | Contact ID to delete
try {
    apiInstance.contactContactIdDelete(apiKey, contactId);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#contactContactIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **contactId** | **Long**| Contact ID to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactContactIdGet"></a>
# **contactContactIdGet**
> Contact contactContactIdGet(apiKey, contactId)

Find contact by ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContactApi;


ContactApi apiInstance = new ContactApi();
String apiKey = "apiKey_example"; // String | 
Long contactId = 789L; // Long | ID of contact that needs to be fetched
try {
    Contact result = apiInstance.contactContactIdGet(apiKey, contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#contactContactIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **contactId** | **Long**| ID of contact that needs to be fetched |

### Return type

[**Contact**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactContactIdPut"></a>
# **contactContactIdPut**
> InlineResponse2002 contactContactIdPut(apiKey, contactId, body)

Update a contact by ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContactApi;


ContactApi apiInstance = new ContactApi();
String apiKey = "apiKey_example"; // String | 
Long contactId = 789L; // Long | ID of contact that needs to be updated
ContactAddUpdate body = new ContactAddUpdate(); // ContactAddUpdate | Contact object that needs to be added
try {
    InlineResponse2002 result = apiInstance.contactContactIdPut(apiKey, contactId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#contactContactIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **contactId** | **Long**| ID of contact that needs to be updated |
 **body** | [**ContactAddUpdate**](ContactAddUpdate.md)| Contact object that needs to be added |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactGet"></a>
# **contactGet**
> InlineResponse2003 contactGet(apiKey, limit, offset)

Get information about all contacts



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContactApi;


ContactApi apiInstance = new ContactApi();
String apiKey = "apiKey_example"; // String | 
Integer limit = 56; // Integer | Maximum number of contacts to be returned. Note that limit maximum value is 100 and default value is 10.
Integer offset = 56; // Integer | Offset from where we contacts should be retrieved. Default value is 0.
try {
    InlineResponse2003 result = apiInstance.contactGet(apiKey, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#contactGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **limit** | **Integer**| Maximum number of contacts to be returned. Note that limit maximum value is 100 and default value is 10. | [optional]
 **offset** | **Integer**| Offset from where we contacts should be retrieved. Default value is 0. | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactPost"></a>
# **contactPost**
> InlineResponse2004 contactPost(apiKey, body)

Add a new contact



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContactApi;


ContactApi apiInstance = new ContactApi();
String apiKey = "apiKey_example"; // String | 
ContactAddUpdate body = new ContactAddUpdate(); // ContactAddUpdate | Contact object that needs to be added
try {
    InlineResponse2004 result = apiInstance.contactPost(apiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#contactPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **body** | [**ContactAddUpdate**](ContactAddUpdate.md)| Contact object that needs to be added |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
