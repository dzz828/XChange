package org.knowm.xchange.dto.marketdata;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Objects;
import lombok.Getter;
import lombok.ToString;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.instrument.Instrument;
import org.knowm.xchange.utils.Assert;

/**
 * A class encapsulating the information a "Ticker" can contain. Some fields can be empty if not
 * provided by the exchange.
 *
 * <p>A ticker contains data representing the latest trade.
 */
@JsonDeserialize(builder = Ticker.Builder.class)
@ToString
@Getter
public final class Ticker implements Serializable {

  private static final long serialVersionUID = -3247730106987193154L;

  private final Instrument instrument;
  private final BigDecimal open;
  private final BigDecimal last;
  private final BigDecimal bid;
  private final BigDecimal ask;
  private final BigDecimal high;
  private final BigDecimal low;
  private final BigDecimal vwap;
  private final BigDecimal volume;
  private final BigDecimal quoteVolume;
  /** the timestamp of the ticker according to the exchange's server, null if not provided */
  private final Date timestamp;

  private final BigDecimal bidSize;
  private final BigDecimal askSize;
  private final BigDecimal percentageChange;
  private final BigDecimal buyVol;
  private final BigDecimal sellVol;
  private final BigDecimal delta;
  private final BigDecimal theta;
  private final BigDecimal gamma;
  private final BigDecimal vega;
  private final BigDecimal deltaBS;
  private final BigDecimal thetaBS;
  private final BigDecimal gammaBS;
  private final BigDecimal vegaBS;
  private final BigDecimal iv;
  private final BigDecimal markVol;

  /**
   * Constructor
   *
   * @param instrument The tradable identifier (e.g. BTC in BTC/USD)
   * @param last Last price
   * @param bid Bid price
   * @param ask Ask price
   * @param high High price
   * @param low Low price
   * @param vwap Volume Weighted Average Price
   * @param volume 24h volume in base currency
   * @param quoteVolume 24h volume in counter currency
   * @param timestamp - the timestamp of the ticker according to the exchange's server, null if not
   *     provided
   * @param bidSize The instantaneous size at the bid price
   * @param askSize The instantaneous size at the ask price
   * @param percentageChange Price percentage change. Is compared against the last price value. Will
   *     be null if not provided and cannot be calculated. Should be represented as percentage (e.g.
   *     0.5 equal 0.5%, 1 equal 1%, 50 equal 50%, 100 equal 100%)
   */
  private Ticker(
      Instrument instrument,
      BigDecimal open,
      BigDecimal last,
      BigDecimal bid,
      BigDecimal ask,
      BigDecimal high,
      BigDecimal low,
      BigDecimal vwap,
      BigDecimal volume,
      BigDecimal quoteVolume,
      Date timestamp,
      BigDecimal bidSize,
      BigDecimal askSize,
      BigDecimal percentageChange,
      BigDecimal buyVol,
      BigDecimal sellVol,
      BigDecimal delta,
      BigDecimal theta,
      BigDecimal gamma,
      BigDecimal vega,
      BigDecimal deltaBS,
      BigDecimal thetaBS,
      BigDecimal gammaBS,
      BigDecimal vegaBS,
      BigDecimal iv,
      BigDecimal markVol) {
    this.open = open;
    this.instrument = instrument;
    this.last = last;
    this.bid = bid;
    this.ask = ask;
    this.high = high;
    this.low = low;
    this.vwap = vwap;
    this.volume = volume;
    this.quoteVolume = quoteVolume;
    this.timestamp = timestamp;
    this.bidSize = bidSize;
    this.askSize = askSize;
    this.percentageChange = percentageChange;
    this.buyVol = buyVol;
    this.sellVol = sellVol;
    this.delta = delta;
    this.theta = theta;
    this.gamma = gamma;
    this.vega = vega;
    this.deltaBS = deltaBS;
    this.thetaBS = thetaBS;
    this.gammaBS = gammaBS;
    this.vegaBS = vegaBS;
    this.iv = iv;
    this.markVol = markVol;
  }


