package dataStructs;

public class Queue 
{
    public int[] queue;
    public int front;
    public int end;
    public int size;
    public int cap;

    public Queue(int cap)
    {
        this.cap = cap;
        queue = new int[cap];
        front = 0;
        end = -1;
        size = 0;
    }

    public boolean isFull()
    {
        return size == cap;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public void enqueue(int n)
    {
        if (isFull())
        {
            throw new RuntimeException("Queue is full.");
        }

        end = (end + 1) % cap;
        queue[end] = n;
        size++;
    }

    public int dequeue()
    {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            System.exit(2);
        }
        int n = queue[front];
        front = (front + 1) % cap;
        size--;
        
        return n;
    }

    public int peek()
    {
        if (isEmpty()) 
        {
            throw new RuntimeException("Queue is empty.");
        }
        return queue[front];
    }

    public int length()
    {
        return size;
    }
}
