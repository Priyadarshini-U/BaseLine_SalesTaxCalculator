package com.tw.shopping;


import org.junit.Test;

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

}