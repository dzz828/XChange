
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
    "symbol",
    "markPrice",
    "bidIV",
    "askIV",
    "markIV",
    "delta",
    "theta",
    "gamma",
    "vega",
    "highPriceLimit",
    "lowPriceLimit"
})
@Generated("jsonschema2pojo")
public class BinanceOptionMarkPrice {

    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("markPrice")
    private String markPrice;
    @JsonProperty("bidIV")
    private String bidIV;
    @JsonProperty("askIV")
    private String askIV;
    @JsonProperty("markIV")
    private String markIV;
    @JsonProperty("delta")
    private String delta;
    @JsonProperty("theta")
    private String theta;
    @JsonProperty("gamma")
    private String gamma;
    @JsonProperty("vega")
    private String vega;
    @JsonProperty("highPriceLimit")
    private String highPriceLimit;
    @JsonProperty("lowPriceLimit")
    private String lowPriceLimit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BinanceOptionMarkPrice withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    @JsonProperty("markPrice")
    public String getMarkPrice() {
        return markPrice;
    }

    @JsonProperty("markPrice")
    public void setMarkPrice(String markPrice) {
        this.markPrice = markPrice;
    }

    public BinanceOptionMarkPrice withMarkPrice(String markPrice) {
        this.markPrice = markPrice;
        return this;
    }

    @JsonProperty("bidIV")
    public String getBidIV() {
        return bidIV;
    }

    @JsonProperty("bidIV")
    public void setBidIV(String bidIV) {
        this.bidIV = bidIV;
    }

    public BinanceOptionMarkPrice withBidIV(String bidIV) {
        this.bidIV = bidIV;
        return this;
    }

    @JsonProperty("askIV")
    public String getAskIV() {
        return askIV;
    }

    @JsonProperty("askIV")
    public void setAskIV(String askIV) {
        this.askIV = askIV;
    }

    public BinanceOptionMarkPrice withAskIV(String askIV) {
        this.askIV = askIV;
        return this;
    }

    @JsonProperty("markIV")
    public String getMarkIV() {
        return markIV;
    }

    @JsonProperty("markIV")
    public void setMarkIV(String markIV) {
        this.markIV = markIV;
    }

    public BinanceOptionMarkPrice withMarkIV(String markIV) {
        this.markIV = markIV;
        return this;
    }

    @JsonProperty("delta")
    public String getDelta() {
        return delta;
    }

    @JsonProperty("delta")
    public void setDelta(String delta) {
        this.delta = delta;
    }

    public BinanceOptionMarkPrice withDelta(String delta) {
        this.delta = delta;
        return this;
    }

    @JsonProperty("theta")
    public String getTheta() {
        return theta;
    }

    @JsonProperty("theta")
    public void setTheta(String theta) {
        this.theta = theta;
    }

    public BinanceOptionMarkPrice withTheta(String theta) {
        this.theta = theta;
        return this;
    }

    @JsonProperty("gamma")
    public String getGamma() {
        return gamma;
    }

    @JsonProperty("gamma")
    public void setGamma(String gamma) {
        this.gamma = gamma;
    }

    public BinanceOptionMarkPrice withGamma(String gamma) {
        this.gamma = gamma;
        return this;
    }

    @JsonProperty("vega")
    public String getVega() {
        return vega;
    }

    @JsonProperty("vega")
    public void setVega(String vega) {
        this.vega = vega;
    }

    public BinanceOptionMarkPrice withVega(String vega) {
        this.vega = vega;
        return this;
    }

    @JsonProperty("highPriceLimit")
    public String getHighPriceLimit() {
        return highPriceLimit;
    }

    @JsonProperty("highPriceLimit")
    public void setHighPriceLimit(String highPriceLimit) {
        this.highPriceLimit = highPriceLimit;
    }

    public BinanceOptionMarkPrice withHighPriceLimit(String highPriceLimit) {
        this.highPriceLimit = highPriceLimit;
        return this;
    }

    @JsonProperty("lowPriceLimit")
    public String getLowPriceLimit() {
        return lowPriceLimit;
    }

    @JsonProperty("lowPriceLimit")
    public void setLowPriceLimit(String lowPriceLimit) {
        this.lowPriceLimit = lowPriceLimit;
    }

