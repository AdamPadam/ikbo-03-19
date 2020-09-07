package ru.mirea.LESSON_3.LAB.Dishes;

public class Bowl extends Dish {
    private int volume;

    public Bowl(String material, int age, int price, int volume) {
        super(material, age, price);
        this.volume = volume;
    }

    @Override
    public void use() {
        System.out.println("Ты поел вкусного супа");
    }

    @Override
    public String toString() {
        return "Миска {\n" +
                "\t\tматериал = " + getMaterial() + "\n" +
                "\t\tвозраст = " + getAge() + " лет\n" +
                "\t\tцена = " + getPrice() + " руб\n" +
                "\t\tобъем = " + getVolume() + " мл }";
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
