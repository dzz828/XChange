
package org.knowm.xchange.binance.dto.meta.exchangeinfo.option;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "timezone",
    "serverTime",
    "optionContracts",
    "optionAssets",
    "optionSymbols",
    "rateLimits"
})
@Generated("jsonschema2pojo")
public class BinanceOptionExchangeInfo {

    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("serverTime")
    private Long serverTime;
    @JsonProperty("optionContracts")
    private List<OptionContract> optionContracts = new ArrayList<OptionContract>();
    @JsonProperty("optionAssets")
    private List<OptionAsset> optionAssets = new ArrayList<OptionAsset>();
    @JsonProperty("optionSymbols")
    private List<OptionSymbol> optionSymbols = new ArrayList<OptionSymbol>();
    @JsonProperty("rateLimits")
    private List<RateLimit> rateLimits = new ArrayList<RateLimit>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public BinanceOptionExchangeInfo withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    @JsonProperty("serverTime")
    public Long getServerTime() {
        return serverTime;
    }

    @JsonProperty("serverTime")
    public void setServerTime(Long serverTime) {
        this.serverTime = serverTime;
    }

    public BinanceOptionExchangeInfo withServerTime(Long serverTime) {
        this.serverTime = serverTime;
        return this;
    }

    @JsonProperty("optionContracts")
    public List<OptionContract> getOptionContracts() {
        return optionContracts;
    }

    @JsonProperty("optionContracts")
    public void setOptionContracts(List<OptionContract> optionContracts) {
        this.optionContracts = optionContracts;
    }

    public BinanceOptionExchangeInfo withOptionContracts(List<OptionContract> optionContracts) {
        this.optionContracts = optionContracts;
        return this;
    }

    @JsonProperty("optionAssets")
    public List<OptionAsset> getOptionAssets() {
        return optionAssets;
    }

    @JsonProperty("optionAssets")
    public void setOptionAssets(List<OptionAsset> optionAssets) {
        this.optionAssets = optionAssets;
    }

    public BinanceOptionExchangeInfo withOptionAssets(List<OptionAsset> optionAssets) {
        this.optionAssets = optionAssets;
        return this;
    }

    @JsonProperty("optionSymbols")
    public List<OptionSymbol> getOptionSymbols() {
        return optionSymbols;
    }

    @JsonProperty("optionSymbols")
    public void setOptionSymbols(List<OptionSymbol> optionSymbols) {
        this.optionSymbols = optionSymbols;
    }

    public BinanceOptionExchangeInfo withOptionSymbols(List<OptionSymbol> optionSymbols) {
        this.optionSymbols = optionSymbols;
        return this;
    }

    @JsonProperty("rateLimits")
    public List<RateLimit> getRateLimits() {
        return rateLimits;
    }

    @JsonProperty("rateLimits")
    public void setRateLimits(List<RateLimit> rateLimits) {
        this.rateLimits = rateLimits;
    }

