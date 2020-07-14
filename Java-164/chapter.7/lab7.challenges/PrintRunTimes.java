/*
Write three statements to print the first three elements of array runTimes. 

Follow each statement with a newline. Ex: If runTime = {800, 775, 790, 805, 808}, print:

800 
775 
790

*/
import java.util.Scanner;

public class PrintRunTimes {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 5;
        int [] runTimes = new int[NUM_ELEMENTS];
        int i;

        for (i = 0; i < runTimes.length; ++i) {
            runTimes[i] = scnr.nextInt();
            scnr.close();
        }
        for (int a = 0; a < 3; a++) {
            System.out.println(runTimes[a]);
        }
    }   
}