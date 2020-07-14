/*
This program will output a right triangle based on user specified height triangleHeight and symbol triangleChar.

(1) The given program outputs a fixed-height triangle using a * character. Modify the given program to output a right triangle that instead uses the user-specified triangleChar character. (1 pt)


(2) Modify the program to use a nested loop to output a right triangle of height triangleHeight. The first line will have one user-specified character, such as % or *. Each subsequent line will have one additional user-specified character until the number in the triangle's base reaches triangleHeight. Output a space after each user-specified character, including after the line's last user-specified character. (2 pts)


Example output for triangleChar = % and triangleHeight = 5:

Enter a character:
%
Enter triangle height:
5

% 
% % 
% % % 
% % % % 
% % % % % 

*/
import java.util.Scanner; 

public class DrawRightTriangle {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char triangleChar;
        int triangleHeight;
        System.out.println("Enter a character:");
        triangleChar = scnr.next().charAt(0);   

        System.out.println("Enter triangle height:");
        triangleHeight = scnr.nextInt();
        System.out.println("");
        scnr.close();
        int rows = 0;
        for (int i = 0; i < triangleHeight; i++) {
            rows = i;
            for (int j = 0; j <= rows; j++) {
                System.out.printf("%c ",triangleChar);
            }
            System.out.println();
        }
        rows++;
        // System.out.println("*" + " ");
        // System.out.println("*" + " " + "*" + " ");
        // System.out.println("*" + " " + "*" + " " + "*" + " ");
    }
}