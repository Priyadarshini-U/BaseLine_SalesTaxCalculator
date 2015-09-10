package com.tw.shopping;

import org.junit.Test;

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
}