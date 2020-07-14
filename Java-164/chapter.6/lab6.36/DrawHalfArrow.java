/*
This program outputs a downwards facing arrow composed of a rectangle and a right triangle. 

The arrow dimensions are defined by user specified arrow base height, arrow base width, and arrow head width.

(1) Modify the given program to use a loop to output an arrow base of height arrowBaseHeight. (1 pt)


(2) Modify the given program to use a loop to output an arrow base of width arrowBaseWidth. 

Use a nested loop in which the inner loop draws the *’s, and the outer loop iterates a number of times equal to the height of the arrow base. (1 pt)


(3) Modify the given program to use a loop to output an arrow head of width arrowHeadWidth. 

Use a nested loop in which the inner loop draws the *’s, and the outer loop iterates a number of times equal to the height of the arrow head. (2 pts)


(4) Modify the given program to only accept an arrow head width that is larger than the arrow base width. 

Use a loop to continue prompting the user for an arrow head width until the value is larger than the arrow base width. (1 pt)

while (arrowHeadWidth <= arrowBaseWidth) {
    // Prompt user for a valid arrow head value
}


Example output for arrowBaseHeight = 5, arrowBaseWidth = 2, and arrowHeadWidth = 4:

Enter arrow base height:
5
Enter arrow base width:
2
Enter arrow head width:
4

**
**
**
**
**
****
***
**
*

*/
import java.util.Scanner; 

public class DrawHalfArrow {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int arrowBaseHeight;
        int arrowBaseWidth;
        int arrowHeadWidth;

        System.out.println("Enter arrow base height:");
        arrowBaseHeight = scnr.nextInt();
            
        System.out.println("Enter arrow base width:");
        arrowBaseWidth = scnr.nextInt();
            
        System.out.println("Enter arrow head width:");
        arrowHeadWidth = scnr.nextInt();
        while (arrowHeadWidth <= arrowBaseWidth) {
            System.out.println("Enter arrow head width:");
            arrowHeadWidth = scnr.nextInt();
        }
        scnr.close();
        System.out.println("");

        
        char star = '*';
        for (int i = 0; i < arrowBaseHeight; i++) {
            for (int j = 1; j <= arrowBaseWidth; j++) {
                System.out.printf("%c",star);
            }
            System.out.println(); 
        }
        int rows = 0;
        for (int i = 0; i < arrowHeadWidth; i++) {
            rows = i;
            for (int j = arrowHeadWidth; j > rows; --j) {
                System.out.printf("%c",star);
            }
            System.out.println();
        }
    }
}