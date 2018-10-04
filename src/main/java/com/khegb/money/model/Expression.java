package com.khegb.money.model;

public interface Expression {
    Money reduce(Bank bank, String to);
}
