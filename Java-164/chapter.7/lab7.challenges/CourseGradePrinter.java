/*
Write a for loop to print all elements in courseGrades, following each element with a space (including the last). 

Print forwards, then backwards. End each loop with a newline. Ex: If courseGrades = {7, 9, 11, 10}, print:

7 9 11 10 
10 11 9 7 

Hint: Use two for loops. Second loop starts with i = courseGrades.length - 1
*/
import java.util.Collections;
import java.util.Scanner;

public class CourseGradePrinter {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_VALS = 4; //unnecessary initialization..this just clutters the code.
        int [] courseGrades = new int[NUM_VALS]; // 
        int i; // unnecessary declaration outside of for loop, this does not benefit the program.

        for (i = 0; i < courseGrades.length; ++i) {
            courseGrades[i] = scnr.nextInt();
        }
        /* Your solution goes here  */
        for (int a : courseGrades) {
            System.out.printf("%d ",a);
        }
        System.out.println();
        for (int a = courseGrades.length - 1; a >= 0; a--) {
            System.out.printf("%d ",courseGrades[a]);
        }
        System.out.println();
    }
}