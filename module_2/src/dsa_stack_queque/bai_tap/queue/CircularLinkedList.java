package dsa_stack_queque.bai_tap.queue;

public class CircularLinkedList {
    private Node front;
    private Node rear;

    public class Node {
        int data;
        Node link;
    }

    public void enQueue(int value) {
        Node temp = new Node();
        temp.data = value;
        if (this.front == null) {
            this.front = temp;
        } else {
            this.rear.link = temp;
        }
        this.rear = temp;
        this.rear.link = this.front;
    }

    public int deQueue() {
        if (this.front == null) {
            System.out.printf("Queue is empty");
            return Integer.MIN_VALUE;
        }

        int value;
        if (this.front == this.rear) {
            value = this.front.data;
            this.front = null;
            this.rear = null;
        } else {
            Node temp = this.front;
            value = temp.data;
            this.front = this.front.link;
            this.rear.link= this.front;
        }
        return value;
    }

    public void displayQueue() {
        Node temp = this.front;
        System.out.print(" Elements in Circular Queue are: ");
        while (temp.link != this.front)
        {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }
}
