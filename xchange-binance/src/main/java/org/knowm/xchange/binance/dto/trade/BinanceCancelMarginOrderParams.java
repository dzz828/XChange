package org.knowm.xchange.binance.dto.trade;

import lombok.Getter;
import org.knowm.xchange.binance.dto.trade.margin.IsIsolated;
import org.knowm.xchange.instrument.Instrument;
import org.knowm.xchange.service.trade.params.CancelOrderByIdParams;
import org.knowm.xchange.service.trade.params.CancelOrderByInstrument;

@Getter
public class BinanceCancelMarginOrderParams extends BinanceCancelOrderParams {
  private final IsIsolated isIsolated;
  public BinanceCancelMarginOrderParams(Instrument pair, String orderId, IsIsolated isIsolated) {
    super(pair, orderId);
    this.isIsolated = isIsolated;
  }

}
