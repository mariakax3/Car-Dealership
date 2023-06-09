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


package pl.zajavka.infrastructure.cepik.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Dane udostępnianego pliku.
 */
@ApiModel(description = "Dane udostępnianego pliku.")
@JsonPropertyOrder({
  FileDto.JSON_PROPERTY_URL_DO_PLIKU,
  FileDto.JSON_PROPERTY_URL_DO_METADANYCH_PLIKU,
  FileDto.JSON_PROPERTY_OPIS_ZAWARTOSCI,
  FileDto.JSON_PROPERTY_OPIS_FORMATU_PLIKU,
  FileDto.JSON_PROPERTY_TYP_ZASOBU_BEDACEGO_ZAWARTOSCIA,
  FileDto.JSON_PROPERTY_DATA_UTWORZENIA_PLIKU
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-05T22:58:19.118382400+02:00[Europe/Warsaw]")
public class FileDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_URL_DO_PLIKU = "url-do-pliku";
  private String urlDoPliku;

  public static final String JSON_PROPERTY_URL_DO_METADANYCH_PLIKU = "url-do-metadanych-pliku";
  private String urlDoMetadanychPliku;

  public static final String JSON_PROPERTY_OPIS_ZAWARTOSCI = "opis-zawartosci";
  private String opisZawartosci;

  public static final String JSON_PROPERTY_OPIS_FORMATU_PLIKU = "opis-formatu-pliku";
  private String opisFormatuPliku;

  public static final String JSON_PROPERTY_TYP_ZASOBU_BEDACEGO_ZAWARTOSCIA = "typ-zasobu-bedacego-zawartoscia";
  private String typZasobuBedacegoZawartoscia;

  public static final String JSON_PROPERTY_DATA_UTWORZENIA_PLIKU = "data-utworzenia-pliku";
  private String dataUtworzeniaPliku;

  public FileDto() {
  }

  public FileDto urlDoPliku(String urlDoPliku) {
    
    this.urlDoPliku = urlDoPliku;
    return this;
  }

   /**
   * Link do pliku zawierającego określoną listę rekordów zasobów.
   * @return urlDoPliku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link do pliku zawierającego określoną listę rekordów zasobów.")
  @JsonProperty(JSON_PROPERTY_URL_DO_PLIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrlDoPliku() {
    return urlDoPliku;
  }


  @JsonProperty(JSON_PROPERTY_URL_DO_PLIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlDoPliku(String urlDoPliku) {
    this.urlDoPliku = urlDoPliku;
  }


  public FileDto urlDoMetadanychPliku(String urlDoMetadanychPliku) {
    
    this.urlDoMetadanychPliku = urlDoMetadanychPliku;
    return this;
  }

   /**
   * Link do metadanych opisujących wewnętrzną strukturę pliku.
   * @return urlDoMetadanychPliku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link do metadanych opisujących wewnętrzną strukturę pliku.")
  @JsonProperty(JSON_PROPERTY_URL_DO_METADANYCH_PLIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrlDoMetadanychPliku() {
    return urlDoMetadanychPliku;
  }


  @JsonProperty(JSON_PROPERTY_URL_DO_METADANYCH_PLIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlDoMetadanychPliku(String urlDoMetadanychPliku) {
    this.urlDoMetadanychPliku = urlDoMetadanychPliku;
  }


  public FileDto opisZawartosci(String opisZawartosci) {
    
    this.opisZawartosci = opisZawartosci;
    return this;
  }

   /**
   * Informacje o zawartości pliku.
   * @return opisZawartosci
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Informacje o zawartości pliku.")
  @JsonProperty(JSON_PROPERTY_OPIS_ZAWARTOSCI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOpisZawartosci() {
    return opisZawartosci;
  }


  @JsonProperty(JSON_PROPERTY_OPIS_ZAWARTOSCI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpisZawartosci(String opisZawartosci) {
    this.opisZawartosci = opisZawartosci;
  }


  public FileDto opisFormatuPliku(String opisFormatuPliku) {
    
    this.opisFormatuPliku = opisFormatuPliku;
    return this;
  }

   /**
   * Informacje o formacie pliku.
   * @return opisFormatuPliku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Informacje o formacie pliku.")
  @JsonProperty(JSON_PROPERTY_OPIS_FORMATU_PLIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOpisFormatuPliku() {
    return opisFormatuPliku;
  }


  @JsonProperty(JSON_PROPERTY_OPIS_FORMATU_PLIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpisFormatuPliku(String opisFormatuPliku) {
    this.opisFormatuPliku = opisFormatuPliku;
  }


  public FileDto typZasobuBedacegoZawartoscia(String typZasobuBedacegoZawartoscia) {
    
    this.typZasobuBedacegoZawartoscia = typZasobuBedacegoZawartoscia;
    return this;
  }

   /**
   * Informacja jaki zasób zawiera plik, np. pojazdy.
   * @return typZasobuBedacegoZawartoscia
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Informacja jaki zasób zawiera plik, np. pojazdy.")
  @JsonProperty(JSON_PROPERTY_TYP_ZASOBU_BEDACEGO_ZAWARTOSCIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypZasobuBedacegoZawartoscia() {
    return typZasobuBedacegoZawartoscia;
  }


  @JsonProperty(JSON_PROPERTY_TYP_ZASOBU_BEDACEGO_ZAWARTOSCIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypZasobuBedacegoZawartoscia(String typZasobuBedacegoZawartoscia) {
    this.typZasobuBedacegoZawartoscia = typZasobuBedacegoZawartoscia;
  }


  public FileDto dataUtworzeniaPliku(String dataUtworzeniaPliku) {
    
    this.dataUtworzeniaPliku = dataUtworzeniaPliku;
    return this;
  }

   /**
   * Data utworzenia pliku.
   * @return dataUtworzeniaPliku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data utworzenia pliku.")
  @JsonProperty(JSON_PROPERTY_DATA_UTWORZENIA_PLIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataUtworzeniaPliku() {
    return dataUtworzeniaPliku;
  }


  @JsonProperty(JSON_PROPERTY_DATA_UTWORZENIA_PLIKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataUtworzeniaPliku(String dataUtworzeniaPliku) {
    this.dataUtworzeniaPliku = dataUtworzeniaPliku;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileDto fileDto = (FileDto) o;
    return Objects.equals(this.urlDoPliku, fileDto.urlDoPliku) &&
        Objects.equals(this.urlDoMetadanychPliku, fileDto.urlDoMetadanychPliku) &&
        Objects.equals(this.opisZawartosci, fileDto.opisZawartosci) &&
        Objects.equals(this.opisFormatuPliku, fileDto.opisFormatuPliku) &&
        Objects.equals(this.typZasobuBedacegoZawartoscia, fileDto.typZasobuBedacegoZawartoscia) &&
        Objects.equals(this.dataUtworzeniaPliku, fileDto.dataUtworzeniaPliku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlDoPliku, urlDoMetadanychPliku, opisZawartosci, opisFormatuPliku, typZasobuBedacegoZawartoscia, dataUtworzeniaPliku);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileDto {\n");
    sb.append("    urlDoPliku: ").append(toIndentedString(urlDoPliku)).append("\n");
    sb.append("    urlDoMetadanychPliku: ").append(toIndentedString(urlDoMetadanychPliku)).append("\n");
    sb.append("    opisZawartosci: ").append(toIndentedString(opisZawartosci)).append("\n");
    sb.append("    opisFormatuPliku: ").append(toIndentedString(opisFormatuPliku)).append("\n");
    sb.append("    typZasobuBedacegoZawartoscia: ").append(toIndentedString(typZasobuBedacegoZawartoscia)).append("\n");
    sb.append("    dataUtworzeniaPliku: ").append(toIndentedString(dataUtworzeniaPliku)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

