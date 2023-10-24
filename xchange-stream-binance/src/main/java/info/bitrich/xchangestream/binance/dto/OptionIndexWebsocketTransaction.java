package info.bitrich.xchangestream.binance.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Optional;
import lombok.Getter;
import org.knowm.xchange.binance.BinanceAdapters;
import org.knowm.xchange.dto.marketdata.FundingRate;
import org.knowm.xchange.dto.marketdata.IndexPrice;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class OptionIndexWebsocketTransaction extends ProductBinanceWebSocketTransaction{

    private final BigDecimal indexPrice;

    public OptionIndexWebsocketTransaction(
            @JsonProperty("e") String eventType,
            @JsonProperty("E") String eventTime,
            @JsonProperty("s") String underlyingSymbol,
            @JsonProperty("p") BigDecimal indexPrice) {
        super(eventType, eventTime, underlyingSymbol);
        this.indexPrice = indexPrice;
    }

    public IndexPrice toIndexPrice() {
        return IndexPrice.builder()
            .time(Optional.ofNullable(this.getEventTime()).map(Date::getTime).orElse(null))
            .underlyingSymbol(this.getSymbol())
            .indexPrice(this.getIndexPrice())
            .build();

    }
}
