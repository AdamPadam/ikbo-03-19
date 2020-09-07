package ru.mirea.LESSON_1.PRACTIK;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("bobik", "black", "Platon");
        Book book1 = new Book("War and Piece", "Tolstoy", 2077);
        Ball ball1 = new Ball("green", "Large", "bobik");

        Tester test = new Tester();

        test.print(dog1);
        test.print(book1);
        test.print(ball1);
    }
}
