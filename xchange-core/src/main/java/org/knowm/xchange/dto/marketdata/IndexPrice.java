package org.knowm.xchange.dto.marketdata;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class IndexPrice {
    Long time;
    String underlyingSymbol;
    BigDecimal indexPrice;
}
