package ru.mirea.LESSON_2.Dishes;

abstract class Dish {
    private final String material;
    private int age;
    private int price;

    protected Dish() {
        material = null;
    }

    protected Dish(String material, int age, int price) {
        this.material = material;
        this.age = age;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void use();
}
