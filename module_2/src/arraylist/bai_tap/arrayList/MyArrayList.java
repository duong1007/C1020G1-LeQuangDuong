package arraylist.bai_tap.arrayList;

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

    public void add(E e) {
        if (size == elements.length) {
             clone();
        }
        elements[size++] = e;
    }

    public E remove(int index) {
        E hold = (E) elements[index];
        for (int i = index; i <elements.length - 1;i++) {
            elements[i] = elements[i+1];
        }
        int newSize = elements.length - 1;
        Arrays.copyOf(elements, newSize);
        return hold;
    }

    public int size() {
        return elements.length;
    }

    public E[] clone() {
        int newSize = elements.length +1;
        E newElements[] = (E[]) new Object[newSize];
        return  newElements;
    }

    public boolean contains(E o){
        int i;
        for (i = 0; i < elements.length ; i++) {
            if (elements[i].equals(o)) {
                break;
            }
        }
        if (i == elements.length ) {
            return true;
        } else {
            return false;
        }
    }
}
