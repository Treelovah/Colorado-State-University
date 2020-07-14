/* 
For any element in keysList with a value smaller than 40, print the corresponding value in itemsList, followed by a space.
Ex: If keysList = {32, 105, 101, 35} and itemsList = {10, 20, 30, 40}, print:

10 40 
*/
import java.util.Scanner;

public class ArraysKeyValue {
    public static void main (String [] args) {

        final int SIZE_LIST = 4;
        int[] keysList = new int[SIZE_LIST];
        int[] itemsList = new int[SIZE_LIST];
        int i;
        
        keysList[0] = 13;
        keysList[1] = 47;
        keysList[2] = 71;
        keysList[3] = 59;
        
        itemsList[0] = 12;
        itemsList[1] = 36;
        itemsList[2] = 72;
        itemsList[3] = 54;
        
        /* Your solution goes here */
        for (i = 0; i < keysList.length; i++) {
            if (keysList[i] < 40) {
                System.out.printf("%d ",itemsList[i]);
            }
        }
        System.out.println("");
    }
}