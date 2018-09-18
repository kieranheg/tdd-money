package com.khegb.money.model;

public class Dollar extends Money {
    
    public static final String CURRENCY = "USD";
    
    public Dollar(int amount) {
        super(amount);
    }
    
    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
    
    public String currency() {
        return CURRENCY;
    }
}
