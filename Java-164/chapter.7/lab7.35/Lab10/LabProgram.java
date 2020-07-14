/*
Write a program that reads a list of words. Then, the program outputs those words and their frequencies. 

The input begins with an integer indicating the number of words that follow. Assume that the list will always contain fewer than 20 words.

Ex: If the input is:

5 hey hi Mark hi mark

the output is:

hey 1
hi 2
Mark 1
hi 2
mark 1

Hint: Use two arrays, one array for the strings and one array for the frequencies.

*/
import java.util.*;
public class LabProgram {
    public static Scanner scnr = new Scanner(System.in);

    public static int search(ArrayList<String> arr, String s) {
        int count = 0;
        for (String str : arr) {
            if (str.equals(s)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hey");
        arr.add("hi");
        arr.add("Mark");
        arr.add("hi");
        arr.add("mark");

        for (String i : arr) {
            System.out.printf("%s %d\n",i, search(arr, i));
        }
    }
    // public static void main(String[] args) {
    //     Scanner scnr = new Scanner(System.in);
    //     // get amount of words that follow
    //     int arrSize = scnr.nextInt();
    //     ArrayList<String> str = new ArrayList<String>();
        
    //     for (int i = 0; i < arrSize; i++) {
    //         str.add(scnr.next());
    //     }
    //         // using a bubble sort here. could have used Array.sort... but meh.
        
    //     for (String s : str) {
    //         System.out.printf("%s",s);
    //         System.out.printf(" %s \n",Collections.frequency(str, s));
    //     }
    //     scnr.close();
    // }
}