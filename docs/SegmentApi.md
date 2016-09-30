# SegmentApi

All URIs are relative to *http://api.sendx.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**segmentGet**](SegmentApi.md#segmentGet) | **GET** /segment | Get information about all segments


<a name="segmentGet"></a>
# **segmentGet**
> InlineResponse20016 segmentGet(apiKey)

Get information about all segments



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SegmentApi;


SegmentApi apiInstance = new SegmentApi();
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse20016 result = apiInstance.segmentGet(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentApi#segmentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

