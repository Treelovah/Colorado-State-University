/*
Write a program that first gets a list of integers from input. 

The input begins with an integer indicating the number of integers that follow. 

Assume that the list will always contain fewer than 20 integers.

That list is followed by two more integers representing lower and upper bounds of a range. 

Your program should output all integers from the list that are within that range (inclusive of the bounds). 

For coding simplicity, follow each output integer by a space, even the last one. The output ends with a newline.

Ex: If the input is:

5 25 51 0 200 33
0 50

then the output is:

25 0 33 

(the bounds are 0-50, so 51 and 200 are out of range and thus not output).

To achieve the above, first read the list of integers into an array.
*/
import java.util.Scanner;
public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int array_size = scnr.nextInt();
        int[] arr = new int[array_size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scnr.nextInt();
        }
        int start_range = scnr.nextInt();
        int last_range = scnr.nextInt();
        for (int i : arr) {
            if (i >= start_range && i <= last_range) {
                System.out.printf("%d ",i);
            }
        }
        System.out.println();
        scnr.close();
    }
}