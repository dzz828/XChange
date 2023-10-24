package org.knowm.xchange.okex.dto.marketdata;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class OkexIndexTicker {
    @JsonProperty("instId")
    private String instrumentId;

    @JsonProperty("idxPx")
    private BigDecimal indexPrice;

    @JsonProperty("ts")
    private Date timestamp;
}
