package ru.mirea.LESSON_4.LAB.Priceable;

public class Food implements Priceable {
    private double price;

    public Food(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "price=" + price +
                "$}";
    }
}
