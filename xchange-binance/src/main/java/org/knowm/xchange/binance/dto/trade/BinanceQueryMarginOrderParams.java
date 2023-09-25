package org.knowm.xchange.binance.dto.trade;

import lombok.Getter;
import org.knowm.xchange.binance.dto.trade.margin.IsIsolated;
import org.knowm.xchange.instrument.Instrument;
import org.knowm.xchange.service.trade.params.orders.OrderQueryParamInstrument;

@Getter
public class BinanceQueryMarginOrderParams extends BinanceQueryOrderParams {
  private final IsIsolated isIsolated;


  public BinanceQueryMarginOrderParams(Instrument instrument, String orderId, IsIsolated isIsolated) {
    super(instrument, orderId);
    this.isIsolated = isIsolated;
  }

}
