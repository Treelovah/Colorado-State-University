/** Linked List Lab
 * Made by Toby Patterson 5/31/2020
 * For CS165 at CSU
 */

public class MyLinkedList<E> implements MiniList<E>{
    /* Private member variables that you need to declare:
     ** The head pointer
     ** The tail pointer
     */
    private Node head = null;
    private Node tail = null;

    public class Node {
        // declare member variables (data, prev and next)
        E data;
        Node prev, next;
        
        // finish these constructors
        public Node(E data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
        public Node(E data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        } // HINT: use this() with next = prev = null
    }

    // Initialize the head and tail pointer
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public boolean add(E item) {
        if (head == null) head = new Node(item);
        else
        {
            Node new_node = new Node(item);
            Node current_node = head;

            if (current_node != null)
            {
                while (current_node.next != null) current_node = current_node.next;
            }
            current_node.next = new_node;
        }
            return true;
    }

    @Override
    public void add(int index, E element) {

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
    public E remove() {
        Node current = head;
        E i = null;
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
    public E remove(int index) {
        Node current = head;
        E i = null;
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
    public boolean remove(E item) {
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
    public boolean contains(E item) {
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
    public E get(int index) {
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
    public int indexOf(E item) {
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
