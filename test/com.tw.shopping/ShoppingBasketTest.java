package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    @Test
    public void shouldBeEmptyInitially() {
        assertEquals(new ShoppingBasket().getNumberOfGoods(), 0);
    }

    @Test
    public void shouldAllowGoodsToBeAddedWithQuantity() {
        ShoppingBasket basket = new ShoppingBasket();
        basket.addToBasket(new Good("cr", 90.0), 1);
        assertEquals(basket.getNumberOfGoods(), 1);
    }

    @Test
    public void shouldHaveSumOfPriceOfEmptyBasketAsZero() {
        assertEquals(new ShoppingBasket().sumOfPrice(), 0.0, 0.0);
    }

    @Test
    public void shouldReturnProductOfQuantityAndPriceForOneGood() {
        ShoppingBasket basket = new ShoppingBasket();
        basket.addToBasket(new Good("cr", 90.0), 2);
        assertEquals(basket.sumOfPrice(), 180.0, 0.0);
    }

    @Test
    public void shouldReturnProductOfQuantityAndPriceForManyGood() {
        ShoppingBasket basket = new ShoppingBasket();
        basket.addToBasket(new Good("cr", 90.0), 2);
        basket.addToBasket(new Good("cr2", 20.0), 1);
        assertEquals(basket.sumOfPrice(), 200.0, 0.0);
    }
}