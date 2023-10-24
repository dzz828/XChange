package org.knowm.xchange.service.marketdata.params;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class AllProductTickerParams implements Params {
  String instType;
  String underlying;
}
