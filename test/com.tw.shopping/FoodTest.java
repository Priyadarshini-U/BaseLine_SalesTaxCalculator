package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FoodTest {

    @Test
    public void shouldBeAFood() {
        assertTrue(new Food("food", 2.3).isFood());
    }

    @Test
    public void shouldNotBeABook() {
        assertFalse(new Food("book", 2.3).isBook());
    }

    @Test
    public void shouldNotBeAMedicine() {
        assertFalse(new Food("Medicine", 2.3).isMedicine());
    }

    @Test
    public void shouldHaveZeroSalesTax() {
        assertEquals(new Food("chocolate", 2.3).salesTax(), 0.0, 0.0);
    }
}