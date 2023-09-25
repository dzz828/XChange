package org.knowm.xchange.binance.service;

import static org.knowm.xchange.binance.BinanceResilience.ORDERS_PER_DAY_RATE_LIMITER;
import static org.knowm.xchange.binance.BinanceResilience.ORDERS_PER_SECOND_RATE_LIMITER;
import static org.knowm.xchange.binance.BinanceResilience.REQUEST_WEIGHT_RATE_LIMITER;
import static org.knowm.xchange.client.ResilienceRegistries.NON_IDEMPOTENT_CALLS_RETRY_CONFIG_NAME;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.knowm.xchange.binance.BinanceAdapters;
import org.knowm.xchange.binance.BinanceExchange;
import org.knowm.xchange.binance.dto.BinanceException;
import org.knowm.xchange.binance.dto.account.futures.BinancePosition;
import org.knowm.xchange.binance.dto.trade.*;
import org.knowm.xchange.binance.dto.trade.futures.BinanceFutureNewOrder;
import org.knowm.xchange.binance.dto.trade.margin.IsIsolated;
import org.knowm.xchange.binance.dto.trade.margin.MarginSideEffectType;
import org.knowm.xchange.client.ResilienceRegistries;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.derivative.FuturesContract;
import org.knowm.xchange.exceptions.ExchangeException;
import org.knowm.xchange.instrument.Instrument;
import org.knowm.xchange.service.trade.params.CancelOrderByIdParams;
import org.knowm.xchange.service.trade.params.CancelOrderByInstrument;
import org.knowm.xchange.service.trade.params.CancelOrderParams;
import org.knowm.xchange.service.trade.params.orders.OrderQueryParamInstrument;

public class BinanceTradeServiceRaw extends BinanceBaseService {

  protected BinanceTradeServiceRaw(
      BinanceExchange exchange,
      ResilienceRegistries resilienceRegistries) {
    super(exchange, resilienceRegistries);
  }

  public List<BinanceOrder> openOrdersAllProducts() throws BinanceException, IOException {
    return openOrdersAllProducts(null);
  }

