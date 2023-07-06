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
 * Statystyki wywołań metody /pojazdy
 */
@ApiModel(description = "Statystyki wywołań metody /pojazdy")
@JsonPropertyOrder({
  StatisticsVehicleDto.JSON_PROPERTY_DATA_STATYSTYKI,
  StatisticsVehicleDto.JSON_PROPERTY_NAZWA_WOJEWODZTWA,
  StatisticsVehicleDto.JSON_PROPERTY_ILOSC_WYSZUKAN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-05T22:58:19.118382400+02:00[Europe/Warsaw]")
public class StatisticsVehicleDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA_STATYSTYKI = "data-statystyki";
  private String dataStatystyki;

  public static final String JSON_PROPERTY_NAZWA_WOJEWODZTWA = "nazwa-wojewodztwa";
  private String nazwaWojewodztwa;

  public static final String JSON_PROPERTY_ILOSC_WYSZUKAN = "ilosc-wyszukan";
  private String iloscWyszukan;

  public StatisticsVehicleDto() {
  }

  public StatisticsVehicleDto dataStatystyki(String dataStatystyki) {
    
    this.dataStatystyki = dataStatystyki;
    return this;
  }

   /**
   * Data statystyki.
   * @return dataStatystyki
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data statystyki.")
  @JsonProperty(JSON_PROPERTY_DATA_STATYSTYKI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataStatystyki() {
    return dataStatystyki;
  }


  @JsonProperty(JSON_PROPERTY_DATA_STATYSTYKI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataStatystyki(String dataStatystyki) {
    this.dataStatystyki = dataStatystyki;
  }


  public StatisticsVehicleDto nazwaWojewodztwa(String nazwaWojewodztwa) {
    
    this.nazwaWojewodztwa = nazwaWojewodztwa;
    return this;
  }

   /**
   * Nazwa województwa będącego województwem rejestracji pojazdu.
   * @return nazwaWojewodztwa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nazwa województwa będącego województwem rejestracji pojazdu.")
  @JsonProperty(JSON_PROPERTY_NAZWA_WOJEWODZTWA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNazwaWojewodztwa() {
    return nazwaWojewodztwa;
  }


  @JsonProperty(JSON_PROPERTY_NAZWA_WOJEWODZTWA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNazwaWojewodztwa(String nazwaWojewodztwa) {
    this.nazwaWojewodztwa = nazwaWojewodztwa;
  }


  public StatisticsVehicleDto iloscWyszukan(String iloscWyszukan) {
    
    this.iloscWyszukan = iloscWyszukan;
    return this;
  }

   /**
   * Liczba wszystkich wywołań metody /pojazdy.
   * @return iloscWyszukan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Liczba wszystkich wywołań metody /pojazdy.")
  @JsonProperty(JSON_PROPERTY_ILOSC_WYSZUKAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIloscWyszukan() {
    return iloscWyszukan;
  }


  @JsonProperty(JSON_PROPERTY_ILOSC_WYSZUKAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIloscWyszukan(String iloscWyszukan) {
    this.iloscWyszukan = iloscWyszukan;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticsVehicleDto statisticsVehicleDto = (StatisticsVehicleDto) o;
    return Objects.equals(this.dataStatystyki, statisticsVehicleDto.dataStatystyki) &&
        Objects.equals(this.nazwaWojewodztwa, statisticsVehicleDto.nazwaWojewodztwa) &&
        Objects.equals(this.iloscWyszukan, statisticsVehicleDto.iloscWyszukan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataStatystyki, nazwaWojewodztwa, iloscWyszukan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsVehicleDto {\n");
    sb.append("    dataStatystyki: ").append(toIndentedString(dataStatystyki)).append("\n");
    sb.append("    nazwaWojewodztwa: ").append(toIndentedString(nazwaWojewodztwa)).append("\n");
    sb.append("    iloscWyszukan: ").append(toIndentedString(iloscWyszukan)).append("\n");
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

