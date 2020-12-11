package dsa_arraylist_linkedlist.bai_tap.mylinkedlist;

public class MyLinkedList<E> {
    private Node head;
    private int numberNode;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numberNode++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numberNode++;
    }

    public void addLast(E e) {
        Node temp = head;
        for (int i = 0; i < numberNode; i++) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numberNode++;
    }

    public E remove(int index) {
        Node temp = head;
        Object holderE;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holderE = temp.next.data;
        temp.next = temp.next.next;
        numberNode--;
        return (E) holderE;
    }

    public boolean remove(Object o) {
        Node temp = head;
        int i;
        for (i = 0; i < numberNode; i++) {
            if (temp.equals(o)) {
                remove(i);
                break;
            } else {
                temp = temp.next;
            }
        }
        if (i == numberNode) {
            return false;
        } else {
            return true;
        }
    }

    public int size() {
        return numberNode + 1;
    }


    public E clone() {
        MyLinkedList<E> clone = new MyLinkedList<E>(this.head.data);
        for (MyLinkedList.Node x = this.head; x != null; x = x.next) {
            clone.addFirst((E) x.next.data);
        }
        return (E) clone;
    }

    public boolean contain(E o) {
        int i = getI(o);
        if (i == numberNode) {
            return false;
        } else {
            return true;
        }
    }

    public int indexOf(E o) {
        int i = getI(o);
        if (i > numberNode) {
            return -1;
        } else {
            return i;
        }
    }

    private int getI(E o) {
        Node temp = head;
        int i;
        for (i = 0; i < numberNode; i++) {
            if (temp.equals(o)) {
                break;
            } else {
                temp = temp.next;
            }
        }
        return i;
    }

    public String printList() {
        String s = "[";
        for (MyLinkedList.Node x = this.head; x != null; x = x.next) {
            s += x.data + ",";
        }
        s += "]";
        return s;
    }

    public E get(int i) {
        Node temp = head;
        for (int index = 0; index < i && temp.next != null; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFist() {
        return (E) head.data;
    }

    public E getLast() {
        Node temp = head;
        for (int i = 0; i < numberNode; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void clear() {
        head = new Node(null);
        numberNode = 0;
    }

}
