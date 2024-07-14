package dataStructs;

public class LinkedList<E> {
    protected Node<E> list;
    private int size = 0;

    public LinkedList() {
        list = null;
    }

    public void prepend(E value) {
        Node<E> n = new Node<E>();

        n.setInfo(value);

        n.setNext(list);
        list = n;

        size++;
    }

    public void append(E value) {
        Node<E> newNode = new Node<E>(value, null);

        newNode.setInfo(value);

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
        }

        int currentIndex = 0;
        for (Node<E> ptr = list; ptr != null; ptr = ptr.getNext(), currentIndex++) {
            if (currentIndex == index - 1) {
                Node<E> newNode = new Node<>(value, ptr.getNext());
                ptr.setNext(newNode);

                size++;
                
                return;
            }
        }

        throw new IndexOutOfBoundsException("Cannot access index " + index + " for size " + size);
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
            throw new RuntimeException("List is empty.");
        }

        if (index < 0) {
            throw new IndexOutOfBoundsException("Cannot access index " + index + " for size " + size);
        }

        else if (index == 0) {
            E value = list.getInfo();
            list = list.getNext();

            size--;

            return value;
        }

        int currentIndex = 0;
        E value = null;

        for (Node<E> ptr = list; ptr != null; ptr = ptr.getNext(), currentIndex++) {
            if (currentIndex == index - 1) {
                Node<E> nodeToRemove = ptr.getNext();
                value = nodeToRemove.getInfo();

                ptr.setNext(nodeToRemove.getNext());

                size--;

                return value;
            }
        }

        throw new IndexOutOfBoundsException("Cannot access index " + index + " for size " + size);
    }

    public int size() {
        return size;
    }

    public void reverse() {
        Node<E> previous = null, current = list, next = list.getNext();

        while (current != null) {
            current.setNext(previous);

            previous = current;
            current = next;

        }

        list = previous;
    }
}