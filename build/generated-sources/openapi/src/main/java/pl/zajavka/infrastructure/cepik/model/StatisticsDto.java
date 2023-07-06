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
 * Metoda udostępnia listę dostępnych statystyk danego zasobu
 */
@ApiModel(description = "Metoda udostępnia listę dostępnych statystyk danego zasobu")
@JsonPropertyOrder({
  StatisticsDto.JSON_PROPERTY_DATA,
  StatisticsDto.JSON_PROPERTY_NAZWA,
  StatisticsDto.JSON_PROPERTY_LICZBA_ODSLON,
  StatisticsDto.JSON_PROPERTY_LICZBA_WIZYT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-05T22:58:19.118382400+02:00[Europe/Warsaw]")
public class StatisticsDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private String data;

  public static final String JSON_PROPERTY_NAZWA = "nazwa";
  private String nazwa;

  public static final String JSON_PROPERTY_LICZBA_ODSLON = "liczba-odslon";
  private String liczbaOdslon;

  public static final String JSON_PROPERTY_LICZBA_WIZYT = "liczba-wizyt";
  private String liczbaWizyt;

  public StatisticsDto() {
  }

  public StatisticsDto data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * Data statystyki.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data statystyki.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(String data) {
    this.data = data;
  }


  public StatisticsDto nazwa(String nazwa) {
    
    this.nazwa = nazwa;
    return this;
  }

   /**
   * Nazwa zasobu, którego dotyczą statystyki
   * @return nazwa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nazwa zasobu, którego dotyczą statystyki")
  @JsonProperty(JSON_PROPERTY_NAZWA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNazwa() {
    return nazwa;
  }


  @JsonProperty(JSON_PROPERTY_NAZWA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }


  public StatisticsDto liczbaOdslon(String liczbaOdslon) {
    
    this.liczbaOdslon = liczbaOdslon;
    return this;
  }

   /**
   * Liczba wszystkich wywołań zasobu
   * @return liczbaOdslon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Liczba wszystkich wywołań zasobu")
  @JsonProperty(JSON_PROPERTY_LICZBA_ODSLON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLiczbaOdslon() {
    return liczbaOdslon;
  }


  @JsonProperty(JSON_PROPERTY_LICZBA_ODSLON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLiczbaOdslon(String liczbaOdslon) {
    this.liczbaOdslon = liczbaOdslon;
  }


  public StatisticsDto liczbaWizyt(String liczbaWizyt) {
    
    this.liczbaWizyt = liczbaWizyt;
    return this;
  }

   /**
   * Liczba unikalnych wywołań zasobu
   * @return liczbaWizyt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Liczba unikalnych wywołań zasobu")
  @JsonProperty(JSON_PROPERTY_LICZBA_WIZYT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLiczbaWizyt() {
    return liczbaWizyt;
  }


  @JsonProperty(JSON_PROPERTY_LICZBA_WIZYT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLiczbaWizyt(String liczbaWizyt) {
    this.liczbaWizyt = liczbaWizyt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticsDto statisticsDto = (StatisticsDto) o;
    return Objects.equals(this.data, statisticsDto.data) &&
        Objects.equals(this.nazwa, statisticsDto.nazwa) &&
        Objects.equals(this.liczbaOdslon, statisticsDto.liczbaOdslon) &&
        Objects.equals(this.liczbaWizyt, statisticsDto.liczbaWizyt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, nazwa, liczbaOdslon, liczbaWizyt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsDto {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    nazwa: ").append(toIndentedString(nazwa)).append("\n");
    sb.append("    liczbaOdslon: ").append(toIndentedString(liczbaOdslon)).append("\n");
    sb.append("    liczbaWizyt: ").append(toIndentedString(liczbaWizyt)).append("\n");
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
