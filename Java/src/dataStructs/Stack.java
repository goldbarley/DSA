package dataStructs;

public class Stack<E> {
    int size;
    E[] stack;
    int top;

    public Stack(int size) {
        this.size = size;
        @SuppressWarnings("unchecked")
        E[] stack = (E[]) new Object[size];
        this.stack = stack;
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(E n) {
        if (isFull()) {
            throw new StackOverflowError("Stack overflow.");
        }

        stack[++top] = n;
    }

    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }

        E n = stack[top];
        stack[top--] = null;

        return n;
    }

    public E peek() {
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