  /**
   * @deprecated CurrencyPair is a subtype of Instrument - this method will throw an exception if
   *     the order was for a derivative
   *     <p>use {@link #getInstrument()} instead
   */
  @Deprecated
  @JsonIgnore
  public CurrencyPair getCurrencyPair() {
    if (instrument == null) {
      return null;
    }
    if (!(instrument instanceof CurrencyPair)) {
      throw new IllegalStateException(
          "The instrument of this order is not a currency pair: " + instrument);
    }
    return (CurrencyPair) instrument;
  }


  public BigDecimal getVolume() {
    if (volume == null && quoteVolume != null && last != null && !last.equals(BigDecimal.ZERO)) {
      return quoteVolume.divide(last, RoundingMode.HALF_UP);
    }

    return volume;
  }

  public BigDecimal getQuoteVolume() {
    if (quoteVolume == null && volume != null && last != null) {
      return volume.multiply(last);
    }
    return quoteVolume;
  }



  /**
   * Builder to provide the following to {@link Ticker}:
   *
   * <ul>
   *   <li>Provision of fluent chained construction interface
   * </ul>
   */
  @JsonPOJOBuilder(withPrefix = "")
  public static class Builder {

    private Instrument instrument;
    private BigDecimal open;
    private BigDecimal last;
    private BigDecimal bid;
    private BigDecimal ask;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal vwap;
    private BigDecimal volume;
    private BigDecimal quoteVolume;
    private Date timestamp;
    private BigDecimal bidSize;
    private BigDecimal askSize;
    private BigDecimal percentageChange;
    private BigDecimal buyVol;
    private BigDecimal sellVol;
    private BigDecimal delta;
    private BigDecimal theta;
    private BigDecimal gamma;
    private BigDecimal vega;
    private BigDecimal deltaBS;
    private BigDecimal thetaBS;
    private BigDecimal gammaBS;
    private BigDecimal vegaBS;
    private BigDecimal iv;
    private BigDecimal markVol;


    // Prevent repeat builds
    private boolean isBuilt = false;

    public Ticker build() {

      validateState();

      Ticker ticker =
          new Ticker(
              instrument,
              open,
              last,
              bid,
              ask,
              high,
              low,
              vwap,
              volume,
              quoteVolume,
              timestamp,
              bidSize,
              askSize,
              percentageChange,
              buyVol,
              sellVol,
              delta,
              theta,
              gamma,
              vega,
              deltaBS,
              thetaBS,
              gammaBS,
              vegaBS,
              iv,
              markVol);

      isBuilt = true;

      return ticker;
    }

    private void validateState() {

      if (isBuilt) {
        throw new IllegalStateException("The entity has been built");
      }
    }

    public Builder instrument(Instrument instrument) {
      Assert.notNull(instrument, "Null instrument");
      this.instrument = instrument;
      return this;
    }

    /** @deprecated Use {@link #instrument(Instrument)} */
    @Deprecated
    public Builder currencyPair(CurrencyPair currencyPair) {
      return instrument(currencyPair);
    }

    public Builder open(BigDecimal open) {

      this.open = open;
      return this;
    }

    public Builder last(BigDecimal last) {

      this.last = last;
      return this;
    }

    public Builder bid(BigDecimal bid) {

      this.bid = bid;
      return this;
    }

    public Builder ask(BigDecimal ask) {

      this.ask = ask;
      return this;
    }

    public Builder high(BigDecimal high) {

      this.high = high;
      return this;
    }

    public Builder low(BigDecimal low) {

      this.low = low;
      return this;
    }

    public Builder vwap(BigDecimal vwap) {

      this.vwap = vwap;
      return this;
    }

    public Builder volume(BigDecimal volume) {

      this.volume = volume;
      return this;
    }

    public Builder quoteVolume(BigDecimal quoteVolume) {

      this.quoteVolume = quoteVolume;
      return this;
    }

