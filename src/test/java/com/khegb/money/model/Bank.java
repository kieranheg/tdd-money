package com.khegb.money.model;

public class Bank {
    public Money reduce(final Expression source, final String to) {
        return source.reduce(to);
    }
}
