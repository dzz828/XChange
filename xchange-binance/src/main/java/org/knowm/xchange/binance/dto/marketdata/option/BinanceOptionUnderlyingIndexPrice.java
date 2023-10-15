
package org.knowm.xchange.binance.dto.marketdata.option;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "time",
    "indexPrice"
})
@Generated("jsonschema2pojo")
public class BinanceOptionUnderlyingIndexPrice {

    @JsonProperty("time")
    private Long time;
    @JsonProperty("indexPrice")
    private String indexPrice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("time")
    public Long getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Long time) {
        this.time = time;
    }

    public BinanceOptionUnderlyingIndexPrice withTime(Long time) {
        this.time = time;
        return this;
    }

    @JsonProperty("indexPrice")
    public String getIndexPrice() {
        return indexPrice;
    }

    @JsonProperty("indexPrice")
    public void setIndexPrice(String indexPrice) {
        this.indexPrice = indexPrice;
    }

    public BinanceOptionUnderlyingIndexPrice withIndexPrice(String indexPrice) {
        this.indexPrice = indexPrice;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public BinanceOptionUnderlyingIndexPrice withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BinanceOptionUnderlyingIndexPrice.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
        sb.append(',');
        sb.append("indexPrice");
        sb.append('=');
        sb.append(((this.indexPrice == null)?"<null>":this.indexPrice));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.time == null)? 0 :this.time.hashCode()));
        result = ((result* 31)+((this.indexPrice == null)? 0 :this.indexPrice.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BinanceOptionUnderlyingIndexPrice) == false) {
            return false;
        }
        BinanceOptionUnderlyingIndexPrice rhs = ((BinanceOptionUnderlyingIndexPrice) other);
        return ((((this.time == rhs.time)||((this.time!= null)&&this.time.equals(rhs.time)))&&((this.indexPrice == rhs.indexPrice)||((this.indexPrice!= null)&&this.indexPrice.equals(rhs.indexPrice))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
