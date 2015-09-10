package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FoodTest {

    @Test
    public void shouldHaveZeroSalesTax() {
        assertEquals(new Food("chocolate", 2.3).salesTax(), 0.0, 0.0);
    }
}