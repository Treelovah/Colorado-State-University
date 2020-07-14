/*
Complete method printPopcornTime(), with int parameter bagOunces, and void return type. If bagOunces is less than 2, print "Too small". If greater than 10, print "Too large". Otherwise, compute and print 6 * bagOunces followed by " seconds". End with a newline. Example output for ounces = 7:

42 seconds

*/

import java.util.Scanner;

public class PopcornTimer {
   public static void printPopcornTime(int bagOunces) {

      if (bagOunces < 2) {
         System.out.printf("Too small\n");
      } else if (bagOunces > 10) {
         System.out.printf("Too large\n");
      } else {
         System.out.printf("%d seconds\n",(6 * bagOunces));
      }

   }

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userOunces;

      userOunces = scnr.nextInt();
      scnr.close();
      printPopcornTime(userOunces);
   }
}