package ru.mirea.LESSON_7.LAB;

import java.util.Random;

public class TestMyArrayList {

    public static void addRandomInt(MyArrayList list, int n) {
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            list.add(rnd.nextInt(500));
        }
    }

    public static void main(String[] args) {

        MyArrayList list1 = new MyArrayList();
        MyArrayList list2 = new MyArrayList(30);

        System.out.println(list1.size());
        addRandomInt(list1, 20);
        System.out.println(list1.size());
        System.out.println(list1);
        list1.clear();
        System.out.println(list1.size());

        System.out.println("---------------------");

        System.out.println(list2.size());
        addRandomInt(list2, 5);
        System.out.println(list2.size());
        System.out.println(list2);
        list2.trimToSize();

        System.out.println("----------------------");

        addRandomInt(list1, 10);
        System.out.println(list1);
        System.out.println(list2);

    }
}
