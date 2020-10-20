import java.util.*;

public class GenericStack<T> {

    /* YOUR CODE HERE
     * Just like in the ArrayList lab, copy your StringStack code, excluding the
     * main method, here.
     * Then, modify it so it's generic!
     */
    public final Object[] arr;

    /*
     * Puts the stack into a valid state, ready for us to call methods on. The size
     * parameter tell the... well, size of the stack.
     */
    public GenericStack(int size) {
        arr = new Object[size];
    }

    /*
     * If someone calls the constructor with no argument, they should get a stack
     * with a default size of 10.
     */
    public GenericStack() {
        arr = new Object[10];
    }

    /*
     * Return true if the stack has no elements, and false otherwise.
     */
    public boolean empty() {
        if (arr[0] == null)
            return true;
        return false;
    }

    /*
     * Return the object at the top of the stack, WITHOUT removing it. If there are
     * no elements to peek, throw a NoSuchElementException.
     */
    public T peek() {
        if (arr[0] == null)
            throw new NoSuchElementException();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != null) {
                return (T)arr[i];
            }
        }
        return (T)arr[0];
    }

    /*
     * Return the object at the top of the stack, AND ALSO remove it. If there are
     * no elements to pop, throw a NoSuchElementException.
     */
    public T pop() {
        T tmp = null;
        if (arr[0] == null)
            throw new NoSuchElementException();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != null) {
                tmp = (T)arr[i];
                arr[i] = null;
                break;
            }
        }
        return tmp;
    }

    /*
     * Add a new object to the top of the stack. If there is no room in the stack,
     * throw a IllegalStateException.
     */
    public T push(T s) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = s;
                return s;
            }
        }
        throw new IllegalStateException();
    }

    /*
     * Return the position of an object on the stack. The position of an object is
     * just its distance from the top of the stack. So, the topmost item is distance
     * 0, the one below the topmost item is at distance 1, etc.
     */
    public int search(T s) {
        int pos = 0, i = 0, size = 0;
        for (; i < arr.length; i++)
        {
            if (arr[i] == null) break;
            else size++;
        }
        for (i = size -1; i >= 0; i--)
        {
            if (arr[i].equals(s)) return pos;
            else pos++;
        }
        return -1;
    }
    public static void main(String[] args) {
        // If any of these lines cause a compilation error, your stack hasn't
        // been properly made generic.
        GenericStack<Integer> intStack = new GenericStack<>();
        GenericStack<String> stringStack = new GenericStack<>();
        GenericStack<ArrayList<String>> listStack = new GenericStack<>();
    }

}
