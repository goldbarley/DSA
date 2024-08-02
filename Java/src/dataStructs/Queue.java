package dataStructs;

public class Queue<T> {
    private T[] queue;
    private int size;
    private int front;
    private int rear;

    public Queue(int size) {
        this.size = size;
        @SuppressWarnings("unchecked")
        T[] queue = (T[]) new Object[this.size];
        this.queue = queue;
        this.front = -1;
        this.rear = -1;
    }

    public boolean empty() {
        return front == -1 && rear == -1;
    }

    public boolean full() {
        return (rear + 1) % size == front;
    }

    public void enqueue(T value) {
        if (full()) {
            System.out.println("Queue is full!");
        }
        else if (empty()) {
            front = rear = 0;
            queue[rear] = value;
        } else {
            rear = (rear + 1) % size;
            queue[rear] = value;
        }
    }

    public T dequeue() {
        if (empty()) {
            System.out.println("Queue is empty!");
            return null;
        }

        T value = queue[front];
        queue[front] = null;

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return value;
    }

    public int size() {
        if (empty()) {
            return 0;
        } else if (full()) {
            return this.size;
        } else if (rear >= front) {
            return rear - front + 1;
        } 
        return (this.size - front) + (rear + 1);
    }
    
    public void print() {
        if (empty()) {
            System.out.println("Queue is empty!");
        }

        System.out.print("[");
        int i = front;
        do {
            i = (i + 1) % size;
            if (i == (front + 1) % size) {
                System.out.print(queue[front]);
            } else {
                System.out.print(", " + queue[i]);
            }
        } while (i != rear);
        System.out.print("]\n");
    }
}