    public BinanceOptionExchangeInfo withRateLimits(List<RateLimit> rateLimits) {
        this.rateLimits = rateLimits;
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

    public BinanceOptionExchangeInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BinanceOptionExchangeInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null)?"<null>":this.timezone));
        sb.append(',');
        sb.append("serverTime");
        sb.append('=');
        sb.append(((this.serverTime == null)?"<null>":this.serverTime));
        sb.append(',');
        sb.append("optionContracts");
        sb.append('=');
        sb.append(((this.optionContracts == null)?"<null>":this.optionContracts));
        sb.append(',');
        sb.append("optionAssets");
        sb.append('=');
        sb.append(((this.optionAssets == null)?"<null>":this.optionAssets));
        sb.append(',');
        sb.append("optionSymbols");
        sb.append('=');
        sb.append(((this.optionSymbols == null)?"<null>":this.optionSymbols));
        sb.append(',');
        sb.append("rateLimits");
        sb.append('=');
        sb.append(((this.rateLimits == null)?"<null>":this.rateLimits));
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
        result = ((result* 31)+((this.optionContracts == null)? 0 :this.optionContracts.hashCode()));
        result = ((result* 31)+((this.rateLimits == null)? 0 :this.rateLimits.hashCode()));
        result = ((result* 31)+((this.optionSymbols == null)? 0 :this.optionSymbols.hashCode()));
        result = ((result* 31)+((this.timezone == null)? 0 :this.timezone.hashCode()));
        result = ((result* 31)+((this.serverTime == null)? 0 :this.serverTime.hashCode()));
        result = ((result* 31)+((this.optionAssets == null)? 0 :this.optionAssets.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BinanceOptionExchangeInfo) == false) {
            return false;
        }
        BinanceOptionExchangeInfo rhs = ((BinanceOptionExchangeInfo) other);
        return ((((((((this.optionContracts == rhs.optionContracts)||((this.optionContracts!= null)&&this.optionContracts.equals(rhs.optionContracts)))&&((this.rateLimits == rhs.rateLimits)||((this.rateLimits!= null)&&this.rateLimits.equals(rhs.rateLimits))))&&((this.optionSymbols == rhs.optionSymbols)||((this.optionSymbols!= null)&&this.optionSymbols.equals(rhs.optionSymbols))))&&((this.timezone == rhs.timezone)||((this.timezone!= null)&&this.timezone.equals(rhs.timezone))))&&((this.serverTime == rhs.serverTime)||((this.serverTime!= null)&&this.serverTime.equals(rhs.serverTime))))&&((this.optionAssets == rhs.optionAssets)||((this.optionAssets!= null)&&this.optionAssets.equals(rhs.optionAssets))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
        "filterType",
        "minPrice",
        "maxPrice",
        "tickSize",
        "minQty",
        "maxQty",
        "stepSize"
    })
    @Generated("jsonschema2pojo")
    public static class Filter {

        @JsonProperty("filterType")
        private String filterType;
        @JsonProperty("minPrice")
        private String minPrice;
        @JsonProperty("maxPrice")
        private String maxPrice;
        @JsonProperty("tickSize")
        private String tickSize;
        @JsonProperty("minQty")
        private String minQty;
        @JsonProperty("maxQty")
        private String maxQty;
        @JsonProperty("stepSize")
        private String stepSize;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("filterType")
        public String getFilterType() {
            return filterType;
        }

        @JsonProperty("filterType")
        public void setFilterType(String filterType) {
            this.filterType = filterType;
        }

        public Filter withFilterType(String filterType) {
            this.filterType = filterType;
            return this;
        }

        @JsonProperty("minPrice")
        public String getMinPrice() {
            return minPrice;
        }

        @JsonProperty("minPrice")
        public void setMinPrice(String minPrice) {
            this.minPrice = minPrice;
        }

        public Filter withMinPrice(String minPrice) {
            this.minPrice = minPrice;
            return this;
        }

        @JsonProperty("maxPrice")
        public String getMaxPrice() {
            return maxPrice;
        }

        @JsonProperty("maxPrice")
        public void setMaxPrice(String maxPrice) {
            this.maxPrice = maxPrice;
        }

        public Filter withMaxPrice(String maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }

        @JsonProperty("tickSize")
        public String getTickSize() {
            return tickSize;
        }

        @JsonProperty("tickSize")
        public void setTickSize(String tickSize) {
            this.tickSize = tickSize;
        }

        public Filter withTickSize(String tickSize) {
            this.tickSize = tickSize;
            return this;
        }

        @JsonProperty("minQty")
        public String getMinQty() {
            return minQty;
        }

        @JsonProperty("minQty")
        public void setMinQty(String minQty) {
            this.minQty = minQty;
        }

        public Filter withMinQty(String minQty) {
            this.minQty = minQty;
            return this;
        }

        @JsonProperty("maxQty")
        public String getMaxQty() {
            return maxQty;
        }

        @JsonProperty("maxQty")
        public void setMaxQty(String maxQty) {
            this.maxQty = maxQty;
        }

        public Filter withMaxQty(String maxQty) {
            this.maxQty = maxQty;
            return this;
        }

        @JsonProperty("stepSize")
        public String getStepSize() {
            return stepSize;
        }

        @JsonProperty("stepSize")
        public void setStepSize(String stepSize) {
            this.stepSize = stepSize;
        }

        public Filter withStepSize(String stepSize) {
            this.stepSize = stepSize;
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

        public Filter withAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
            return this;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Filter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("filterType");
            sb.append('=');
            sb.append(((this.filterType == null)?"<null>":this.filterType));
            sb.append(',');
            sb.append("minPrice");
            sb.append('=');
            sb.append(((this.minPrice == null)?"<null>":this.minPrice));
            sb.append(',');
            sb.append("maxPrice");
            sb.append('=');
            sb.append(((this.maxPrice == null)?"<null>":this.maxPrice));
            sb.append(',');
            sb.append("tickSize");
            sb.append('=');
            sb.append(((this.tickSize == null)?"<null>":this.tickSize));
            sb.append(',');
            sb.append("minQty");
            sb.append('=');
            sb.append(((this.minQty == null)?"<null>":this.minQty));
            sb.append(',');
            sb.append("maxQty");
            sb.append('=');
            sb.append(((this.maxQty == null)?"<null>":this.maxQty));
            sb.append(',');
            sb.append("stepSize");
            sb.append('=');
            sb.append(((this.stepSize == null)?"<null>":this.stepSize));
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
            result = ((result* 31)+((this.minPrice == null)? 0 :this.minPrice.hashCode()));
            result = ((result* 31)+((this.stepSize == null)? 0 :this.stepSize.hashCode()));
            result = ((result* 31)+((this.maxPrice == null)? 0 :this.maxPrice.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.filterType == null)? 0 :this.filterType.hashCode()));
            result = ((result* 31)+((this.maxQty == null)? 0 :this.maxQty.hashCode()));
            result = ((result* 31)+((this.tickSize == null)? 0 :this.tickSize.hashCode()));
            result = ((result* 31)+((this.minQty == null)? 0 :this.minQty.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Filter) == false) {
                return false;
            }
            Filter rhs = ((Filter) other);
            return (((((((((this.minPrice == rhs.minPrice)||((this.minPrice!= null)&&this.minPrice.equals(rhs.minPrice)))&&((this.stepSize == rhs.stepSize)||((this.stepSize!= null)&&this.stepSize.equals(rhs.stepSize))))&&((this.maxPrice == rhs.maxPrice)||((this.maxPrice!= null)&&this.maxPrice.equals(rhs.maxPrice))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.filterType == rhs.filterType)||((this.filterType!= null)&&this.filterType.equals(rhs.filterType))))&&((this.maxQty == rhs.maxQty)||((this.maxQty!= null)&&this.maxQty.equals(rhs.maxQty))))&&((this.tickSize == rhs.tickSize)||((this.tickSize!= null)&&this.tickSize.equals(rhs.tickSize))))&&((this.minQty == rhs.minQty)||((this.minQty!= null)&&this.minQty.equals(rhs.minQty))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
        "id",
        "name"
    })
    @Generated("jsonschema2pojo")
    public static class OptionAsset {

        @JsonProperty("id")
        private Integer id;
        @JsonProperty("name")
        private String name;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("id")
        public Integer getId() {
            return id;
        }

        @JsonProperty("id")
        public void setId(Integer id) {
            this.id = id;
        }

        public OptionAsset withId(Integer id) {
            this.id = id;
            return this;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        public OptionAsset withName(String name) {
            this.name = name;
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

        public OptionAsset withAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
            return this;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(OptionAsset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("id");
            sb.append('=');
            sb.append(((this.id == null)?"<null>":this.id));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null)?"<null>":this.name));
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
            result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
            result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof OptionAsset) == false) {
                return false;
            }
            OptionAsset rhs = ((OptionAsset) other);
            return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
        "id",
        "baseAsset",
        "quoteAsset",
        "underlying",
        "settleAsset"
    })
    @Generated("jsonschema2pojo")
    public static class OptionContract {

        @JsonProperty("id")
        private Integer id;
        @JsonProperty("baseAsset")
        private String baseAsset;
        @JsonProperty("quoteAsset")
        private String quoteAsset;
        @JsonProperty("underlying")
        private String underlying;
        @JsonProperty("settleAsset")
        private String settleAsset;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("id")
        public Integer getId() {
            return id;
        }

        @JsonProperty("id")
        public void setId(Integer id) {
            this.id = id;
        }

        public OptionContract withId(Integer id) {
            this.id = id;
            return this;
        }

        @JsonProperty("baseAsset")
        public String getBaseAsset() {
            return baseAsset;
        }

        @JsonProperty("baseAsset")
        public void setBaseAsset(String baseAsset) {
            this.baseAsset = baseAsset;
        }

        public OptionContract withBaseAsset(String baseAsset) {
            this.baseAsset = baseAsset;
            return this;
        }

        @JsonProperty("quoteAsset")
        public String getQuoteAsset() {
            return quoteAsset;
        }

        @JsonProperty("quoteAsset")
        public void setQuoteAsset(String quoteAsset) {
            this.quoteAsset = quoteAsset;
        }

        public OptionContract withQuoteAsset(String quoteAsset) {
            this.quoteAsset = quoteAsset;
            return this;
        }

        @JsonProperty("underlying")
        public String getUnderlying() {
            return underlying;
        }

        @JsonProperty("underlying")
        public void setUnderlying(String underlying) {
            this.underlying = underlying;
        }

        public OptionContract withUnderlying(String underlying) {
            this.underlying = underlying;
            return this;
        }

        @JsonProperty("settleAsset")
        public String getSettleAsset() {
            return settleAsset;
        }

        @JsonProperty("settleAsset")
        public void setSettleAsset(String settleAsset) {
            this.settleAsset = settleAsset;
        }

        public OptionContract withSettleAsset(String settleAsset) {
            this.settleAsset = settleAsset;
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

        public OptionContract withAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
            return this;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(OptionContract.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("id");
            sb.append('=');
            sb.append(((this.id == null)?"<null>":this.id));
            sb.append(',');
            sb.append("baseAsset");
            sb.append('=');
            sb.append(((this.baseAsset == null)?"<null>":this.baseAsset));
            sb.append(',');
            sb.append("quoteAsset");
            sb.append('=');
            sb.append(((this.quoteAsset == null)?"<null>":this.quoteAsset));
            sb.append(',');
            sb.append("underlying");
            sb.append('=');
            sb.append(((this.underlying == null)?"<null>":this.underlying));
            sb.append(',');
            sb.append("settleAsset");
            sb.append('=');
            sb.append(((this.settleAsset == null)?"<null>":this.settleAsset));
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
            result = ((result* 31)+((this.settleAsset == null)? 0 :this.settleAsset.hashCode()));
            result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
            result = ((result* 31)+((this.baseAsset == null)? 0 :this.baseAsset.hashCode()));
            result = ((result* 31)+((this.underlying == null)? 0 :this.underlying.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.quoteAsset == null)? 0 :this.quoteAsset.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof OptionContract) == false) {
                return false;
            }
            OptionContract rhs = ((OptionContract) other);
            return (((((((this.settleAsset == rhs.settleAsset)||((this.settleAsset!= null)&&this.settleAsset.equals(rhs.settleAsset)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.baseAsset == rhs.baseAsset)||((this.baseAsset!= null)&&this.baseAsset.equals(rhs.baseAsset))))&&((this.underlying == rhs.underlying)||((this.underlying!= null)&&this.underlying.equals(rhs.underlying))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.quoteAsset == rhs.quoteAsset)||((this.quoteAsset!= null)&&this.quoteAsset.equals(rhs.quoteAsset))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
        "contractId",
        "expiryDate",
        "filters",
        "id",
        "symbol",
        "side",
        "strikePrice",
        "underlying",
        "unit",
        "makerFeeRate",
        "takerFeeRate",
        "minQty",
        "maxQty",
        "initialMargin",
        "maintenanceMargin",
        "minInitialMargin",
        "minMaintenanceMargin",
        "priceScale",
        "quantityScale",
        "quoteAsset"
    })
    @Generated("jsonschema2pojo")
    public static class OptionSymbol {

        @JsonProperty("contractId")
        private Integer contractId;
        @JsonProperty("expiryDate")
        private Long expiryDate;
        @JsonProperty("filters")
        private List<Filter> filters = new ArrayList<Filter>();
        @JsonProperty("id")
        private Integer id;
        @JsonProperty("symbol")
        private String symbol;
        @JsonProperty("side")
        private String side;
        @JsonProperty("strikePrice")
        private String strikePrice;
        @JsonProperty("underlying")
        private String underlying;
        @JsonProperty("unit")
        private Integer unit;
        @JsonProperty("makerFeeRate")
        private String makerFeeRate;
        @JsonProperty("takerFeeRate")
        private String takerFeeRate;
        @JsonProperty("minQty")
        private String minQty;
        @JsonProperty("maxQty")
        private String maxQty;
        @JsonProperty("initialMargin")
        private String initialMargin;
        @JsonProperty("maintenanceMargin")
        private String maintenanceMargin;
        @JsonProperty("minInitialMargin")
        private String minInitialMargin;
        @JsonProperty("minMaintenanceMargin")
        private String minMaintenanceMargin;
        @JsonProperty("priceScale")
        private Integer priceScale;
        @JsonProperty("quantityScale")
        private Integer quantityScale;
        @JsonProperty("quoteAsset")
        private String quoteAsset;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("contractId")
        public Integer getContractId() {
            return contractId;
        }

        @JsonProperty("contractId")
        public void setContractId(Integer contractId) {
            this.contractId = contractId;
        }

        public OptionSymbol withContractId(Integer contractId) {
            this.contractId = contractId;
            return this;
        }

        @JsonProperty("expiryDate")
        public Long getExpiryDate() {
            return expiryDate;
        }

        @JsonProperty("expiryDate")
        public void setExpiryDate(Long expiryDate) {
            this.expiryDate = expiryDate;
        }

        public OptionSymbol withExpiryDate(Long expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        @JsonProperty("filters")
        public List<Filter> getFilters() {
            return filters;
        }

        @JsonProperty("filters")
        public void setFilters(List<Filter> filters) {
            this.filters = filters;
        }

        public OptionSymbol withFilters(List<Filter> filters) {
            this.filters = filters;
            return this;
        }

        @JsonProperty("id")
        public Integer getId() {
            return id;
        }

        @JsonProperty("id")
        public void setId(Integer id) {
            this.id = id;
        }

        public OptionSymbol withId(Integer id) {
            this.id = id;
            return this;
        }

        @JsonProperty("symbol")
        public String getSymbol() {
            return symbol;
        }

        @JsonProperty("symbol")
        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public OptionSymbol withSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        @JsonProperty("side")
        public String getSide() {
            return side;
        }

        @JsonProperty("side")
        public void setSide(String side) {
            this.side = side;
        }

        public OptionSymbol withSide(String side) {
            this.side = side;
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

        public OptionSymbol withStrikePrice(String strikePrice) {
            this.strikePrice = strikePrice;
            return this;
        }

        @JsonProperty("underlying")
        public String getUnderlying() {
            return underlying;
        }

        @JsonProperty("underlying")
        public void setUnderlying(String underlying) {
            this.underlying = underlying;
        }

        public OptionSymbol withUnderlying(String underlying) {
            this.underlying = underlying;
            return this;
        }

        @JsonProperty("unit")
        public Integer getUnit() {
            return unit;
        }

        @JsonProperty("unit")
        public void setUnit(Integer unit) {
            this.unit = unit;
        }

        public OptionSymbol withUnit(Integer unit) {
            this.unit = unit;
            return this;
        }

        @JsonProperty("makerFeeRate")
        public String getMakerFeeRate() {
            return makerFeeRate;
        }

        @JsonProperty("makerFeeRate")
        public void setMakerFeeRate(String makerFeeRate) {
            this.makerFeeRate = makerFeeRate;
        }

        public OptionSymbol withMakerFeeRate(String makerFeeRate) {
            this.makerFeeRate = makerFeeRate;
            return this;
        }

        @JsonProperty("takerFeeRate")
        public String getTakerFeeRate() {
            return takerFeeRate;
        }

        @JsonProperty("takerFeeRate")
        public void setTakerFeeRate(String takerFeeRate) {
            this.takerFeeRate = takerFeeRate;
        }

        public OptionSymbol withTakerFeeRate(String takerFeeRate) {
            this.takerFeeRate = takerFeeRate;
            return this;
        }

        @JsonProperty("minQty")
        public String getMinQty() {
            return minQty;
        }

        @JsonProperty("minQty")
        public void setMinQty(String minQty) {
            this.minQty = minQty;
        }

        public OptionSymbol withMinQty(String minQty) {
            this.minQty = minQty;
            return this;
        }

        @JsonProperty("maxQty")
        public String getMaxQty() {
            return maxQty;
        }

        @JsonProperty("maxQty")
        public void setMaxQty(String maxQty) {
            this.maxQty = maxQty;
        }

        public OptionSymbol withMaxQty(String maxQty) {
            this.maxQty = maxQty;
            return this;
        }

        @JsonProperty("initialMargin")
        public String getInitialMargin() {
            return initialMargin;
        }

        @JsonProperty("initialMargin")
        public void setInitialMargin(String initialMargin) {
            this.initialMargin = initialMargin;
        }

        public OptionSymbol withInitialMargin(String initialMargin) {
            this.initialMargin = initialMargin;
            return this;
        }

        @JsonProperty("maintenanceMargin")
        public String getMaintenanceMargin() {
            return maintenanceMargin;
        }

        @JsonProperty("maintenanceMargin")
        public void setMaintenanceMargin(String maintenanceMargin) {
            this.maintenanceMargin = maintenanceMargin;
        }

        public OptionSymbol withMaintenanceMargin(String maintenanceMargin) {
            this.maintenanceMargin = maintenanceMargin;
            return this;
        }

        @JsonProperty("minInitialMargin")
        public String getMinInitialMargin() {
            return minInitialMargin;
        }

        @JsonProperty("minInitialMargin")
        public void setMinInitialMargin(String minInitialMargin) {
            this.minInitialMargin = minInitialMargin;
        }

        public OptionSymbol withMinInitialMargin(String minInitialMargin) {
            this.minInitialMargin = minInitialMargin;
            return this;
        }

        @JsonProperty("minMaintenanceMargin")
        public String getMinMaintenanceMargin() {
            return minMaintenanceMargin;
        }

        @JsonProperty("minMaintenanceMargin")
        public void setMinMaintenanceMargin(String minMaintenanceMargin) {
            this.minMaintenanceMargin = minMaintenanceMargin;
        }

        public OptionSymbol withMinMaintenanceMargin(String minMaintenanceMargin) {
            this.minMaintenanceMargin = minMaintenanceMargin;
            return this;
        }

        @JsonProperty("priceScale")
        public Integer getPriceScale() {
            return priceScale;
        }

        @JsonProperty("priceScale")
        public void setPriceScale(Integer priceScale) {
            this.priceScale = priceScale;
        }

        public OptionSymbol withPriceScale(Integer priceScale) {
            this.priceScale = priceScale;
            return this;
        }

        @JsonProperty("quantityScale")
        public Integer getQuantityScale() {
            return quantityScale;
        }

        @JsonProperty("quantityScale")
        public void setQuantityScale(Integer quantityScale) {
            this.quantityScale = quantityScale;
        }

        public OptionSymbol withQuantityScale(Integer quantityScale) {
            this.quantityScale = quantityScale;
            return this;
        }

        @JsonProperty("quoteAsset")
        public String getQuoteAsset() {
            return quoteAsset;
        }

        @JsonProperty("quoteAsset")
        public void setQuoteAsset(String quoteAsset) {
            this.quoteAsset = quoteAsset;
        }

        public OptionSymbol withQuoteAsset(String quoteAsset) {
            this.quoteAsset = quoteAsset;
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

        public OptionSymbol withAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
            return this;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(OptionSymbol.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("contractId");
            sb.append('=');
            sb.append(((this.contractId == null)?"<null>":this.contractId));
            sb.append(',');
            sb.append("expiryDate");
            sb.append('=');
            sb.append(((this.expiryDate == null)?"<null>":this.expiryDate));
            sb.append(',');
            sb.append("filters");
            sb.append('=');
            sb.append(((this.filters == null)?"<null>":this.filters));
            sb.append(',');
            sb.append("id");
            sb.append('=');
            sb.append(((this.id == null)?"<null>":this.id));
            sb.append(',');
            sb.append("symbol");
            sb.append('=');
            sb.append(((this.symbol == null)?"<null>":this.symbol));
            sb.append(',');
            sb.append("side");
            sb.append('=');
            sb.append(((this.side == null)?"<null>":this.side));
            sb.append(',');
            sb.append("strikePrice");
            sb.append('=');
            sb.append(((this.strikePrice == null)?"<null>":this.strikePrice));
            sb.append(',');
            sb.append("underlying");
            sb.append('=');
            sb.append(((this.underlying == null)?"<null>":this.underlying));
            sb.append(',');
            sb.append("unit");
            sb.append('=');
            sb.append(((this.unit == null)?"<null>":this.unit));
            sb.append(',');
            sb.append("makerFeeRate");
            sb.append('=');
            sb.append(((this.makerFeeRate == null)?"<null>":this.makerFeeRate));
            sb.append(',');
            sb.append("takerFeeRate");
            sb.append('=');
            sb.append(((this.takerFeeRate == null)?"<null>":this.takerFeeRate));
            sb.append(',');
            sb.append("minQty");
            sb.append('=');
            sb.append(((this.minQty == null)?"<null>":this.minQty));
            sb.append(',');
            sb.append("maxQty");
            sb.append('=');
            sb.append(((this.maxQty == null)?"<null>":this.maxQty));
            sb.append(',');
            sb.append("initialMargin");
            sb.append('=');
            sb.append(((this.initialMargin == null)?"<null>":this.initialMargin));
            sb.append(',');
            sb.append("maintenanceMargin");
            sb.append('=');
            sb.append(((this.maintenanceMargin == null)?"<null>":this.maintenanceMargin));
            sb.append(',');
            sb.append("minInitialMargin");
            sb.append('=');
            sb.append(((this.minInitialMargin == null)?"<null>":this.minInitialMargin));
            sb.append(',');
            sb.append("minMaintenanceMargin");
            sb.append('=');
            sb.append(((this.minMaintenanceMargin == null)?"<null>":this.minMaintenanceMargin));
            sb.append(',');
            sb.append("priceScale");
            sb.append('=');
            sb.append(((this.priceScale == null)?"<null>":this.priceScale));
            sb.append(',');
            sb.append("quantityScale");
            sb.append('=');
            sb.append(((this.quantityScale == null)?"<null>":this.quantityScale));
            sb.append(',');
            sb.append("quoteAsset");
            sb.append('=');
            sb.append(((this.quoteAsset == null)?"<null>":this.quoteAsset));
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
            result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
            result = ((result* 31)+((this.side == null)? 0 :this.side.hashCode()));
            result = ((result* 31)+((this.minInitialMargin == null)? 0 :this.minInitialMargin.hashCode()));
            result = ((result* 31)+((this.makerFeeRate == null)? 0 :this.makerFeeRate.hashCode()));
            result = ((result* 31)+((this.filters == null)? 0 :this.filters.hashCode()));
            result = ((result* 31)+((this.underlying == null)? 0 :this.underlying.hashCode()));
            result = ((result* 31)+((this.initialMargin == null)? 0 :this.initialMargin.hashCode()));
            result = ((result* 31)+((this.expiryDate == null)? 0 :this.expiryDate.hashCode()));
            result = ((result* 31)+((this.unit == null)? 0 :this.unit.hashCode()));
            result = ((result* 31)+((this.maintenanceMargin == null)? 0 :this.maintenanceMargin.hashCode()));
            result = ((result* 31)+((this.contractId == null)? 0 :this.contractId.hashCode()));
            result = ((result* 31)+((this.quantityScale == null)? 0 :this.quantityScale.hashCode()));
            result = ((result* 31)+((this.takerFeeRate == null)? 0 :this.takerFeeRate.hashCode()));
            result = ((result* 31)+((this.priceScale == null)? 0 :this.priceScale.hashCode()));
            result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.maxQty == null)? 0 :this.maxQty.hashCode()));
            result = ((result* 31)+((this.minMaintenanceMargin == null)? 0 :this.minMaintenanceMargin.hashCode()));
            result = ((result* 31)+((this.strikePrice == null)? 0 :this.strikePrice.hashCode()));
            result = ((result* 31)+((this.quoteAsset == null)? 0 :this.quoteAsset.hashCode()));
            result = ((result* 31)+((this.minQty == null)? 0 :this.minQty.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof OptionSymbol) == false) {
                return false;
            }
            OptionSymbol rhs = ((OptionSymbol) other);
            return ((((((((((((((((((((((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.side == rhs.side)||((this.side!= null)&&this.side.equals(rhs.side))))&&((this.minInitialMargin == rhs.minInitialMargin)||((this.minInitialMargin!= null)&&this.minInitialMargin.equals(rhs.minInitialMargin))))&&((this.makerFeeRate == rhs.makerFeeRate)||((this.makerFeeRate!= null)&&this.makerFeeRate.equals(rhs.makerFeeRate))))&&((this.filters == rhs.filters)||((this.filters!= null)&&this.filters.equals(rhs.filters))))&&((this.underlying == rhs.underlying)||((this.underlying!= null)&&this.underlying.equals(rhs.underlying))))&&((this.initialMargin == rhs.initialMargin)||((this.initialMargin!= null)&&this.initialMargin.equals(rhs.initialMargin))))&&((this.expiryDate == rhs.expiryDate)||((this.expiryDate!= null)&&this.expiryDate.equals(rhs.expiryDate))))&&((this.unit == rhs.unit)||((this.unit!= null)&&this.unit.equals(rhs.unit))))&&((this.maintenanceMargin == rhs.maintenanceMargin)||((this.maintenanceMargin!= null)&&this.maintenanceMargin.equals(rhs.maintenanceMargin))))&&((this.contractId == rhs.contractId)||((this.contractId!= null)&&this.contractId.equals(rhs.contractId))))&&((this.quantityScale == rhs.quantityScale)||((this.quantityScale!= null)&&this.quantityScale.equals(rhs.quantityScale))))&&((this.takerFeeRate == rhs.takerFeeRate)||((this.takerFeeRate!= null)&&this.takerFeeRate.equals(rhs.takerFeeRate))))&&((this.priceScale == rhs.priceScale)||((this.priceScale!= null)&&this.priceScale.equals(rhs.priceScale))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.maxQty == rhs.maxQty)||((this.maxQty!= null)&&this.maxQty.equals(rhs.maxQty))))&&((this.minMaintenanceMargin == rhs.minMaintenanceMargin)||((this.minMaintenanceMargin!= null)&&this.minMaintenanceMargin.equals(rhs.minMaintenanceMargin))))&&((this.strikePrice == rhs.strikePrice)||((this.strikePrice!= null)&&this.strikePrice.equals(rhs.strikePrice))))&&((this.quoteAsset == rhs.quoteAsset)||((this.quoteAsset!= null)&&this.quoteAsset.equals(rhs.quoteAsset))))&&((this.minQty == rhs.minQty)||((this.minQty!= null)&&this.minQty.equals(rhs.minQty))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
        "rateLimitType",
        "interval",
        "intervalNum",
        "limit"
    })
    @Generated("jsonschema2pojo")
    public static class RateLimit {

        @JsonProperty("rateLimitType")
        private String rateLimitType;
        @JsonProperty("interval")
        private String interval;
        @JsonProperty("intervalNum")
        private Integer intervalNum;
        @JsonProperty("limit")
        private Integer limit;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("rateLimitType")
        public String getRateLimitType() {
            return rateLimitType;
        }

        @JsonProperty("rateLimitType")
        public void setRateLimitType(String rateLimitType) {
            this.rateLimitType = rateLimitType;
        }

        public RateLimit withRateLimitType(String rateLimitType) {
            this.rateLimitType = rateLimitType;
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

        public RateLimit withInterval(String interval) {
            this.interval = interval;
            return this;
        }

        @JsonProperty("intervalNum")
        public Integer getIntervalNum() {
            return intervalNum;
        }

        @JsonProperty("intervalNum")
        public void setIntervalNum(Integer intervalNum) {
            this.intervalNum = intervalNum;
        }

        public RateLimit withIntervalNum(Integer intervalNum) {
            this.intervalNum = intervalNum;
            return this;
        }

        @JsonProperty("limit")
        public Integer getLimit() {
            return limit;
        }

        @JsonProperty("limit")
        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        public RateLimit withLimit(Integer limit) {
            this.limit = limit;
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

        public RateLimit withAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
            return this;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(RateLimit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("rateLimitType");
            sb.append('=');
            sb.append(((this.rateLimitType == null)?"<null>":this.rateLimitType));
            sb.append(',');
            sb.append("interval");
            sb.append('=');
            sb.append(((this.interval == null)?"<null>":this.interval));
            sb.append(',');
            sb.append("intervalNum");
            sb.append('=');
            sb.append(((this.intervalNum == null)?"<null>":this.intervalNum));
            sb.append(',');
            sb.append("limit");
            sb.append('=');
            sb.append(((this.limit == null)?"<null>":this.limit));
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
            result = ((result* 31)+((this.limit == null)? 0 :this.limit.hashCode()));
            result = ((result* 31)+((this.intervalNum == null)? 0 :this.intervalNum.hashCode()));
            result = ((result* 31)+((this.interval == null)? 0 :this.interval.hashCode()));
            result = ((result* 31)+((this.rateLimitType == null)? 0 :this.rateLimitType.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof RateLimit) == false) {
                return false;
            }
            RateLimit rhs = ((RateLimit) other);
            return ((((((this.limit == rhs.limit)||((this.limit!= null)&&this.limit.equals(rhs.limit)))&&((this.intervalNum == rhs.intervalNum)||((this.intervalNum!= null)&&this.intervalNum.equals(rhs.intervalNum))))&&((this.interval == rhs.interval)||((this.interval!= null)&&this.interval.equals(rhs.interval))))&&((this.rateLimitType == rhs.rateLimitType)||((this.rateLimitType!= null)&&this.rateLimitType.equals(rhs.rateLimitType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
        }

    }
}
