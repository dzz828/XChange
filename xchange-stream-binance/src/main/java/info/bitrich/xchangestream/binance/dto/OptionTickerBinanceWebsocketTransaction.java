package info.bitrich.xchangestream.binance.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.Optional;

public class OptionTickerBinanceWebsocketTransaction extends TickerBinanceWebsocketTransaction {

  public OptionTickerBinanceWebsocketTransaction(
      @JsonProperty("e") String eventType,
      @JsonProperty("E") Long eventTime,
      @JsonProperty("T") Long transactionTime,
      @JsonProperty("s") String symbol,
      @JsonProperty("o") BigDecimal openPrice,
      @JsonProperty("h") BigDecimal highPrice,
      @JsonProperty("l") BigDecimal lowPrice,
      @JsonProperty("c") BigDecimal lastPrice,
      @JsonProperty("V") BigDecimal tradingVolume,
      @JsonProperty("A") BigDecimal tradingAmount,
      @JsonProperty("p") BigDecimal priceChange,
      @JsonProperty("P") BigDecimal priceChangePercent,
      @JsonProperty("Q") BigDecimal lastQty,
      @JsonProperty("F") Long firstId,
      @JsonProperty("L") Long lastId,
      @JsonProperty("n") Long count,
      @JsonProperty("bo") BigDecimal bestBuyPrice,
      @JsonProperty("bq") BigDecimal bestBuyQty,
      @JsonProperty("ao") BigDecimal bestSellPrice,
      @JsonProperty("aq") BigDecimal bestSellQty,
      @JsonProperty("b") BigDecimal buyIV,
      @JsonProperty("a") BigDecimal sellIV,
      @JsonProperty("d") BigDecimal delta,
      @JsonProperty("t") BigDecimal theta,
      @JsonProperty("g") BigDecimal gamma,
      @JsonProperty("v") BigDecimal vega,
      @JsonProperty("vo") BigDecimal iv,
      @JsonProperty("mp") BigDecimal markPrice,
      @JsonProperty("hl") BigDecimal buyMaxPrice,
      @JsonProperty("ll") BigDecimal sellMinPrice,
      @JsonProperty("eep") BigDecimal estimatedStrikePrice) {

    super(eventType,
        String.valueOf(Optional.of(eventTime).orElse(0L)),
        symbol,
        priceChange,
        priceChangePercent,
        null,
        null,
        lastPrice,
        lastQty,
        bestBuyPrice,
        bestBuyQty,
        bestSellPrice,
        bestSellQty,
        openPrice,
        highPrice,
        lowPrice,
        tradingVolume,
        tradingAmount,
        -1L,
        -1L,
        firstId,
        lastId,
        count);

    ticker.setIv(iv);
    ticker.setDelta(delta);
    ticker.setGamma(gamma);
    ticker.setTheta(theta);
    ticker.setVega(vega);
    ticker.setBuyIV(buyIV);
    ticker.setSellIV(sellIV);
  }

}
