package com.khegb;

import com.khegb.money.model.Money;
import org.junit.Test;

import static org.junit.Assert.*;

public class Money_UT {
    
    public static final String USD = "USD";
    public static final String CHF = "CHF";
    
    @Test
    public void testDollarMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
    
    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.dollar(5).equals(Money.franc(5)));
    }
    
    @Test
    public void testCurrency() {
        assertEquals(USD, Money.dollar(1).currency());
        assertEquals(CHF, Money.franc(1).currency());
    }
}
