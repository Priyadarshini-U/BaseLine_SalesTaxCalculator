package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodTest {

    @Test
    public void shouldHaveSalesTaxAsTenPercent() {
        Good good = new Good("CD", 30.2);
        assertEquals(good.salesTax(), 30.2/10, 0.0);
    }

    @Test
    public void shouldHaveZeroImportTaxIfNotImported() {
        Good good = new Good("CD", 30.2);
        assertEquals(good.importTax(), 0.0, 0.0);
    }

    @Test
    public void shouldHaveFivePercentImportTaxIfGoodNameContainsImported() {
        Good good = new Good("imported CD", 30.2);
        assertEquals(good.importTax(), 30.2/20, 0.0);
    }
}