# SendApi

All URIs are relative to *http://127.0.0.1:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendEmailPost**](SendApi.md#sendEmailPost) | **POST** /send/email | Send transactional email to user


<a name="sendEmailPost"></a>
# **sendEmailPost**
> sendEmailPost(apiKey, body)

Send transactional email to user



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SendApi;


SendApi apiInstance = new SendApi();
String apiKey = "apiKey_example"; // String | 
EMessage body = new EMessage(); // EMessage | EMessage object that needs to be added
try {
    apiInstance.sendEmailPost(apiKey, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SendApi#sendEmailPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **body** | [**EMessage**](EMessage.md)| EMessage object that needs to be added |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

