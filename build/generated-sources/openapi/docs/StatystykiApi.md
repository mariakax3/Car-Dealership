# StatystykiApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getListaStatystykAktywnosciGodzinowych**](StatystykiApi.md#getListaStatystykAktywnosciGodzinowych) | **GET** /statystyki/aktywnosc/{data-statystyki} |  |
| [**getListaStatystykGlownychZasobow**](StatystykiApi.md#getListaStatystykGlownychZasobow) | **GET** /statystyki |  |
| [**getListaStatystykPobranPlikow**](StatystykiApi.md#getListaStatystykPobranPlikow) | **GET** /statystyki/pliki |  |
| [**getListaStatystykPobranPlikowWDniu**](StatystykiApi.md#getListaStatystykPobranPlikowWDniu) | **GET** /statystyki/pliki/{data-statystyki} |  |
| [**getListaStatystykWyszukanPojazdowWDniu**](StatystykiApi.md#getListaStatystykWyszukanPojazdowWDniu) | **GET** /statystyki/pojazdy/{data-statystyki} |  |
| [**getListaStatystykWyszukanSlownikow**](StatystykiApi.md#getListaStatystykWyszukanSlownikow) | **GET** /statystyki/slowniki/{data-statystyki} |  |
| [**getStatystykiAktywnosciGodzinowej**](StatystykiApi.md#getStatystykiAktywnosciGodzinowej) | **GET** /statystyki/aktywnosc/{data-statystyki}/{id} |  |
| [**getStatystykiPobranPliku**](StatystykiApi.md#getStatystykiPobranPliku) | **GET** /statystyki/pliki/{data-statystyki}/{id} |  |
| [**getStatystykiWyszukanPojazdowWWojewodztwie**](StatystykiApi.md#getStatystykiWyszukanPojazdowWWojewodztwie) | **GET** /statystyki/pojazdy/{data-statystyki}/{wojewodztwo} |  |



## getListaStatystykAktywnosciGodzinowych

> JsonApiForListStatisticsActivityDaily getListaStatystykAktywnosciGodzinowych(dataStatystyki, limit, page)



Metoda udostępnia statystykę aktywności użycia API do CEPIK we wskazanym dniu w podziale na przedziały godzinowe.

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.StatystykiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        StatystykiApi apiInstance = new StatystykiApi(defaultClient);
        String dataStatystyki = "dataStatystyki_example"; // String | Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki aktywności użycia API.
        String limit = "100"; // String | Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
        String page = "1"; // String | Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
        try {
            JsonApiForListStatisticsActivityDaily result = apiInstance.getListaStatystykAktywnosciGodzinowych(dataStatystyki, limit, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatystykiApi#getListaStatystykAktywnosciGodzinowych");
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
| **dataStatystyki** | **String**| Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki aktywności użycia API. | |
| **limit** | **String**| Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500. | [optional] [default to 100] |
| **page** | **String**| Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1. | [optional] [default to 1] |

### Return type

[**JsonApiForListStatisticsActivityDaily**](JsonApiForListStatisticsActivityDaily.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Rate-Limit-Remaining - Szacunkowy pozostały limit wywołań usługi dla adresu IP w jednostce czasu. <br>  |
| **404** | Not Found |  -  |


## getListaStatystykGlownychZasobow

> JsonApiForListStatistics getListaStatystykGlownychZasobow(dataOd, dataDo, limit, page)



Metoda udostępnia listę dostępnych statystyk użycia API do CEPIK.

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.StatystykiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        StatystykiApi apiInstance = new StatystykiApi(defaultClient);
        String dataOd = "dataOd_example"; // String | Parametr daty podawany w formacie YYYYMMDD. Określa początek okresu, z którego statystyki mają być zwrócone. Domyślną datą jest D-3.
        String dataDo = "dataDo_example"; // String | Parametr daty podawany w formacie YYYYMMDD. Określa koniec okresu, z którego statystyki mają być zwrócone. Domyślną wartością jest bieżąca data.
        String limit = "100"; // String | Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
        String page = "1"; // String | Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
        try {
            JsonApiForListStatistics result = apiInstance.getListaStatystykGlownychZasobow(dataOd, dataDo, limit, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatystykiApi#getListaStatystykGlownychZasobow");
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
| **dataOd** | **String**| Parametr daty podawany w formacie YYYYMMDD. Określa początek okresu, z którego statystyki mają być zwrócone. Domyślną datą jest D-3. | [optional] |
| **dataDo** | **String**| Parametr daty podawany w formacie YYYYMMDD. Określa koniec okresu, z którego statystyki mają być zwrócone. Domyślną wartością jest bieżąca data. | [optional] |
| **limit** | **String**| Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500. | [optional] [default to 100] |
| **page** | **String**| Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1. | [optional] [default to 1] |

### Return type

[**JsonApiForListStatistics**](JsonApiForListStatistics.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Rate-Limit-Remaining - Szacunkowy pozostały limit wywołań usługi dla adresu IP w jednostce czasu. <br>  |
| **404** | Not Found |  -  |


## getListaStatystykPobranPlikow

> JsonApiForListStatisticsServerWww getListaStatystykPobranPlikow(dataOd, dataDo, limit, page)



Metoda udostępnia stystyki wywołań metody /pliki oraz pobrań plików zawierających listy pojazdów w wybranym zakresie dat.

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.StatystykiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        StatystykiApi apiInstance = new StatystykiApi(defaultClient);
        String dataOd = "dataOd_example"; // String | Parametr daty podawany w formacie YYYYMMDD. Określa początek okresu, z którego statystyki mają być zwrócone. Domyślną datą jest D-3.
        String dataDo = "dataDo_example"; // String | Parametr daty podawany w formacie YYYYMMDD. Określa koniec okresu, z którego statystyki mają być zwrócone. Domyślną wartością jest bieżąca data.
        String limit = "100"; // String | Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
        String page = "1"; // String | Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
        try {
            JsonApiForListStatisticsServerWww result = apiInstance.getListaStatystykPobranPlikow(dataOd, dataDo, limit, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatystykiApi#getListaStatystykPobranPlikow");
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
| **dataOd** | **String**| Parametr daty podawany w formacie YYYYMMDD. Określa początek okresu, z którego statystyki mają być zwrócone. Domyślną datą jest D-3. | [optional] |
| **dataDo** | **String**| Parametr daty podawany w formacie YYYYMMDD. Określa koniec okresu, z którego statystyki mają być zwrócone. Domyślną wartością jest bieżąca data. | [optional] |
| **limit** | **String**| Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500. | [optional] [default to 100] |
| **page** | **String**| Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1. | [optional] [default to 1] |

### Return type

[**JsonApiForListStatisticsServerWww**](JsonApiForListStatisticsServerWww.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Rate-Limit-Remaining - Szacunkowy pozostały limit wywołań usługi dla adresu IP w jednostce czasu. <br>  |
| **404** | Not Found |  -  |


## getListaStatystykPobranPlikowWDniu

> JsonApiForObjectStatisticsServerWww getListaStatystykPobranPlikowWDniu(dataStatystyki, limit, page)



Metoda udostępnia stystyki wywołań metody /pliki oraz pobrań plików zawierających listy pojazdów we wskazanym dniu.

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.StatystykiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        StatystykiApi apiInstance = new StatystykiApi(defaultClient);
        String dataStatystyki = "dataStatystyki_example"; // String | Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki API.
        String limit = "100"; // String | Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
        String page = "1"; // String | Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
        try {
            JsonApiForObjectStatisticsServerWww result = apiInstance.getListaStatystykPobranPlikowWDniu(dataStatystyki, limit, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatystykiApi#getListaStatystykPobranPlikowWDniu");
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
| **dataStatystyki** | **String**| Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki API. | |
| **limit** | **String**| Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500. | [optional] [default to 100] |
| **page** | **String**| Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1. | [optional] [default to 1] |

### Return type

[**JsonApiForObjectStatisticsServerWww**](JsonApiForObjectStatisticsServerWww.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Rate-Limit-Remaining - Szacunkowy pozostały limit wywołań usługi dla adresu IP w jednostce czasu. <br>  |
| **404** | Not Found |  -  |


## getListaStatystykWyszukanPojazdowWDniu

> JsonApiForListStatisticsVehicle getListaStatystykWyszukanPojazdowWDniu(dataStatystyki, limit, page)



Metoda udostępnia statystykę użycia metody /pojazdy we wskazanym dniu.

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.StatystykiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        StatystykiApi apiInstance = new StatystykiApi(defaultClient);
        String dataStatystyki = "dataStatystyki_example"; // String | Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki użycia metody /pojazdy.
        String limit = "100"; // String | Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
        String page = "1"; // String | Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
        try {
            JsonApiForListStatisticsVehicle result = apiInstance.getListaStatystykWyszukanPojazdowWDniu(dataStatystyki, limit, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatystykiApi#getListaStatystykWyszukanPojazdowWDniu");
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
| **dataStatystyki** | **String**| Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki użycia metody /pojazdy. | |
| **limit** | **String**| Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500. | [optional] [default to 100] |
| **page** | **String**| Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1. | [optional] [default to 1] |

### Return type

[**JsonApiForListStatisticsVehicle**](JsonApiForListStatisticsVehicle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Rate-Limit-Remaining - Szacunkowy pozostały limit wywołań usługi dla adresu IP w jednostce czasu. <br>  |
| **404** | Not Found |  -  |


## getListaStatystykWyszukanSlownikow

> JsonApiForObjectDictionary getListaStatystykWyszukanSlownikow(dataStatystyki, limit, page)



Metoda udostępnia statystykę użycia metody /slowniki we wksazanym dniu.

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.StatystykiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        StatystykiApi apiInstance = new StatystykiApi(defaultClient);
        String dataStatystyki = "dataStatystyki_example"; // String | Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki użycia metody /slowniki.
        String limit = "100"; // String | Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
        String page = "1"; // String | Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
        try {
            JsonApiForObjectDictionary result = apiInstance.getListaStatystykWyszukanSlownikow(dataStatystyki, limit, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatystykiApi#getListaStatystykWyszukanSlownikow");
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
| **dataStatystyki** | **String**| Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki użycia metody /slowniki. | |
| **limit** | **String**| Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500. | [optional] [default to 100] |
| **page** | **String**| Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1. | [optional] [default to 1] |

### Return type

[**JsonApiForObjectDictionary**](JsonApiForObjectDictionary.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Rate-Limit-Remaining - Szacunkowy pozostały limit wywołań usługi dla adresu IP w jednostce czasu. <br>  |
| **404** | Not Found |  -  |


## getStatystykiAktywnosciGodzinowej

> JsonApiForObjectStatisticsActivityHourly getStatystykiAktywnosciGodzinowej(id, dataStatystyki, limit, page)



Metoda udostępnia statystykę aktywności użycia API do CEPIK we wskazanym przedziale godzinowym danego dnia.

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.StatystykiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        StatystykiApi apiInstance = new StatystykiApi(defaultClient);
        String id = "id_example"; // String | Identyfikator statystyki aktywnośći użycia API. Parametr Wymagany
        String dataStatystyki = "dataStatystyki_example"; // String | Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki aktywności użycia API.
        String limit = "100"; // String | Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
        String page = "1"; // String | Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
        try {
            JsonApiForObjectStatisticsActivityHourly result = apiInstance.getStatystykiAktywnosciGodzinowej(id, dataStatystyki, limit, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatystykiApi#getStatystykiAktywnosciGodzinowej");
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
| **id** | **String**| Identyfikator statystyki aktywnośći użycia API. Parametr Wymagany | |
| **dataStatystyki** | **String**| Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki aktywności użycia API. | |
| **limit** | **String**| Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500. | [optional] [default to 100] |
| **page** | **String**| Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1. | [optional] [default to 1] |

### Return type

[**JsonApiForObjectStatisticsActivityHourly**](JsonApiForObjectStatisticsActivityHourly.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Rate-Limit-Remaining - Szacunkowy pozostały limit wywołań usługi dla adresu IP w jednostce czasu. <br>  |
| **404** | Not Found |  -  |


## getStatystykiPobranPliku

> JsonApiForObjectStatisticsServerWww getStatystykiPobranPliku(id, dataStatystyki, limit, page)



Metoda udostępnia stystyki wywołań pobrań wskazanego pliku zawierającego listę pojazdów we wskazanym dniu.

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.StatystykiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        StatystykiApi apiInstance = new StatystykiApi(defaultClient);
        String id = "id_example"; // String | Identyfikator pliku z listą pojazdów. Parametr Wymagany
        String dataStatystyki = "dataStatystyki_example"; // String | Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki API.
        String limit = "100"; // String | Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
        String page = "1"; // String | Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
        try {
            JsonApiForObjectStatisticsServerWww result = apiInstance.getStatystykiPobranPliku(id, dataStatystyki, limit, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatystykiApi#getStatystykiPobranPliku");
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
| **id** | **String**| Identyfikator pliku z listą pojazdów. Parametr Wymagany | |
| **dataStatystyki** | **String**| Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki API. | |
| **limit** | **String**| Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500. | [optional] [default to 100] |
| **page** | **String**| Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1. | [optional] [default to 1] |

### Return type

[**JsonApiForObjectStatisticsServerWww**](JsonApiForObjectStatisticsServerWww.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Rate-Limit-Remaining - Szacunkowy pozostały limit wywołań usługi dla adresu IP w jednostce czasu. <br>  |
| **404** | Not Found |  -  |


## getStatystykiWyszukanPojazdowWWojewodztwie

> JsonApiForObjectStatisticsVehicle getStatystykiWyszukanPojazdowWWojewodztwie(wojewodztwo, dataStatystyki, limit, page)



Metoda udostępnia statystykę użycia metody /pojazdy w podziale na województwo oraz wskazany dzień.

### Example

```java
// Import classes:
import pl.zajavka.infrastructure.cepik.ApiClient;
import pl.zajavka.infrastructure.cepik.ApiException;
import pl.zajavka.infrastructure.cepik.Configuration;
import pl.zajavka.infrastructure.cepik.models.*;
import pl.zajavka.infrastructure.cepik.api.StatystykiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        StatystykiApi apiInstance = new StatystykiApi(defaultClient);
        String wojewodztwo = "wojewodztwo_example"; // String | Parametr specyfikuję za jakie województwo mają zostać zwrócone statystki użycia metody /pojazdy. Parametr wymagany.
        String dataStatystyki = "dataStatystyki_example"; // String | Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki użycia metody /pojazdy.
        String limit = "100"; // String | Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
        String page = "1"; // String | Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
        try {
            JsonApiForObjectStatisticsVehicle result = apiInstance.getStatystykiWyszukanPojazdowWWojewodztwie(wojewodztwo, dataStatystyki, limit, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatystykiApi#getStatystykiWyszukanPojazdowWWojewodztwie");
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
| **wojewodztwo** | **String**| Parametr specyfikuję za jakie województwo mają zostać zwrócone statystki użycia metody /pojazdy. Parametr wymagany. | |
| **dataStatystyki** | **String**| Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki użycia metody /pojazdy. | |
| **limit** | **String**| Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500. | [optional] [default to 100] |
| **page** | **String**| Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1. | [optional] [default to 1] |

### Return type

[**JsonApiForObjectStatisticsVehicle**](JsonApiForObjectStatisticsVehicle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Rate-Limit-Remaining - Szacunkowy pozostały limit wywołań usługi dla adresu IP w jednostce czasu. <br>  |
| **404** | Not Found |  -  |

