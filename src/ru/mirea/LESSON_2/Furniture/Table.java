package ru.mirea.LESSON_2.Furniture;

public class Table extends Furniture {

    public Table(String material, int price) {
        super(material, price);
    }

    @Override
    public String toString() {
        return "Стол {\n" +
                "\t\tматериал = " + getMaterial() + "\n" +
                "\t\tцена = " + getPrice() + " руб }";
    }
}
