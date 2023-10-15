
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
    "id",
    "tradeId",
    "price",
    "qty",
    "quoteQty",
    "side",
    "time"
})
@Generated("jsonschema2pojo")
public class BinanceOptionHistoricalTrade {

    @JsonProperty("id")
    private String id;
    @JsonProperty("tradeId")
    private String tradeId;
    @JsonProperty("price")
    private String price;
    @JsonProperty("qty")
    private String qty;
    @JsonProperty("quoteQty")
    private String quoteQty;
    @JsonProperty("side")
    private Integer side;
    @JsonProperty("time")
    private Long time;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public BinanceOptionHistoricalTrade withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("tradeId")
    public String getTradeId() {
        return tradeId;
    }

    @JsonProperty("tradeId")
    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public BinanceOptionHistoricalTrade withTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    public BinanceOptionHistoricalTrade withPrice(String price) {
        this.price = price;
        return this;
    }

    @JsonProperty("qty")
    public String getQty() {
        return qty;
    }

    @JsonProperty("qty")
    public void setQty(String qty) {
        this.qty = qty;
    }

    public BinanceOptionHistoricalTrade withQty(String qty) {
        this.qty = qty;
        return this;
    }

    @JsonProperty("quoteQty")
    public String getQuoteQty() {
        return quoteQty;
    }

    @JsonProperty("quoteQty")
    public void setQuoteQty(String quoteQty) {
        this.quoteQty = quoteQty;
    }

    public BinanceOptionHistoricalTrade withQuoteQty(String quoteQty) {
        this.quoteQty = quoteQty;
        return this;
    }

    @JsonProperty("side")
    public Integer getSide() {
        return side;
    }

    @JsonProperty("side")
    public void setSide(Integer side) {
        this.side = side;
    }

    public BinanceOptionHistoricalTrade withSide(Integer side) {
        this.side = side;
        return this;
    }

    @JsonProperty("time")
    public Long getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Long time) {
        this.time = time;
    }

    public BinanceOptionHistoricalTrade withTime(Long time) {
        this.time = time;
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

    public BinanceOptionHistoricalTrade withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BinanceOptionHistoricalTrade.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("tradeId");
        sb.append('=');
        sb.append(((this.tradeId == null)?"<null>":this.tradeId));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("qty");
        sb.append('=');
        sb.append(((this.qty == null)?"<null>":this.qty));
        sb.append(',');
        sb.append("quoteQty");
        sb.append('=');
        sb.append(((this.quoteQty == null)?"<null>":this.quoteQty));
        sb.append(',');
        sb.append("side");
        sb.append('=');
        sb.append(((this.side == null)?"<null>":this.side));
        sb.append(',');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
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
        result = ((result* 31)+((this.side == null)? 0 :this.side.hashCode()));
        result = ((result* 31)+((this.quoteQty == null)? 0 :this.quoteQty.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.qty == null)? 0 :this.qty.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.time == null)? 0 :this.time.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tradeId == null)? 0 :this.tradeId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BinanceOptionHistoricalTrade) == false) {
            return false;
        }
        BinanceOptionHistoricalTrade rhs = ((BinanceOptionHistoricalTrade) other);
        return (((((((((this.side == rhs.side)||((this.side!= null)&&this.side.equals(rhs.side)))&&((this.quoteQty == rhs.quoteQty)||((this.quoteQty!= null)&&this.quoteQty.equals(rhs.quoteQty))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.qty == rhs.qty)||((this.qty!= null)&&this.qty.equals(rhs.qty))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.time == rhs.time)||((this.time!= null)&&this.time.equals(rhs.time))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tradeId == rhs.tradeId)||((this.tradeId!= null)&&this.tradeId.equals(rhs.tradeId))));
    }

}
