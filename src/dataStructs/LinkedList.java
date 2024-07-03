package dataStructs;

public class LinkedList
{
    private Node list;

    public LinkedList()
    {
        list = null;
    }

    public void prepend(int value)
    {
        Node n = new Node();

        n.setInfo(value);

        n.setNext(list);
        list = n;
    }
    
    public void append(int value)
    {
        Node n = new Node();

        n.setInfo(value);
        
        if (list == null)
            list = n;
        else
        {
            for (Node ptr = list; ptr != null; ptr = ptr.getNext())
            {
                if (ptr.getNext() == null)
                {
                    ptr.setNext(n);
                    break;
                }
            }
        }
    }

    public void addAfter(int index, int value)
    {
        if (index < 0)
            throw new IndexOutOfBoundsException();

        Node n = new Node();
        n.setInfo(value);

        int i = 0;

        for (Node ptr = list; ptr != null; ptr = ptr.getNext(), i++)
        {
            if (i == index)
            {
                Node nextNode = ptr.getNext();
                if (nextNode == null)
                    ptr.setNext(n);
                else
                {
                    n.setNext(nextNode);
                    ptr.setNext(n);
                }

                return;
            }
        }

        throw new IndexOutOfBoundsException();
    }

    public int get(int index)
    {
        if (list == null)
            throw new RuntimeException("List is empty.");

        if (index < 0)
            throw new IndexOutOfBoundsException();

        int i = 0;

        for (Node ptr = list; ptr != null; ptr = ptr.getNext(), i++)
        {
            if (i == index)
            {
                return ptr.getInfo();
            }
        }

        throw new IndexOutOfBoundsException();
    }

    public int remove(int index)
    {
        if (list == null)
            throw new RuntimeException("List is empty.");

        if (index < 0)
            throw new IndexOutOfBoundsException();

        else if (index == 0)
        {
            int value = list.getInfo();
            list = list.getNext();

            return value;
        }

        int i = 0;
        int value = 0;
        
        for (Node ptr = list; ptr != null; ptr = ptr.getNext(), i++)
        {
            if (i == index - 1)
            {
                Node nodeToRemove = ptr.getNext();
                value = nodeToRemove.getInfo();
                
                ptr.setNext(nodeToRemove.getNext());

                return value;
            }
        }

        throw new IndexOutOfBoundsException();
    }

    public int length()
    {
        int length = 0;
        for (Node ptr = list; ptr != null; ptr = ptr.getNext(), length++);

        return length;
    }

    public void reverse()
    {
        Node previous = null;
        Node current = list;

        while (current != null)
        {
            Node next = current.getNext();
            current.setNext(previous);

            previous = current;
            current = next;
            
        }

        list = previous;
    }
}
