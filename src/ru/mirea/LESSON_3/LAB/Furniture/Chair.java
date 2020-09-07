package ru.mirea.LESSON_3.LAB.Furniture;

public class Chair extends Furniture {

    public Chair(String material, int price) {
        super(material, price);
    }

    @Override
    public String toString() {
        return "Стул {\n" +
                "\t\tматериал = " + getMaterial() + "\n" +
                "\t\tцена = " + getPrice() + " руб }";
    }
}
