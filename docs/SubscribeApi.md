# SubscribeApi

All URIs are relative to *http://127.0.0.1:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subscribeEncryptedListIdPost**](SubscribeApi.md#subscribeEncryptedListIdPost) | **POST** /subscribe/{encryptedListId} | Subscribe a new user a list
[**subscribeEncryptedListIdPut**](SubscribeApi.md#subscribeEncryptedListIdPut) | **PUT** /subscribe/{encryptedListId} | Subscribe an existing user a list


<a name="subscribeEncryptedListIdPost"></a>
# **subscribeEncryptedListIdPost**
> subscribeEncryptedListIdPost(encryptedListId, body)

Subscribe a new user a list



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscribeApi;


SubscribeApi apiInstance = new SubscribeApi();
String encryptedListId = "encryptedListId_example"; // String | encrypted list Id of the list to which you want to add user
ContactAddUpdate body = new ContactAddUpdate(); // ContactAddUpdate | Contact object that needs to be added
try {
    apiInstance.subscribeEncryptedListIdPost(encryptedListId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscribeApi#subscribeEncryptedListIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedListId** | **String**| encrypted list Id of the list to which you want to add user |
 **body** | [**ContactAddUpdate**](ContactAddUpdate.md)| Contact object that needs to be added |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subscribeEncryptedListIdPut"></a>
# **subscribeEncryptedListIdPut**
> subscribeEncryptedListIdPut(encryptedListId, body)

Subscribe an existing user a list



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscribeApi;


SubscribeApi apiInstance = new SubscribeApi();
String encryptedListId = "encryptedListId_example"; // String | encrypted list Id of the list to which you want to add user
Email body = new Email(); // Email | Contact Emil needs to be added
try {
    apiInstance.subscribeEncryptedListIdPut(encryptedListId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscribeApi#subscribeEncryptedListIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedListId** | **String**| encrypted list Id of the list to which you want to add user |
 **body** | [**Email**](Email.md)| Contact Emil needs to be added |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

