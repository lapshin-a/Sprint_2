package service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    public double getTotalWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double itemPrice = item.getAmount() * item.getPrice();
            if (item instanceof Discountable) {
                double discount = ((Discountable) item).getDiscount();
                itemPrice -= itemPrice * (discount / 100);
            }
            total += itemPrice;
        }
        return total;
    }

    public double getTotalVegetarianWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}
