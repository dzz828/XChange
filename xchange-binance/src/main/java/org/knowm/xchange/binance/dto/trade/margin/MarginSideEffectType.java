package org.knowm.xchange.binance.dto.trade.margin;

import org.knowm.xchange.dto.Order;

public enum MarginSideEffectType implements Order.IOrderFlags {
  NO_SIDE_EFFECT,
  MARGIN_BUY,
  AUTO_REPAY;

}
