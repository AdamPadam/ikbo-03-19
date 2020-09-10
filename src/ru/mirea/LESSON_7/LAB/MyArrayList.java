package ru.mirea.LESSON_7.LAB;

import java.util.Arrays;

public class MyArrayList {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;
    private int capacity;

    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elements = new Object[initialCapacity];
            this.capacity = DEFAULT_CAPACITY;
        } else if (initialCapacity == 0) {
            this.elements = new Object[0];
            this.capacity = 0;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
    }

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
    }

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

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elements[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elements[i]))
                    return i;
        }
        return -1;
    }

    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException();
    }

    private void rangeCheckForAdd(int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException();
    }

    public Object get(int index) {
        rangeCheck(index);
        return elements[index];
    }

    public Object set(int index, Object element) {
        rangeCheck(index);

        Object oldValue = elements[index];
        elements[index] = element;
        return oldValue;
    }

    public boolean add(Object e) {
        elements[size++] = e;
        return true;
    }

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

}
