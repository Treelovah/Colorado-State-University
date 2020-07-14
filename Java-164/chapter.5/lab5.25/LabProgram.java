/*
Summary: Given integer values for red, green, and blue, subtract the gray from each value.

Computers represent color by combining the sub-colors red, green, and blue (rgb). Each sub-color's value can range from 0 to 255. Thus (255, 0, 0) is bright red, (130, 0, 130) is a medium purple, (0, 0, 0) is black, (255, 255, 255) is white, and (40, 40, 40) is a dark gray. (130, 50, 130) is a faded purple, due to the (50, 50, 50) gray part. (In other words, equal amounts of red, green, blue yield gray).

Given values for red, green, and blue, remove the gray part.

Ex: If the input is:

130 50 130

the output is:

80 0 80

Find the smallest value, and then subtract it from all three values, thus removing the gray. 
*/
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        int num3 = scnr.nextInt();
        int smallestNum;
        scnr.close();
        // check for smallest number
        if (num1 < num2) {
            if (num1 < num3) {
                smallestNum = num1;
            } else {
                smallestNum = num3;
            }
        } else if (num2 < num3) {
           smallestNum = num2; 
        } else {
            smallestNum = num3;
        }
        // get rid of grey
        num1 = num1 - smallestNum;
        num2 = num2 - smallestNum;
        num3 = num3 - smallestNum;
        
        System.out.printf("%d %d %d\n", num1, num2, num3);
    }
}
