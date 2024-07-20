package dataStructs;

public class LinkedList_D<E> {
    private Node<E> list = null;
    private Node<E> endOfList = null;
    private int size = 0;

    public LinkedList_D() {
        this.list = null;
        this.endOfList = null;
        this.size = 0;
    }

    public void prepend(E value) {
        Node<E> firstNode = list;
        final Node<E> newNode = new Node<>(null, value, list);
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
        final Node<E> newNode = new Node<>(lastNode, value, null);
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
            throw new IndexOutOfBoundsException("Cannot access index " + index + "for size " + size);
        } else if (index == 0) {
            prepend(value);
            return;
        } else if (index == size - 1) {
            append(value);
            return;
        }

        int currentIndex = 1;
        for (Node<E> ptr = list.getNext(); ptr.getNext() != null; ptr = ptr.getNext(), currentIndex++) {
            if (currentIndex == index) {
                
                Node<E> prevNode = ptr.getPrevious();
                final Node<E> newNode = new Node<>(ptr.getPrevious(), value, ptr);

                ptr.setPrevious(newNode);
                prevNode.setNext(newNode);

                break;
            }
        }

        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Cannot index " + index + " for size " + size);
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

        E value = null;
        int currentIndex = 0;

        for (Node<E> ptr = list; ptr != null; ptr = ptr.getNext(), currentIndex++) {

            if (currentIndex == index) {

                value = ptr.getInfo();

                Node<E> prevNode = ptr.getPrevious();
                Node<E> nextNode = ptr.getNext();

                if (prevNode == null && nextNode == null) {
                    list = null;
                    break;
                } else if (prevNode == null) {
                    nextNode.setPrevious(null);
                    list = nextNode;
                    break;
                } else if (nextNode == null) {
                    prevNode.setNext(null);
                    endOfList = prevNode;
                    break;
                }

                prevNode.setNext(nextNode);
                nextNode.setPrevious(prevNode);

                break;
            }
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
            currentNode.setPrevious(nextNode);

            prevNode = currentNode;
            currentNode = nextNode;
        }

        endOfList = list;
        list = prevNode;
    }
}
