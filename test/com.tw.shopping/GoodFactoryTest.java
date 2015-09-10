package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
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

    @Test
    public void shouldConstructGoodWithPriceAsNumberAfterAt() {
        Good good = new GoodFactory("imported bottle of perfume at 27.99").ConstructGood();

        assertTrue(good.getPrice() == 27.99);
    }

    @Test
    public void shouldNotGoodIfInputInvalid() {
        Good good = new GoodFactory("imported bottle of perfume at 27y.99").ConstructGood();

        assertTrue(good == null);
    }

    @Test
    public void shouldReturnFoodIfValidFood() {
        Good good = new GoodFactory("imported bottle of chocolate at 27.99").ConstructGood();

        assertEquals(good.getClass(), Food.class);
    }

    @Test
    public void shouldReturnBookIfValidBook() {
        Good good = new GoodFactory("imported bottle of book at 27.99").ConstructGood();

        assertEquals(good.getClass(), Book.class);
    }

    @Test
    public void shouldReturnMedicineIfValidMedicine() {
        Good good = new GoodFactory("imported bottle of pill at 27.99").ConstructGood();

        assertEquals(good.getClass(), Medicine.class);
    }
}