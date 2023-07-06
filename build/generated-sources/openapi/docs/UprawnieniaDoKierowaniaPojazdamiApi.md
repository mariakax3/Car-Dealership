# UprawnieniaDoKierowaniaPojazdamiApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getListaUprawnien**](UprawnieniaDoKierowaniaPojazdamiApi.md#getListaUprawnien) | **GET** /uprawnienia |  |
| [**getUprawnienia**](UprawnieniaDoKierowaniaPojazdamiApi.md#getUprawnienia) | **GET** /uprawnienia/{id} |  |



## getListaUprawnien

> JsonApiForListDrivingPermission getListaUprawnien(fields, limit, page, sort)



Metoda udostępniająca miesięczne statystyki ilości nadanych uprawnień do kierowania pojazdami grupom kierowców.   Metoda udostępnia mechanizm filtrowania w postaci parametru: **filter[\\&lt;nazwa atrybutu\\&gt;]&#x3D;\\&lt;szukana wartość\\&gt;**. Znakiem operacji filtrowania jest znak równości **\&quot;&#x3D;\&quot;**. Parametr może być podany wielokrotnie.  \\&lt;**nazwa atrybutu**\\&gt; powinna być prawidłową nazwą jednego z atrybutów zawartych w danych statystyki. Parametr jest opcjonalny.   Przykładowe wykorzystania:   Statystyki z województwa wielkopolskiego - ilość nadanych mężczyznom uprawnień do kierowania pojazdami o kategorii B.        GET /uprawnienia?filter[plec]&#x3D;M&amp;filter[wojewodztwo-kod]&#x3D;30&amp;filter[kod-uprawnienia]&#x3D;B      

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.UprawnieniaDoKierowaniaPojazdamiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UprawnieniaDoKierowaniaPojazdamiApi apiInstance = new UprawnieniaDoKierowaniaPojazdamiApi(defaultClient);
        List<String> fields = Arrays.asList(); // List<String> | Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
        String limit = "100"; // String | Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
        String page = "1"; // String | Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
        List<String> sort = Arrays.asList(); // List<String> | Parametr mechanizmu sortowania. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Kolejność podanych atrybutów określa kolejność sortowania. Aby posortować w odwrotnej kolejności należy poprzedzić nazwę parametru znakiem minus. Parametr jest opcjonalny.
        try {
            JsonApiForListDrivingPermission result = apiInstance.getListaUprawnien(fields, limit, page, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UprawnieniaDoKierowaniaPojazdamiApi#getListaUprawnien");
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
| **fields** | [**List&lt;String&gt;**](String.md)| Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny. | [optional] |
| **limit** | **String**| Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500. | [optional] [default to 100] |
| **page** | **String**| Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1. | [optional] [default to 1] |
| **sort** | [**List&lt;String&gt;**](String.md)| Parametr mechanizmu sortowania. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Kolejność podanych atrybutów określa kolejność sortowania. Aby posortować w odwrotnej kolejności należy poprzedzić nazwę parametru znakiem minus. Parametr jest opcjonalny. | [optional] |

### Return type

[**JsonApiForListDrivingPermission**](JsonApiForListDrivingPermission.md)

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


## getUprawnienia

> JsonApiForObjectDrivingPermission getUprawnienia(id, fields)



Metoda udostępnia informację o ilości nadanych uprawnień do kierowania pojazdami w zadanym miesiącu, kierowcom o określonych cechach.

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.UprawnieniaDoKierowaniaPojazdamiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UprawnieniaDoKierowaniaPojazdamiApi apiInstance = new UprawnieniaDoKierowaniaPojazdamiApi(defaultClient);
        String id = "id_example"; // String | Identyfikator statystyki. Ma postać \"YYYY-MM,WOJ,UPR,P,WIEK\", gdzie  YYYY-MM - rok i miesiąc statystyki, WOJ - kod teryt województwa, UPR - kod kategorii uprawnienia, np. A, B ,B1, C i rd., P - płeć (K - kobiety, M - mężczyźni), WIEK - wiek kierowcy wyrażony liczbą naturalną.  Przykład: 2019-08,02,K,28
        List<String> fields = Arrays.asList(); // List<String> | Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
        try {
            JsonApiForObjectDrivingPermission result = apiInstance.getUprawnienia(id, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UprawnieniaDoKierowaniaPojazdamiApi#getUprawnienia");
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
| **id** | **String**| Identyfikator statystyki. Ma postać \&quot;YYYY-MM,WOJ,UPR,P,WIEK\&quot;, gdzie  YYYY-MM - rok i miesiąc statystyki, WOJ - kod teryt województwa, UPR - kod kategorii uprawnienia, np. A, B ,B1, C i rd., P - płeć (K - kobiety, M - mężczyźni), WIEK - wiek kierowcy wyrażony liczbą naturalną.  Przykład: 2019-08,02,K,28 | |
| **fields** | [**List&lt;String&gt;**](String.md)| Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny. | [optional] |

### Return type

[**JsonApiForObjectDrivingPermission**](JsonApiForObjectDrivingPermission.md)

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

