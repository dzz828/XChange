package org.knowm.xchange.binance;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;
import org.knowm.xchange.binance.dto.BinanceException;
import org.knowm.xchange.binance.dto.marketdata.BinanceOrderbook;
import org.knowm.xchange.binance.dto.marketdata.option.BinanceOptionHistoricalTrade;
import org.knowm.xchange.binance.dto.marketdata.option.BinanceOptionRecentTrade;
import org.knowm.xchange.binance.dto.meta.BinanceTime;
import org.knowm.xchange.binance.dto.meta.exchangeinfo.option.BinanceOptionExchangeInfo;
import org.knowm.xchange.binance.dto.marketdata.option.BinanceOptionKline;
import org.knowm.xchange.binance.dto.marketdata.option.BinanceOptionMarkPrice;
import org.knowm.xchange.binance.dto.marketdata.option.BinanceOptionTicker24h;
import org.knowm.xchange.binance.dto.marketdata.option.BinanceOptionUnderlyingIndexPrice;

@Path("")
@Produces(MediaType.APPLICATION_JSON)
public interface BinanceOption {

  @GET
  @Path("eapi/v1/ping")
  Object ping() throws IOException;

  @GET
  @Path("eapi/v1/time")
  BinanceTime time() throws IOException;

  @GET
  @Path("eapi/v1/exchangeInfo")
  BinanceOptionExchangeInfo exchangeInfo() throws IOException;

  @GET
  @Path("eapi/v1/depth")
  BinanceOrderbook depth(@QueryParam("symbol") String symbol, @QueryParam("limit") Integer limit)
      throws IOException, BinanceException;

  @GET
  @Path("eapi/v1/trades")
  List<BinanceOptionRecentTrade> recentTrades(@QueryParam("symbol") String symbol, @QueryParam("limit") Integer limit)
      throws IOException, BinanceException;


  @GET
  @Path("eapi/v1/historicalTrades")
  List<BinanceOptionHistoricalTrade> historicalTrades(@QueryParam("symbol") String symbol, @QueryParam("fromId") Long fromId, @QueryParam("limit") Integer limit)
      throws IOException, BinanceException;

  @GET
  @Path("api/v3/klines")
  List<BinanceOptionKline> klines(
      @QueryParam("symbol") String symbol,
      @QueryParam("interval") String interval,
      @QueryParam("limit") Integer limit,
      @QueryParam("startTime") Long startTime,
      @QueryParam("endTime") Long endTime)
      throws IOException, BinanceException;

  @GET
  @Path("eapi/v1/mark")
  List<BinanceOptionMarkPrice> markPrice(@QueryParam("symbol") String symbol)
      throws IOException, BinanceException;

  @GET
  @Path("eapi/v1/ticker")
  List<BinanceOptionTicker24h> ticker24h(@QueryParam("symbol") String symbol) throws IOException, BinanceException;

  @GET
  @Path("eapi/v1/index")
  BinanceOptionUnderlyingIndexPrice underlyingIndexPrice(@QueryParam("underlying") String underlying) throws IOException, BinanceException;


}