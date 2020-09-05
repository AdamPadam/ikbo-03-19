package ru.mirea.LESSON_2.Dishes;

public class Plate extends Dish {
    private int radius;
    private String Color;

    public Plate(String material, int age, int price, int radius, String color) {
        super(material, age, price);
        this.radius = radius;
        Color = color;
    }

    @Override
    public void use() {
        System.out.println("Ты поел вкусного мяса");
    }

    @Override
    public String toString() {
        return "Тарелка {\n" +
                "\t\tматериал = " + getMaterial() + "\n" +
                "\t\tвозраст = " + getAge() + " лет\n" +
                "\t\tцена = " + getPrice() + " руб\n" +
                "\t\tразмер(радиус) = " + getRadius() + " см\n" +
                "\t\tцвет = " + getColor() + " }";
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
