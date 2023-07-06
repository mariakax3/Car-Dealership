package pl.zajavka.infrastructure.cepik.api;

import pl.zajavka.infrastructure.cepik.ApiClient;

import pl.zajavka.infrastructure.cepik.model.Error;
import pl.zajavka.infrastructure.cepik.model.JsonApiForListVehicle;
import pl.zajavka.infrastructure.cepik.model.JsonApiForObjectVehicle;

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
public class PojazdyApi {
    private ApiClient apiClient;

    public PojazdyApi() {
        this(new ApiClient());
    }

    @Autowired
    public PojazdyApi(ApiClient apiClient) {
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
     * Metoda udostępniająca listę pojazdów z bazy CEPiK.   Metoda udostępnia mechanizm filtrowania w postaci parametru: **filter[\\&lt;nazwa atrybutu\\&gt;]&#x3D;\\&lt;szukana wartość\\&gt;**. Znakiem operacji filtrowania jest znak równości **\&quot;&#x3D;\&quot;**. Parametr może być podany wielokrotnie.  \\&lt;**nazwa atrybutu**\\&gt; powinna być prawidłową nazwą jednego z atrybutów zawartych w danych technicznych pojazdu. Parametr jest opcjonalny.   Przykładowe wykorzystania:   Pojazdy z województwa wielkopolskiego, zarejestrowane po raz I w Polsce w 2019r.        GET /pojazdy?wojewodztwo&#x3D;30&amp;data-od&#x3D;20190101&amp;data-do&#x3D;20191231      Pojazdy o modelu JUMPER z województwa mazowieckiego, zarejestrowane po raz I w Polsce między 2016-01-01 a 2018-12-01r.        GET /pojazdy?wojewodztwo&#x3D;14&amp;data-od&#x3D;20160101&amp;data-do&#x3D;20181201&amp;filter[model]&#x3D;JUMPER      Pojazdy z województwa dolnośląskiego, których data ostatniej rejestracji mieści się w przedziale 2018-01-01 - 2019-12-31r.        GET /pojazdy?wojewodztwo&#x3D;02&amp;data-od&#x3D;20180101&amp;data-do&#x3D;20191231&amp;typ-daty&#x3D;2      
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param wojewodztwo Kod teryt województwa, w którym zarejestrowane jest auto lub, w przypadku wyrejestrowanych aut, było ostatnio zarejestrowane. Parametr jest wymagany. Kody teryt znajdziesz w usłudze /słowniki.
     * @param dataOd Wymagany parametr daty podawany w formacie YYYYMMDD. Określa datę początkową okresu pierwszej lub ostatniej rejestracji w kraju (domyślnie pierwszej), dla którego zostaną udostępnione informacje o pojazdach.
     * @param dataDo Parametr daty podawany w formacie YYYYMMDD. Określa koniec okresu, dla którego pojazdy mają być zwrócone. Domyślną wartością jest data bieżąca. Maksymalny zakres dat to 2 lata.
     * @param typDaty Parametr określający jakiej daty dotyczy warunek wyszukiwania określony parametrami data-od i data-do.  W przypadku nie podania parametru, przyjęta zostanie wartość domyślna. 1 (domyślna wartość) - data pierwszej rejestracji pojazdu w Polsce, 2 - data ostatniej rejestracji pojazdu.
     * @param tylkoZarejestrowane Parametr określający czy mają zostać zwrócone dane tylko pojazdów zarejestrowanych. Domyślną wartością jest, że tak.
     * @param pokazWszystkiePola Parametr określający czy mają zostać zwrócone wszystkie pola w zwróconych danych technicznych pojazdów. Domyślną wartością jest, że nie. Parametr ten jest ignorowany w przypadku podania jednocześnie parametru fields.
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko dane techniczne pojazdów określone podanymi atrybutami. Parametr jest opcjonalny.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @param sort Parametr mechanizmu sortowania. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Kolejność podanych atrybutów określa kolejność sortowania. Aby posortować w odwrotnej kolejności należy poprzedzić nazwę parametru znakiem minus. Parametr jest opcjonalny.
     * @return JsonApiForListVehicle
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getListaPojazdowRequestCreation(String wojewodztwo, String dataOd, String dataDo, String typDaty, Boolean tylkoZarejestrowane, Boolean pokazWszystkiePola, List<String> fields, String limit, String page, List<String> sort) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'wojewodztwo' is set
        if (wojewodztwo == null) {
            throw new WebClientResponseException("Missing the required parameter 'wojewodztwo' when calling getListaPojazdow", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dataOd' is set
        if (dataOd == null) {
            throw new WebClientResponseException("Missing the required parameter 'dataOd' when calling getListaPojazdow", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "wojewodztwo", wojewodztwo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "data-od", dataOd));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "data-do", dataDo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "typ-daty", typDaty));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tylko-zarejestrowane", tylkoZarejestrowane));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pokaz-wszystkie-pola", pokazWszystkiePola));
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

        ParameterizedTypeReference<JsonApiForListVehicle> localVarReturnType = new ParameterizedTypeReference<JsonApiForListVehicle>() {};
        return apiClient.invokeAPI("/pojazdy", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępniająca listę pojazdów z bazy CEPiK.   Metoda udostępnia mechanizm filtrowania w postaci parametru: **filter[\\&lt;nazwa atrybutu\\&gt;]&#x3D;\\&lt;szukana wartość\\&gt;**. Znakiem operacji filtrowania jest znak równości **\&quot;&#x3D;\&quot;**. Parametr może być podany wielokrotnie.  \\&lt;**nazwa atrybutu**\\&gt; powinna być prawidłową nazwą jednego z atrybutów zawartych w danych technicznych pojazdu. Parametr jest opcjonalny.   Przykładowe wykorzystania:   Pojazdy z województwa wielkopolskiego, zarejestrowane po raz I w Polsce w 2019r.        GET /pojazdy?wojewodztwo&#x3D;30&amp;data-od&#x3D;20190101&amp;data-do&#x3D;20191231      Pojazdy o modelu JUMPER z województwa mazowieckiego, zarejestrowane po raz I w Polsce między 2016-01-01 a 2018-12-01r.        GET /pojazdy?wojewodztwo&#x3D;14&amp;data-od&#x3D;20160101&amp;data-do&#x3D;20181201&amp;filter[model]&#x3D;JUMPER      Pojazdy z województwa dolnośląskiego, których data ostatniej rejestracji mieści się w przedziale 2018-01-01 - 2019-12-31r.        GET /pojazdy?wojewodztwo&#x3D;02&amp;data-od&#x3D;20180101&amp;data-do&#x3D;20191231&amp;typ-daty&#x3D;2      
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param wojewodztwo Kod teryt województwa, w którym zarejestrowane jest auto lub, w przypadku wyrejestrowanych aut, było ostatnio zarejestrowane. Parametr jest wymagany. Kody teryt znajdziesz w usłudze /słowniki.
     * @param dataOd Wymagany parametr daty podawany w formacie YYYYMMDD. Określa datę początkową okresu pierwszej lub ostatniej rejestracji w kraju (domyślnie pierwszej), dla którego zostaną udostępnione informacje o pojazdach.
     * @param dataDo Parametr daty podawany w formacie YYYYMMDD. Określa koniec okresu, dla którego pojazdy mają być zwrócone. Domyślną wartością jest data bieżąca. Maksymalny zakres dat to 2 lata.
     * @param typDaty Parametr określający jakiej daty dotyczy warunek wyszukiwania określony parametrami data-od i data-do.  W przypadku nie podania parametru, przyjęta zostanie wartość domyślna. 1 (domyślna wartość) - data pierwszej rejestracji pojazdu w Polsce, 2 - data ostatniej rejestracji pojazdu.
     * @param tylkoZarejestrowane Parametr określający czy mają zostać zwrócone dane tylko pojazdów zarejestrowanych. Domyślną wartością jest, że tak.
     * @param pokazWszystkiePola Parametr określający czy mają zostać zwrócone wszystkie pola w zwróconych danych technicznych pojazdów. Domyślną wartością jest, że nie. Parametr ten jest ignorowany w przypadku podania jednocześnie parametru fields.
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko dane techniczne pojazdów określone podanymi atrybutami. Parametr jest opcjonalny.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @param sort Parametr mechanizmu sortowania. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Kolejność podanych atrybutów określa kolejność sortowania. Aby posortować w odwrotnej kolejności należy poprzedzić nazwę parametru znakiem minus. Parametr jest opcjonalny.
     * @return JsonApiForListVehicle
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForListVehicle> getListaPojazdow(String wojewodztwo, String dataOd, String dataDo, String typDaty, Boolean tylkoZarejestrowane, Boolean pokazWszystkiePola, List<String> fields, String limit, String page, List<String> sort) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForListVehicle> localVarReturnType = new ParameterizedTypeReference<JsonApiForListVehicle>() {};
        return getListaPojazdowRequestCreation(wojewodztwo, dataOd, dataDo, typDaty, tylkoZarejestrowane, pokazWszystkiePola, fields, limit, page, sort).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępniająca listę pojazdów z bazy CEPiK.   Metoda udostępnia mechanizm filtrowania w postaci parametru: **filter[\\&lt;nazwa atrybutu\\&gt;]&#x3D;\\&lt;szukana wartość\\&gt;**. Znakiem operacji filtrowania jest znak równości **\&quot;&#x3D;\&quot;**. Parametr może być podany wielokrotnie.  \\&lt;**nazwa atrybutu**\\&gt; powinna być prawidłową nazwą jednego z atrybutów zawartych w danych technicznych pojazdu. Parametr jest opcjonalny.   Przykładowe wykorzystania:   Pojazdy z województwa wielkopolskiego, zarejestrowane po raz I w Polsce w 2019r.        GET /pojazdy?wojewodztwo&#x3D;30&amp;data-od&#x3D;20190101&amp;data-do&#x3D;20191231      Pojazdy o modelu JUMPER z województwa mazowieckiego, zarejestrowane po raz I w Polsce między 2016-01-01 a 2018-12-01r.        GET /pojazdy?wojewodztwo&#x3D;14&amp;data-od&#x3D;20160101&amp;data-do&#x3D;20181201&amp;filter[model]&#x3D;JUMPER      Pojazdy z województwa dolnośląskiego, których data ostatniej rejestracji mieści się w przedziale 2018-01-01 - 2019-12-31r.        GET /pojazdy?wojewodztwo&#x3D;02&amp;data-od&#x3D;20180101&amp;data-do&#x3D;20191231&amp;typ-daty&#x3D;2      
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param wojewodztwo Kod teryt województwa, w którym zarejestrowane jest auto lub, w przypadku wyrejestrowanych aut, było ostatnio zarejestrowane. Parametr jest wymagany. Kody teryt znajdziesz w usłudze /słowniki.
     * @param dataOd Wymagany parametr daty podawany w formacie YYYYMMDD. Określa datę początkową okresu pierwszej lub ostatniej rejestracji w kraju (domyślnie pierwszej), dla którego zostaną udostępnione informacje o pojazdach.
     * @param dataDo Parametr daty podawany w formacie YYYYMMDD. Określa koniec okresu, dla którego pojazdy mają być zwrócone. Domyślną wartością jest data bieżąca. Maksymalny zakres dat to 2 lata.
     * @param typDaty Parametr określający jakiej daty dotyczy warunek wyszukiwania określony parametrami data-od i data-do.  W przypadku nie podania parametru, przyjęta zostanie wartość domyślna. 1 (domyślna wartość) - data pierwszej rejestracji pojazdu w Polsce, 2 - data ostatniej rejestracji pojazdu.
     * @param tylkoZarejestrowane Parametr określający czy mają zostać zwrócone dane tylko pojazdów zarejestrowanych. Domyślną wartością jest, że tak.
     * @param pokazWszystkiePola Parametr określający czy mają zostać zwrócone wszystkie pola w zwróconych danych technicznych pojazdów. Domyślną wartością jest, że nie. Parametr ten jest ignorowany w przypadku podania jednocześnie parametru fields.
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko dane techniczne pojazdów określone podanymi atrybutami. Parametr jest opcjonalny.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @param sort Parametr mechanizmu sortowania. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Kolejność podanych atrybutów określa kolejność sortowania. Aby posortować w odwrotnej kolejności należy poprzedzić nazwę parametru znakiem minus. Parametr jest opcjonalny.
     * @return ResponseEntity&lt;JsonApiForListVehicle&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForListVehicle>> getListaPojazdowWithHttpInfo(String wojewodztwo, String dataOd, String dataDo, String typDaty, Boolean tylkoZarejestrowane, Boolean pokazWszystkiePola, List<String> fields, String limit, String page, List<String> sort) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForListVehicle> localVarReturnType = new ParameterizedTypeReference<JsonApiForListVehicle>() {};
        return getListaPojazdowRequestCreation(wojewodztwo, dataOd, dataDo, typDaty, tylkoZarejestrowane, pokazWszystkiePola, fields, limit, page, sort).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępniająca listę pojazdów z bazy CEPiK.   Metoda udostępnia mechanizm filtrowania w postaci parametru: **filter[\\&lt;nazwa atrybutu\\&gt;]&#x3D;\\&lt;szukana wartość\\&gt;**. Znakiem operacji filtrowania jest znak równości **\&quot;&#x3D;\&quot;**. Parametr może być podany wielokrotnie.  \\&lt;**nazwa atrybutu**\\&gt; powinna być prawidłową nazwą jednego z atrybutów zawartych w danych technicznych pojazdu. Parametr jest opcjonalny.   Przykładowe wykorzystania:   Pojazdy z województwa wielkopolskiego, zarejestrowane po raz I w Polsce w 2019r.        GET /pojazdy?wojewodztwo&#x3D;30&amp;data-od&#x3D;20190101&amp;data-do&#x3D;20191231      Pojazdy o modelu JUMPER z województwa mazowieckiego, zarejestrowane po raz I w Polsce między 2016-01-01 a 2018-12-01r.        GET /pojazdy?wojewodztwo&#x3D;14&amp;data-od&#x3D;20160101&amp;data-do&#x3D;20181201&amp;filter[model]&#x3D;JUMPER      Pojazdy z województwa dolnośląskiego, których data ostatniej rejestracji mieści się w przedziale 2018-01-01 - 2019-12-31r.        GET /pojazdy?wojewodztwo&#x3D;02&amp;data-od&#x3D;20180101&amp;data-do&#x3D;20191231&amp;typ-daty&#x3D;2      
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param wojewodztwo Kod teryt województwa, w którym zarejestrowane jest auto lub, w przypadku wyrejestrowanych aut, było ostatnio zarejestrowane. Parametr jest wymagany. Kody teryt znajdziesz w usłudze /słowniki.
     * @param dataOd Wymagany parametr daty podawany w formacie YYYYMMDD. Określa datę początkową okresu pierwszej lub ostatniej rejestracji w kraju (domyślnie pierwszej), dla którego zostaną udostępnione informacje o pojazdach.
     * @param dataDo Parametr daty podawany w formacie YYYYMMDD. Określa koniec okresu, dla którego pojazdy mają być zwrócone. Domyślną wartością jest data bieżąca. Maksymalny zakres dat to 2 lata.
     * @param typDaty Parametr określający jakiej daty dotyczy warunek wyszukiwania określony parametrami data-od i data-do.  W przypadku nie podania parametru, przyjęta zostanie wartość domyślna. 1 (domyślna wartość) - data pierwszej rejestracji pojazdu w Polsce, 2 - data ostatniej rejestracji pojazdu.
     * @param tylkoZarejestrowane Parametr określający czy mają zostać zwrócone dane tylko pojazdów zarejestrowanych. Domyślną wartością jest, że tak.
     * @param pokazWszystkiePola Parametr określający czy mają zostać zwrócone wszystkie pola w zwróconych danych technicznych pojazdów. Domyślną wartością jest, że nie. Parametr ten jest ignorowany w przypadku podania jednocześnie parametru fields.
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko dane techniczne pojazdów określone podanymi atrybutami. Parametr jest opcjonalny.
     * @param limit Parametr mechanizmu stronicowania określający ilość wyników na stronie. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 100, Maksymalna wartość → 500.
     * @param page Parametr mechanizmu stronicowania określający, którą stronę wyników chce pobrać użytkownik. Jest to dodatnia liczba całkowita podawana z kluczem parametru. Domyślna wartość → 1.
     * @param sort Parametr mechanizmu sortowania. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Kolejność podanych atrybutów określa kolejność sortowania. Aby posortować w odwrotnej kolejności należy poprzedzić nazwę parametru znakiem minus. Parametr jest opcjonalny.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getListaPojazdowWithResponseSpec(String wojewodztwo, String dataOd, String dataDo, String typDaty, Boolean tylkoZarejestrowane, Boolean pokazWszystkiePola, List<String> fields, String limit, String page, List<String> sort) throws WebClientResponseException {
        return getListaPojazdowRequestCreation(wojewodztwo, dataOd, dataDo, typDaty, tylkoZarejestrowane, pokazWszystkiePola, fields, limit, page, sort);
    }
    /**
     * 
     * Metoda udostępnia dane pojazdu z bazy CEPiK.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param id Identyfikator techniczny pojazdu. Jest to dodatnia liczba całkowita. Uwaga: nie jest to ani VIN, ani numer rejestracyjny.
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko dane techniczne pojazdów określone podanymi atrybutami. Parametr jest opcjonalny.
     * @return JsonApiForObjectVehicle
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPojazdRequestCreation(String id, List<String> fields) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getPojazd", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<JsonApiForObjectVehicle> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectVehicle>() {};
        return apiClient.invokeAPI("/pojazdy/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia dane pojazdu z bazy CEPiK.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param id Identyfikator techniczny pojazdu. Jest to dodatnia liczba całkowita. Uwaga: nie jest to ani VIN, ani numer rejestracyjny.
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko dane techniczne pojazdów określone podanymi atrybutami. Parametr jest opcjonalny.
     * @return JsonApiForObjectVehicle
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<JsonApiForObjectVehicle> getPojazd(String id, List<String> fields) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectVehicle> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectVehicle>() {};
        return getPojazdRequestCreation(id, fields).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia dane pojazdu z bazy CEPiK.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param id Identyfikator techniczny pojazdu. Jest to dodatnia liczba całkowita. Uwaga: nie jest to ani VIN, ani numer rejestracyjny.
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko dane techniczne pojazdów określone podanymi atrybutami. Parametr jest opcjonalny.
     * @return ResponseEntity&lt;JsonApiForObjectVehicle&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<JsonApiForObjectVehicle>> getPojazdWithHttpInfo(String id, List<String> fields) throws WebClientResponseException {
        ParameterizedTypeReference<JsonApiForObjectVehicle> localVarReturnType = new ParameterizedTypeReference<JsonApiForObjectVehicle>() {};
        return getPojazdRequestCreation(id, fields).toEntity(localVarReturnType);
    }

    /**
     * 
     * Metoda udostępnia dane pojazdu z bazy CEPiK.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param id Identyfikator techniczny pojazdu. Jest to dodatnia liczba całkowita. Uwaga: nie jest to ani VIN, ani numer rejestracyjny.
     * @param fields Parametr mechanizmu wyboru pól. Jako wartość przyjmuje nazwy atrybutów rozdzielone przecinkiem. Usługa zwróci tylko dane techniczne pojazdów określone podanymi atrybutami. Parametr jest opcjonalny.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPojazdWithResponseSpec(String id, List<String> fields) throws WebClientResponseException {
        return getPojazdRequestCreation(id, fields);
    }
}
