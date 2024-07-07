package dataStructs;

public class Stack {
    int size;
    int[] stack;
    int top;

    public Stack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int n) {
        if (isFull()) {
            throw new StackOverflowError("Stack overflow.");
        }

        stack[++top] = n;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }

        int n = stack[top];
        stack[top--] = 0;

        return n;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }

        return stack[top];
    }

    public int getsize() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        return top + 1;
    }
}