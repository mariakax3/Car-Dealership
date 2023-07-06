# PrawaJazdyApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getListaPrawJazdy**](PrawaJazdyApi.md#getListaPrawJazdy) | **GET** /prawa-jazdy |  |
| [**getPrawaJazdy**](PrawaJazdyApi.md#getPrawaJazdy) | **GET** /prawa-jazdy/{id} |  |



## getListaPrawJazdy

> JsonApiForListDrivingLicense getListaPrawJazdy(fields, limit, page, sort)



Metoda udostępniająca miesięczne statystyki ilości wydań praw jazdy grupom kierowców.   Metoda udostępnia mechanizm filtrowania w postaci parametru: **filter[\\&lt;nazwa atrybutu\\&gt;]&#x3D;\\&lt;szukana wartość\\&gt;**. Znakiem operacji filtrowania jest znak równości **\&quot;&#x3D;\&quot;**. Parametr może być podany wielokrotnie.  \\&lt;**nazwa atrybutu**\\&gt; powinna być prawidłową nazwą jednego z atrybutów zawartych w danych statystyki. Parametr jest opcjonalny.   Przykładowe wykorzystania:   Statystyki z województwa wielkopolskiego - ilość praw jazdy wydanych kobietom.        GET /prawa-jazdy?filter[plec]&#x3D;K&amp;filter[wojewodztwo-kod]&#x3D;30      

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.PrawaJazdyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PrawaJazdyApi apiInstance = new PrawaJazdyApi(defaultClient);
        List<String> fields = Arrays.asList(); // List<String> | Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
        String limit = "100"; // String | Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
        String page = "1"; // String | Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
        List<String> sort = Arrays.asList(); // List<String> | Parametr mechanizmu sortowania. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Kolejność podanych atrybutów określa kolejność sortowania. Aby posortować w odwrotnej kolejności należy poprzedzić nazwę parametru znakiem minus. Parametr jest opcjonalny.
        try {
            JsonApiForListDrivingLicense result = apiInstance.getListaPrawJazdy(fields, limit, page, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrawaJazdyApi#getListaPrawJazdy");
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

[**JsonApiForListDrivingLicense**](JsonApiForListDrivingLicense.md)

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


## getPrawaJazdy

> JsonApiForObjectDrivingLicense getPrawaJazdy(id, fields)



Metoda udostępnia informację o ilości wydań praw jazdy w zadanym miesiącu, kierowcom o określonych cechach.

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.PrawaJazdyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PrawaJazdyApi apiInstance = new PrawaJazdyApi(defaultClient);
        String id = "id_example"; // String | Identyfikator statystyki. Ma postać \"YYYY-MM,WOJ,P,WIEK\", gdzie  YYYY-MM - rok i miesiąc statystyki, WOJ - kod teryt województwa, P - płeć (K - kobiety, M - mężczyźni), WIEK - wiek kierowcy wyrażony liczbą naturalną.  Przykład: 2019-08,02,K,28
        List<String> fields = Arrays.asList(); // List<String> | Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
        try {
            JsonApiForObjectDrivingLicense result = apiInstance.getPrawaJazdy(id, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrawaJazdyApi#getPrawaJazdy");
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
| **id** | **String**| Identyfikator statystyki. Ma postać \&quot;YYYY-MM,WOJ,P,WIEK\&quot;, gdzie  YYYY-MM - rok i miesiąc statystyki, WOJ - kod teryt województwa, P - płeć (K - kobiety, M - mężczyźni), WIEK - wiek kierowcy wyrażony liczbą naturalną.  Przykład: 2019-08,02,K,28 | |
| **fields** | [**List&lt;String&gt;**](String.md)| Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny. | [optional] |

### Return type

[**JsonApiForObjectDrivingLicense**](JsonApiForObjectDrivingLicense.md)

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

