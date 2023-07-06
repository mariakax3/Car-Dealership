package pl.zajavka.infrastructure.cepik.api;

import pl.zajavka.infrastructure.cepik.ApiClient;

import pl.zajavka.infrastructure.cepik.model.Error;
import pl.zajavka.infrastructure.cepik.model.JsonApiForListDictionary;
import pl.zajavka.infrastructure.cepik.model.JsonApiForObjectDictionary;

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
public class SownikiApi {
    private ApiClient apiClient;

    public SownikiApi() {
        this(new ApiClient());
    }

    @Autowired
    public SownikiApi(ApiClient apiClient) {
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
     * Metoda udostępnia listę wartości dla pól, po których można wyszukiwać/filtrować zasoby udostępniane przez API do CEPIK.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1
     * @return JsonApiForListDictionary
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getListaSlownikowRequestCreation(String limit, String page) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<JsonApiForListDictionary> localVarReturnType = new ParameterizedTypeReference<JsonApiForListDictionary>() {};
        return apiClient.invokeAPI("/slowniki", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia listę wartości dla pól, po których można wyszukiwać/filtrować zasoby udostępniane przez API do CEPIK.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1
     * @return JsonApiForListDictionary
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForListDictionary> getListaSlownikow(String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForListDictionary> localVarReturnType = new ParameterizedTypeReference<JsonApiForListDictionary>() {};
        return getListaSlownikowRequestCreation(limit, page).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia listę wartości dla pól, po których można wyszukiwać/filtrować zasoby udostępniane przez API do CEPIK.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1
     * @return ResponseEntity&lt;JsonApiForListDictionary&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForListDictionary>> getListaSlownikowWithHttpInfo(String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForListDictionary> localVarReturnType = new ParameterizedTypeReference<JsonApiForListDictionary>() {};
        return getListaSlownikowRequestCreation(limit, page).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia listę wartości dla pól, po których można wyszukiwać/filtrować zasoby udostępniane przez API do CEPIK.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getListaSlownikowWithResponseSpec(String limit, String page) throws WebClientResponseException {
        return getListaSlownikowRequestCreation(limit, page);
    }
    /**
     * 
     * Metoda udostępnia wybrany słownik zawierający możliwe wartości dla danego pola.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param nazwaSlownika Nazwa słownika (np. województwa, marka).
     * @return JsonApiForObjectDictionary
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSlownikRequestCreation(String nazwaSlownika) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'nazwaSlownika' is set
        if (nazwaSlownika == null) {
            throw new WebClientResponseException("Missing the required parameter 'nazwaSlownika' when calling getSlownik", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("nazwa-slownika", nazwaSlownika);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<JsonApiForObjectDictionary> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectDictionary>() {};
        return apiClient.invokeAPI("/slowniki/{nazwa-slownika}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia wybrany słownik zawierający możliwe wartości dla danego pola.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param nazwaSlownika Nazwa słownika (np. województwa, marka).
     * @return JsonApiForObjectDictionary
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForObjectDictionary> getSlownik(String nazwaSlownika) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectDictionary> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectDictionary>() {};
        return getSlownikRequestCreation(nazwaSlownika).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia wybrany słownik zawierający możliwe wartości dla danego pola.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param nazwaSlownika Nazwa słownika (np. województwa, marka).
     * @return ResponseEntity&lt;JsonApiForObjectDictionary&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForObjectDictionary>> getSlownikWithHttpInfo(String nazwaSlownika) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectDictionary> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectDictionary>() {};
        return getSlownikRequestCreation(nazwaSlownika).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia wybrany słownik zawierający możliwe wartości dla danego pola.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param nazwaSlownika Nazwa słownika (np. województwa, marka).
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSlownikWithResponseSpec(String nazwaSlownika) throws WebClientResponseException {
        return getSlownikRequestCreation(nazwaSlownika);
    }
}