    public BinanceOptionMarkPrice withLowPriceLimit(String lowPriceLimit) {
        this.lowPriceLimit = lowPriceLimit;
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

    public BinanceOptionMarkPrice withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BinanceOptionMarkPrice.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("markPrice");
        sb.append('=');
        sb.append(((this.markPrice == null)?"<null>":this.markPrice));
        sb.append(',');
        sb.append("bidIV");
        sb.append('=');
        sb.append(((this.bidIV == null)?"<null>":this.bidIV));
        sb.append(',');
        sb.append("askIV");
        sb.append('=');
        sb.append(((this.askIV == null)?"<null>":this.askIV));
        sb.append(',');
        sb.append("markIV");
        sb.append('=');
        sb.append(((this.markIV == null)?"<null>":this.markIV));
        sb.append(',');
        sb.append("delta");
        sb.append('=');
        sb.append(((this.delta == null)?"<null>":this.delta));
        sb.append(',');
        sb.append("theta");
        sb.append('=');
        sb.append(((this.theta == null)?"<null>":this.theta));
        sb.append(',');
        sb.append("gamma");
        sb.append('=');
        sb.append(((this.gamma == null)?"<null>":this.gamma));
        sb.append(',');
        sb.append("vega");
        sb.append('=');
        sb.append(((this.vega == null)?"<null>":this.vega));
        sb.append(',');
        sb.append("highPriceLimit");
        sb.append('=');
        sb.append(((this.highPriceLimit == null)?"<null>":this.highPriceLimit));
        sb.append(',');
        sb.append("lowPriceLimit");
        sb.append('=');
        sb.append(((this.lowPriceLimit == null)?"<null>":this.lowPriceLimit));
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
        result = ((result* 31)+((this.highPriceLimit == null)? 0 :this.highPriceLimit.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.lowPriceLimit == null)? 0 :this.lowPriceLimit.hashCode()));
        result = ((result* 31)+((this.markPrice == null)? 0 :this.markPrice.hashCode()));
        result = ((result* 31)+((this.markIV == null)? 0 :this.markIV.hashCode()));
        result = ((result* 31)+((this.delta == null)? 0 :this.delta.hashCode()));
        result = ((result* 31)+((this.askIV == null)? 0 :this.askIV.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.bidIV == null)? 0 :this.bidIV.hashCode()));
        result = ((result* 31)+((this.theta == null)? 0 :this.theta.hashCode()));
        result = ((result* 31)+((this.gamma == null)? 0 :this.gamma.hashCode()));
        result = ((result* 31)+((this.vega == null)? 0 :this.vega.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BinanceOptionMarkPrice) == false) {
            return false;
        }
        BinanceOptionMarkPrice rhs = ((BinanceOptionMarkPrice) other);
        return (((((((((((((this.highPriceLimit == rhs.highPriceLimit)||((this.highPriceLimit!= null)&&this.highPriceLimit.equals(rhs.highPriceLimit)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.lowPriceLimit == rhs.lowPriceLimit)||((this.lowPriceLimit!= null)&&this.lowPriceLimit.equals(rhs.lowPriceLimit))))&&((this.markPrice == rhs.markPrice)||((this.markPrice!= null)&&this.markPrice.equals(rhs.markPrice))))&&((this.markIV == rhs.markIV)||((this.markIV!= null)&&this.markIV.equals(rhs.markIV))))&&((this.delta == rhs.delta)||((this.delta!= null)&&this.delta.equals(rhs.delta))))&&((this.askIV == rhs.askIV)||((this.askIV!= null)&&this.askIV.equals(rhs.askIV))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.bidIV == rhs.bidIV)||((this.bidIV!= null)&&this.bidIV.equals(rhs.bidIV))))&&((this.theta == rhs.theta)||((this.theta!= null)&&this.theta.equals(rhs.theta))))&&((this.gamma == rhs.gamma)||((this.gamma!= null)&&this.gamma.equals(rhs.gamma))))&&((this.vega == rhs.vega)||((this.vega!= null)&&this.vega.equals(rhs.vega))));
    }

}
