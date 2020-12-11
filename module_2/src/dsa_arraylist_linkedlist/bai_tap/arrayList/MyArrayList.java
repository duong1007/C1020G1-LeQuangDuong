package dsa_arraylist_linkedlist.bai_tap.arrayList;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        this.elements = new Object[capacity];
    }

    public void add(int index, E e) {
        if (size == elements.length) {
            ensureCapacity(size +1);
        }
        for (int i = elements.length - 1; i > index ; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
        size++;
    }

    public E remove(int index) {
        Object hold = elements[index];
        for (int i = index; i < elements.length - 1;i++) {
            elements[i] = elements[i+1];
        }
        elements[size--] = null;
        return (E) hold;
    }

    public int size() {
        return size;
    }

    public E[] clone() {
        E newElements[] = (E[]) new Object[size];
        for (int index = 0; index < elements.length ; index++) {
            newElements[index] = (E) elements[index];
        }
        return  newElements;
    }

    public boolean contains(E o){
        int i = getIndex(o);
        if (i == elements.length ) {
            return true;
        } else {
            return false;
        }
    }

    public int indexOf(E o) {
        int index = getIndex(o);
        if (index == elements.length) {
            return -1;
        } else {
            return index;
        }
    }

    private int getIndex(E o) {
        int index;
        for (index = 0; index < elements.length; index++) {
            if (elements[index].equals(o)) {
                break;
            }
        }
        return index;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(size + 1);
        }
        elements[size++] = e;
        return true;
    }

    public E get(int i ) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public void clear() {
        elements = new Object[size];
        size = 0;
    }

    public void ensureCapacity(int minCapacity) {
        if (elements.length < minCapacity ){
            Object newElements[] =  new Object[minCapacity];
            for (int index = 0; index < elements.length ; index++) {
                newElements[index] = elements[index];
            }
            elements = newElements;
        }
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
