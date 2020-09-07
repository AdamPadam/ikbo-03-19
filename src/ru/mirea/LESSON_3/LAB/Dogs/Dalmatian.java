package ru.mirea.LESSON_3.LAB.Dogs;

public class Dalmatian extends Dog {

    public Dalmatian(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public String toString() {
        return "Далматин {\n" +
                "\t\tимя = " + getName() + "\n" +
                "\t\tвозраст = " + getAge() + " лет\n" +
                "\t\tцвет = " + getColor() + " }";
    }
}
