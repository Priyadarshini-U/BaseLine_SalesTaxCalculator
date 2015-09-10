package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BookTest {

    @Test
    public void shouldBeAFood() {
        assertFalse(new Book("book", 2.3).isFood());
    }

    @Test
    public void shouldNotBeABook() {
        assertTrue(new Book("book", 2.3).isBook());
    }

    @Test
    public void shouldNotBeAMedicine() {
        assertFalse(new Book("book", 2.3).isMedicine());
    }

    @Test
    public void shouldHaveZeroSalesTax() {
        assertEquals(new Book("book", 2.3).salesTax(), 0.0, 0.0);
    }
}