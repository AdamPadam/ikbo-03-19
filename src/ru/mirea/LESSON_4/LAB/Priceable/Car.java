package ru.mirea.LESSON_4.LAB.Priceable;

public class Car implements Priceable {
    private double price;

    public Car(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                "$}";
    }
}
