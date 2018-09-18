package com.khegb.money.model;

public class Franc extends Money {
    
    public static final String CURRENCY = "CHF";
    
    public Franc(int amount) {
        super(amount);
    }
    
    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
    
    public String currency() {
        return CURRENCY;
    }
}
