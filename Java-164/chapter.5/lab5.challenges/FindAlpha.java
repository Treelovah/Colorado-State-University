/*
Write code to print the location of any alphabetic character in the 2-character string passCode. Each alphabetic character detected should print a separate statement followed by a newline. Ex: If passCode is "9a", output is:

Alphabetic at 1

Hint: Use two if statements to check each of the two characters in the string, using Character.isLetter(). 
*/
import java.util.Scanner;

public class FindAlpha {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String passCode;

      passCode = scnr.next();
      scnr.close();

      /* Your solution goes here  */
        for (int i = 0; i < passCode.length(); i++) {
            if (Character.isLetter(passCode.charAt(i))) {
                System.out.printf("Alphabetic at %d\n",i);
            }
        }
    }
}