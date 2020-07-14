/*
Given positive integer numInsects, write a while loop that prints that number doubled without reaching 200. Follow each number with a space. After the loop, print a newline. Ex: If numInsects = 16, print:

16 32 64 128 

*/
import java.util.Scanner;

public class InsectGrowth {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int numInsects;

        numInsects = scnr.nextInt(); // Must be >= 1
        scnr.close();
        while (numInsects < 200) {
            System.out.printf("%d ", numInsects);
            numInsects = numInsects * 2;
        }
        System.out.println();
    }
}