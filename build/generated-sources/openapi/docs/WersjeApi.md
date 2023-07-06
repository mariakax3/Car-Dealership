# WersjeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getWersjaAktualna**](WersjeApi.md#getWersjaAktualna) | **GET** /version |  |
| [**getWersjaV1**](WersjeApi.md#getWersjaV1) | **GET** /v1/version |  |



## getWersjaAktualna

> VersionDto getWersjaAktualna()



Metoda udostępnia infromację o najnowszej wersji API - V.1

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.WersjeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        WersjeApi apiInstance = new WersjeApi(defaultClient);
        try {
            VersionDto result = apiInstance.getWersjaAktualna();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WersjeApi#getWersjaAktualna");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**VersionDto**](VersionDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |


## getWersjaV1

> VersionDto getWersjaV1()



Metoda udostępnia infromację o najnowszej wersji API - V.1

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.WersjeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        WersjeApi apiInstance = new WersjeApi(defaultClient);
        try {
            VersionDto result = apiInstance.getWersjaV1();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WersjeApi#getWersjaV1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**VersionDto**](VersionDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

