package dsa_stack_queque.bai_tap.queue;

public class CircularLinkedListTest {
    public static void main(String[] args) {
        CircularLinkedList queue = new CircularLinkedList();
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(10);
        queue.displayQueue();

        System.out.println();
        System.out.println(" Deleted value = " + queue.deQueue());
        System.out.println(" Deleted value = " + queue.deQueue());

        queue.displayQueue();
        System.out.println();
        queue.enQueue(9);
        queue.enQueue(20);
        queue.displayQueue();
    }
}
