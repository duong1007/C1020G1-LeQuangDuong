package arraylist.thuc_hanh.linklist;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(50);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(3,5);
        ll.add(4,9);
        ll.printList();
    }
}

