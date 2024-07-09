package dataStructs;

public class LinkedList<E> {
    protected Node<E> list;

    public LinkedList() {
        list = null;
    }

    public void prepend(E value) {
        Node<E> n = new Node<E>();

        n.setInfo(value);

        n.setNext(list);
        list = n;
    }

    public void append(E value) {
        Node<E> n = new Node<E>();

        n.setInfo(value);

        if (list == null) {
            list = n;
        }
        else {
            for (Node<E> ptr = list; ptr != null; ptr = ptr.getNext()) {
                if (ptr.getNext() == null) {
                    ptr.setNext(n);
                    break;
                }
            }
        }
    }

    public void insert(int index, E value) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> n = new Node<E>();
        n.setInfo(value);

        int i = 0;

        for (Node<E> ptr = list; ptr != null; ptr = ptr.getNext(), i++) {
            if (i == index) {
                Node<E> nextNode = ptr.getNext();
                if (nextNode == null) {
                    ptr.setNext(n);
                } else {
                    n.setNext(nextNode);
                    ptr.setNext(n);
                }

                return;
            }
        }

        throw new IndexOutOfBoundsException();
    }

    public E get(int index) {
        if (list == null) {
            throw new RuntimeException("List is empty.");
        }

        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        int i = 0;

        for (Node<E> ptr = list; ptr != null; ptr = ptr.getNext(), i++) {
            if (i == index) {
                return ptr.getInfo();
            }
        }

        throw new IndexOutOfBoundsException();
    }

    public E remove(int index) {
        if (list == null) {
            throw new RuntimeException("List is empty.");
        }

        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        else if (index == 0) {
            E value = list.getInfo();
            list = list.getNext();

            return value;
        }

        int i = 0;
        E value = null;

        for (Node<E> ptr = list; ptr != null; ptr = ptr.getNext(), i++) {
            if (i == index - 1) {
                Node<E> nodeToRemove = ptr.getNext();
                value = nodeToRemove.getInfo();

                ptr.setNext(nodeToRemove.getNext());

                return value;
            }
        }

        throw new IndexOutOfBoundsException();
    }

    public int length() {
        if (list == null) {
            throw new RuntimeException("List is empty.");
        }
        int length = 0;
        for (Node<E> ptr = list; ptr != null; ptr = ptr.getNext(), length++);

        return length;
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