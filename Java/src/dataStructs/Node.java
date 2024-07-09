package dataStructs;

public class Node<E> {
    private E info;
    private Node<E> next;

    public Node() {
        info = null;
        next = null;
    }

    public Node(E value) {
        info = value;
        next = null;
    }

    public void setInfo(E value) {
        info = value;
    }

    public void setNext(Node<E> n) {
        next = n;
    }

    public E getInfo() {
        return info;
    }

    public Node<E> getNext() {
        return next;
    }
}