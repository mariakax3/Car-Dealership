package pl.zajavka.infrastructure.cepik.api;

import pl.zajavka.infrastructure.cepik.ApiClient;

import pl.zajavka.infrastructure.cepik.model.Error;
import pl.zajavka.infrastructure.cepik.model.JsonApiForListDrivingLicense;
import pl.zajavka.infrastructure.cepik.model.JsonApiForObjectDrivingLicense;

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
public class PrawaJazdyApi {
    private ApiClient apiClient;

    public PrawaJazdyApi() {
        this(new ApiClient());
    }

    @Autowired
    public PrawaJazdyApi(ApiClient apiClient) {
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
     * Metoda udostępniająca miesięczne statystyki ilości wydań praw jazdy grupom kierowców.   Metoda udostępnia mechanizm filtrowania w postaci parametru: **filter[\\&lt;nazwa atrybutu\\&gt;]&#x3D;\\&lt;szukana wartość\\&gt;**. Znakiem operacji filtrowania jest znak równości **\&quot;&#x3D;\&quot;**. Parametr może być podany wielokrotnie.  \\&lt;**nazwa atrybutu**\\&gt; powinna być prawidłową nazwą jednego z atrybutów zawartych w danych statystyki. Parametr jest opcjonalny.   Przykładowe wykorzystania:   Statystyki z województwa wielkopolskiego - ilość praw jazdy wydanych kobietom.        GET /prawa-jazdy?filter[plec]&#x3D;K&amp;filter[wojewodztwo-kod]&#x3D;30      
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @param sort Parametr mechanizmu sortowania. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Kolejność podanych atrybutów określa kolejność sortowania. Aby posortować w odwrotnej kolejności należy poprzedzić nazwę parametru znakiem minus. Parametr jest opcjonalny.
     * @return JsonApiForListDrivingLicense
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getListaPrawJazdyRequestCreation(List<String> fields, String limit, String page, List<String> sort) throws WebClientResponseException {
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

        ParameterizedTypeReference<JsonApiForListDrivingLicense> localVarReturnType = new ParameterizedTypeReference<JsonApiForListDrivingLicense>() {};
        return apiClient.invokeAPI("/prawa-jazdy", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępniająca miesięczne statystyki ilości wydań praw jazdy grupom kierowców.   Metoda udostępnia mechanizm filtrowania w postaci parametru: **filter[\\&lt;nazwa atrybutu\\&gt;]&#x3D;\\&lt;szukana wartość\\&gt;**. Znakiem operacji filtrowania jest znak równości **\&quot;&#x3D;\&quot;**. Parametr może być podany wielokrotnie.  \\&lt;**nazwa atrybutu**\\&gt; powinna być prawidłową nazwą jednego z atrybutów zawartych w danych statystyki. Parametr jest opcjonalny.   Przykładowe wykorzystania:   Statystyki z województwa wielkopolskiego - ilość praw jazdy wydanych kobietom.        GET /prawa-jazdy?filter[plec]&#x3D;K&amp;filter[wojewodztwo-kod]&#x3D;30      
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @param sort Parametr mechanizmu sortowania. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Kolejność podanych atrybutów określa kolejność sortowania. Aby posortować w odwrotnej kolejności należy poprzedzić nazwę parametru znakiem minus. Parametr jest opcjonalny.
     * @return JsonApiForListDrivingLicense
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForListDrivingLicense> getListaPrawJazdy(List<String> fields, String limit, String page, List<String> sort) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForListDrivingLicense> localVarReturnType = new ParameterizedTypeReference<JsonApiForListDrivingLicense>() {};
        return getListaPrawJazdyRequestCreation(fields, limit, page, sort).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępniająca miesięczne statystyki ilości wydań praw jazdy grupom kierowców.   Metoda udostępnia mechanizm filtrowania w postaci parametru: **filter[\\&lt;nazwa atrybutu\\&gt;]&#x3D;\\&lt;szukana wartość\\&gt;**. Znakiem operacji filtrowania jest znak równości **\&quot;&#x3D;\&quot;**. Parametr może być podany wielokrotnie.  \\&lt;**nazwa atrybutu**\\&gt; powinna być prawidłową nazwą jednego z atrybutów zawartych w danych statystyki. Parametr jest opcjonalny.   Przykładowe wykorzystania:   Statystyki z województwa wielkopolskiego - ilość praw jazdy wydanych kobietom.        GET /prawa-jazdy?filter[plec]&#x3D;K&amp;filter[wojewodztwo-kod]&#x3D;30      
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @param sort Parametr mechanizmu sortowania. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Kolejność podanych atrybutów określa kolejność sortowania. Aby posortować w odwrotnej kolejności należy poprzedzić nazwę parametru znakiem minus. Parametr jest opcjonalny.
     * @return ResponseEntity&lt;JsonApiForListDrivingLicense&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForListDrivingLicense>> getListaPrawJazdyWithHttpInfo(List<String> fields, String limit, String page, List<String> sort) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForListDrivingLicense> localVarReturnType = new ParameterizedTypeReference<JsonApiForListDrivingLicense>() {};
        return getListaPrawJazdyRequestCreation(fields, limit, page, sort).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępniająca miesięczne statystyki ilości wydań praw jazdy grupom kierowców.   Metoda udostępnia mechanizm filtrowania w postaci parametru: **filter[\\&lt;nazwa atrybutu\\&gt;]&#x3D;\\&lt;szukana wartość\\&gt;**. Znakiem operacji filtrowania jest znak równości **\&quot;&#x3D;\&quot;**. Parametr może być podany wielokrotnie.  \\&lt;**nazwa atrybutu**\\&gt; powinna być prawidłową nazwą jednego z atrybutów zawartych w danych statystyki. Parametr jest opcjonalny.   Przykładowe wykorzystania:   Statystyki z województwa wielkopolskiego - ilość praw jazdy wydanych kobietom.        GET /prawa-jazdy?filter[plec]&#x3D;K&amp;filter[wojewodztwo-kod]&#x3D;30      
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @param sort Parametr mechanizmu sortowania. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Kolejność podanych atrybutów określa kolejność sortowania. Aby posortować w odwrotnej kolejności należy poprzedzić nazwę parametru znakiem minus. Parametr jest opcjonalny.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getListaPrawJazdyWithResponseSpec(List<String> fields, String limit, String page, List<String> sort) throws WebClientResponseException {
        return getListaPrawJazdyRequestCreation(fields, limit, page, sort);
    }
    /**
     * 
     * Metoda udostępnia informację o ilości wydań praw jazdy w zadanym miesiącu, kierowcom o określonych cechach.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param id Identyfikator statystyki. Ma postać \&quot;YYYY-MM,WOJ,P,WIEK\&quot;, gdzie  YYYY-MM - rok i miesiąc statystyki, WOJ - kod teryt województwa, P - płeć (K - kobiety, M - mężczyźni), WIEK - wiek kierowcy wyrażony liczbą naturalną.  Przykład: 2019-08,02,K,28
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
     * @return JsonApiForObjectDrivingLicense
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPrawaJazdyRequestCreation(String id, List<String> fields) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getPrawaJazdy", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<JsonApiForObjectDrivingLicense> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectDrivingLicense>() {};
        return apiClient.invokeAPI("/prawa-jazdy/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia informację o ilości wydań praw jazdy w zadanym miesiącu, kierowcom o określonych cechach.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param id Identyfikator statystyki. Ma postać \&quot;YYYY-MM,WOJ,P,WIEK\&quot;, gdzie  YYYY-MM - rok i miesiąc statystyki, WOJ - kod teryt województwa, P - płeć (K - kobiety, M - mężczyźni), WIEK - wiek kierowcy wyrażony liczbą naturalną.  Przykład: 2019-08,02,K,28
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
     * @return JsonApiForObjectDrivingLicense
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForObjectDrivingLicense> getPrawaJazdy(String id, List<String> fields) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectDrivingLicense> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectDrivingLicense>() {};
        return getPrawaJazdyRequestCreation(id, fields).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia informację o ilości wydań praw jazdy w zadanym miesiącu, kierowcom o określonych cechach.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param id Identyfikator statystyki. Ma postać \&quot;YYYY-MM,WOJ,P,WIEK\&quot;, gdzie  YYYY-MM - rok i miesiąc statystyki, WOJ - kod teryt województwa, P - płeć (K - kobiety, M - mężczyźni), WIEK - wiek kierowcy wyrażony liczbą naturalną.  Przykład: 2019-08,02,K,28
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
     * @return ResponseEntity&lt;JsonApiForObjectDrivingLicense&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForObjectDrivingLicense>> getPrawaJazdyWithHttpInfo(String id, List<String> fields) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectDrivingLicense> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectDrivingLicense>() {};
        return getPrawaJazdyRequestCreation(id, fields).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia informację o ilości wydań praw jazdy w zadanym miesiącu, kierowcom o określonych cechach.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param id Identyfikator statystyki. Ma postać \&quot;YYYY-MM,WOJ,P,WIEK\&quot;, gdzie  YYYY-MM - rok i miesiąc statystyki, WOJ - kod teryt województwa, P - płeć (K - kobiety, M - mężczyźni), WIEK - wiek kierowcy wyrażony liczbą naturalną.  Przykład: 2019-08,02,K,28
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko atrybuty statystyki określone w żądaniu. Parametr jest opcjonalny.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPrawaJazdyWithResponseSpec(String id, List<String> fields) throws WebClientResponseException {
        return getPrawaJazdyRequestCreation(id, fields);
    }
}
