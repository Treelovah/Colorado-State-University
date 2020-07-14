/*
Write a method maxMagnitude() with two integer input parameters that returns the largest magnitude value. Use the method in a program that takes two integer inputs, and outputs the largest magnitude value.

Ex: If the inputs are:

5 7

the method returns:

7

Ex: If the inputs are:

-8 -2

the method returns:

-8

Note: The method does not just return the largest value, which for -8 -2 would be -2. Though not necessary, you may use the absolute-value built-in math method.

Your program must define and call a method:
public static int maxMagnitude(int userVal1, int userVal2)
*/
import java.util.Scanner;

public class LabProgram {

/* Define your method here */
    public static int maxMagnitude(int num1, int num2) {
        if (Math.abs(num1) > Math.abs(num2)) { // must use Math.abs() to get magnitude aka absolute value
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        scnr.close();
        System.out.println(maxMagnitude(num1, num2));
    }
}