  public List<BinanceOrder> openOrdersAllProducts(Instrument pair) throws BinanceException, IOException {
    return decorateApiCall(
            () ->
                    (pair instanceof FuturesContract)
            ? binanceFutures.futureOpenOrders(
                            Optional.of(pair).map(BinanceAdapters::toSymbol).orElse(null),
                            getRecvWindow(),
                            getTimestampFactory(),
                            apiKey,
                            signatureCreator
                    )
            : binance.openOrders(
                    Optional.ofNullable(pair).map(BinanceAdapters::toSymbol).orElse(null),
                    getRecvWindow(),
                    getTimestampFactory(),
                    apiKey,
                    signatureCreator))
        .withRetry(retry("openOrders"))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER), openOrdersPermits(pair))
        .call();
  }

  public BinanceNewOrder newOrder(
      Instrument pair,
      OrderSide side,
      OrderType type,
      TimeInForce timeInForce,
      BigDecimal quantity,
      BigDecimal quoteOrderQty,
      BigDecimal price,
      String newClientOrderId,
      BigDecimal stopPrice,
      Long trailingDelta,
      BigDecimal icebergQty,
      BinanceNewOrder.NewOrderResponseType newOrderRespType)
      throws IOException, BinanceException {
    return decorateApiCall(
            () ->
                binance.newOrder(
                    BinanceAdapters.toSymbol(pair),
                    side,
                    type,
                    timeInForce,
                    quantity,
                    quoteOrderQty,
                    price,
                    newClientOrderId,
                    stopPrice,
                    trailingDelta,
                    icebergQty,
                    newOrderRespType,
                    getRecvWindow(),
                    getTimestampFactory(),
                    apiKey,
                    signatureCreator))
        .withRetry(retry("newOrder", NON_IDEMPOTENT_CALLS_RETRY_CONFIG_NAME))
        .withRateLimiter(rateLimiter(ORDERS_PER_SECOND_RATE_LIMITER))
        .withRateLimiter(rateLimiter(ORDERS_PER_DAY_RATE_LIMITER))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public BinanceFutureNewOrder newFutureOrder(
          Instrument pair,
          OrderSide side,
          OrderType type,
          TimeInForce timeInForce,
          BigDecimal quantity,
          boolean reduceOnly,
          BigDecimal price,
          String newClientOrderId,
          BigDecimal stopPrice,
          boolean closePosition,
          BigDecimal activationPrice,
          BigDecimal callbackRate,
          BinanceNewOrder.NewOrderResponseType newOrderRespType)
          throws IOException, BinanceException {
    return decorateApiCall(
            () ->
                    binanceFutures.newOrder(
                            BinanceAdapters.toSymbol(pair),
                            side,
                            type,
                            timeInForce,
                            quantity,
                            reduceOnly,
                            price,
                            newClientOrderId,
                            stopPrice,
                            closePosition,
                            activationPrice,
                            callbackRate,
                            newOrderRespType,
                            getRecvWindow(),
                            getTimestampFactory(),
                            apiKey,
                            signatureCreator))
            .withRetry(retry("newFutureOrder", NON_IDEMPOTENT_CALLS_RETRY_CONFIG_NAME))
            .withRateLimiter(rateLimiter(ORDERS_PER_SECOND_RATE_LIMITER))
            .withRateLimiter(rateLimiter(ORDERS_PER_DAY_RATE_LIMITER))
            .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
            .call();
  }

  public void testNewOrder(
      Instrument pair,
      OrderSide side,
      OrderType type,
      TimeInForce timeInForce,
      BigDecimal quantity,
      BigDecimal quoteOrderQty,
      BigDecimal price,
      String newClientOrderId,
      BigDecimal stopPrice,
      Long trailingDelta,
      BigDecimal icebergQty)
      throws IOException, BinanceException {
    decorateApiCall(
            () ->
                binance.testNewOrder(
                    BinanceAdapters.toSymbol(pair),
                    side,
                    type,
                    timeInForce,
                    quantity,
                    quoteOrderQty,
                    price,
                    newClientOrderId,
                    stopPrice,
                    trailingDelta,
                    icebergQty,
                    getRecvWindow(),
                    getTimestampFactory(),
                    apiKey,
                    signatureCreator))
        .withRetry(retry("testNewOrder"))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public BinanceNewOrder newMarginOrder(
      Instrument pair,
      OrderSide side,
      IsIsolated isIsolated,
      OrderType type,
      TimeInForce timeInForce,
      BigDecimal quantity,
      BigDecimal price,
      String newClientOrderId,
      BigDecimal stopPrice,
      BigDecimal icebergQty,
      BinanceNewOrder.NewOrderResponseType newOrderRespType,
      MarginSideEffectType sideEffectType)
      throws IOException, BinanceException {
    return decorateApiCall(
        () ->
            binance.newMarginOrder(
                BinanceAdapters.toSymbol(pair),
                isIsolated,
                side,
                type,
                timeInForce,
                quantity,
                price,
                newClientOrderId,
                stopPrice,
                icebergQty,
                newOrderRespType,
                sideEffectType,
                getRecvWindow(),
                getTimestampFactory(),
                apiKey,
                signatureCreator))
        .withRetry(retry("newMarginOrder", NON_IDEMPOTENT_CALLS_RETRY_CONFIG_NAME))
        .withRateLimiter(rateLimiter(ORDERS_PER_SECOND_RATE_LIMITER))
        .withRateLimiter(rateLimiter(ORDERS_PER_DAY_RATE_LIMITER))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public BinanceOrder marginOrderStatus(
      Instrument pair, IsIsolated isIsolated, Long orderId, String origClientOrderId)
      throws IOException, BinanceException {
    return decorateApiCall(
        () ->
            binance.marginOrderStatus(
                BinanceAdapters.toSymbol(pair),
                isIsolated,
                orderId,
                origClientOrderId,
                getRecvWindow(),
                getTimestampFactory(),
                super.apiKey,
                super.signatureCreator))
        .withRetry(retry("marginOrderStatus"))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public BinanceCancelledOrder cancelMarginOrder(
      Instrument pair, IsIsolated isIsolated, Long orderId, String origClientOrderId, String newClientOrderId)
      throws IOException, BinanceException {
    return decorateApiCall(
        () ->
            binance.cancelMarginOrder(
                BinanceAdapters.toSymbol(pair),
                isIsolated,
                orderId,
                origClientOrderId,
                newClientOrderId,
                getRecvWindow(),
                getTimestampFactory(),
                super.apiKey,
                super.signatureCreator))
        .withRetry(retry("cancelMarginOrder"))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public List<BinanceCancelledOrder> cancelAllOpenMarginOrders(
      Instrument pair, IsIsolated isIsolated)
      throws IOException, BinanceException {
    return decorateApiCall(
        () ->
            binance.cancelAllOpenMarginOrders(
                BinanceAdapters.toSymbol(pair),
                isIsolated,
                getRecvWindow(),
                getTimestampFactory(),
                super.apiKey,
                super.signatureCreator))
        .withRetry(retry("cancelAllOpenMarginOrders"))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public BinanceListenKey startMarginUserDataStream() throws IOException {
    return decorateApiCall(() -> binance.startMarginUserDataStream(apiKey))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public void keepMarginAliveDataStream(String listenKey) throws IOException {
    decorateApiCall(() -> binance.keepAliveMarginUserDataStream(apiKey, listenKey))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public void closeMarginDataStream(String listenKey) throws IOException {
    decorateApiCall(() -> binance.closeMarginUserDataStream(apiKey, listenKey))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public BinanceListenKey startIsolatedMarginUserDataStream() throws IOException {
    return decorateApiCall(() -> binance.startIsolatedMarginUserDataStream(apiKey))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public void keepAliveIsolatedMarginDataStream(String listenKey) throws IOException {
    decorateApiCall(() -> binance.keepAliveIsolatedMarginUserDataStream(apiKey, listenKey))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public void closeIsolatedMarginDataStream(String listenKey) throws IOException {
    decorateApiCall(() -> binance.closeIsolatedMarginUserDataStream(apiKey, listenKey))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public BinanceOrder orderStatusAllProducts(OrderQueryParamInstrument orderQueryParamInstrument) throws IOException, BinanceException {
    Instrument pair = orderQueryParamInstrument.getInstrument();
    long orderId = BinanceAdapters.id(orderQueryParamInstrument.getOrderId());

    return decorateApiCall(() -> {
      if (orderQueryParamInstrument instanceof BinanceQueryMarginOrderParams) {
        return binance.marginOrderStatus(
            BinanceAdapters.toSymbol(pair),
            ((BinanceQueryMarginOrderParams) orderQueryParamInstrument).getIsIsolated(),
            orderId,
            null,
            getRecvWindow(),
            getTimestampFactory(),
            super.apiKey,
            super.signatureCreator
        );
      } else if (pair instanceof FuturesContract) {
        return binanceFutures.futureOrderStatus(
            BinanceAdapters.toSymbol(pair),
            orderId,
            null,
            getRecvWindow(),
            getTimestampFactory(),
            super.apiKey,
            super.signatureCreator
        );
      } else {
        return binance.orderStatus(
            BinanceAdapters.toSymbol(pair),
            orderId,
            null,
            getRecvWindow(),
            getTimestampFactory(),
            super.apiKey,
            super.signatureCreator);
      }
    })
        .withRetry(retry("orderStatus"))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public BinanceCancelledOrder cancelOrderAllProducts(CancelOrderParams params)
      throws IOException, BinanceException {
    if (!(params instanceof CancelOrderByInstrument)
        || !(params instanceof CancelOrderByIdParams)) {
      throw new ExchangeException(
          "You need to provide the currency pair and the order id to cancel an order.");
    }

    Instrument pair = ((CancelOrderByInstrument) params).getInstrument();
    long orderId = BinanceAdapters.id(((CancelOrderByIdParams) params).getOrderId());

    return decorateApiCall(
            () -> {
              if (params instanceof BinanceCancelMarginOrderParams) {
                return binance.cancelMarginOrder(
                    BinanceAdapters.toSymbol(pair),
                    ((BinanceCancelMarginOrderParams) params).getIsIsolated(),
                    orderId,
                    null,
                    null,
                    getRecvWindow(),
                    getTimestampFactory(),
                    super.apiKey,
                    super.signatureCreator
                );
              } else if (pair instanceof FuturesContract) {
                return binanceFutures.cancelFutureOrder(
                    BinanceAdapters.toSymbol(pair),
                    orderId,
                    null,
                    getRecvWindow(),
                    getTimestampFactory(),
                    super.apiKey,
                    super.signatureCreator
                );
              } else {
                return binance.cancelOrder(
                    BinanceAdapters.toSymbol(pair),
                    orderId,
                    null,
                    null,
                    getRecvWindow(),
                    getTimestampFactory(),
                    super.apiKey,
                    super.signatureCreator);
              }
            }
    )
        .withRetry(retry("cancelOrder"))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public List<BinanceCancelledOrder> cancelAllOpenOrdersAllProducts(Instrument pair)
      throws IOException, BinanceException {
    return decorateApiCall(
            () -> {
              if (pair instanceof FuturesContract) {
                return binanceFutures.cancelAllFutureOpenOrders(
                    BinanceAdapters.toSymbol(pair),
                    getRecvWindow(),
                    getTimestampFactory(),
                    super.apiKey,
                    super.signatureCreator
                );
              } else {
                return ImmutableList.<BinanceCancelledOrder>builder()
                    .addAll(binance.cancelAllOpenOrders(
                        BinanceAdapters.toSymbol(pair),
                        getRecvWindow(),
                        getTimestampFactory(),
                        super.apiKey,
                        super.signatureCreator))
                    .addAll(binance.cancelAllOpenMarginOrders(
                        BinanceAdapters.toSymbol(pair),
                        IsIsolated.CROSS,
                        getRecvWindow(),
                        getTimestampFactory(),
                        super.apiKey,
                        super.signatureCreator))
                    .addAll(binance.cancelAllOpenMarginOrders(
                        BinanceAdapters.toSymbol(pair),
                        IsIsolated.ISOLATED,
                        getRecvWindow(),
                        getTimestampFactory(),
                        super.apiKey,
                        super.signatureCreator))
                    .build();

              }
            }
    )
        .withRetry(retry("cancelAllOpenOrders"))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public List<BinanceOrder> allOrders(CurrencyPair pair, Long orderId, Integer limit)
      throws BinanceException, IOException {
    return decorateApiCall(
            () ->
                binance.allOrders(
                    BinanceAdapters.toSymbol(pair),
                    orderId,
                    limit,
                    getRecvWindow(),
                    getTimestampFactory(),
                    apiKey,
                    signatureCreator))
        .withRetry(retry("allOrders"))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public List<BinanceTrade> myTradesAllProducts(Instrument pair, Long orderId, Long startTime, Long endTime, Long fromId, Integer limit) throws BinanceException, IOException{
    return decorateApiCall(
            () -> (pair instanceof FuturesContract)
                    ? binanceFutures.myFutureTrades(
                            BinanceAdapters.toSymbol(pair),
                            orderId,
                            startTime,
                            endTime,
                            fromId,
                            limit,
                            getRecvWindow(),
                            getTimestampFactory(),
                            apiKey,
                            signatureCreator)
                    : binance.myTrades(
                            BinanceAdapters.toSymbol(pair),
                            orderId,
                            startTime,
                            endTime,
                            fromId,
                            limit,
                            getRecvWindow(),
                            getTimestampFactory(),
                            apiKey,
                            signatureCreator))
            .withRetry(retry("myTrades"))
            .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER), myTradesPermits(limit))
            .call();
  }

  public List<BinancePosition> openPositions() throws BinanceException, IOException {
    return decorateApiCall(
            () -> binanceFutures.futuresAccount(getRecvWindow(), getTimestampFactory(), apiKey, signatureCreator))
            .withRetry(retry("futures-account"))
            .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER), 5)
            .call().getPositions();
  }

  /**
   * Retrieves the dust log from Binance. If you have many currencies with low amount (=dust) that
   * cannot be traded, because their amount is less than the minimum amount required for trading
   * them, you can convert all these currencies at once into BNB with the button "Convert Small
   * Balance to BNB".
   *
   * @param startTime optional. If set, also the endTime must be set. If neither time is set, the
   *     100 most recent dust logs are returned.
   * @param endTime optional. If set, also the startTime must be set. If neither time is set, the
   *     100 most recent dust logs are returned.
   * @return
   * @throws IOException
   */
  public BinanceDustLog getDustLog(Long startTime, Long endTime) throws IOException {

    if (((startTime != null) && (endTime == null)) || (startTime == null) && (endTime != null))
      throw new ExchangeException(
          "You need to specify both, the start and the end date, or none of them");

    return decorateApiCall(
            () ->
                binance.getDustLog(
                    startTime,
                    endTime,
                    getRecvWindow(),
                    getTimestampFactory(),
                    apiKey,
                    signatureCreator))
        .withRetry(retry("myDustLog"))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public BinanceListenKey startUserDataStream() throws IOException {
    return decorateApiCall(() -> binance.startUserDataStream(apiKey))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public void keepAliveDataStream(String listenKey) throws IOException {
    decorateApiCall(() -> binance.keepAliveUserDataStream(apiKey, listenKey))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  public void closeDataStream(String listenKey) throws IOException {
    decorateApiCall(() -> binance.closeUserDataStream(apiKey, listenKey))
        .withRateLimiter(rateLimiter(REQUEST_WEIGHT_RATE_LIMITER))
        .call();
  }

  protected int openOrdersPermits(Instrument pair) {
    return pair != null ? 1 : 40;
  }

  protected int myTradesPermits(Integer limit) {
    if (limit != null && limit > 500) {
      return 10;
    }
    return 5;
  }
}
