package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodTest {

    @Test
    public void shouldHaveSalesTaxAsTenPercent() {
        Good good = new Good("CD", 30.2);
        assertEquals(good.salesTax(), 30.2 / 10, 0.0);
    }

    @Test
    public void shouldHaveZeroImportTaxIfNotImported() {
        Good good = new Good("CD", 30.2);
        assertEquals(good.importTax(), 0.0, 0.0);
    }

    @Test
    public void shouldHaveFivePercentImportTaxIfGoodNameContainsImported() {
        Good good = new Good("imported CD", 30.2);
        assertEquals(good.importTax(), 30.2 / 20, 0.0);
    }

    @Test
    public void shouldHavePriceForQuantityAsProductOfPriceAndQuantity() {
        Good good = new Good("imported CD", 30.0);
        double price = good.getPriceForQuantity(2);
        assertEquals(price, 60.0, 0.0);
    }

    @Test
    public void shouldHaveTotalPriceForQuantityAsZeroIfQuantityIsZero() {
        Good good = new Good("imported CD", 30.0);
        double price = good.getTotalPriceForQuantity(0);
        assertEquals(price, 0.0, 0.0);
    }

    @Test
    public void shouldHaveTotalPriceForOneQuantityAsPriceAndSalesAndImportTax() {
        Good good = new Good("imported CD", 30.0);
        double price = good.getTotalPriceForQuantity(1);
        assertEquals(price, 34.0, 0.5);
    }

    @Test
    public void shouldHaveTotalPriceForManyQuantityAsPriceAndSalesAndImportTax() {
        Good good = new Good("imported CD", 30.0);
        double price = good.getTotalPriceForQuantity(2);
        assertEquals(price, 34.0 * 2, 0.5 * 2);
    }
}