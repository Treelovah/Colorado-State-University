/**
 * Linked List Lab Made by Toby Patterson 5/29/2020 For CS165 at CSU
 */

public class MyLinkedList implements MiniList<Integer> 
{
    /*
     * Private member variables that you need to declare: 
     * 
     * no pointers in java, right? only references?
     * 
     * The head pointer 
     * The tail pointer
     */
    private Node head = null;
    private Node tail = null;

    public class Node 
    {
        // declare member variables (data and next)
        int data;
        Node next;

        // finish these constructors
        public Node(int data, Node next) 
        {
            this.data = data;
            this.next = next;
        }

        public Node(int data) 
        {
            this.data = data;
            this.next = null;

        } // HINT: use this() with next = null
    }

    // Initialize the linked list (set head and tail pointers)
    public MyLinkedList() 
    {
        head = null;
        tail = null;
    }

    @Override
    public boolean add(Integer item) 
    {
        Node newNode = new Node(item);
        if (head == null) 
        {
            head = newNode;
            tail = newNode;
        } 
        else 
        {
            tail.next = newNode;
            tail = newNode;
        }
        return true;
    }

    @Override
    public void add(int index, Integer element) 
    {
        Node current = head;
        if (head == null) return;
        int count = 0;
        while (current != null) 
        {
            if (index - 1 == count) {
                Node newNode = new Node(element);
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
            count++;
        }
    }

    @Override
    public Integer remove() 
    {
        Node current = head;
        Integer i = null;
        i = head.data;
        head = head.next;
        if (head == null) return null;
        while (current != null) 
        {
            if (current.next.next == null) {
                i = current.next.data;
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
        return i;
    }

    @Override
    public Integer remove(int index) 
    {
        Node current = head;
        Integer i = null;
        int count = 0;
        if (head == null) return null;

        while (current != null) 
        {
            if (index - 1 == count && current.next != null) 
            {
                i = current.next.data;
                if (current.next.next == null) tail = current;

                current.next = current.next.next;
                break;
            }
            current = current.next;
            count++;
        }
        return i;
    }

    @Override
    public boolean remove(Integer item) 
    {
        Node current = head;
        if (head == null) return false;
        if (current.data == item)
        {
            head = current.next;
            return true;
        }
        while (current != null) 
        {
            if (current.next != null && current.next.data == item) 
            {
                if (current.next.next == null) { tail = current; }
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
        return true;
    }

    @Override
    public void clear() { head = null; }

    @Override
    public boolean contains(Integer item) 
    {
        Node current = head;
        if (head == null) return false;

        while (current != null) 
        {
            if (current.data == item) return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public Integer get(int index) {
        Node current = head;
        int count = 0;
        if (head == null) return null;

        while (current != null) {
            if (index == count) return current.data;
            current = current.next;
            count++;

        }
        return null;
    }

    @Override
    public int indexOf(Integer item) {
        Node current = head;
        int count = 0;
        if (head == null) return -1;

        while (current != null) {
            if (current.data == item) return count;
            current = current.next;
            count++;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) return true;
        return false;
    }

    @Override
    public int size() {
        Node current = head;
        int count = 0;
        if (head == null) return 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // Uncomment when ready to test
    @Override
    public String toString() {
        String ret = "";
        Node curr = head;
        while (curr != null) {
            ret += curr.data + " ";
            curr = curr.next;
        }
        return ret;
    }

}
