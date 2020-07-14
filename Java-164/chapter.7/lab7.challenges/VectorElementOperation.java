/*
Multiply each element in origList with the corresponding value in offsetAmount. Print each product followed by a space.
Ex: If origList = {4, 5, 10, 12} and offsetAmount = {2, 4, 7, 3}, print:

8 20 70 36 
*/
import java.util.Scanner;

public class VectorElementOperation {
    public static void main (String [] args) {

        final int NUM_VALS = 4;
        int[] origList = new int[NUM_VALS];
        int[] offsetAmount = new int[NUM_VALS];
        int i;

        origList[0] = 40;
        origList[1] = 10;
        origList[2] = 30;
        origList[3] = 20;

        offsetAmount[0] = 4;
        offsetAmount[1] = 6;
        offsetAmount[2] = 2;
        offsetAmount[3] = 8;
        /* Type your code below */
        i = 0;
        for (int a : origList) {
            System.out.printf("%d ",a * offsetAmount[i]);
            i++;
        }

        System.out.println("");
    }
}
