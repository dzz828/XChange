package org.knowm.xchange.binance.dto.trade.margin;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.knowm.xchange.dto.Order;

public enum IsIsolated implements Order.IOrderFlags {
  ISOLATED("TRUE"),
  CROSS("FALSE");

  private final String isIsolated;

  IsIsolated(String isIsolated) {
    this.isIsolated = isIsolated;
  }

  @Override
  public String toString() {
    return isIsolated;
  }

  @JsonCreator
  public static IsIsolated getIsIsolated(String s) {
    try {
      return Boolean.parseBoolean(s) ? ISOLATED : CROSS;
    } catch (Exception e) {
      throw new RuntimeException("Unknown account type " + s + ".");
    }
  }
}