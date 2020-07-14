import java.util.Scanner;

public class OrderStrings {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String firstString;
      String secondString;

      firstString  = scnr.next();
      secondString = scnr.next();
      scnr.close();
      if (firstString.compareTo(secondString) < 0) {
         System.out.printf("%s %s\n",firstString, secondString);
      } else {
         System.out.printf("%s %s\n",secondString, firstString);
      }
   }
}