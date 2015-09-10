package com.tw.shopping;


import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class GoodTest {

    @Test
    public void shouldNotReturnCDAsFood() {
        Good good = new Good("chocolate", 3.2);
        assertFalse(good.isFood());
    }
}