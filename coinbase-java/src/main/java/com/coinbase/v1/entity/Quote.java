package com.coinbase.v1.entity;

import com.coinbase.v1.deserializer.FeesCollector;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import org.joda.money.Money;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.HashMap;

public class Quote implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -4797946450079069495L;
    private HashMap<String, Money> _fees;
    private Money _btc;
    private Money _subtotal;
    private Money _total;
    private DateTime _payout_date;

    public Money getBtc() {
        return _btc;
    }

    public void setBtc(Money btc) {
        _btc = btc;
    }

    public Money getSubtotal() {
        return _subtotal;
    }

    public void setSubtotal(Money subtotal) {
        _subtotal = subtotal;
    }

    public Money getTotal() {
        return _total;
    }

    public void setTotal(Money total) {
        _total = total;
    }

    public HashMap<String, Money> getFees() {
        return _fees;
    }

    @JsonDeserialize(converter=FeesCollector.class )
    public void setFees(HashMap<String, Money> fees) {
        _fees = fees;
    }

    public DateTime getPayoutDate() {
        return _payout_date;
    }

    public void setPayoutDate(DateTime payout_date) {
        this._payout_date = payout_date;
    }
}
