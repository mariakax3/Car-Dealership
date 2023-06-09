/*
 * Dokumentacja API do CEPiK (version: beta)
 * Niniejsza dokumentacja zawiera opis wszystkich dostępnych metod w API, ich parametrów wejściowych i komunikatów wyjściowych.  Jeżeli masz trudności w korzystaniu z tej dokumentacji, np. jesteś osobą z niepełnosprawnością, otwórz https://api.cepik.gov.pl/swagger/apicepik.json w ulubionym narzędziu obsługującym dokumentację w standardzie OpenAPI.
 *
 * The version of the OpenAPI document: 1.1.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package pl.zajavka.infrastructure.cepik.api;

import pl.zajavka.infrastructure.cepik.model.Error;
import pl.zajavka.infrastructure.cepik.model.JsonApiForListDrivingPermission;
import pl.zajavka.infrastructure.cepik.model.JsonApiForObjectDrivingPermission;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for UprawnieniaDoKierowaniaPojazdamiApi
 */
@Ignore
public class UprawnieniaDoKierowaniaPojazdamiApiTest {

    private final UprawnieniaDoKierowaniaPojazdamiApi api = new UprawnieniaDoKierowaniaPojazdamiApi();

    
    /**
     * 
     *
     * Metoda udostępniająca miesięczne statystyki ilości nadanych uprawnień do kierowania pojazdami grupom kierowców.   Metoda udostępnia mechanizm filtrowania w postaci parametru: **filter[\\&lt;nazwa atrybutu\\&gt;]&#x3D;\\&lt;szukana wartość\\&gt;**. Znakiem operacji filtrowania jest znak równości **\&quot;&#x3D;\&quot;**. Parametr może być podany wielokrotnie.  \\&lt;**nazwa atrybutu**\\&gt; powinna być prawidłową nazwą jednego z atrybutów zawartych w danych statystyki. Parametr jest opcjonalny.   Przykładowe wykorzystania:   Statystyki z województwa wielkopolskiego - ilość nadanych mężczyznom uprawnień do kierowania pojazdami o kategorii B.        GET /uprawnienia?filter[plec]&#x3D;M&amp;filter[wojewodztwo-kod]&#x3D;30&amp;filter[kod-uprawnienia]&#x3D;B      
     */
    @Test
    public void getListaUprawnienTest()  {
        List<String> fields = null;
        String limit = null;
        String page = null;
        List<String> sort = null;
        JsonApiForListDrivingPermission response = api.getListaUprawnien(fields, limit, page, sort).block();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Metoda udostępnia informację o ilości nadanych uprawnień do kierowania pojazdami w zadanym miesiącu, kierowcom o określonych cechach.
     */
    @Test
    public void getUprawnieniaTest()  {
        String id = null;
        List<String> fields = null;
        JsonApiForObjectDrivingPermission response = api.getUprawnienia(id, fields).block();

        // TODO: test validations
    }
    
}
