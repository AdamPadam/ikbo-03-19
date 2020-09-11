package ru.mirea.LESSON_5.PRACTIK;

import java.util.Scanner;

public class Main {

    public static void f7(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            f7(n / k, k);
        } else {
            f7(n, ++k);
        }
    }

    public static String f8(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return f8(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }

    public static int f9(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return f9(a, b - 1) + f9(a - 1, b - 1);
    }

    public static int f10(int n, int i) {
        return (n == 0) ? i : f10(n / 10, i * 10 + n % 10);
    }

    public static int f11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            int m = in.nextInt();
            if (m == 1) {
                return f11() + n + m;
            } else if (m == 0) {
                int k = in.nextInt();
                if (k == 1) {
                    return f11() + n + k;
                } else if (k == 0) {
                    return n;
                } else {
                    return f11() + n;
                }
            } else {
                return f11() + n;
            }
        } else if (n == 0) {
            int m = in.nextInt();
            if (m == 1) {
                return f11() + m;
            } else if (m == 0) {
                return 0;
            } else {
                return f11();
            }
        } else {
            int m = in.nextInt();
            if (m == 1) {
                return f11() + m;
            } else if (m == 0) {
                int k = in.nextInt();
                if (k == 1) {
                    return f11() + k;
                } else if (k == 0) {
                    return 0;
                } else {
                    return f11();
                }
            } else {
                return f11();
            }
        }
    }

    public static void f12() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println("-> " + n);
                f12();
            } else {
                f12();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("7. Введите число n, вам выведут все простые");
        System.out.println("множители в порядке неубывания с учетом кратности:");
        f7(scanner.nextInt(), 2);
        System.out.println();

        System.out.println("8. Введите слово из строчных латинских букв,");
        System.out.println("вам ответ на полиндром ли это:");
        System.out.println(f8(scanner.next()));
        System.out.println();

        System.out.println("9. Введите число a и b, вам выведут сколько существет");
        System.out.println("последовательностей из a нулей и b едениц, в которых два нуля не стоят рядом:");
        System.out.println(f9(scanner.nextInt(), scanner.nextInt()));
        System.out.println();

        System.out.println("10. Введите число n, десятичная запись которого, не содержит нулей, ");
        System.out.println("вам выведут число, записанное теми же цифрами, но в обратном порядке:");
        System.out.println(f10(scanner.nextInt(), 0));
        System.out.println();

        System.out.println("11. Дана последовательность натуральных чисел (одно число в строке), ");
        System.out.println("завершающаяся двумя числами 0 подряд.");
        System.out.println("Определите, сколько раз в этой последовательности встречается число 1:");
        System.out.println(f11());
        System.out.println();

        System.out.println("12. Дана последовательность натуральных чисел (одно число в строке),");
        System.out.println("завершающаяся числом 0. Выведите все нечетные числа из этой");
        System.out.println("последовательности, сохраняя их порядок:");
        f12();
        System.out.println();
    }
}
