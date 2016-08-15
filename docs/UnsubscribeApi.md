# UnsubscribeApi

All URIs are relative to *http://127.0.0.1:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**unsubscribeEncryptedListIdPost**](UnsubscribeApi.md#unsubscribeEncryptedListIdPost) | **POST** /unsubscribe/{encryptedListId} | Unsubscribe a user from list based on email id


<a name="unsubscribeEncryptedListIdPost"></a>
# **unsubscribeEncryptedListIdPost**
> unsubscribeEncryptedListIdPost(encryptedListId, body)

Unsubscribe a user from list based on email id



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UnsubscribeApi;


UnsubscribeApi apiInstance = new UnsubscribeApi();
String encryptedListId = "encryptedListId_example"; // String | encrypted list Id of the list to which you want to add user
Email body = new Email(); // Email | Email object of the user that needs to be unsubscribed.
try {
    apiInstance.unsubscribeEncryptedListIdPost(encryptedListId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UnsubscribeApi#unsubscribeEncryptedListIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedListId** | **String**| encrypted list Id of the list to which you want to add user |
 **body** | [**Email**](Email.md)| Email object of the user that needs to be unsubscribed. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

