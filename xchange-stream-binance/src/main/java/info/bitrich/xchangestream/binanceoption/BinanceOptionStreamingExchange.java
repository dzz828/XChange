package info.bitrich.xchangestream.binanceoption;

import info.bitrich.xchangestream.binance.BinanceStreamingExchange;

/** Simple endpoint switch as we cannot inject it when setting up the endpoint. */
public class BinanceOptionStreamingExchange extends BinanceStreamingExchange {

  private static final String WS_API_BASE_URI = "wss://nbstream.binance.com/eoptions/";

  protected String getStreamingBaseUri() {
    return WS_API_BASE_URI;
  }
}
