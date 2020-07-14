/*
Write a void method selectionSortDescendTrace() that takes an integer array, and sorts the array into descending order. 
The method should use nested loops and output the array after each iteration of the outer loop, thus outputting the array N-1 times (where N is the size). 
Complete main() to read in a list of up to 10 positive integers (ending in -1) and then call the selectionSortDescendTrace() method.

If the input is:

20 10 30 40 -1

then the output is:

40 10 30 20 
40 30 10 20 
40 30 20 10 

*/
    // TODO: Write a void method selectionSortDescendTrace() that takes 
    //       an integer array and the number of elements in the array as arguments, 
    //       and sorts the array into descending order.
    
import java.util.Scanner;


public class DescendingOrder {


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void selectionSortDescendTrace(int[] arr, int arrSize) {
        int max;
        for (int i = 0; i < arrSize - 1; ++i) {
            max = i;
            for (int j = i; j < arrSize; ++j) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            swap(arr, i, max);
            for (int j = 0; j < arrSize; j++) {
                System.out.printf("%d ",arr[j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int arrSize = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if (arr[i] == -1)
                break;
            ++arrSize;
        }
        selectionSortDescendTrace(arr, arrSize);
    }
}