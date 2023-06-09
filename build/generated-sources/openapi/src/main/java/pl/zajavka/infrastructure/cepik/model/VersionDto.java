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
 * Szczegóły dotyczące wersji API.
 */
@ApiModel(description = "Szczegóły dotyczące wersji API.")
@JsonPropertyOrder({
  VersionDto.JSON_PROPERTY_DATE_MOD,
  VersionDto.JSON_PROPERTY_DEPRECATED,
  VersionDto.JSON_PROPERTY_MAJOR,
  VersionDto.JSON_PROPERTY_MINOR,
  VersionDto.JSON_PROPERTY_PATCH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-05T22:58:19.118382400+02:00[Europe/Warsaw]")
public class VersionDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATE_MOD = "dateMod";
  private String dateMod;

  public static final String JSON_PROPERTY_DEPRECATED = "deprecated";
  private String deprecated;

  public static final String JSON_PROPERTY_MAJOR = "major";
  private String major;

  public static final String JSON_PROPERTY_MINOR = "minor";
  private String minor;

  public static final String JSON_PROPERTY_PATCH = "patch";
  private String patch;

  public VersionDto() {
  }

  public VersionDto dateMod(String dateMod) {
    
    this.dateMod = dateMod;
    return this;
  }

   /**
   * Data ostatniej modyfikacji wersji.
   * @return dateMod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data ostatniej modyfikacji wersji.")
  @JsonProperty(JSON_PROPERTY_DATE_MOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateMod() {
    return dateMod;
  }


  @JsonProperty(JSON_PROPERTY_DATE_MOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateMod(String dateMod) {
    this.dateMod = dateMod;
  }


  public VersionDto deprecated(String deprecated) {
    
    this.deprecated = deprecated;
    return this;
  }

   /**
   * Data zakończenia wsparcia wersji.
   * @return deprecated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data zakończenia wsparcia wersji.")
  @JsonProperty(JSON_PROPERTY_DEPRECATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeprecated() {
    return deprecated;
  }


  @JsonProperty(JSON_PROPERTY_DEPRECATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeprecated(String deprecated) {
    this.deprecated = deprecated;
  }


  public VersionDto major(String major) {
    
    this.major = major;
    return this;
  }

   /**
   * Numer wersji Major.
   * @return major
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Numer wersji Major.")
  @JsonProperty(JSON_PROPERTY_MAJOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMajor() {
    return major;
  }


  @JsonProperty(JSON_PROPERTY_MAJOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMajor(String major) {
    this.major = major;
  }


  public VersionDto minor(String minor) {
    
    this.minor = minor;
    return this;
  }

   /**
   * Numer wersji Minor.
   * @return minor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Numer wersji Minor.")
  @JsonProperty(JSON_PROPERTY_MINOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMinor() {
    return minor;
  }


  @JsonProperty(JSON_PROPERTY_MINOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinor(String minor) {
    this.minor = minor;
  }


  public VersionDto patch(String patch) {
    
    this.patch = patch;
    return this;
  }

   /**
   * Numer wersji Patch.
   * @return patch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Numer wersji Patch.")
  @JsonProperty(JSON_PROPERTY_PATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPatch() {
    return patch;
  }


  @JsonProperty(JSON_PROPERTY_PATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPatch(String patch) {
    this.patch = patch;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionDto versionDto = (VersionDto) o;
    return Objects.equals(this.dateMod, versionDto.dateMod) &&
        Objects.equals(this.deprecated, versionDto.deprecated) &&
        Objects.equals(this.major, versionDto.major) &&
        Objects.equals(this.minor, versionDto.minor) &&
        Objects.equals(this.patch, versionDto.patch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateMod, deprecated, major, minor, patch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionDto {\n");
    sb.append("    dateMod: ").append(toIndentedString(dateMod)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
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

