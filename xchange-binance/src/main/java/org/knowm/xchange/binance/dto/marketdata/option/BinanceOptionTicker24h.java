
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
    "priceChange",
    "priceChangePercent",
    "lastPrice",
    "lastQty",
    "open",
    "high",
    "low",
    "volume",
    "amount",
    "bidPrice",
    "askPrice",
    "openTime",
    "closeTime",
    "firstTradeId",
    "tradeCount",
    "strikePrice",
    "exercisePrice"
})
@Generated("jsonschema2pojo")
public class BinanceOptionTicker24h {

    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("priceChange")
    private String priceChange;
    @JsonProperty("priceChangePercent")
    private String priceChangePercent;
    @JsonProperty("lastPrice")
    private String lastPrice;
    @JsonProperty("lastQty")
    private String lastQty;
    @JsonProperty("open")
    private String open;
    @JsonProperty("high")
    private String high;
    @JsonProperty("low")
    private String low;
    @JsonProperty("volume")
    private String volume;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("bidPrice")
    private String bidPrice;
    @JsonProperty("askPrice")
    private String askPrice;
    @JsonProperty("openTime")
    private Long openTime;
    @JsonProperty("closeTime")
    private Long closeTime;
    @JsonProperty("firstTradeId")
    private Integer firstTradeId;
    @JsonProperty("tradeCount")
    private Integer tradeCount;
    @JsonProperty("strikePrice")
    private String strikePrice;
    @JsonProperty("exercisePrice")
    private String exercisePrice;
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

    public BinanceOptionTicker24h withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    @JsonProperty("priceChange")
    public String getPriceChange() {
        return priceChange;
    }

    @JsonProperty("priceChange")
    public void setPriceChange(String priceChange) {
        this.priceChange = priceChange;
    }

    public BinanceOptionTicker24h withPriceChange(String priceChange) {
        this.priceChange = priceChange;
        return this;
    }

    @JsonProperty("priceChangePercent")
    public String getPriceChangePercent() {
        return priceChangePercent;
    }

    @JsonProperty("priceChangePercent")
    public void setPriceChangePercent(String priceChangePercent) {
        this.priceChangePercent = priceChangePercent;
    }

    public BinanceOptionTicker24h withPriceChangePercent(String priceChangePercent) {
        this.priceChangePercent = priceChangePercent;
        return this;
    }

    @JsonProperty("lastPrice")
    public String getLastPrice() {
        return lastPrice;
    }

    @JsonProperty("lastPrice")
    public void setLastPrice(String lastPrice) {
        this.lastPrice = lastPrice;
    }

    public BinanceOptionTicker24h withLastPrice(String lastPrice) {
        this.lastPrice = lastPrice;
        return this;
    }

    @JsonProperty("lastQty")
    public String getLastQty() {
        return lastQty;
    }

    @JsonProperty("lastQty")
    public void setLastQty(String lastQty) {
        this.lastQty = lastQty;
    }

    public BinanceOptionTicker24h withLastQty(String lastQty) {
        this.lastQty = lastQty;
        return this;
    }

    @JsonProperty("open")
    public String getOpen() {
        return open;
    }

    @JsonProperty("open")
    public void setOpen(String open) {
        this.open = open;
    }

    public BinanceOptionTicker24h withOpen(String open) {
        this.open = open;
        return this;
    }

    @JsonProperty("high")
    public String getHigh() {
        return high;
    }

    @JsonProperty("high")
    public void setHigh(String high) {
        this.high = high;
    }

    public BinanceOptionTicker24h withHigh(String high) {
        this.high = high;
        return this;
    }

    @JsonProperty("low")
    public String getLow() {
        return low;
    }

    @JsonProperty("low")
    public void setLow(String low) {
        this.low = low;
    }

    public BinanceOptionTicker24h withLow(String low) {
        this.low = low;
        return this;
    }

    @JsonProperty("volume")
    public String getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(String volume) {
        this.volume = volume;
    }

    public BinanceOptionTicker24h withVolume(String volume) {
        this.volume = volume;
        return this;
    }

    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public BinanceOptionTicker24h withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("bidPrice")
    public String getBidPrice() {
        return bidPrice;
    }

