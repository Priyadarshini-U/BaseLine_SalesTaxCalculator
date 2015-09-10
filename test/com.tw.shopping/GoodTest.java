package com.tw.shopping;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GoodTest {

    @Test
    public void shouldNotReturnCDAsFood() {
        Good good = new Good("CD", 3.2);
        assertFalse(good.isFood());
    }

    @Test
    public void shouldReturnChocolateAsFood() {
        Good good = new Good("chocolate", 3.2);
        assertTrue(good.isFood());
    }

    @Test
    public void shouldReturnAnyGoodThatHasChocolateInItsNameAsFood() {
        Good good = new Good("chocolate bar", 3.2);
        assertTrue(good.isFood());
    }

    @Test
    public void shouldNotReturnCDAsBook() {
        Good good = new Good("CD", 3.2);
        assertFalse(good.isBook());
    }

    @Test
    public void shouldReturnAnyGoodThatHasBookInItsNameAsBook() {
        Good good = new Good("chocolate book", 3.2);
        assertTrue(good.isBook());
    }

    @Test
    public void shouldNotReturnCDAsMedicine() {
        Good good = new Good("CD", 3.2);
        assertFalse(good.isMedicine());
    }

    @Test
    public void shouldHaveSalesTaxAsTenPercent() {
        Good good = new Good("CD", 30.2);
        assertEquals(good.salesTax(), 30.2/10, 0.0);
    }
}