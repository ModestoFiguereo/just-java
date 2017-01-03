package com.modestofiguereo.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    private Quantity quantity = new Quantity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(quantity.getQuantity());
        displayPrice(quantity.getQuantity() * 5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_textview);
        quantityTextView.setText("" + number);
    }

    /**
            * This method displays the given price on the screen.
    */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_textview);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void increment(View view) {
        quantity.incrementBy(1);
        display(quantity.getQuantity());
//        displayPrice(quantity.getQuantity() * 5);
    }

    public void decrement(View view) {
        quantity.decrementBy(1);
        display(quantity.getQuantity());
//        displayPrice(quantity.getQuantity() * 5);
    }

    private class Quantity {
        private int quantity;

        public Quantity() {
            quantity = 0;
        }

        public Quantity(int seed) {
            quantity = seed;
        }

        public void incrementBy(int step) {
            ++quantity;
        }

        public void decrementBy(int step) {
            if (quantity > 0)
                --quantity;
        }

        public int getQuantity() {
            return quantity;
        }
    }
}