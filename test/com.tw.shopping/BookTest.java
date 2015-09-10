package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void shouldHaveZeroSalesTax() {
        assertEquals(new Book("book", 2.3).salesTax(), 0.0, 0.0);
    }
}