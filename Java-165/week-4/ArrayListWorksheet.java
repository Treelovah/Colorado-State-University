import java.util.ArrayList;

/**
 * ArrayListWorksheet
 */

 





 

// 3.

// public void makeAL(){


// a. Why is the ArrayList not containing ints?


// b. What is printed?
public class ArrayListWorksheet {
    
    public static void arrayStuff()
    {
        // 1. What is the contents of the ArrayList after the following code executes?

        // ArrayList<String> list = new ArrayList<>();

        // list.add("Stack");

        // list.add(1, "Queue");

        // list.add("Queue");

        // list.add("LinkedList");

        // list.add(2, "ArrayList");

        // list.remove("Queue");

        // list.remove(3);
        ArrayList<String> list = new ArrayList<>();
        list.add("Stack");
        list.add(1, "Queue");
        list.add("Queue");
        list.add("LinkedList");
        list.add(2, "ArrayList");
        list.remove("Queue");
        list.remove(3);
        
        for (String str : list) System.out.printf("%s ", str);
        System.out.println();
    } 

    public static void moreArrayStuff()
    {
        // 2.  True/False.

        // Assuming two ArrayList objects (of strings) named arr and arr2 have been declared, initialized, and have the following strings:

        // arr=>["ABC", "DEF", "EFG", "GHI"]

        // arr2=>["ABC", "JKL"]

        // arr.retainAll(arr2) would delete all the strings from arr except "ABC".
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();

        arr.add("ABC");
        arr.add("DEF");
        arr.add("EFG");
        arr.add("GHI");

        arr2.add("ABC");
        arr2.add("JK:");

        arr.retainAll(arr2);
        for (String str : arr) System.out.printf("%s\n",str);
    }

    public static void omgItNeverEnds()
    {
        // a. Why is the ArrayList not containing ints?

        // b. What is printed?
        ArrayList<Integer> alI = new ArrayList<Integer>();
        alI.add(0);
        alI.add(2);
        alI.add(4);
        alI.add(2,3);
        alI.add(1,1);
        System.out.println(alI);
        alI.remove(1);
        alI.remove(2);
        System.out.println(alI);
        

    }

    public static void main(String[] args) {

        arrayStuff();
        moreArrayStuff();
        omgItNeverEnds();
    }    
}