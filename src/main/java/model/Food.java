package model;

public abstract class Food {
    protected int amount;       // количество продукта в килограммах
    protected double price;     // цена за единицу
    protected boolean isVegetarian; // флаг вегетарианского продукта

    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}