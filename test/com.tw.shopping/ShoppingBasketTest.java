package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    @Test
    public void shouldBeEmptyInitially() {
        assertEquals(new ShoppingBasket().getNumberOfGoods(), 0);
    }

    @Test
    public void shouldAllowGoodsToBeAdded() {
        ShoppingBasket basket = new ShoppingBasket();
        basket.addToBasket(new Good("cr", 90.0));
        assertEquals(basket.getNumberOfGoods(), 1);
    }
}