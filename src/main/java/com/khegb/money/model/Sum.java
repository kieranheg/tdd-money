package com.khegb.money.model;

public class Sum implements Expression {
    public final Money augend;
    public final Money addend;
    
    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }
    
    public Money reduce(final Bank bank, final String to) {
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}
