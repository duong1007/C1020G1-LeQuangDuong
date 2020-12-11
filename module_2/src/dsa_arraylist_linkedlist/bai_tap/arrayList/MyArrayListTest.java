package dsa_arraylist_linkedlist.bai_tap.arrayList;


import java.util.LinkedList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> listInteger = new MyArrayList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
        listInteger.add(3,10);
        listInteger.remove(0);
        System.out.println(listInteger.indexOf(10));
        System.out.println(listInteger);
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(10);
        linkedList.clone();
    }
}
