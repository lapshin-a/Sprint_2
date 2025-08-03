package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true); // яблоки вегетарианские
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        return Colour.RED.equals(this.colour) ? Discount.RED_APPLE_DISCOUNT : 0.0; // 60% скидка для красных яблок, 0 для остальных
    }
}