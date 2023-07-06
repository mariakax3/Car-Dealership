package pl.zajavka.infrastructure.cepik.api;

import pl.zajavka.infrastructure.cepik.ApiClient;

import pl.zajavka.infrastructure.cepik.model.Error;
import pl.zajavka.infrastructure.cepik.model.VersionDto;

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
public class WersjeApi {
    private ApiClient apiClient;

    public WersjeApi() {
        this(new ApiClient());
    }

    @Autowired
    public WersjeApi(ApiClient apiClient) {
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
     * Metoda udostępnia infromację o najnowszej wersji API - V.1
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @return VersionDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getWersjaAktualnaRequestCreation() throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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

        ParameterizedTypeReference<VersionDto> localVarReturnType = new ParameterizedTypeReference<VersionDto>() {};
        return apiClient.invokeAPI("/version", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia infromację o najnowszej wersji API - V.1
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @return VersionDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<VersionDto> getWersjaAktualna() throws WebClientResponseException {
        ParameterizedTypeReference<VersionDto> localVarReturnType = new ParameterizedTypeReference<VersionDto>() {};
        return getWersjaAktualnaRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia infromację o najnowszej wersji API - V.1
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @return ResponseEntity&lt;VersionDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<VersionDto>> getWersjaAktualnaWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<VersionDto> localVarReturnType = new ParameterizedTypeReference<VersionDto>() {};
        return getWersjaAktualnaRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia infromację o najnowszej wersji API - V.1
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getWersjaAktualnaWithResponseSpec() throws WebClientResponseException {
        return getWersjaAktualnaRequestCreation();
    }
    /**
     * 
     * Metoda udostępnia infromację o najnowszej wersji API - V.1
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @return VersionDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getWersjaV1RequestCreation() throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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

        ParameterizedTypeReference<VersionDto> localVarReturnType = new ParameterizedTypeReference<VersionDto>() {};
        return apiClient.invokeAPI("/v1/version", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia infromację o najnowszej wersji API - V.1
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @return VersionDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<VersionDto> getWersjaV1() throws WebClientResponseException {
        ParameterizedTypeReference<VersionDto> localVarReturnType = new ParameterizedTypeReference<VersionDto>() {};
        return getWersjaV1RequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia infromację o najnowszej wersji API - V.1
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @return ResponseEntity&lt;VersionDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<VersionDto>> getWersjaV1WithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<VersionDto> localVarReturnType = new ParameterizedTypeReference<VersionDto>() {};
        return getWersjaV1RequestCreation().toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia infromację o najnowszej wersji API - V.1
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getWersjaV1WithResponseSpec() throws WebClientResponseException {
        return getWersjaV1RequestCreation();
    }
}
