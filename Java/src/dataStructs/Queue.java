package dataStructs;

public class Queue<E> {
    public E[] queue;
    public int front;
    public int end;
    public int size;
    public int cap;

    public Queue(int cap) {
        this.cap = cap;
        @SuppressWarnings("unchecked")
        E[] queue = (E[]) new Object[cap];
        this.queue = queue;
        front = 0;
        end = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == cap;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(E n) {
        if (isFull()) {
            throw new RuntimeException("Queue is full.");
        }

        end = (end + 1) % cap;
        queue[end] = n;
        size++;
    }

    public E dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            System.exit(2);
        }
        
        E n = queue[front];
        front = (front + 1) % cap;
        size--;

        return n;
    }

    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty.");
        }
        return queue[front];
    }

    public int length() {
        return size;
    }
}