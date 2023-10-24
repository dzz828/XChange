
package org.knowm.xchange.binance.dto.marketdata.option;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import org.knowm.xchange.binance.BinanceAdapters;
import org.knowm.xchange.derivative.OptionsContract;
import org.knowm.xchange.dto.marketdata.Ticker;

@Value
@Jacksonized
@Builder(toBuilder = true)
public class BinanceOptionTicker24h {
    String symbol;
    String priceChange;
    BigDecimal priceChangePercent;
    BigDecimal lastPrice;
    BigDecimal lastQty;
    BigDecimal open;
    BigDecimal high;
    BigDecimal low;
    BigDecimal volume;
    BigDecimal amount;
    BigDecimal bidPrice;
    BigDecimal askPrice;
    Long openTime;
    Long closeTime;
    Integer firstTradeId;
    Integer tradeCount;
    String strikePrice;
    String exercisePrice;

    public Ticker toTicker() {
        return new Ticker.Builder()
            .instrument(BinanceAdapters.adaptSymbol(symbol, BinanceAdapters.OPTION))
            .open(open)
            .ask(askPrice)
            .bid(bidPrice)
            .last(lastPrice)
            .high(high)
            .low(low)
            .volume(volume)
            .quoteVolume(amount)
            .timestamp(closeTime > 0 ? new Date(closeTime) : null)
            .percentageChange(priceChangePercent)
            .build();
    }

}
