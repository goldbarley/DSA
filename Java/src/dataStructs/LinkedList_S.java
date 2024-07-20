package dataStructs;

import java.util.NoSuchElementException;

public class LinkedList<E> {
    protected Node<E> list;
    private int size = 0;

    public LinkedList() {
        list = null;
    }

    public void prepend(E value) {
        final Node<E> newNode = new Node<E>(value, list);

        list = newNode;

        size++;
    }

    public void append(E value) {
        final Node<E> newNode = new Node<E>(value, null);

        if (list == null) {
            list = newNode;
        }
        else {
            Node<E> ptr = list;
            while (ptr.getNext() != null) {
                ptr = ptr.getNext();
            } 

            ptr.setNext(newNode);
        }

        size++;
    }

    public void insert(int index, E value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Cannot access index " + index + " for size " + size);
        }

        if (index == 0) {
            prepend(value);
            return;
        } else if (index == size - 1) {
            append(value);
            return;
        }

        int currentIndex = 1;
        for (Node<E> ptr = list.getNext(); ptr.getNext() != null; ptr = ptr.getNext(), currentIndex++) {
            if (currentIndex == index - 1) {
                final Node<E> newNode = new Node<>(value, ptr.getNext());

                ptr.setNext(newNode);
            }
        }
    }

    public E get(int index) {
        if (list == null) {
            throw new RuntimeException("List is empty.");
        }

        if (index < 0) {
            throw new IndexOutOfBoundsException("Cannot access index " + index + " for size " + size);
        }

        int currentIndex = 0;

        for (Node<E> ptr = list; ptr != null; ptr = ptr.getNext(), currentIndex++) {
            if (currentIndex == index) {
                return ptr.getInfo();
            }
        }

        throw new IndexOutOfBoundsException("Cannot access index " + index + " for size " + size);
    }

    public E remove(int index) {
        if (list == null) {
            throw new NoSuchElementException();
        }

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Cannot access index " + index + " for size " + size);
        }

        int currentIndex = 0;
        E value = null;
        Node<E> prevNode = null;

        for (Node<E> ptr = list; ptr != null; ptr = ptr.getNext(), currentIndex++) {
            if (currentIndex == index) {
                final Node<E> nextNode = ptr.getNext();
                if (prevNode == null) {
                    list = nextNode;
                } else {
                    prevNode.setNext(nextNode);
                }

                break;
            }
            prevNode = ptr;
        }

        size--;
        return value;
    }

    public int size() {
        return size;
    }

    public void reverse() {
        if (list == null) {
            throw new RuntimeException("List is empty.");
        }
        Node<E> prevNode = null, currentNode = list, nextNode = null;

        while (currentNode != null) {
            
            nextNode = currentNode.getNext();
            currentNode.setNext(prevNode);

            prevNode = currentNode;
            currentNode = nextNode;
        }

        list = prevNode;
    }
}