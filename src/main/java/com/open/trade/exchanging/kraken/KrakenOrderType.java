package com.open.trade.exchanging.kraken;

public enum KrakenOrderType {
    MARKET("market"),
    STOP_LOSS("stop-loss");

    private final String ordertype;

    KrakenOrderType(String ordertype) {
        this.ordertype = ordertype;
    }
}
