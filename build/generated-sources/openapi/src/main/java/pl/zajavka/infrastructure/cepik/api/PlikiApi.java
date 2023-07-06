package pl.zajavka.infrastructure.cepik.api;

import pl.zajavka.infrastructure.cepik.ApiClient;

import pl.zajavka.infrastructure.cepik.model.Error;
import pl.zajavka.infrastructure.cepik.model.JsonApiForListFile;
import pl.zajavka.infrastructure.cepik.model.JsonApiForObjectFile;

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
public class PlikiApi {
    private ApiClient apiClient;

    public PlikiApi() {
        this(new ApiClient());
    }

    @Autowired
    public PlikiApi(ApiClient apiClient) {
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
     * Metoda udostępnia informacje o plikach zawierających dane pojazdów z bazy CEPiK.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param limit Parametr mechanizmu stronicowania określający ilość plików na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę listy plików chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForListFile
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getListaPlikowRequestCreation(String limit, String page) throws WebClientResponseException {
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

        ParameterizedTypeReference<JsonApiForListFile> localVarReturnType = new ParameterizedTypeReference<JsonApiForListFile>() {};
        return apiClient.invokeAPI("/pliki", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia informacje o plikach zawierających dane pojazdów z bazy CEPiK.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param limit Parametr mechanizmu stronicowania określający ilość plików na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę listy plików chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForListFile
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForListFile> getListaPlikow(String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForListFile> localVarReturnType = new ParameterizedTypeReference<JsonApiForListFile>() {};
        return getListaPlikowRequestCreation(limit, page).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia informacje o plikach zawierających dane pojazdów z bazy CEPiK.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param limit Parametr mechanizmu stronicowania określający ilość plików na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę listy plików chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseEntity&lt;JsonApiForListFile&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForListFile>> getListaPlikowWithHttpInfo(String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForListFile> localVarReturnType = new ParameterizedTypeReference<JsonApiForListFile>() {};
        return getListaPlikowRequestCreation(limit, page).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia informacje o plikach zawierających dane pojazdów z bazy CEPiK.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param limit Parametr mechanizmu stronicowania określający ilość plików na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę listy plików chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getListaPlikowWithResponseSpec(String limit, String page) throws WebClientResponseException {
        return getListaPlikowRequestCreation(limit, page);
    }
    /**
     * 
     * Metoda udostępnia informacje o pliku zawierającym dane o pojazdach z bazy CEPiK.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param id Identyfikator zasobu plikowego. Parametr jest wymagany.
     * @return JsonApiForObjectFile
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPlikRequestCreation(String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getPlik", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

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

        ParameterizedTypeReference<JsonApiForObjectFile> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectFile>() {};
        return apiClient.invokeAPI("/pliki/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia informacje o pliku zawierającym dane o pojazdach z bazy CEPiK.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param id Identyfikator zasobu plikowego. Parametr jest wymagany.
     * @return JsonApiForObjectFile
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForObjectFile> getPlik(String id) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectFile> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectFile>() {};
        return getPlikRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia informacje o pliku zawierającym dane o pojazdach z bazy CEPiK.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param id Identyfikator zasobu plikowego. Parametr jest wymagany.
     * @return ResponseEntity&lt;JsonApiForObjectFile&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForObjectFile>> getPlikWithHttpInfo(String id) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectFile> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectFile>() {};
        return getPlikRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia informacje o pliku zawierającym dane o pojazdach z bazy CEPiK.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param id Identyfikator zasobu plikowego. Parametr jest wymagany.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPlikWithResponseSpec(String id) throws WebClientResponseException {
        return getPlikRequestCreation(id);
    }
}
