# PlikiApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getListaPlikow**](PlikiApi.md#getListaPlikow) | **GET** /pliki |  |
| [**getPlik**](PlikiApi.md#getPlik) | **GET** /pliki/{id} |  |



## getListaPlikow

> JsonApiForListFile getListaPlikow(limit, page)



Metoda udostępnia informacje o plikach zawierających dane pojazdów z bazy CEPiK.

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.PlikiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PlikiApi apiInstance = new PlikiApi(defaultClient);
        String limit = "100"; // String | Parametr mechanizmu stronicowania określający ilość plików na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
        String page = "1"; // String | Parametr mechanizmu stronicowania określający, którą stronę listy plików chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
        try {
            JsonApiForListFile result = apiInstance.getListaPlikow(limit, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlikiApi#getListaPlikow");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **String**| Parametr mechanizmu stronicowania określający ilość plików na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500. | [optional] [default to 100] |
| **page** | **String**| Parametr mechanizmu stronicowania określający, którą stronę listy plików chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1. | [optional] [default to 1] |

### Return type

[**JsonApiForListFile**](JsonApiForListFile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Rate-Limit-Remaining - Szacunkowy pozostały limit wywołań usługi dla adresu IP w jednostce czasu. <br>  |
| **400** | Bad Request |  -  |


## getPlik

> JsonApiForObjectFile getPlik(id)



Metoda udostępnia informacje o pliku zawierającym dane o pojazdach z bazy CEPiK.

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.PlikiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PlikiApi apiInstance = new PlikiApi(defaultClient);
        String id = "id_example"; // String | Identyfikator zasobu plikowego. Parametr jest wymagany.
        try {
            JsonApiForObjectFile result = apiInstance.getPlik(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlikiApi#getPlik");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Identyfikator zasobu plikowego. Parametr jest wymagany. | |

### Return type

[**JsonApiForObjectFile**](JsonApiForObjectFile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Rate-Limit-Remaining - Szacunkowy pozostały limit wywołań usługi dla adresu IP w jednostce czasu. <br>  |
| **400** | Bad Request |  -  |

