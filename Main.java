package ru.mirea;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int fact(int f) {
        int sum = 1;
        for (int i = 1; i <= f; i++) {
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("------ 5 ------");
        System.out.println(fact(5));
        System.out.println("------ 1 and 4 ------");
        rndArr(5);
        System.out.println("------ 2 ------");
        garm(10);
        System.out.println("------ 3 ------");
        argPring(args);

    }

    private static void argPring(String[] args) {
        for (String arg : args) {
            System.out.println(args);
        }
    }

    private static void garm(int n) {
        double[] arrSum = new double[n];
        for (int i = 1; i <= n; i++) {
            arrSum[i-1] = 1.0/i;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arrSum[i]);
        }
    }

    private static void rndArr(int n) {
        Random rnd = new Random();
        int[] rndArray = new int[n];

        for (int i = 0; i < n; i++) {
            rndArray[i] = rnd.nextInt(100);
        }

        System.out.println("--- not sorted ---");

        for (int i = 0; i < n; i++) {
            System.out.print(rndArray[i] + " ");
        }
        System.out.println();

        System.out.println("--- sorted ---");
        Arrays.sort(rndArray);

        System.out.print("for:    ");

        for (int i = 0; i < n; i++) {
            System.out.print(rndArray[i] + " ");
        }
        System.out.println();

        System.out.print("while:    ");

        int i = 0;
        while (i < n) {
            System.out.print(rndArray[i] + " ");
            i++;
        }
        System.out.println();

        System.out.print("while do:    ");
        i = 0;
        do {
            System.out.print(rndArray[i] + " ");
            i++;
        }
        while (i < n);
        System.out.println();
    }
}
