/*
 Find the maximum value and minimum value in milesTracker. Assign the maximum value to maxMiles, and the minimum value to minMiles. Sample output for the given program:

Min miles: -10
Max miles: 40
*/
import java.util.Scanner;

public class ArrayKeyValue {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ROWS = 2;
        final int NUM_COLS = 2;
        int [][] milesTracker = new int[NUM_ROWS][NUM_COLS];
        int i;
        int j;
        int maxMiles; // Assign with first element in milesTracker before loop
        int minMiles; // Assign with first element in milesTracker before loop

        for (i = 0; i < milesTracker.length; i++){
            for (j = 0; j < milesTracker[i].length; j++){
                milesTracker[i][j] = scnr.nextInt();
            }
        }

        /* Your solution goes here  */
        // this should go in 2 different functions...
        minMiles = milesTracker[0][0];
        maxMiles = milesTracker[0][0];
        for (i = 0; i < milesTracker.length; i++) {
            for (j = 0; j < milesTracker.length; i++) {
                if (milesTracker[i][j] < minMiles) {
                    minMiles = milesTracker[i][j];
                }
                if (milesTracker[i][j] > maxMiles) {
                    maxMiles = milesTracker[i][j];
                }
            }
        }

        System.out.println("Min miles: " + minMiles);
        System.out.println("Max miles: " + maxMiles);
    }
}