    public Builder timestamp(Date timestamp) {

      this.timestamp = timestamp;
      return this;
    }

    public Builder bidSize(BigDecimal bidSize) {
      this.bidSize = bidSize;
      return this;
    }

    public Builder askSize(BigDecimal askSize) {
      this.askSize = askSize;
      return this;
    }

    public Builder percentageChange(BigDecimal percentageChange) {
      this.percentageChange = percentageChange;
      return this;
    }

    public Builder buyVol(BigDecimal buyVol) {
      this.buyVol = buyVol;
      return this;
    }

    public Builder sellVol(BigDecimal sellVol) {
      this.sellVol = sellVol;
      return this;
    }

    public Builder delta(BigDecimal delta) {
      this.delta = delta;
      return this;
    }

    public Builder theta(BigDecimal theta) {
      this.theta = theta;
      return this;
    }

    public Builder gamma(BigDecimal gamma) {
      this.gamma = gamma;
      return this;
    }

    public Builder vega(BigDecimal vega) {
      this.vega = vega;
      return this;
    }

    public Builder deltaBS(BigDecimal deltaBS) {
      this.deltaBS = deltaBS;
      return this;
    }

    public Builder thetaBS(BigDecimal thetaBS) {
      this.thetaBS = thetaBS;
      return this;
    }

    public Builder gammaBS(BigDecimal gammaBS) {
      this.gammaBS = gammaBS;
      return this;
    }

    public Builder vegaBS(BigDecimal vegaBS) {
      this.vegaBS = vegaBS;
      return this;
    }

    public Builder iv(BigDecimal iv) {
      this.iv = iv;
      return this;
    }

    public Builder markVol(BigDecimal markVol) {
      this.markVol = markVol;
      return this;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Ticker ticker = (Ticker) o;
    return Objects.equals(getInstrument(), ticker.getInstrument())
        && Objects.equals(getOpen(), ticker.getOpen())
        && Objects.equals(getLast(), ticker.getLast())
        && Objects.equals(getBid(), ticker.getBid())
        && Objects.equals(getAsk(), ticker.getAsk())
        && Objects.equals(getHigh(), ticker.getHigh())
        && Objects.equals(getLow(), ticker.getLow())
        && Objects.equals(getVwap(), ticker.getVwap())
        && Objects.equals(getVolume(), ticker.getVolume())
        && Objects.equals(getQuoteVolume(), ticker.getQuoteVolume())
        && Objects.equals(getTimestamp(), ticker.getTimestamp())
        && Objects.equals(getBidSize(), ticker.getBidSize())
        && Objects.equals(getAskSize(), ticker.getAskSize())
        && Objects.equals(getBuyVol(), ticker.getBuyVol())
        && Objects.equals(getSellVol(), ticker.getSellVol())
        && Objects.equals(getDelta(), ticker.getDelta())
        && Objects.equals(getTheta(), ticker.getTheta())
        && Objects.equals(getGamma(), ticker.getGamma())
        && Objects.equals(getVega(), ticker.getVega())
        && Objects.equals(getDeltaBS(), ticker.getDeltaBS())
        && Objects.equals(getThetaBS(), ticker.getThetaBS())
        && Objects.equals(getGammaBS(), ticker.getGammaBS())
        && Objects.equals(getVegaBS(), ticker.getVegaBS())
        && Objects.equals(getIv(), ticker.getIv())
        && Objects.equals(getMarkVol(), ticker.getMarkVol())
        ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        getInstrument(),
        getOpen(),
        getLast(),
        getBid(),
        getAsk(),
        getHigh(),
        getLow(),
        getVwap(),
        getVolume(),
        getQuoteVolume(),
        getTimestamp(),
        getBidSize(),
        getAskSize(),
        getBuyVol(),
        getSellVol(),
        getDelta(),
        getTheta(),
        getGamma(),
        getVega(),
        getDeltaBS(),
        getThetaBS(),
        getGammaBS(),
        getVegaBS(),
        getIv());
  }
}
