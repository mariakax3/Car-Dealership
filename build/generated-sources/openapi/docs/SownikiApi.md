# SownikiApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getListaSlownikow**](SownikiApi.md#getListaSlownikow) | **GET** /slowniki |  |
| [**getSlownik**](SownikiApi.md#getSlownik) | **GET** /slowniki/{nazwa-slownika} |  |



## getListaSlownikow

> JsonApiForListDictionary getListaSlownikow(limit, page)



Metoda udostępnia listę wartości dla pól, po których można wyszukiwać/filtrować zasoby udostępniane przez API do CEPIK.

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.SownikiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SownikiApi apiInstance = new SownikiApi(defaultClient);
        String limit = "100"; // String | Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
        String page = "1"; // String | Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1
        try {
            JsonApiForListDictionary result = apiInstance.getListaSlownikow(limit, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SownikiApi#getListaSlownikow");
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
| **limit** | **String**| Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500. | [optional] [default to 100] |
| **page** | **String**| Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1 | [optional] [default to 1] |

### Return type

[**JsonApiForListDictionary**](JsonApiForListDictionary.md)

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


## getSlownik

> JsonApiForObjectDictionary getSlownik(nazwaSlownika)



Metoda udostępnia wybrany słownik zawierający możliwe wartości dla danego pola.

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.SownikiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SownikiApi apiInstance = new SownikiApi(defaultClient);
        String nazwaSlownika = "nazwaSlownika_example"; // String | Nazwa słownika (np. województwa, marka).
        try {
            JsonApiForObjectDictionary result = apiInstance.getSlownik(nazwaSlownika);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SownikiApi#getSlownik");
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
| **nazwaSlownika** | **String**| Nazwa słownika (np. województwa, marka). | |

### Return type

[**JsonApiForObjectDictionary**](JsonApiForObjectDictionary.md)

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

