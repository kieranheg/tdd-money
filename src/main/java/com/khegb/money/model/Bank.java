package com.khegb.money.model;

import java.util.Hashtable;

public class Bank {
    private Hashtable<Pair, Integer> rates = new Hashtable();
    
    public Money reduce(final Expression source, final String to) {
        return source.reduce(this, to);
    }
    
    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from,to), new Integer(rate));
    }
    
    public int rate(String from, String to) {
        if (from.equals(to)) return 1;
        Integer rate = rates.get(new Pair(from, to));
        return rate;
    }
    
    private class Pair {
        private String from;
        private String to;
        
        Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }
        
        @Override
        public boolean equals(Object object) {
            Pair pair = (Pair) object;
            return from.equals(pair.from) && to.equals(pair.to);
        }
        
        @Override
        public int hashCode() {
            return 0;
        }
    }
}