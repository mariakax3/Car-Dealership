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
import pl.zajavka.infrastructure.cepik.model.ApiLinksOneDto;
import pl.zajavka.infrastructure.cepik.model.StatisticsActivityHourlyDto;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Model sekcji atrybutów odpowiedzi API zgodnej ze standardem JSON API.
 */
@ApiModel(description = "Model sekcji atrybutów odpowiedzi API zgodnej ze standardem JSON API.")
@JsonPropertyOrder({
  ApiAttributesDtoStatisticsActivityHourly.JSON_PROPERTY_ATTRIBUTES,
  ApiAttributesDtoStatisticsActivityHourly.JSON_PROPERTY_ID,
  ApiAttributesDtoStatisticsActivityHourly.JSON_PROPERTY_LINKS,
  ApiAttributesDtoStatisticsActivityHourly.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-05T22:58:19.118382400+02:00[Europe/Warsaw]")
public class ApiAttributesDtoStatisticsActivityHourly implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private StatisticsActivityHourlyDto attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LINKS = "links";
  private ApiLinksOneDto links;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public ApiAttributesDtoStatisticsActivityHourly() {
  }

  public ApiAttributesDtoStatisticsActivityHourly attributes(StatisticsActivityHourlyDto attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatisticsActivityHourlyDto getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(StatisticsActivityHourlyDto attributes) {
    this.attributes = attributes;
  }


  public ApiAttributesDtoStatisticsActivityHourly id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unikalny identyfikator.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unikalny identyfikator.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public ApiAttributesDtoStatisticsActivityHourly links(ApiLinksOneDto links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiLinksOneDto getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(ApiLinksOneDto links) {
    this.links = links;
  }


  public ApiAttributesDtoStatisticsActivityHourly type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Typ zasobu.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typ zasobu.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAttributesDtoStatisticsActivityHourly apiAttributesDtoStatisticsActivityHourly = (ApiAttributesDtoStatisticsActivityHourly) o;
    return Objects.equals(this.attributes, apiAttributesDtoStatisticsActivityHourly.attributes) &&
        Objects.equals(this.id, apiAttributesDtoStatisticsActivityHourly.id) &&
        Objects.equals(this.links, apiAttributesDtoStatisticsActivityHourly.links) &&
        Objects.equals(this.type, apiAttributesDtoStatisticsActivityHourly.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, links, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAttributesDtoStatisticsActivityHourly {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

