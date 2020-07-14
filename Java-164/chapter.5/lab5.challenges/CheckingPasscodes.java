// Set hasDigit to true if the 3-character passCode contains a digit.

import java.util.Scanner;

public class CheckingPasscodes {
   public static void main (final String[] args) {
      final Scanner scnr = new Scanner(System.in);
      boolean hasDigit;
      String passCode;

      hasDigit = false;
      passCode = scnr.next();
      scnr.close();
      for (int i = 0; i < passCode.length(); i++) {
         if (Character.isDigit(passCode.charAt(i))) {
            hasDigit = true;
         }
      } if (hasDigit) {
         System.out.println("Has a digit.");
      }
      else {
         System.out.println("Has no digit.");
      }
   }
}