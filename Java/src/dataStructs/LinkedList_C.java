package dataStructs;

public class LinkedList_C<E> extends LinkedList_S<E> {

    public LinkedList_C() {
        list = null;
    }

    @Override
    public void prepend(E value) {
        final Node<E> newNode = new Node<>(value);
        if (list == null) {
            list = newNode;
            newNode.setNext(list);
            
        } else {
            Node<E> ptr;
            for (ptr = list; ptr.getNext() != list; ptr = ptr.getNext());

            ptr.setNext(newNode);
            newNode.setNext(list);
            list = newNode;
        }
    }

    @Override
    public void append(E value) {
        final Node<E> newNode = new Node<>(value);
        if (list == null) {
            list = newNode;
            newNode.setNext(list);
        } else {
            Node<E> ptr;
            for (ptr = list; ptr.getNext() != list; ptr = ptr.getNext());

            ptr.setNext(newNode);
            newNode.setNext(list);
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

        final Node<E> newNode = new Node<>(value);

        if (list == null) {
            if (index != 0) {
                throw new IndexOutOfBoundsException();
            }
            list = newNode;
            newNode.setNext(list);    
        } else {
            int currentIndex = 0;
            for (Node<E> ptr = list; ptr.getNext() != list; ptr = ptr.getNext(), currentIndex++) {
                if (currentIndex == index) {

                    Node<E> nextNode = ptr.getNext();
                    if (nextNode == list) {
                        ptr.setNext(newNode);
                        newNode.setNext(list);

                        return;
                    }

                    ptr.setNext(newNode);
                    newNode.setNext(nextNode);

                    return;
                }
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int size() {
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