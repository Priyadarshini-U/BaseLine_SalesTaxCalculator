package com.tw.shopping;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GoodFactoryTest {

    @Test
    public void shouldReturnNoGoodIfThereIsNOLine() {
        Good good = new GoodFactory(null).ConstructGood();

        assertTrue(good == null);
    }
}