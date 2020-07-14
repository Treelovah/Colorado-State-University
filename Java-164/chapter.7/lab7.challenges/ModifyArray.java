/* 
Write a method swapArrayEnds() that swaps the first and last elements of its array parameter. Ex: sortArray = {10, 20, 30, 40} becomes {40, 20, 30, 10}. 
*/
import java.util.Scanner;

public class ModifyArray {

/* Your solution goes here  */
    public static void swapArrayEnds(int[] arr) {
        int arr_last = arr.length - 1;
        arr[0] ^= arr[arr_last];
        arr[arr_last] ^= arr[0];
        arr[0] ^= arr[arr_last];
    }

    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in); 
        int numElem = 4;
        int[] sortArray = new int[numElem];
        int i;
        // int userNum;                         not needed

        for (i = 0; i < sortArray.length; ++i) {
            if (i != sortArray.length -1) {
                sortArray[i] = scnr.nextInt();
            } else {
                sortArray[i] = scnr.nextInt();
                scnr.close();
            }
        }

        swapArrayEnds(sortArray);

        for (i = 0; i < sortArray.length; ++i) {
            System.out.print(sortArray[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }
}