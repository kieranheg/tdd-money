package com.khegb.money.model;

import static com.khegb.money.common.Constants.CHF;
import static com.khegb.money.common.Constants.USD;

public class Money implements Expression {
    public int amount;
    public String currency;
    
    Money(final int amount, final String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    
    public static Money dollar(final int amount) {
        return new Money(amount, USD);
    }
    
    public static Money franc(final int amount) {
        return new Money(amount, CHF);
    }
    
    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount &&
                currency().equals(money.currency());
    }
    
    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency());
    }
    
    public String currency() {
        return currency;
    }
    
    @Override
    public String toString() {
        return amount + " " + currency();
    }
    
    public Expression plus(final Money addend) {
        return new Sum(this, addend);
    }
    
    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount/rate, to);
    }
}
