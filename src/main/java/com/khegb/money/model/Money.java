package com.khegb.money.model;

public abstract class Money {
    protected int amount;
    
    public Money(int amount) {
        this.amount = amount;
    }
    
    public static Money dollar(final int amount) {
        return new Dollar(amount);
    }
    
    public static Money franc(final int amount) {
        return new Franc(amount);
    }
    
    public Money times(int multiplier) {
        return null;
    }
    
    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount &&
                getClass().equals(money.getClass());
    }
    
    public abstract String currency();
    
    public String toString() {
        return amount + " " + currency();
    }
}
