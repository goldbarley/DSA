package dataStructs;

import java.util.NoSuchElementException;

// import java.util.LinkedList;
public class DoublyLinkedList<E> {
    private Node<E> list;
    private Node<E> endOfList;
    private int size = 0;

    public DoublyLinkedList() {
        list = null;
        endOfList = null;
    }

    public void prepend(E value) {
        Node<E> firstNode = list;
        Node<E> newNode = new Node<>(null, value, list);
        list = newNode;
        if (list == null) {
            endOfList = newNode;
        } else {
            firstNode.setPrevious(newNode);
        }
        size++;
    }

    public void append(E value) {
        Node<E> lastNode = endOfList;
        Node<E> newNode = new Node<>(lastNode, value, null);
        endOfList = newNode;

        if (lastNode == null) {
            list = newNode;
        } else {
            lastNode.setNext(newNode);
        }
        size++;
    }

    public void insert(int index, E value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Cannot access index " + index + " for size " + size);
        }

        if (list == null) {
            if (index != 0) {
                throw new IndexOutOfBoundsException("Cannot access index " + index + " for size " + size);
            }
        } 

        int currentIndex = 0;
        for (Node<E> ptr = list; ptr != null; ptr = ptr.getNext(), currentIndex++) {
            if (currentIndex == index) {
                Node<E> newNode = new Node<>(ptr.getPrevious(), value, ptr);
                ptr.setPrevious(newNode);

                break;
            }
        }
        
        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Cannot index " + index + " for size " + size);
        }
        if (list == null) {
           throw new NoSuchElementException("List is empty.");
        }

        int currentIndex = 0;

        if (index == size - 1) {
            return endOfList.getInfo();
        } 

        for (Node<E> ptr = list; ptr != null; ptr = ptr.getNext(), currentIndex++) {
            if (currentIndex == index) {
                return ptr.getInfo();
            }
        }

        return null;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Cannot access index " + index + " for size " + size);
        }

        if (list == null) {
            throw new NoSuchElementException("List is empty.");
        }

        E value = null;

        int currentIndex = 0;
        for (Node<E> ptr = list; ptr != null; ptr = ptr.getNext(), currentIndex++) {
            if (currentIndex == index) {
                value = ptr.getInfo();

                Node<E> previousNode = ptr.getPrevious();
                Node<E> nextNode = ptr.getNext();

                if (previousNode == null) {
                    list = nextNode;
                    
                    if (list != null) {
                        list.setNext(null);
                    } else {
                        endOfList = list;
                    }

                    break;
                }

                if (nextNode == null) {
                    
                }

                ptr.setPrevious(null); ptr.setNext(null);

                previousNode.setNext(nextNode);
                nextNode.setPrevious(previousNode);
            }
        }

        size--;
        return value;
    }

    public int size() {
        return size;
    }
}
