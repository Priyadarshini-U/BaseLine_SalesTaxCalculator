package com.tw.shopping;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MedicineTest {

    @Test
    public void shouldNotBeAFood() {
        assertFalse(new Medicine("pill", 2.3).isFood());
    }

    @Test
    public void shouldNotBeABook() {
        assertFalse(new Medicine("pill", 2.3).isBook());
    }

    @Test
    public void shouldBeAMedicine() {
        assertTrue(new Medicine("pill", 2.3).isMedicine());
    }

    @Test
    public void shouldHaveZeroSalesTax() {
        assertEquals(new Medicine("pill", 2.3).salesTax(), 0.0, 0.0);
    }
}