package ru.mirea.LESSON_3.LAB.Furniture;

import java.util.HashSet;

public class FurnitureShop {
    private HashSet<Furniture> furniture = new HashSet<>();

    public FurnitureShop() {
    }

    public FurnitureShop(HashSet<Furniture> furniture) {
        this.furniture = furniture;
    }

    public void add(Furniture table) {
        furniture.add(table);
    }

    public HashSet<Furniture> getAll() {
        return furniture;
    }

    public void del(Table table) {
        furniture.remove(table);
    }

    @Override
    public String toString() {
        return "FurnitureShop {\n" +
                "\t\tмебель = " + furniture + " }";
    }
}
