
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
    "open",
    "high",
    "low",
    "close",
    "volume",
    "amount",
    "interval",
    "tradeCount",
    "takerVolume",
    "takerAmount",
    "openTime",
    "closeTime"
})
@Generated("jsonschema2pojo")
public class BinanceOptionKline {

    @JsonProperty("open")
    private String open;
    @JsonProperty("high")
    private String high;
    @JsonProperty("low")
    private String low;
    @JsonProperty("close")
    private String close;
    @JsonProperty("volume")
    private String volume;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("interval")
    private String interval;
    @JsonProperty("tradeCount")
    private Integer tradeCount;
    @JsonProperty("takerVolume")
    private String takerVolume;
    @JsonProperty("takerAmount")
    private String takerAmount;
    @JsonProperty("openTime")
    private Long openTime;
    @JsonProperty("closeTime")
    private Long closeTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("open")
    public String getOpen() {
        return open;
    }

    @JsonProperty("open")
    public void setOpen(String open) {
        this.open = open;
    }

    public BinanceOptionKline withOpen(String open) {
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

    public BinanceOptionKline withHigh(String high) {
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

    public BinanceOptionKline withLow(String low) {
        this.low = low;
        return this;
    }

    @JsonProperty("close")
    public String getClose() {
        return close;
    }

    @JsonProperty("close")
    public void setClose(String close) {
        this.close = close;
    }

    public BinanceOptionKline withClose(String close) {
        this.close = close;
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

    public BinanceOptionKline withVolume(String volume) {
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

    public BinanceOptionKline withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("interval")
    public String getInterval() {
        return interval;
    }

    @JsonProperty("interval")
    public void setInterval(String interval) {
        this.interval = interval;
    }

    public BinanceOptionKline withInterval(String interval) {
        this.interval = interval;
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

    public BinanceOptionKline withTradeCount(Integer tradeCount) {
        this.tradeCount = tradeCount;
        return this;
    }

    @JsonProperty("takerVolume")
    public String getTakerVolume() {
        return takerVolume;
    }

    @JsonProperty("takerVolume")
    public void setTakerVolume(String takerVolume) {
        this.takerVolume = takerVolume;
    }

    public BinanceOptionKline withTakerVolume(String takerVolume) {
        this.takerVolume = takerVolume;
        return this;
    }

    @JsonProperty("takerAmount")
    public String getTakerAmount() {
        return takerAmount;
    }

    @JsonProperty("takerAmount")
    public void setTakerAmount(String takerAmount) {
        this.takerAmount = takerAmount;
    }

    public BinanceOptionKline withTakerAmount(String takerAmount) {
        this.takerAmount = takerAmount;
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

    public BinanceOptionKline withOpenTime(Long openTime) {
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

    public BinanceOptionKline withCloseTime(Long closeTime) {
        this.closeTime = closeTime;
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

    public BinanceOptionKline withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BinanceOptionKline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("close");
        sb.append('=');
        sb.append(((this.close == null)?"<null>":this.close));
        sb.append(',');
        sb.append("volume");
        sb.append('=');
        sb.append(((this.volume == null)?"<null>":this.volume));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("interval");
        sb.append('=');
        sb.append(((this.interval == null)?"<null>":this.interval));
        sb.append(',');
        sb.append("tradeCount");
        sb.append('=');
        sb.append(((this.tradeCount == null)?"<null>":this.tradeCount));
        sb.append(',');
        sb.append("takerVolume");
        sb.append('=');
        sb.append(((this.takerVolume == null)?"<null>":this.takerVolume));
        sb.append(',');
        sb.append("takerAmount");
        sb.append('=');
        sb.append(((this.takerAmount == null)?"<null>":this.takerAmount));
        sb.append(',');
        sb.append("openTime");
        sb.append('=');
        sb.append(((this.openTime == null)?"<null>":this.openTime));
        sb.append(',');
        sb.append("closeTime");
        sb.append('=');
        sb.append(((this.closeTime == null)?"<null>":this.closeTime));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.takerAmount == null)? 0 :this.takerAmount.hashCode()));
        result = ((result* 31)+((this.volume == null)? 0 :this.volume.hashCode()));
        result = ((result* 31)+((this.high == null)? 0 :this.high.hashCode()));
        result = ((result* 31)+((this.tradeCount == null)? 0 :this.tradeCount.hashCode()));
        result = ((result* 31)+((this.low == null)? 0 :this.low.hashCode()));
        result = ((result* 31)+((this.closeTime == null)? 0 :this.closeTime.hashCode()));
        result = ((result* 31)+((this.takerVolume == null)? 0 :this.takerVolume.hashCode()));
        result = ((result* 31)+((this.interval == null)? 0 :this.interval.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.openTime == null)? 0 :this.openTime.hashCode()));
        result = ((result* 31)+((this.close == null)? 0 :this.close.hashCode()));
        result = ((result* 31)+((this.open == null)? 0 :this.open.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BinanceOptionKline) == false) {
            return false;
        }
        BinanceOptionKline rhs = ((BinanceOptionKline) other);
        return ((((((((((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.takerAmount == rhs.takerAmount)||((this.takerAmount!= null)&&this.takerAmount.equals(rhs.takerAmount))))&&((this.volume == rhs.volume)||((this.volume!= null)&&this.volume.equals(rhs.volume))))&&((this.high == rhs.high)||((this.high!= null)&&this.high.equals(rhs.high))))&&((this.tradeCount == rhs.tradeCount)||((this.tradeCount!= null)&&this.tradeCount.equals(rhs.tradeCount))))&&((this.low == rhs.low)||((this.low!= null)&&this.low.equals(rhs.low))))&&((this.closeTime == rhs.closeTime)||((this.closeTime!= null)&&this.closeTime.equals(rhs.closeTime))))&&((this.takerVolume == rhs.takerVolume)||((this.takerVolume!= null)&&this.takerVolume.equals(rhs.takerVolume))))&&((this.interval == rhs.interval)||((this.interval!= null)&&this.interval.equals(rhs.interval))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.openTime == rhs.openTime)||((this.openTime!= null)&&this.openTime.equals(rhs.openTime))))&&((this.close == rhs.close)||((this.close!= null)&&this.close.equals(rhs.close))))&&((this.open == rhs.open)||((this.open!= null)&&this.open.equals(rhs.open))));
    }

}
