// Write an if-else statement that prints "Goodbye" if userString is "Quit", else prints "Hello". End with newline. 
import java.util.Scanner;

import java.util.Scanner;

public class DetectWord {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String userString;

      userString = scnr.next();
      scnr.close();
      if (userString.equals("Quit")) { // ew
         System.out.println("Goodbye");
      } else {
         System.out.println("Hello");
      }

   }
}