    @JsonProperty("bidPrice")
    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }

    public BinanceOptionTicker24h withBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    @JsonProperty("askPrice")
    public String getAskPrice() {
        return askPrice;
    }

    @JsonProperty("askPrice")
    public void setAskPrice(String askPrice) {
        this.askPrice = askPrice;
    }

    public BinanceOptionTicker24h withAskPrice(String askPrice) {
        this.askPrice = askPrice;
        return this;
    }

    @JsonProperty("openTime")
    public Long getOpenTime() {
        return openTime;
    }

    @JsonProperty("openTime")
    public void setOpenTime(Long openTime) {
        this.openTime = openTime;
    }

    public BinanceOptionTicker24h withOpenTime(Long openTime) {
        this.openTime = openTime;
        return this;
    }

    @JsonProperty("closeTime")
    public Long getCloseTime() {
        return closeTime;
    }

    @JsonProperty("closeTime")
    public void setCloseTime(Long closeTime) {
        this.closeTime = closeTime;
    }

    public BinanceOptionTicker24h withCloseTime(Long closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    @JsonProperty("firstTradeId")
    public Integer getFirstTradeId() {
        return firstTradeId;
    }

    @JsonProperty("firstTradeId")
    public void setFirstTradeId(Integer firstTradeId) {
        this.firstTradeId = firstTradeId;
    }

    public BinanceOptionTicker24h withFirstTradeId(Integer firstTradeId) {
        this.firstTradeId = firstTradeId;
        return this;
    }

    @JsonProperty("tradeCount")
    public Integer getTradeCount() {
        return tradeCount;
    }

    @JsonProperty("tradeCount")
    public void setTradeCount(Integer tradeCount) {
        this.tradeCount = tradeCount;
    }

    public BinanceOptionTicker24h withTradeCount(Integer tradeCount) {
        this.tradeCount = tradeCount;
        return this;
    }

    @JsonProperty("strikePrice")
    public String getStrikePrice() {
        return strikePrice;
    }

    @JsonProperty("strikePrice")
    public void setStrikePrice(String strikePrice) {
        this.strikePrice = strikePrice;
    }

    public BinanceOptionTicker24h withStrikePrice(String strikePrice) {
        this.strikePrice = strikePrice;
        return this;
    }

    @JsonProperty("exercisePrice")
    public String getExercisePrice() {
        return exercisePrice;
    }

    @JsonProperty("exercisePrice")
    public void setExercisePrice(String exercisePrice) {
        this.exercisePrice = exercisePrice;
    }

    public BinanceOptionTicker24h withExercisePrice(String exercisePrice) {
        this.exercisePrice = exercisePrice;
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

    public BinanceOptionTicker24h withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BinanceOptionTicker24h.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("priceChange");
        sb.append('=');
        sb.append(((this.priceChange == null)?"<null>":this.priceChange));
        sb.append(',');
        sb.append("priceChangePercent");
        sb.append('=');
        sb.append(((this.priceChangePercent == null)?"<null>":this.priceChangePercent));
        sb.append(',');
        sb.append("lastPrice");
        sb.append('=');
        sb.append(((this.lastPrice == null)?"<null>":this.lastPrice));
        sb.append(',');
        sb.append("lastQty");
        sb.append('=');
        sb.append(((this.lastQty == null)?"<null>":this.lastQty));
        sb.append(',');
        sb.append("open");
        sb.append('=');
        sb.append(((this.open == null)?"<null>":this.open));
        sb.append(',');
        sb.append("high");
        sb.append('=');
        sb.append(((this.high == null)?"<null>":this.high));
        sb.append(',');
        sb.append("low");
        sb.append('=');
        sb.append(((this.low == null)?"<null>":this.low));
        sb.append(',');
        sb.append("volume");
        sb.append('=');
        sb.append(((this.volume == null)?"<null>":this.volume));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("bidPrice");
        sb.append('=');
        sb.append(((this.bidPrice == null)?"<null>":this.bidPrice));
        sb.append(',');
        sb.append("askPrice");
        sb.append('=');
        sb.append(((this.askPrice == null)?"<null>":this.askPrice));
        sb.append(',');
        sb.append("openTime");
        sb.append('=');
        sb.append(((this.openTime == null)?"<null>":this.openTime));
        sb.append(',');
        sb.append("closeTime");
        sb.append('=');
        sb.append(((this.closeTime == null)?"<null>":this.closeTime));
        sb.append(',');
        sb.append("firstTradeId");
        sb.append('=');
        sb.append(((this.firstTradeId == null)?"<null>":this.firstTradeId));
        sb.append(',');
        sb.append("tradeCount");
        sb.append('=');
        sb.append(((this.tradeCount == null)?"<null>":this.tradeCount));
        sb.append(',');
        sb.append("strikePrice");
        sb.append('=');
        sb.append(((this.strikePrice == null)?"<null>":this.strikePrice));
        sb.append(',');
        sb.append("exercisePrice");
        sb.append('=');
        sb.append(((this.exercisePrice == null)?"<null>":this.exercisePrice));
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
        result = ((result* 31)+((this.priceChange == null)? 0 :this.priceChange.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.askPrice == null)? 0 :this.askPrice.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.firstTradeId == null)? 0 :this.firstTradeId.hashCode()));
        result = ((result* 31)+((this.exercisePrice == null)? 0 :this.exercisePrice.hashCode()));
        result = ((result* 31)+((this.bidPrice == null)? 0 :this.bidPrice.hashCode()));
        result = ((result* 31)+((this.volume == null)? 0 :this.volume.hashCode()));
        result = ((result* 31)+((this.lastQty == null)? 0 :this.lastQty.hashCode()));
        result = ((result* 31)+((this.high == null)? 0 :this.high.hashCode()));
        result = ((result* 31)+((this.tradeCount == null)? 0 :this.tradeCount.hashCode()));
        result = ((result* 31)+((this.low == null)? 0 :this.low.hashCode()));
        result = ((result* 31)+((this.closeTime == null)? 0 :this.closeTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.openTime == null)? 0 :this.openTime.hashCode()));
        result = ((result* 31)+((this.priceChangePercent == null)? 0 :this.priceChangePercent.hashCode()));
        result = ((result* 31)+((this.open == null)? 0 :this.open.hashCode()));
        result = ((result* 31)+((this.strikePrice == null)? 0 :this.strikePrice.hashCode()));
        result = ((result* 31)+((this.lastPrice == null)? 0 :this.lastPrice.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BinanceOptionTicker24h) == false) {
            return false;
        }
        BinanceOptionTicker24h rhs = ((BinanceOptionTicker24h) other);
        return ((((((((((((((((((((this.priceChange == rhs.priceChange)||((this.priceChange!= null)&&this.priceChange.equals(rhs.priceChange)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.askPrice == rhs.askPrice)||((this.askPrice!= null)&&this.askPrice.equals(rhs.askPrice))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.firstTradeId == rhs.firstTradeId)||((this.firstTradeId!= null)&&this.firstTradeId.equals(rhs.firstTradeId))))&&((this.exercisePrice == rhs.exercisePrice)||((this.exercisePrice!= null)&&this.exercisePrice.equals(rhs.exercisePrice))))&&((this.bidPrice == rhs.bidPrice)||((this.bidPrice!= null)&&this.bidPrice.equals(rhs.bidPrice))))&&((this.volume == rhs.volume)||((this.volume!= null)&&this.volume.equals(rhs.volume))))&&((this.lastQty == rhs.lastQty)||((this.lastQty!= null)&&this.lastQty.equals(rhs.lastQty))))&&((this.high == rhs.high)||((this.high!= null)&&this.high.equals(rhs.high))))&&((this.tradeCount == rhs.tradeCount)||((this.tradeCount!= null)&&this.tradeCount.equals(rhs.tradeCount))))&&((this.low == rhs.low)||((this.low!= null)&&this.low.equals(rhs.low))))&&((this.closeTime == rhs.closeTime)||((this.closeTime!= null)&&this.closeTime.equals(rhs.closeTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.openTime == rhs.openTime)||((this.openTime!= null)&&this.openTime.equals(rhs.openTime))))&&((this.priceChangePercent == rhs.priceChangePercent)||((this.priceChangePercent!= null)&&this.priceChangePercent.equals(rhs.priceChangePercent))))&&((this.open == rhs.open)||((this.open!= null)&&this.open.equals(rhs.open))))&&((this.strikePrice == rhs.strikePrice)||((this.strikePrice!= null)&&this.strikePrice.equals(rhs.strikePrice))))&&((this.lastPrice == rhs.lastPrice)||((this.lastPrice!= null)&&this.lastPrice.equals(rhs.lastPrice))));
    }

}
