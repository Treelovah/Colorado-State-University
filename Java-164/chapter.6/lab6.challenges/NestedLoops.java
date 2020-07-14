/*
Given numRows and numColumns, print a list of all seats in a theater. Rows are numbered, columns lettered, as in 1A or 3E. Print a space after each seat, including after the last.

Use separate print statements to print the row and column. Ex: numRows = 2 and numColumns = 3 prints:

1A 1B 1C 2A 2B 2C 
*/
import java.util.Scanner;
public class NestedLoops {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int numRows;
        int numColumns;
        int currentRow;
        // int currentColumn; Don't need this. 
        char currentColumnLetter;

        numRows = scnr.nextInt();
        numColumns = scnr.nextInt();
        scnr.close();

        /* Your solution goes here  */
        currentRow = 1;
        for (int i = 0; i < numRows; i++) {
            currentColumnLetter = 'A';
            for (int j = 0; j < numColumns; j++) {
                System.out.printf("%d%c ",currentRow,currentColumnLetter);
                currentColumnLetter++;
            }
            currentRow++;
        } 
    }
}