# PojazdyApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getListaPojazdow**](PojazdyApi.md#getListaPojazdow) | **GET** /pojazdy |  |
| [**getPojazd**](PojazdyApi.md#getPojazd) | **GET** /pojazdy/{id} |  |



## getListaPojazdow

> JsonApiForListVehicle getListaPojazdow(wojewodztwo, dataOd, dataDo, typDaty, tylkoZarejestrowane, pokazWszystkiePola, fields, limit, page, sort)



Metoda udostępniająca listę pojazdów z bazy CEPiK.   Metoda udostępnia mechanizm filtrowania w postaci parametru: **filter[\\&lt;nazwa atrybutu\\&gt;]&#x3D;\\&lt;szukana wartość\\&gt;**. Znakiem operacji filtrowania jest znak równości **\&quot;&#x3D;\&quot;**. Parametr może być podany wielokrotnie.  \\&lt;**nazwa atrybutu**\\&gt; powinna być prawidłową nazwą jednego z atrybutów zawartych w danych technicznych pojazdu. Parametr jest opcjonalny.   Przykładowe wykorzystania:   Pojazdy z województwa wielkopolskiego, zarejestrowane po raz I w Polsce w 2019r.        GET /pojazdy?wojewodztwo&#x3D;30&amp;data-od&#x3D;20190101&amp;data-do&#x3D;20191231      Pojazdy o modelu JUMPER z województwa mazowieckiego, zarejestrowane po raz I w Polsce między 2016-01-01 a 2018-12-01r.        GET /pojazdy?wojewodztwo&#x3D;14&amp;data-od&#x3D;20160101&amp;data-do&#x3D;20181201&amp;filter[model]&#x3D;JUMPER      Pojazdy z województwa dolnośląskiego, których data ostatniej rejestracji mieści się w przedziale 2018-01-01 - 2019-12-31r.        GET /pojazdy?wojewodztwo&#x3D;02&amp;data-od&#x3D;20180101&amp;data-do&#x3D;20191231&amp;typ-daty&#x3D;2      

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.PojazdyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PojazdyApi apiInstance = new PojazdyApi(defaultClient);
        String wojewodztwo = "wojewodztwo_example"; // String | Kod teryt województwa, w którym zarejestrowane jest auto lub, w przypadku wyrejestrowanych aut, było ostatnio zarejestrowane. Parametr jest wymagany. Kody teryt znajdziesz w usłudze /słowniki.
        String dataOd = "dataOd_example"; // String | Wymagany parametr daty podawany w formacie YYYYMMDD. Określa datę początkową okresu pierwszej lub ostatniej rejestracji w kraju (domyślnie pierwszej), dla którego zostaną udostępnione informacje o pojazdach.
        String dataDo = "dataDo_example"; // String | Parametr daty podawany w formacie YYYYMMDD. Określa koniec okresu, dla którego pojazdy mają być zwrócone. Domyślną wartością jest data bieżąca. Maksymalny zakres dat to 2 lata.
        String typDaty = "1"; // String | Parametr określający jakiej daty dotyczy warunek wyszukiwania określony parametrami data-od i data-do.  W przypadku nie podania parametru, przyjęta zostanie wartość domyślna. 1 (domyślna wartość) - data pierwszej rejestracji pojazdu w Polsce, 2 - data ostatniej rejestracji pojazdu.
        Boolean tylkoZarejestrowane = true; // Boolean | Parametr określający czy mają zostać zwrócone dane tylko pojazdów zarejestrowanych. Domyślną wartością jest, że tak.
        Boolean pokazWszystkiePola = false; // Boolean | Parametr określający czy mają zostać zwrócone wszystkie pola w zwróconych danych technicznych pojazdów. Domyślną wartością jest, że nie. Parametr ten jest ignorowany w przypadku podania jednocześnie parametru fields.
        List<String> fields = Arrays.asList(); // List<String> | Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko dane techniczne pojazdów określone podanymi atrybutami. Parametr jest opcjonalny.
        String limit = "100"; // String | Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
        String page = "1"; // String | Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
        List<String> sort = Arrays.asList(); // List<String> | Parametr mechanizmu sortowania. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Kolejność podanych atrybutów określa kolejność sortowania. Aby posortować w odwrotnej kolejności należy poprzedzić nazwę parametru znakiem minus. Parametr jest opcjonalny.
        try {
            JsonApiForListVehicle result = apiInstance.getListaPojazdow(wojewodztwo, dataOd, dataDo, typDaty, tylkoZarejestrowane, pokazWszystkiePola, fields, limit, page, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PojazdyApi#getListaPojazdow");
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
| **wojewodztwo** | **String**| Kod teryt województwa, w którym zarejestrowane jest auto lub, w przypadku wyrejestrowanych aut, było ostatnio zarejestrowane. Parametr jest wymagany. Kody teryt znajdziesz w usłudze /słowniki. | |
| **dataOd** | **String**| Wymagany parametr daty podawany w formacie YYYYMMDD. Określa datę początkową okresu pierwszej lub ostatniej rejestracji w kraju (domyślnie pierwszej), dla którego zostaną udostępnione informacje o pojazdach. | |
| **dataDo** | **String**| Parametr daty podawany w formacie YYYYMMDD. Określa koniec okresu, dla którego pojazdy mają być zwrócone. Domyślną wartością jest data bieżąca. Maksymalny zakres dat to 2 lata. | [optional] |
| **typDaty** | **String**| Parametr określający jakiej daty dotyczy warunek wyszukiwania określony parametrami data-od i data-do.  W przypadku nie podania parametru, przyjęta zostanie wartość domyślna. 1 (domyślna wartość) - data pierwszej rejestracji pojazdu w Polsce, 2 - data ostatniej rejestracji pojazdu. | [optional] [default to 1] |
| **tylkoZarejestrowane** | **Boolean**| Parametr określający czy mają zostać zwrócone dane tylko pojazdów zarejestrowanych. Domyślną wartością jest, że tak. | [optional] [default to true] |
| **pokazWszystkiePola** | **Boolean**| Parametr określający czy mają zostać zwrócone wszystkie pola w zwróconych danych technicznych pojazdów. Domyślną wartością jest, że nie. Parametr ten jest ignorowany w przypadku podania jednocześnie parametru fields. | [optional] [default to false] |
| **fields** | [**List&lt;String&gt;**](String.md)| Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko dane techniczne pojazdów określone podanymi atrybutami. Parametr jest opcjonalny. | [optional] |
| **limit** | **String**| Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500. | [optional] [default to 100] |
| **page** | **String**| Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1. | [optional] [default to 1] |
| **sort** | [**List&lt;String&gt;**](String.md)| Parametr mechanizmu sortowania. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Kolejność podanych atrybutów określa kolejność sortowania. Aby posortować w odwrotnej kolejności należy poprzedzić nazwę parametru znakiem minus. Parametr jest opcjonalny. | [optional] |

### Return type

[**JsonApiForListVehicle**](JsonApiForListVehicle.md)

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


## getPojazd

> JsonApiForObjectVehicle getPojazd(id, fields)



Metoda udostępnia dane pojazdu z bazy CEPiK.

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.PojazdyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PojazdyApi apiInstance = new PojazdyApi(defaultClient);
        String id = "id_example"; // String | Identyfikator techniczny pojazdu. Jest to dodatnia liczba całkowita. Uwaga: nie jest to ani VIN, ani numer rejestracyjny.
        List<String> fields = Arrays.asList(); // List<String> | Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko dane techniczne pojazdów określone podanymi atrybutami. Parametr jest opcjonalny.
        try {
            JsonApiForObjectVehicle result = apiInstance.getPojazd(id, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PojazdyApi#getPojazd");
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
| **id** | **String**| Identyfikator techniczny pojazdu. Jest to dodatnia liczba całkowita. Uwaga: nie jest to ani VIN, ani numer rejestracyjny. | |
| **fields** | [**List&lt;String&gt;**](String.md)| Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko dane techniczne pojazdów określone podanymi atrybutami. Parametr jest opcjonalny. | [optional] |

### Return type

[**JsonApiForObjectVehicle**](JsonApiForObjectVehicle.md)

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

