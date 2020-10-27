package ru.mirea.LESSON_11.PRACTIK;

interface Queue<E> {
    E value();
    E poll();
    E peek();
    boolean add(E value);
}
