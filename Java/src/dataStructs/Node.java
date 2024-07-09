package dataStructs;

public class Node {
    private int info;
    private Node next;

    public Node() {
        info = 0;
        next = null;
    }

    public Node(int value) {
        info = value;
        next = null;
    }

    public void setInfo(int value) {
        info = value;
    }

    public void setNext(Node n) {
        next = n;
    }

    public int getInfo() {
        return info;
    }

    public Node getNext() {
        return next;
    }
}