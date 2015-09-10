package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedicineTest {

    @Test
    public void shouldHaveZeroSalesTax() {
        assertEquals(new Medicine("pill", 2.3).salesTax(), 0.0, 0.0);
    }
}