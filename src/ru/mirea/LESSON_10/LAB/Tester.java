package ru.mirea.LESSON_10.LAB;

public class Tester {

    public static void main(String[] args) {
        MyList<String> list1 = new MyList<>();
        MyList<Integer> list2 = new MyList<>();
        MyList<Boolean> list3 = new MyList<>();

        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        list1.add("6");
        list1.add("7");
        list1.add("8");
        list1.add("9");
        list1.add("10");
        list1.add("11");
        list1.add("12");


        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        list2.add(11);
        list2.add(12);


        list3.add(true);
        list3.add(true);
        list3.add(true);
        list3.add(false);
        list3.add(false);
        list3.add(true);
        list3.add(false);
        list3.add(true);
        list3.add(true);
        list3.add(false);
        list3.add(false);
        list3.add(true);

        System.out.println("lists:");
        System.out.println("\n");

        System.out.println("list of str:   " + list1);
        System.out.println("list of int:   " + list2);
        System.out.println("list of bool:   " + list3);

        System.out.println("");

        System.out.println("list of str [4]:   " + list1.get(4));
        System.out.println("list of int [4]:   " + list2.get(4));
        System.out.println("list of bool [4]:   " + list3.get(4));

        System.out.println("");

        System.out.println("list of str.size:   " + list1.size());
        System.out.println("list of int.size:   " + list2.size());
        System.out.println("list of bool.size:   " + list3.size());

        System.out.println("");

        System.out.println("remove 4th el. from lists:");

        System.out.println("\n");

        list1.remove(4);
        list2.remove(4);
        list3.remove(4);

        System.out.println("");

        System.out.println("new lists:");

        System.out.println("\n");

        System.out.println("list of str.size:   " + list1.size());
        System.out.println("list of int.size:   " + list2.size());
        System.out.println("list of bool.size:   " + list3.size());

        System.out.println("");

        System.out.println("list of str [4]:   " + list1.get(4));
        System.out.println("list of int [4]:   " + list2.get(4));
        System.out.println("list of bool [4]:   " + list3.get(4));
    }
}
