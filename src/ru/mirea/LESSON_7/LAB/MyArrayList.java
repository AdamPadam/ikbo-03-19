package ru.mirea.LESSON_7.LAB;

import java.util.Arrays;

public class MyArrayList {

    private static final int DEFAULT_CAPACITY = 10; //Дефолтный размер массива
    private Object[] elements; // массив объектов
    private int size; // количество жлементов в массиве

    // конструктор с задым размером масива
    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elements = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elements = new Object[0];
        } else { // если число < 0 то выкидываем ошибку
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
    }

    // если не передаем параметры. то используем константу
    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    //изменения размера массива до количества эллементов
    public void trimToSize() {
        if (size < elements.length) {
            elements = (size == 0) ? new Object[0] : Arrays.copyOf(elements, size);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException();
    }

    private void rangeCheckForAdd(int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException();
    }

    //получение элемента по индексу
    public Object get(int index) {
        rangeCheck(index);
        return elements[index];
    }

    //изменения элемента по индексу
    public Object set(int index, Object element) {
        rangeCheck(index);

        Object oldValue = elements[index];
        elements[index] = element;
        return oldValue;
    }

    //добавление нового элемента
    public boolean add(Object e) {
        if (size == elements.length - 1) {
            Object[] old_elements = elements;
            elements = new Object[(size * 3) / 2 + 1];
            System.arraycopy(old_elements,0,elements,0,size);
        }
        elements[size++] = e;
        return true;
    }

    //добавление элемента по индексу
    public void add(int index, Object element) {
        rangeCheckForAdd(index);

        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public Object remove(int index) {
        rangeCheck(index);

        Object oldValue = elements[index];

        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        elements[--size] = null;

        return oldValue;
    }

    public boolean remove(Object o) {
        if (o == null) {
            for (int index = 0; index < size; index++)
                if (elements[index] == null) {
                    fastRemove(index);
                    return true;
                }
        } else {
            for (int index = 0; index < size; index++)
                if (o.equals(elements[index])) {
                    fastRemove(index);
                    return true;
                }
        }
        return false;
    }

    private void fastRemove(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        elements[--size] = null;
    }

    public void clear() {

        for (int i = 0; i < size; i++)
            elements[i] = null;

        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("MyArrayList {");

        for (int i = 0; i < size; i++) {
            out.append(elements[i]);
            out.append((i != size - 1) ? ", " : "");
        }

        out.append("}");
        return out.toString();
    }
}
