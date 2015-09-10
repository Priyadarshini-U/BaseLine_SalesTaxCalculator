package com.tw.shopping;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GoodTest {

    @Test
    public void shouldHaveSalesTaxAsTenPercent() {
        Good good = new Good("CD", 30.2);
        assertEquals(good.salesTax(), 30.2/10, 0.0);
    }
}