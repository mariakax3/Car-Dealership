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
import java.util.UUID;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Szczegóły błędu prezentowane w przypadku nieprawidłowego wykonania operacji.
 */
@ApiModel(description = "Szczegóły błędu prezentowane w przypadku nieprawidłowego wykonania operacji.")
@JsonPropertyOrder({
  Error.JSON_PROPERTY_ID,
  Error.JSON_PROPERTY_ERRORR_RESULT,
  Error.JSON_PROPERTY_ERRORR_REASON,
  Error.JSON_PROPERTY_ERRORR_SOLUTION,
  Error.JSON_PROPERTY_ERROR_HELP,
  Error.JSON_PROPERTY_ERROR_CODE
})
@JsonTypeName("error")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-05T22:58:19.118382400+02:00[Europe/Warsaw]")
public class Error implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ERRORR_RESULT = "errorr-result";
  private String errorrResult;

  public static final String JSON_PROPERTY_ERRORR_REASON = "errorr-reason";
  private String errorrReason;

  public static final String JSON_PROPERTY_ERRORR_SOLUTION = "errorr-solution";
  private String errorrSolution;

  public static final String JSON_PROPERTY_ERROR_HELP = "error-help";
  private String errorHelp;

  public static final String JSON_PROPERTY_ERROR_CODE = "error-code";
  private String errorCode;

  public Error() {
  }

  public Error id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unikalny identyfikator zdarzenia.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unikalny identyfikator zdarzenia.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public Error errorrResult(String errorrResult) {
    
    this.errorrResult = errorrResult;
    return this;
  }

   /**
   * Rezultat błędu.
   * @return errorrResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rezultat błędu.")
  @JsonProperty(JSON_PROPERTY_ERRORR_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorrResult() {
    return errorrResult;
  }


  @JsonProperty(JSON_PROPERTY_ERRORR_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorrResult(String errorrResult) {
    this.errorrResult = errorrResult;
  }


  public Error errorrReason(String errorrReason) {
    
    this.errorrReason = errorrReason;
    return this;
  }

   /**
   * Powód błędu.
   * @return errorrReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Powód błędu.")
  @JsonProperty(JSON_PROPERTY_ERRORR_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorrReason() {
    return errorrReason;
  }


  @JsonProperty(JSON_PROPERTY_ERRORR_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorrReason(String errorrReason) {
    this.errorrReason = errorrReason;
  }


  public Error errorrSolution(String errorrSolution) {
    
    this.errorrSolution = errorrSolution;
    return this;
  }

   /**
   * Rozwiązanie błędu.
   * @return errorrSolution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rozwiązanie błędu.")
  @JsonProperty(JSON_PROPERTY_ERRORR_SOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorrSolution() {
    return errorrSolution;
  }


  @JsonProperty(JSON_PROPERTY_ERRORR_SOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorrSolution(String errorrSolution) {
    this.errorrSolution = errorrSolution;
  }


  public Error errorHelp(String errorHelp) {
    
    this.errorHelp = errorHelp;
    return this;
  }

   /**
   * Link do pomocy i szczegółów.
   * @return errorHelp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link do pomocy i szczegółów.")
  @JsonProperty(JSON_PROPERTY_ERROR_HELP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorHelp() {
    return errorHelp;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_HELP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorHelp(String errorHelp) {
    this.errorHelp = errorHelp;
  }


  public Error errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Kod błędu.
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kod błędu.")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.id, error.id) &&
        Objects.equals(this.errorrResult, error.errorrResult) &&
        Objects.equals(this.errorrReason, error.errorrReason) &&
        Objects.equals(this.errorrSolution, error.errorrSolution) &&
        Objects.equals(this.errorHelp, error.errorHelp) &&
        Objects.equals(this.errorCode, error.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, errorrResult, errorrReason, errorrSolution, errorHelp, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    errorrResult: ").append(toIndentedString(errorrResult)).append("\n");
    sb.append("    errorrReason: ").append(toIndentedString(errorrReason)).append("\n");
    sb.append("    errorrSolution: ").append(toIndentedString(errorrSolution)).append("\n");
    sb.append("    errorHelp: ").append(toIndentedString(errorHelp)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

