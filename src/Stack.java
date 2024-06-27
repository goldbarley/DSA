public class Stack
{
    int size; 
    int[] stack;
    int top;

    public Stack(int size)
    {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }
    public static void main(String[] args) 
    {
        // Call stack functions here
    }

    private  boolean isEmpty()
    {
        return top == -1;
    }

    private boolean isFull()
    {
        return top == size - 1;
    }

    private void push(int n)
    {
        if (isFull())
        {
            System.out.println("Stack Overflow error.");
            System.exit(1);
        }

        stack[++top] = n;
    }

    private void pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack Underflow error.");
            System.exit(2);
        }

        stack[top--] = 0;
    }

    private int peek()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty.");
            System.exit(3);
        }

        return stack[top];
    }

    private int getsize()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty.");
            System.exit(4);
        }
        return top + 1;
    }
}