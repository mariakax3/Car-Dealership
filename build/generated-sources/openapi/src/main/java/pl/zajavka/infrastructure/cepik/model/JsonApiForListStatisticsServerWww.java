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
import java.util.ArrayList;
import java.util.List;
import pl.zajavka.infrastructure.cepik.model.ApiAttributesDtoStatisticsServerWww;
import pl.zajavka.infrastructure.cepik.model.ApiLinksDto;
import pl.zajavka.infrastructure.cepik.model.ApiMetaDto;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Model odpowiedzi API udostępniającej listę rekordów w standardzie JSON API.
 */
@ApiModel(description = "Model odpowiedzi API udostępniającej listę rekordów w standardzie JSON API.")
@JsonPropertyOrder({
  JsonApiForListStatisticsServerWww.JSON_PROPERTY_DATA,
  JsonApiForListStatisticsServerWww.JSON_PROPERTY_LINKS,
  JsonApiForListStatisticsServerWww.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-05T22:58:19.118382400+02:00[Europe/Warsaw]")
public class JsonApiForListStatisticsServerWww implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<ApiAttributesDtoStatisticsServerWww> data = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private ApiLinksDto links;

  public static final String JSON_PROPERTY_META = "meta";
  private ApiMetaDto meta;

  public JsonApiForListStatisticsServerWww() {
  }

  public JsonApiForListStatisticsServerWww data(List<ApiAttributesDtoStatisticsServerWww> data) {
    
    this.data = data;
    return this;
  }

  public JsonApiForListStatisticsServerWww addDataItem(ApiAttributesDtoStatisticsServerWww dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Lista rekordów.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lista rekordów.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiAttributesDtoStatisticsServerWww> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<ApiAttributesDtoStatisticsServerWww> data) {
    this.data = data;
  }


  public JsonApiForListStatisticsServerWww links(ApiLinksDto links) {
    
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

  public ApiLinksDto getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(ApiLinksDto links) {
    this.links = links;
  }


  public JsonApiForListStatisticsServerWww meta(ApiMetaDto meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiMetaDto getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(ApiMetaDto meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonApiForListStatisticsServerWww jsonApiForListStatisticsServerWww = (JsonApiForListStatisticsServerWww) o;
    return Objects.equals(this.data, jsonApiForListStatisticsServerWww.data) &&
        Objects.equals(this.links, jsonApiForListStatisticsServerWww.links) &&
        Objects.equals(this.meta, jsonApiForListStatisticsServerWww.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiForListStatisticsServerWww {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

