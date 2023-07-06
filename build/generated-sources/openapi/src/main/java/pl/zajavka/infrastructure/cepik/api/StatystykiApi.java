package pl.zajavka.infrastructure.cepik.api;

import pl.zajavka.infrastructure.cepik.ApiClient;

import pl.zajavka.infrastructure.cepik.model.JsonApiForListStatistics;
import pl.zajavka.infrastructure.cepik.model.JsonApiForListStatisticsActivityDaily;
import pl.zajavka.infrastructure.cepik.model.JsonApiForListStatisticsServerWww;
import pl.zajavka.infrastructure.cepik.model.JsonApiForListStatisticsVehicle;
import pl.zajavka.infrastructure.cepik.model.JsonApiForObjectDictionary;
import pl.zajavka.infrastructure.cepik.model.JsonApiForObjectStatisticsActivityHourly;
import pl.zajavka.infrastructure.cepik.model.JsonApiForObjectStatisticsServerWww;
import pl.zajavka.infrastructure.cepik.model.JsonApiForObjectStatisticsVehicle;

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
public class StatystykiApi {
    private ApiClient apiClient;

    public StatystykiApi() {
        this(new ApiClient());
    }

    @Autowired
    public StatystykiApi(ApiClient apiClient) {
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
     * Metoda udostępnia statystykę aktywności użycia API do CEPIK we wskazanym dniu w podziale na przedziały godzinowe.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki aktywności użycia API.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForListStatisticsActivityDaily
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getListaStatystykAktywnosciGodzinowychRequestCreation(String dataStatystyki, String limit, String page) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dataStatystyki' is set
        if (dataStatystyki == null) {
            throw new WebClientResponseException("Missing the required parameter 'dataStatystyki' when calling getListaStatystykAktywnosciGodzinowych", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("data-statystyki", dataStatystyki);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<JsonApiForListStatisticsActivityDaily> localVarReturnType = new ParameterizedTypeReference<JsonApiForListStatisticsActivityDaily>() {};
        return apiClient.invokeAPI("/statystyki/aktywnosc/{data-statystyki}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia statystykę aktywności użycia API do CEPIK we wskazanym dniu w podziale na przedziały godzinowe.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki aktywności użycia API.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForListStatisticsActivityDaily
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForListStatisticsActivityDaily> getListaStatystykAktywnosciGodzinowych(String dataStatystyki, String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForListStatisticsActivityDaily> localVarReturnType = new ParameterizedTypeReference<JsonApiForListStatisticsActivityDaily>() {};
        return getListaStatystykAktywnosciGodzinowychRequestCreation(dataStatystyki, limit, page).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia statystykę aktywności użycia API do CEPIK we wskazanym dniu w podziale na przedziały godzinowe.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki aktywności użycia API.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseEntity&lt;JsonApiForListStatisticsActivityDaily&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForListStatisticsActivityDaily>> getListaStatystykAktywnosciGodzinowychWithHttpInfo(String dataStatystyki, String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForListStatisticsActivityDaily> localVarReturnType = new ParameterizedTypeReference<JsonApiForListStatisticsActivityDaily>() {};
        return getListaStatystykAktywnosciGodzinowychRequestCreation(dataStatystyki, limit, page).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia statystykę aktywności użycia API do CEPIK we wskazanym dniu w podziale na przedziały godzinowe.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki aktywności użycia API.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getListaStatystykAktywnosciGodzinowychWithResponseSpec(String dataStatystyki, String limit, String page) throws WebClientResponseException {
        return getListaStatystykAktywnosciGodzinowychRequestCreation(dataStatystyki, limit, page);
    }
    /**
     * 
     * Metoda udostępnia listę dostępnych statystyk użycia API do CEPIK.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataOd Parametr daty podawany w formacie YYYYMMDD. Określa początek okresu, z którego statystyki mają być zwrócone. Domyślną datą jest D-3.
     * @param dataDo Parametr daty podawany w formacie YYYYMMDD. Określa koniec okresu, z którego statystyki mają być zwrócone. Domyślną wartością jest bieżąca data.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForListStatistics
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getListaStatystykGlownychZasobowRequestCreation(String dataOd, String dataDo, String limit, String page) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "data-od", dataOd));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "data-do", dataDo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<JsonApiForListStatistics> localVarReturnType = new ParameterizedTypeReference<JsonApiForListStatistics>() {};
        return apiClient.invokeAPI("/statystyki", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia listę dostępnych statystyk użycia API do CEPIK.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataOd Parametr daty podawany w formacie YYYYMMDD. Określa początek okresu, z którego statystyki mają być zwrócone. Domyślną datą jest D-3.
     * @param dataDo Parametr daty podawany w formacie YYYYMMDD. Określa koniec okresu, z którego statystyki mają być zwrócone. Domyślną wartością jest bieżąca data.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForListStatistics
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForListStatistics> getListaStatystykGlownychZasobow(String dataOd, String dataDo, String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForListStatistics> localVarReturnType = new ParameterizedTypeReference<JsonApiForListStatistics>() {};
        return getListaStatystykGlownychZasobowRequestCreation(dataOd, dataDo, limit, page).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia listę dostępnych statystyk użycia API do CEPIK.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataOd Parametr daty podawany w formacie YYYYMMDD. Określa początek okresu, z którego statystyki mają być zwrócone. Domyślną datą jest D-3.
     * @param dataDo Parametr daty podawany w formacie YYYYMMDD. Określa koniec okresu, z którego statystyki mają być zwrócone. Domyślną wartością jest bieżąca data.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseEntity&lt;JsonApiForListStatistics&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForListStatistics>> getListaStatystykGlownychZasobowWithHttpInfo(String dataOd, String dataDo, String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForListStatistics> localVarReturnType = new ParameterizedTypeReference<JsonApiForListStatistics>() {};
        return getListaStatystykGlownychZasobowRequestCreation(dataOd, dataDo, limit, page).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia listę dostępnych statystyk użycia API do CEPIK.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataOd Parametr daty podawany w formacie YYYYMMDD. Określa początek okresu, z którego statystyki mają być zwrócone. Domyślną datą jest D-3.
     * @param dataDo Parametr daty podawany w formacie YYYYMMDD. Określa koniec okresu, z którego statystyki mają być zwrócone. Domyślną wartością jest bieżąca data.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getListaStatystykGlownychZasobowWithResponseSpec(String dataOd, String dataDo, String limit, String page) throws WebClientResponseException {
        return getListaStatystykGlownychZasobowRequestCreation(dataOd, dataDo, limit, page);
    }
    /**
     * 
     * Metoda udostępnia stystyki wywołań metody /pliki oraz pobrań plików zawierających listy pojazdów w wybranym zakresie dat.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataOd Parametr daty podawany w formacie YYYYMMDD. Określa początek okresu, z którego statystyki mają być zwrócone. Domyślną datą jest D-3.
     * @param dataDo Parametr daty podawany w formacie YYYYMMDD. Określa koniec okresu, z którego statystyki mają być zwrócone. Domyślną wartością jest bieżąca data.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForListStatisticsServerWww
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getListaStatystykPobranPlikowRequestCreation(String dataOd, String dataDo, String limit, String page) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "data-od", dataOd));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "data-do", dataDo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<JsonApiForListStatisticsServerWww> localVarReturnType = new ParameterizedTypeReference<JsonApiForListStatisticsServerWww>() {};
        return apiClient.invokeAPI("/statystyki/pliki", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia stystyki wywołań metody /pliki oraz pobrań plików zawierających listy pojazdów w wybranym zakresie dat.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataOd Parametr daty podawany w formacie YYYYMMDD. Określa początek okresu, z którego statystyki mają być zwrócone. Domyślną datą jest D-3.
     * @param dataDo Parametr daty podawany w formacie YYYYMMDD. Określa koniec okresu, z którego statystyki mają być zwrócone. Domyślną wartością jest bieżąca data.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForListStatisticsServerWww
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForListStatisticsServerWww> getListaStatystykPobranPlikow(String dataOd, String dataDo, String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForListStatisticsServerWww> localVarReturnType = new ParameterizedTypeReference<JsonApiForListStatisticsServerWww>() {};
        return getListaStatystykPobranPlikowRequestCreation(dataOd, dataDo, limit, page).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia stystyki wywołań metody /pliki oraz pobrań plików zawierających listy pojazdów w wybranym zakresie dat.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataOd Parametr daty podawany w formacie YYYYMMDD. Określa początek okresu, z którego statystyki mają być zwrócone. Domyślną datą jest D-3.
     * @param dataDo Parametr daty podawany w formacie YYYYMMDD. Określa koniec okresu, z którego statystyki mają być zwrócone. Domyślną wartością jest bieżąca data.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseEntity&lt;JsonApiForListStatisticsServerWww&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForListStatisticsServerWww>> getListaStatystykPobranPlikowWithHttpInfo(String dataOd, String dataDo, String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForListStatisticsServerWww> localVarReturnType = new ParameterizedTypeReference<JsonApiForListStatisticsServerWww>() {};
        return getListaStatystykPobranPlikowRequestCreation(dataOd, dataDo, limit, page).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia stystyki wywołań metody /pliki oraz pobrań plików zawierających listy pojazdów w wybranym zakresie dat.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataOd Parametr daty podawany w formacie YYYYMMDD. Określa początek okresu, z którego statystyki mają być zwrócone. Domyślną datą jest D-3.
     * @param dataDo Parametr daty podawany w formacie YYYYMMDD. Określa koniec okresu, z którego statystyki mają być zwrócone. Domyślną wartością jest bieżąca data.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getListaStatystykPobranPlikowWithResponseSpec(String dataOd, String dataDo, String limit, String page) throws WebClientResponseException {
        return getListaStatystykPobranPlikowRequestCreation(dataOd, dataDo, limit, page);
    }
    /**
     * 
     * Metoda udostępnia stystyki wywołań metody /pliki oraz pobrań plików zawierających listy pojazdów we wskazanym dniu.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki API.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForObjectStatisticsServerWww
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getListaStatystykPobranPlikowWDniuRequestCreation(String dataStatystyki, String limit, String page) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dataStatystyki' is set
        if (dataStatystyki == null) {
            throw new WebClientResponseException("Missing the required parameter 'dataStatystyki' when calling getListaStatystykPobranPlikowWDniu", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("data-statystyki", dataStatystyki);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<JsonApiForObjectStatisticsServerWww> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectStatisticsServerWww>() {};
        return apiClient.invokeAPI("/statystyki/pliki/{data-statystyki}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia stystyki wywołań metody /pliki oraz pobrań plików zawierających listy pojazdów we wskazanym dniu.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki API.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForObjectStatisticsServerWww
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForObjectStatisticsServerWww> getListaStatystykPobranPlikowWDniu(String dataStatystyki, String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectStatisticsServerWww> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectStatisticsServerWww>() {};
        return getListaStatystykPobranPlikowWDniuRequestCreation(dataStatystyki, limit, page).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia stystyki wywołań metody /pliki oraz pobrań plików zawierających listy pojazdów we wskazanym dniu.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki API.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseEntity&lt;JsonApiForObjectStatisticsServerWww&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForObjectStatisticsServerWww>> getListaStatystykPobranPlikowWDniuWithHttpInfo(String dataStatystyki, String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectStatisticsServerWww> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectStatisticsServerWww>() {};
        return getListaStatystykPobranPlikowWDniuRequestCreation(dataStatystyki, limit, page).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia stystyki wywołań metody /pliki oraz pobrań plików zawierających listy pojazdów we wskazanym dniu.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki API.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getListaStatystykPobranPlikowWDniuWithResponseSpec(String dataStatystyki, String limit, String page) throws WebClientResponseException {
        return getListaStatystykPobranPlikowWDniuRequestCreation(dataStatystyki, limit, page);
    }
    /**
     * 
     * Metoda udostępnia statystykę użycia metody /pojazdy we wskazanym dniu.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki użycia metody /pojazdy.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForListStatisticsVehicle
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getListaStatystykWyszukanPojazdowWDniuRequestCreation(String dataStatystyki, String limit, String page) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dataStatystyki' is set
        if (dataStatystyki == null) {
            throw new WebClientResponseException("Missing the required parameter 'dataStatystyki' when calling getListaStatystykWyszukanPojazdowWDniu", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("data-statystyki", dataStatystyki);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<JsonApiForListStatisticsVehicle> localVarReturnType = new ParameterizedTypeReference<JsonApiForListStatisticsVehicle>() {};
        return apiClient.invokeAPI("/statystyki/pojazdy/{data-statystyki}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia statystykę użycia metody /pojazdy we wskazanym dniu.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki użycia metody /pojazdy.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForListStatisticsVehicle
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForListStatisticsVehicle> getListaStatystykWyszukanPojazdowWDniu(String dataStatystyki, String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForListStatisticsVehicle> localVarReturnType = new ParameterizedTypeReference<JsonApiForListStatisticsVehicle>() {};
        return getListaStatystykWyszukanPojazdowWDniuRequestCreation(dataStatystyki, limit, page).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia statystykę użycia metody /pojazdy we wskazanym dniu.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki użycia metody /pojazdy.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseEntity&lt;JsonApiForListStatisticsVehicle&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForListStatisticsVehicle>> getListaStatystykWyszukanPojazdowWDniuWithHttpInfo(String dataStatystyki, String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForListStatisticsVehicle> localVarReturnType = new ParameterizedTypeReference<JsonApiForListStatisticsVehicle>() {};
        return getListaStatystykWyszukanPojazdowWDniuRequestCreation(dataStatystyki, limit, page).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia statystykę użycia metody /pojazdy we wskazanym dniu.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki użycia metody /pojazdy.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getListaStatystykWyszukanPojazdowWDniuWithResponseSpec(String dataStatystyki, String limit, String page) throws WebClientResponseException {
        return getListaStatystykWyszukanPojazdowWDniuRequestCreation(dataStatystyki, limit, page);
    }
    /**
     * 
     * Metoda udostępnia statystykę użycia metody /slowniki we wksazanym dniu.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki użycia metody /slowniki.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForObjectDictionary
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getListaStatystykWyszukanSlownikowRequestCreation(String dataStatystyki, String limit, String page) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dataStatystyki' is set
        if (dataStatystyki == null) {
            throw new WebClientResponseException("Missing the required parameter 'dataStatystyki' when calling getListaStatystykWyszukanSlownikow", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("data-statystyki", dataStatystyki);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<JsonApiForObjectDictionary> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectDictionary>() {};
        return apiClient.invokeAPI("/statystyki/slowniki/{data-statystyki}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia statystykę użycia metody /slowniki we wksazanym dniu.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki użycia metody /slowniki.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForObjectDictionary
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForObjectDictionary> getListaStatystykWyszukanSlownikow(String dataStatystyki, String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectDictionary> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectDictionary>() {};
        return getListaStatystykWyszukanSlownikowRequestCreation(dataStatystyki, limit, page).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia statystykę użycia metody /slowniki we wksazanym dniu.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki użycia metody /slowniki.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseEntity&lt;JsonApiForObjectDictionary&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForObjectDictionary>> getListaStatystykWyszukanSlownikowWithHttpInfo(String dataStatystyki, String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectDictionary> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectDictionary>() {};
        return getListaStatystykWyszukanSlownikowRequestCreation(dataStatystyki, limit, page).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia statystykę użycia metody /slowniki we wksazanym dniu.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki użycia metody /slowniki.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getListaStatystykWyszukanSlownikowWithResponseSpec(String dataStatystyki, String limit, String page) throws WebClientResponseException {
        return getListaStatystykWyszukanSlownikowRequestCreation(dataStatystyki, limit, page);
    }
    /**
     * 
     * Metoda udostępnia statystykę aktywności użycia API do CEPIK we wskazanym przedziale godzinowym danego dnia.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param id Identyfikator statystyki aktywnośći użycia API. Parametr Wymagany
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki aktywności użycia API.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForObjectStatisticsActivityHourly
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getStatystykiAktywnosciGodzinowejRequestCreation(String id, String dataStatystyki, String limit, String page) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getStatystykiAktywnosciGodzinowej", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dataStatystyki' is set
        if (dataStatystyki == null) {
            throw new WebClientResponseException("Missing the required parameter 'dataStatystyki' when calling getStatystykiAktywnosciGodzinowej", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("data-statystyki", dataStatystyki);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<JsonApiForObjectStatisticsActivityHourly> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectStatisticsActivityHourly>() {};
        return apiClient.invokeAPI("/statystyki/aktywnosc/{data-statystyki}/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia statystykę aktywności użycia API do CEPIK we wskazanym przedziale godzinowym danego dnia.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param id Identyfikator statystyki aktywnośći użycia API. Parametr Wymagany
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki aktywności użycia API.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForObjectStatisticsActivityHourly
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForObjectStatisticsActivityHourly> getStatystykiAktywnosciGodzinowej(String id, String dataStatystyki, String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectStatisticsActivityHourly> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectStatisticsActivityHourly>() {};
        return getStatystykiAktywnosciGodzinowejRequestCreation(id, dataStatystyki, limit, page).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia statystykę aktywności użycia API do CEPIK we wskazanym przedziale godzinowym danego dnia.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param id Identyfikator statystyki aktywnośći użycia API. Parametr Wymagany
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki aktywności użycia API.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseEntity&lt;JsonApiForObjectStatisticsActivityHourly&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForObjectStatisticsActivityHourly>> getStatystykiAktywnosciGodzinowejWithHttpInfo(String id, String dataStatystyki, String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectStatisticsActivityHourly> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectStatisticsActivityHourly>() {};
        return getStatystykiAktywnosciGodzinowejRequestCreation(id, dataStatystyki, limit, page).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia statystykę aktywności użycia API do CEPIK we wskazanym przedziale godzinowym danego dnia.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param id Identyfikator statystyki aktywnośći użycia API. Parametr Wymagany
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki aktywności użycia API.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getStatystykiAktywnosciGodzinowejWithResponseSpec(String id, String dataStatystyki, String limit, String page) throws WebClientResponseException {
        return getStatystykiAktywnosciGodzinowejRequestCreation(id, dataStatystyki, limit, page);
    }
    /**
     * 
     * Metoda udostępnia stystyki wywołań pobrań wskazanego pliku zawierającego listę pojazdów we wskazanym dniu.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param id Identyfikator pliku z listą pojazdów. Parametr Wymagany
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki API.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForObjectStatisticsServerWww
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getStatystykiPobranPlikuRequestCreation(String id, String dataStatystyki, String limit, String page) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getStatystykiPobranPliku", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dataStatystyki' is set
        if (dataStatystyki == null) {
            throw new WebClientResponseException("Missing the required parameter 'dataStatystyki' when calling getStatystykiPobranPliku", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("data-statystyki", dataStatystyki);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<JsonApiForObjectStatisticsServerWww> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectStatisticsServerWww>() {};
        return apiClient.invokeAPI("/statystyki/pliki/{data-statystyki}/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia stystyki wywołań pobrań wskazanego pliku zawierającego listę pojazdów we wskazanym dniu.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param id Identyfikator pliku z listą pojazdów. Parametr Wymagany
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki API.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForObjectStatisticsServerWww
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForObjectStatisticsServerWww> getStatystykiPobranPliku(String id, String dataStatystyki, String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectStatisticsServerWww> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectStatisticsServerWww>() {};
        return getStatystykiPobranPlikuRequestCreation(id, dataStatystyki, limit, page).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia stystyki wywołań pobrań wskazanego pliku zawierającego listę pojazdów we wskazanym dniu.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param id Identyfikator pliku z listą pojazdów. Parametr Wymagany
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki API.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseEntity&lt;JsonApiForObjectStatisticsServerWww&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForObjectStatisticsServerWww>> getStatystykiPobranPlikuWithHttpInfo(String id, String dataStatystyki, String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectStatisticsServerWww> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectStatisticsServerWww>() {};
        return getStatystykiPobranPlikuRequestCreation(id, dataStatystyki, limit, page).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia stystyki wywołań pobrań wskazanego pliku zawierającego listę pojazdów we wskazanym dniu.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param id Identyfikator pliku z listą pojazdów. Parametr Wymagany
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki API.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getStatystykiPobranPlikuWithResponseSpec(String id, String dataStatystyki, String limit, String page) throws WebClientResponseException {
        return getStatystykiPobranPlikuRequestCreation(id, dataStatystyki, limit, page);
    }
    /**
     * 
     * Metoda udostępnia statystykę użycia metody /pojazdy w podziale na województwo oraz wskazany dzień.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param wojewodztwo Parametr specyfikuję za jakie województwo mają zostać zwrócone statystki użycia metody /pojazdy. Parametr wymagany.
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki użycia metody /pojazdy.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForObjectStatisticsVehicle
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getStatystykiWyszukanPojazdowWWojewodztwieRequestCreation(String wojewodztwo, String dataStatystyki, String limit, String page) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'wojewodztwo' is set
        if (wojewodztwo == null) {
            throw new WebClientResponseException("Missing the required parameter 'wojewodztwo' when calling getStatystykiWyszukanPojazdowWWojewodztwie", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dataStatystyki' is set
        if (dataStatystyki == null) {
            throw new WebClientResponseException("Missing the required parameter 'dataStatystyki' when calling getStatystykiWyszukanPojazdowWWojewodztwie", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("wojewodztwo", wojewodztwo);
        pathParams.put("data-statystyki", dataStatystyki);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<JsonApiForObjectStatisticsVehicle> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectStatisticsVehicle>() {};
        return apiClient.invokeAPI("/statystyki/pojazdy/{data-statystyki}/{wojewodztwo}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia statystykę użycia metody /pojazdy w podziale na województwo oraz wskazany dzień.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param wojewodztwo Parametr specyfikuję za jakie województwo mają zostać zwrócone statystki użycia metody /pojazdy. Parametr wymagany.
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki użycia metody /pojazdy.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return JsonApiForObjectStatisticsVehicle
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForObjectStatisticsVehicle> getStatystykiWyszukanPojazdowWWojewodztwie(String wojewodztwo, String dataStatystyki, String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectStatisticsVehicle> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectStatisticsVehicle>() {};
        return getStatystykiWyszukanPojazdowWWojewodztwieRequestCreation(wojewodztwo, dataStatystyki, limit, page).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia statystykę użycia metody /pojazdy w podziale na województwo oraz wskazany dzień.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param wojewodztwo Parametr specyfikuję za jakie województwo mają zostać zwrócone statystki użycia metody /pojazdy. Parametr wymagany.
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki użycia metody /pojazdy.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseEntity&lt;JsonApiForObjectStatisticsVehicle&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForObjectStatisticsVehicle>> getStatystykiWyszukanPojazdowWWojewodztwieWithHttpInfo(String wojewodztwo, String dataStatystyki, String limit, String page) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectStatisticsVehicle> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectStatisticsVehicle>() {};
        return getStatystykiWyszukanPojazdowWWojewodztwieRequestCreation(wojewodztwo, dataStatystyki, limit, page).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia statystykę użycia metody /pojazdy w podziale na województwo oraz wskazany dzień.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param wojewodztwo Parametr specyfikuję za jakie województwo mają zostać zwrócone statystki użycia metody /pojazdy. Parametr wymagany.
     * @param dataStatystyki Wymagany parametr daty podawany w formacie YYYYMMDD. Określa dzień, za który mają zostać zwrócone statystyki użycia metody /pojazdy.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getStatystykiWyszukanPojazdowWWojewodztwieWithResponseSpec(String wojewodztwo, String dataStatystyki, String limit, String page) throws WebClientResponseException {
        return getStatystykiWyszukanPojazdowWWojewodztwieRequestCreation(wojewodztwo, dataStatystyki, limit, page);
    }
}
