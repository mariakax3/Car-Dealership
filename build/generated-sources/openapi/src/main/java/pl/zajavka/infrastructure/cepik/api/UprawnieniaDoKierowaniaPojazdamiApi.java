package pl.zajavka.infrastructure.cepik.api;

import pl.zajavka.infrastructure.cepik.ApiClient;

import pl.zajavka.infrastructure.cepik.model.Error;
import pl.zajavka.infrastructure.cepik.model.JsonApiForListDrivingPermission;
import pl.zajavka.infrastructure.cepik.model.JsonApiForObjectDrivingPermission;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-05T22:58:19.118382400+02:00[Europe/Warsaw]")
public class UprawnieniaDoKierowaniaPojazdamiApi {
    private ApiClient apiClient;

    public UprawnieniaDoKierowaniaPojazdamiApi() {
        this(new ApiClient());
    }

    @Autowired
    public UprawnieniaDoKierowaniaPojazdamiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Metoda udostępniająca miesięczne statystyki ilości nadanych uprawnień do kierowania pojazdami grupom kierowców.   Metoda udostępnia mechanizm filtrowania w postaci parametru: **filter[\\&lt;nazwa atrybutu\\&gt;]&#x3D;\\&lt;szukana wartość\\&gt;**. Znakiem operacji filtrowania jest znak równości **\&quot;&#x3D;\&quot;**. Parametr może być podany wielokrotnie.  \\&lt;**nazwa atrybutu**\\&gt; powinna być prawidłową nazwą jednego z atrybutów zawartych w danych statystyki. Parametr jest opcjonalny.   Przykładowe wykorzystania:   Statystyki z województwa wielkopolskiego - ilość nadanych mężczyznom uprawnień do kierowania pojazdami o kategorii B.        GET /uprawnienia?filter[plec]&#x3D;M&amp;filter[wojewodztwo-kod]&#x3D;30&amp;filter[kod-uprawnienia]&#x3D;B      
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @param sort Parametr mechanizmu sortowania. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Kolejność podanych atrybutów określa kolejność sortowania. Aby posortować w odwrotnej kolejności należy poprzedzić nazwę parametru znakiem minus. Parametr jest opcjonalny.
     * @return JsonApiForListDrivingPermission
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getListaUprawnienRequestCreation(List<String> fields, String limit, String page, List<String> sort) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "fields", fields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "sort", sort));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<JsonApiForListDrivingPermission> localVarReturnType = new ParameterizedTypeReference<JsonApiForListDrivingPermission>() {};
        return apiClient.invokeAPI("/uprawnienia", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępniająca miesięczne statystyki ilości nadanych uprawnień do kierowania pojazdami grupom kierowców.   Metoda udostępnia mechanizm filtrowania w postaci parametru: **filter[\\&lt;nazwa atrybutu\\&gt;]&#x3D;\\&lt;szukana wartość\\&gt;**. Znakiem operacji filtrowania jest znak równości **\&quot;&#x3D;\&quot;**. Parametr może być podany wielokrotnie.  \\&lt;**nazwa atrybutu**\\&gt; powinna być prawidłową nazwą jednego z atrybutów zawartych w danych statystyki. Parametr jest opcjonalny.   Przykładowe wykorzystania:   Statystyki z województwa wielkopolskiego - ilość nadanych mężczyznom uprawnień do kierowania pojazdami o kategorii B.        GET /uprawnienia?filter[plec]&#x3D;M&amp;filter[wojewodztwo-kod]&#x3D;30&amp;filter[kod-uprawnienia]&#x3D;B      
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @param sort Parametr mechanizmu sortowania. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Kolejność podanych atrybutów określa kolejność sortowania. Aby posortować w odwrotnej kolejności należy poprzedzić nazwę parametru znakiem minus. Parametr jest opcjonalny.
     * @return JsonApiForListDrivingPermission
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForListDrivingPermission> getListaUprawnien(List<String> fields, String limit, String page, List<String> sort) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForListDrivingPermission> localVarReturnType = new ParameterizedTypeReference<JsonApiForListDrivingPermission>() {};
        return getListaUprawnienRequestCreation(fields, limit, page, sort).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępniająca miesięczne statystyki ilości nadanych uprawnień do kierowania pojazdami grupom kierowców.   Metoda udostępnia mechanizm filtrowania w postaci parametru: **filter[\\&lt;nazwa atrybutu\\&gt;]&#x3D;\\&lt;szukana wartość\\&gt;**. Znakiem operacji filtrowania jest znak równości **\&quot;&#x3D;\&quot;**. Parametr może być podany wielokrotnie.  \\&lt;**nazwa atrybutu**\\&gt; powinna być prawidłową nazwą jednego z atrybutów zawartych w danych statystyki. Parametr jest opcjonalny.   Przykładowe wykorzystania:   Statystyki z województwa wielkopolskiego - ilość nadanych mężczyznom uprawnień do kierowania pojazdami o kategorii B.        GET /uprawnienia?filter[plec]&#x3D;M&amp;filter[wojewodztwo-kod]&#x3D;30&amp;filter[kod-uprawnienia]&#x3D;B      
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @param sort Parametr mechanizmu sortowania. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Kolejność podanych atrybutów określa kolejność sortowania. Aby posortować w odwrotnej kolejności należy poprzedzić nazwę parametru znakiem minus. Parametr jest opcjonalny.
     * @return ResponseEntity&lt;JsonApiForListDrivingPermission&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForListDrivingPermission>> getListaUprawnienWithHttpInfo(List<String> fields, String limit, String page, List<String> sort) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForListDrivingPermission> localVarReturnType = new ParameterizedTypeReference<JsonApiForListDrivingPermission>() {};
        return getListaUprawnienRequestCreation(fields, limit, page, sort).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępniająca miesięczne statystyki ilości nadanych uprawnień do kierowania pojazdami grupom kierowców.   Metoda udostępnia mechanizm filtrowania w postaci parametru: **filter[\\&lt;nazwa atrybutu\\&gt;]&#x3D;\\&lt;szukana wartość\\&gt;**. Znakiem operacji filtrowania jest znak równości **\&quot;&#x3D;\&quot;**. Parametr może być podany wielokrotnie.  \\&lt;**nazwa atrybutu**\\&gt; powinna być prawidłową nazwą jednego z atrybutów zawartych w danych statystyki. Parametr jest opcjonalny.   Przykładowe wykorzystania:   Statystyki z województwa wielkopolskiego - ilość nadanych mężczyznom uprawnień do kierowania pojazdami o kategorii B.        GET /uprawnienia?filter[plec]&#x3D;M&amp;filter[wojewodztwo-kod]&#x3D;30&amp;filter[kod-uprawnienia]&#x3D;B      
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @param sort Parametr mechanizmu sortowania. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Kolejność podanych atrybutów określa kolejność sortowania. Aby posortować w odwrotnej kolejności należy poprzedzić nazwę parametru znakiem minus. Parametr jest opcjonalny.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getListaUprawnienWithResponseSpec(List<String> fields, String limit, String page, List<String> sort) throws WebClientResponseException {
        return getListaUprawnienRequestCreation(fields, limit, page, sort);
    }
    /**
     * 
     * Metoda udostępnia informację o ilości nadanych uprawnień do kierowania pojazdami w zadanym miesiącu, kierowcom o określonych cechach.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param id Identyfikator statystyki. Ma postać \&quot;YYYY-MM,WOJ,UPR,P,WIEK\&quot;, gdzie  YYYY-MM - rok i miesiąc statystyki, WOJ - kod teryt województwa, UPR - kod kategorii uprawnienia, np. A, B ,B1, C i rd., P - płeć (K - kobiety, M - mężczyźni), WIEK - wiek kierowcy wyrażony liczbą naturalną.  Przykład: 2019-08,02,K,28
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
     * @return JsonApiForObjectDrivingPermission
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getUprawnieniaRequestCreation(String id, List<String> fields) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getUprawnienia", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "fields", fields));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<JsonApiForObjectDrivingPermission> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectDrivingPermission>() {};
        return apiClient.invokeAPI("/uprawnienia/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia informację o ilości nadanych uprawnień do kierowania pojazdami w zadanym miesiącu, kierowcom o określonych cechach.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param id Identyfikator statystyki. Ma postać \&quot;YYYY-MM,WOJ,UPR,P,WIEK\&quot;, gdzie  YYYY-MM - rok i miesiąc statystyki, WOJ - kod teryt województwa, UPR - kod kategorii uprawnienia, np. A, B ,B1, C i rd., P - płeć (K - kobiety, M - mężczyźni), WIEK - wiek kierowcy wyrażony liczbą naturalną.  Przykład: 2019-08,02,K,28
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
     * @return JsonApiForObjectDrivingPermission
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForObjectDrivingPermission> getUprawnienia(String id, List<String> fields) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectDrivingPermission> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectDrivingPermission>() {};
        return getUprawnieniaRequestCreation(id, fields).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia informację o ilości nadanych uprawnień do kierowania pojazdami w zadanym miesiącu, kierowcom o określonych cechach.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param id Identyfikator statystyki. Ma postać \&quot;YYYY-MM,WOJ,UPR,P,WIEK\&quot;, gdzie  YYYY-MM - rok i miesiąc statystyki, WOJ - kod teryt województwa, UPR - kod kategorii uprawnienia, np. A, B ,B1, C i rd., P - płeć (K - kobiety, M - mężczyźni), WIEK - wiek kierowcy wyrażony liczbą naturalną.  Przykład: 2019-08,02,K,28
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
     * @return ResponseEntity&lt;JsonApiForObjectDrivingPermission&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForObjectDrivingPermission>> getUprawnieniaWithHttpInfo(String id, List<String> fields) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectDrivingPermission> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectDrivingPermission>() {};
        return getUprawnieniaRequestCreation(id, fields).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia informację o ilości nadanych uprawnień do kierowania pojazdami w zadanym miesiącu, kierowcom o określonych cechach.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param id Identyfikator statystyki. Ma postać \&quot;YYYY-MM,WOJ,UPR,P,WIEK\&quot;, gdzie  YYYY-MM - rok i miesiąc statystyki, WOJ - kod teryt województwa, UPR - kod kategorii uprawnienia, np. A, B ,B1, C i rd., P - płeć (K - kobiety, M - mężczyźni), WIEK - wiek kierowcy wyrażony liczbą naturalną.  Przykład: 2019-08,02,K,28
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getUprawnieniaWithResponseSpec(String id, List<String> fields) throws WebClientResponseException {
        return getUprawnieniaRequestCreation(id, fields);
    }
}
