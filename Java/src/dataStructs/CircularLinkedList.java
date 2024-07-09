package dataStructs;

public class CircularLinkedList extends LinkedList {

    public CircularLinkedList() {
        list = null;
    }

    @Override
    public void prepend(int value) {
        Node n = new Node(value);
        if (list == null) {
            list = n;
            n.setNext(list);
            
        } else {
            Node ptr = list;
            for (; ptr.getNext() != list; ptr = ptr.getNext());

            ptr.setNext(n);
            n.setNext(list);
            list = n;
        }
    }

    @Override
    public void append(int value) {
        Node n = new Node(value);
        if (list == null) {
            list = n;
            n.setNext(list);
        } else {
            Node ptr = list;
            for (; ptr.getNext() != list; ptr = ptr.getNext());

            ptr.setNext(n);
            n.setNext(list);
        }
    }

    @Override
    public void insert(int index, int value) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            prepend(value);
            return;
        }

        Node n = new Node(value);

        if (list == null) {
            if (index != 0) {
                throw new IndexOutOfBoundsException();
            }
            list = n;
            n.setNext(list);    
        } else {
            int currentIndex = 0;
            for (Node ptr = list; ptr.getNext() != list; ptr = ptr.getNext(), currentIndex++) {
                if (currentIndex == index) {
                    Node nextNode = ptr.getNext();
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
        for (Node ptr = list; ptr.getNext() != list; ptr = ptr.getNext(), length++);

        return length;
    }
}