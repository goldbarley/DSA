package dataStructs;

public class CircularLinkedList<E> extends LinkedList<E> {

    public CircularLinkedList() {
        list = null;
    }

    @Override
    public void prepend(E value) {
        Node<E> n = new Node<>(value);
        if (list == null) {
            list = n;
            n.setNext(list);
            
        } else {
            Node<E> ptr = list;
            for (; ptr.getNext() != list; ptr = ptr.getNext());

            ptr.setNext(n);
            n.setNext(list);
            list = n;
        }
    }

    @Override
    public void append(E value) {
        Node<E> n = new Node<>(value);
        if (list == null) {
            list = n;
            n.setNext(list);
        } else {
            Node<E> ptr = list;
            for (; ptr.getNext() != list; ptr = ptr.getNext());

            ptr.setNext(n);
            n.setNext(list);
        }
    }

    @Override
    public void insert(int index, E value) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            prepend(value);
            return;
        }

        Node<E> n = new Node<>(value);

        if (list == null) {
            if (index != 0) {
                throw new IndexOutOfBoundsException();
            }
            list = n;
            n.setNext(list);    
        } else {
            int currentIndex = 0;
            for (Node<E> ptr = list; ptr.getNext() != list; ptr = ptr.getNext(), currentIndex++) {
                if (currentIndex == index) {

                    Node<E> nextNode = ptr.getNext();
                    if (nextNode == list) {
                        ptr.setNext(n);
                        n.setNext(list);

                        return;
                    }

                    ptr.setNext(n);
                    n.setNext(nextNode);

                    return;
                }
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int length() {
        if (list == null) {
            throw new RuntimeException("List is empty.");
        }
        
        int length = 1;
        for (Node<E> ptr = list; ptr.getNext() != list; ptr = ptr.getNext(), length++);

        return length;
    }

    @Override
    public void reverse() {
        if (list == null) {
            throw new RuntimeException("Cannot reverse an empty list.");
        }

        Node<E> previous = null, current = list, next = null;

        do {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        } while (current != list);

        list.setNext(previous);
        list = previous;
    }
}