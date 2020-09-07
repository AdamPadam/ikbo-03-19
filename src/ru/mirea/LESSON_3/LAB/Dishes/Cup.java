package ru.mirea.LESSON_3.LAB.Dishes;

public class Cup extends Dish {
    private int volume;
    private String color;

    public Cup(String material, int age, int price, int volume, String color) {
        super(material, age, price);
        this.volume = volume;
        this.color = color;
    }

    @Override
    public void use() {
        System.out.println("Ты выпил вкусного кофе");
    }

    @Override
    public String toString() {
        return "Кружка {\n" +
                "\t\tматериал = " + getMaterial() + "\n" +
                "\t\tвозраст = " + getAge() + " лет\n" +
                "\t\tцена = " + getPrice() + " руб\n" +
                "\t\tобъем = " + getVolume() + " мл\n" +
                "\t\tцвет = " + getColor() + " }";
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
