package ru.mirea.LESSON_7.LAB;

import java.util.LinkedList;
import java.util.Random;

public class TestLindefList {

    public static void addRandomInt(LinkedList<Integer> list, int n) {
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            list.add(rnd.nextInt(500));
        }
    }

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();

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

        System.out.println("----------------------");

        addRandomInt(list1, 10);
        System.out.println(list1);
        System.out.println(list2);

        list2.addAll(list1);
        System.out.println(list2);

    }
}
