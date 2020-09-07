package ru.mirea.LESSON_3.LAB;

import ru.mirea.LESSON_3.LAB.Dishes.Bowl;
import ru.mirea.LESSON_3.LAB.Dishes.Cup;
import ru.mirea.LESSON_3.LAB.Dishes.Plate;
import ru.mirea.LESSON_3.LAB.Dogs.Dachshund;
import ru.mirea.LESSON_3.LAB.Dogs.Dalmatian;
import ru.mirea.LESSON_3.LAB.Furniture.Chair;
import ru.mirea.LESSON_3.LAB.Furniture.FurnitureShop;
import ru.mirea.LESSON_3.LAB.Furniture.Table;

public class Tester {

    public static void main(String[] args) {

        System.out.println("-------- Тестриование класса Cup --------");

        Cup cup = new Cup("Wood", 1, 500, 500, "White");

        System.out.println(cup.toString());
        cup.use();

        System.out.println("\n\n-------- Тестриование класса Bowl --------");

        Bowl bowl = new Bowl("Wood", 1, 500, 500);

        System.out.println(bowl.toString());
        bowl.use();

        System.out.println("\n\n-------- Тестриование класса Plate --------");

        Plate plate = new Plate("Wood", 1, 500, 23, "White");

        System.out.println(plate.toString());
        plate.use();

        System.out.println("\n\n-------- Тестриование класса Dachshund --------");

        Dachshund dachshund = new Dachshund("Layla", 3, "Brown");

        System.out.println(dachshund.toString());

        System.out.println("\n\n-------- Тестриование класса Dalmatian --------");

        Dalmatian dalmatian = new Dalmatian("Rex", 7, "White");

        System.out.println(dalmatian.toString());

        System.out.println("\n\n-------- Тестриование класса Chair --------");

        Chair chair = new Chair("Plastic", 2000);

        System.out.println(chair.toString());

        System.out.println("\n\n-------- Тестриование класса Table --------");

        Table table = new Table("Wood", 8000);

        System.out.println(table.toString());

        System.out.println("\n\n-------- Тестриование класса FurnitureShop --------");

        FurnitureShop furnitureShop = new FurnitureShop();

        System.out.println(furnitureShop.toString());

        furnitureShop.add(table);

        System.out.println(furnitureShop.toString());
    }
}
