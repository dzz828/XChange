package org.knowm.xchange.okex.dto.marketdata;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class OkexOptionSummary {
  private String instType;
  private String instId;
  private String uly;
  private BigDecimal delta;
  private BigDecimal gamma;
  private BigDecimal theta;
  private BigDecimal vega;
  private BigDecimal deltaBS;
  private BigDecimal gammaBS;
  private BigDecimal thetaBS;
  private BigDecimal vegaBS;
  private BigDecimal realVol;
  private BigDecimal bidVol;
  private BigDecimal askVol;
  private BigDecimal markVol;
  private BigDecimal volLv;
  private BigDecimal lever;
  private BigDecimal fwdPx;
  private Date ts;
}
