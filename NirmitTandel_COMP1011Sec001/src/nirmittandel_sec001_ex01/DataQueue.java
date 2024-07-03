package nirmittandel_sec001_ex01;



public class DataQueue<E> {
    // Node class for holding the data and a reference to the next node
    private static class Node<E> {
        E item;
        Node<E> next;

        // Constructor for the Node class
        Node(E item) {
            this.item = item;
            this.next = null;
        }
    }

    // Head and tail pointers for the queue
    private Node<E> head;
    private Node<E> tail;

    // Constructor to initialize an empty queue
    public DataQueue() {
        this.head = null;
        this.tail = null;
    }

    // Method to add an element to the queue (enqueue)
    public void enqueue(E item) {
        // Create a new node with the provided item
        Node<E> newNode = new Node<>(item);

        // If the queue is empty, set both head and tail to the new node
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            // If the queue is not empty, add the new node to the end of the queue
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Method to delete an element from the queue (dequeue)
    public E dequeue() {
        // Check if the queue is empty before dequeueing
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        // Retrieve the item from the head of the queue
        E item = head.item;

        // Move the head pointer to the next node
        head = head.next;

        // If the queue becomes empty after dequeueing, reset the tail
        if (head == null) {
            tail = null;
        }

        // Return the dequeued item
        return item;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Method to print elements in the queue
    public void printQueue() {
        // Start from the head and iterate through the queue
        Node<E> current = head;
        while (current != null) {
            // Print the item in the current node
            System.out.print(current.item + " ");
            // Move to the next node
            current = current.next;
        }
        // Print a new line after printing all elements
        System.out.println();
    }
}