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
 * Dane miesięcznej statystyki wydań praw jazdy.
 */
@ApiModel(description = "Dane miesięcznej statystyki wydań praw jazdy.")
@JsonPropertyOrder({
  DrivingLicenseDto.JSON_PROPERTY_DATA_STATYSTYKI,
  DrivingLicenseDto.JSON_PROPERTY_WOJEWODZTWO_KOD,
  DrivingLicenseDto.JSON_PROPERTY_WOJEWODZTWO_NAZWA,
  DrivingLicenseDto.JSON_PROPERTY_PLEC,
  DrivingLicenseDto.JSON_PROPERTY_WIEK,
  DrivingLicenseDto.JSON_PROPERTY_ILOSC
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-05T22:58:19.118382400+02:00[Europe/Warsaw]")
public class DrivingLicenseDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA_STATYSTYKI = "data-statystyki";
  private String dataStatystyki;

  public static final String JSON_PROPERTY_WOJEWODZTWO_KOD = "wojewodztwo-kod";
  private String wojewodztwoKod;

  public static final String JSON_PROPERTY_WOJEWODZTWO_NAZWA = "wojewodztwo-nazwa";
  private String wojewodztwoNazwa;

  public static final String JSON_PROPERTY_PLEC = "plec";
  private String plec;

  public static final String JSON_PROPERTY_WIEK = "wiek";
  private Integer wiek;

  public static final String JSON_PROPERTY_ILOSC = "ilosc";
  private Integer ilosc;

  public DrivingLicenseDto() {
  }

  public DrivingLicenseDto dataStatystyki(String dataStatystyki) {
    
    this.dataStatystyki = dataStatystyki;
    return this;
  }

   /**
   * Data statystyki w formacie YYYY-MM. Określenie miesiąca, ze który zebrano informacje o wydanych prawach jazdy.
   * @return dataStatystyki
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data statystyki w formacie YYYY-MM. Określenie miesiąca, ze który zebrano informacje o wydanych prawach jazdy.")
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


  public DrivingLicenseDto wojewodztwoKod(String wojewodztwoKod) {
    
    this.wojewodztwoKod = wojewodztwoKod;
    return this;
  }

   /**
   * Kod TERYT województwa, którego dane dotyczą.
   * @return wojewodztwoKod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kod TERYT województwa, którego dane dotyczą.")
  @JsonProperty(JSON_PROPERTY_WOJEWODZTWO_KOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWojewodztwoKod() {
    return wojewodztwoKod;
  }


  @JsonProperty(JSON_PROPERTY_WOJEWODZTWO_KOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWojewodztwoKod(String wojewodztwoKod) {
    this.wojewodztwoKod = wojewodztwoKod;
  }


  public DrivingLicenseDto wojewodztwoNazwa(String wojewodztwoNazwa) {
    
    this.wojewodztwoNazwa = wojewodztwoNazwa;
    return this;
  }

   /**
   * Nazwa województwa, którego dane dotyczą.
   * @return wojewodztwoNazwa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nazwa województwa, którego dane dotyczą.")
  @JsonProperty(JSON_PROPERTY_WOJEWODZTWO_NAZWA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWojewodztwoNazwa() {
    return wojewodztwoNazwa;
  }


  @JsonProperty(JSON_PROPERTY_WOJEWODZTWO_NAZWA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWojewodztwoNazwa(String wojewodztwoNazwa) {
    this.wojewodztwoNazwa = wojewodztwoNazwa;
  }


  public DrivingLicenseDto plec(String plec) {
    
    this.plec = plec;
    return this;
  }

   /**
   * Płeć kierowcy. K - kobieta, M - mężczyzna
   * @return plec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Płeć kierowcy. K - kobieta, M - mężczyzna")
  @JsonProperty(JSON_PROPERTY_PLEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlec() {
    return plec;
  }


  @JsonProperty(JSON_PROPERTY_PLEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlec(String plec) {
    this.plec = plec;
  }


  public DrivingLicenseDto wiek(Integer wiek) {
    
    this.wiek = wiek;
    return this;
  }

   /**
   * Wiek kierowcy wyrażony w latach
   * @return wiek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Wiek kierowcy wyrażony w latach")
  @JsonProperty(JSON_PROPERTY_WIEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWiek() {
    return wiek;
  }


  @JsonProperty(JSON_PROPERTY_WIEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWiek(Integer wiek) {
    this.wiek = wiek;
  }


  public DrivingLicenseDto ilosc(Integer ilosc) {
    
    this.ilosc = ilosc;
    return this;
  }

   /**
   * Ilość wydanych praw jazdy
   * @return ilosc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ilość wydanych praw jazdy")
  @JsonProperty(JSON_PROPERTY_ILOSC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIlosc() {
    return ilosc;
  }


  @JsonProperty(JSON_PROPERTY_ILOSC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIlosc(Integer ilosc) {
    this.ilosc = ilosc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrivingLicenseDto drivingLicenseDto = (DrivingLicenseDto) o;
    return Objects.equals(this.dataStatystyki, drivingLicenseDto.dataStatystyki) &&
        Objects.equals(this.wojewodztwoKod, drivingLicenseDto.wojewodztwoKod) &&
        Objects.equals(this.wojewodztwoNazwa, drivingLicenseDto.wojewodztwoNazwa) &&
        Objects.equals(this.plec, drivingLicenseDto.plec) &&
        Objects.equals(this.wiek, drivingLicenseDto.wiek) &&
        Objects.equals(this.ilosc, drivingLicenseDto.ilosc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataStatystyki, wojewodztwoKod, wojewodztwoNazwa, plec, wiek, ilosc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrivingLicenseDto {\n");
    sb.append("    dataStatystyki: ").append(toIndentedString(dataStatystyki)).append("\n");
    sb.append("    wojewodztwoKod: ").append(toIndentedString(wojewodztwoKod)).append("\n");
    sb.append("    wojewodztwoNazwa: ").append(toIndentedString(wojewodztwoNazwa)).append("\n");
    sb.append("    plec: ").append(toIndentedString(plec)).append("\n");
    sb.append("    wiek: ").append(toIndentedString(wiek)).append("\n");
    sb.append("    ilosc: ").append(toIndentedString(ilosc)).append("\n");
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

