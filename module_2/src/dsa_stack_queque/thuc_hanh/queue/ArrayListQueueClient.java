package dsa_stack_queque.thuc_hanh.queue;

public class ArrayListQueueClient {
    public static void main(String[] args) {
        MyArrayListQueue queue = new MyArrayListQueue(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
    }
}
