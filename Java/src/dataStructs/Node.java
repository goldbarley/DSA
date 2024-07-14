package dataStructs;

public class Node<E> {
    private E info;
    private Node<E> previous;
    private Node<E> next;

    public Node() {
        previous = null;
        info = null;
        next = null;
    }

    public Node(E value) {
        previous = null;
        info = value;
        next = null;
    }

    public Node(E value, Node<E> next) {
        previous = null;
        info = value;
        this.next = next;
    }

    public Node(Node<E> previous, E value, Node<E> next) {
        this.previous = previous;
        this.info = value;
        this.next = next;
    }

    public void setInfo(E value) {
        info = value;
    }

    public void setPrevious(Node<E> n) {
        previous = n;
    }

    public void setNext(Node<E> n) {
        next = n;
    }

    public E getInfo() {
        return info;
    }

    public Node <E> getPrevious() {
        return previous;
    }

    public Node<E> getNext() {
        return next;
    }
}