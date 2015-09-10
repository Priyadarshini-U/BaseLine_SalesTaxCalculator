package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GoodFactoryTest {

    @Test
    public void shouldReturnNoGoodIfThereIsNOLine() {
        Good good = new GoodFactory(null).ConstructGood();

        assertTrue(good == null);
    }

    @Test
    public void shouldReturnNoGoodForEmptyLine() {
        Good good = new GoodFactory(null).ConstructGood();

        assertTrue(good == null);
    }

    @Test
    public void shouldConstructGoodWithNameAsWordsBeforeAt() {
        Good good = new GoodFactory("imported bottle of perfume at 27.99").ConstructGood();

        assertTrue(good.getName().equals("imported bottle of perfume"));
    }
}