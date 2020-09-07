package ru.mirea.LESSON_3.LAB.Furniture;

abstract class Furniture {

    private String material;
    private int price;

    public Furniture() {
    }

    public Furniture(String material, int price) {
        this.material = material;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
