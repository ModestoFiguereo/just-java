package com.modestofiguereo.justjava;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by modesto on 03/01/17.
 */

public class QuantityTest {
    @Test
    public void increment_quantity_properly() {
        Quantity quantity = new Quantity(0);
        quantity.incrementBy(2);
        quantity.incrementBy(1);
        quantity.incrementBy(5);

        assertEquals(8, quantity.getQuantity());
    }

    @Test
    public void decrement_quantity_properly() {
        Quantity quantity = new Quantity(985);
        quantity.decrementBy(2);
        quantity.decrementBy(1);
        quantity.decrementBy(5);

        assertEquals(977, quantity.getQuantity());
    }
}
