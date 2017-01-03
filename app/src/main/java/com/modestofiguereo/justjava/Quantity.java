package com.modestofiguereo.justjava;

/**
 * Created by modesto on 03/01/17.
 */

public class Quantity {
    private int quantity;

    public Quantity() {
        quantity = 0;
    }

    public Quantity(int seed) {
        quantity = seed;
    }

    public void incrementBy(int step) {
        quantity += step;
    }

    public void decrementBy(int step) {
        if (quantity > 0)
            quantity -= step;
    }

    public int getQuantity() {
        return quantity;
    }
}