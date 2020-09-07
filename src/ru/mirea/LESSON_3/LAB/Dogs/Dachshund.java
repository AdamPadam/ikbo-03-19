package ru.mirea.LESSON_3.LAB.Dogs;

public class Dachshund extends Dog {

    public Dachshund(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public String toString() {
        return "Такса {\n" +
                "\t\tимя = " + getName() + "\n" +
                "\t\tвозраст = " + getAge() + " лет\n" +
                "\t\tцвет = " + getColor() + " }";
    }
}
