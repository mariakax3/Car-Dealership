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
 * Linki nawigujące HATEOS.
 */
@ApiModel(description = "Linki nawigujące HATEOS.")
@JsonPropertyOrder({
  ApiLinksOneDto.JSON_PROPERTY_SELF
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-05T22:58:19.118382400+02:00[Europe/Warsaw]")
public class ApiLinksOneDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SELF = "self";
  private String self;

  public ApiLinksOneDto() {
  }

  public ApiLinksOneDto self(String self) {
    
    this.self = self;
    return this;
  }

   /**
   * Link prowadzący do danych zasobu.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link prowadzący do danych zasobu.")
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSelf() {
    return self;
  }


  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelf(String self) {
    this.self = self;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiLinksOneDto apiLinksOneDto = (ApiLinksOneDto) o;
    return Objects.equals(this.self, apiLinksOneDto.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiLinksOneDto {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

