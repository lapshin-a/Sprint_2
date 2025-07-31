package model;

import model.constants.Colour;

public class Apple extends Food implements Discountable {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true); // яблоки вегетарианские
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Colour.RED.equals(colour)) {
            return 60.0; // 60% скидка для красных яблок
        }
        return 0.0; // без скидки для остальных
    }
}