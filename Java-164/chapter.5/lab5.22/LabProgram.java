/*
Write a program whose inputs are three integers, and whose outputs are the largest of the three values and the smallest of the three values.

Ex: If the input is:

7 15 3

the output is:

largest: 15 
smallest: 3

Your program must define and call the following two methods. The method largestNumber() should return the largest number of the three input values. The method smallestNumber() should return the smallest number of the three input values.
public static int largestNumber(int num1, int num2, int num3)
public static int smallestNumber(int num1, int num2, int num3)
*/
import java.util.Scanner; 

    public class LabProgram {

    /* Define your method here */
    public static int largestNumber(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num1 > num3) {
                return num1;
            } else {
                return num3;
            }
        } else if (num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static int smallestNumber(int num1, int num2, int num3) {
        if (num1 < num2) {
            if (num1 < num3) {
                return num1;
            } else {
                return num3;
            }
        } else if (num2 < num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
    /* Type your code here. */
    System.out.printf("largest: %d\n",largestNumber(7, 15, 3));
    System.out.printf("smallest: %d\n",smallestNumber(7, 15, 3));
    System.out.printf("largest: %d\n",largestNumber(0, -1, -2));
    System.out.printf("smallest: %d\n",smallestNumber(0, -1, -2));
    }
}
