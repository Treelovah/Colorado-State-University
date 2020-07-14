/*


One lap around a standard high-school running track is exactly 0.25 miles. Write a program that takes a number of miles as input, and outputs the number of laps.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

Ex: If the input is:

1.5

the output is:

6.00

Ex: If the input is:

2.2

the output is:

8.80

Your program must define and call a method:
public static double milesToLaps(double userMiles)
*/
import java.util.Scanner;

public class LabProgram {
   
   public static double milesToLaps(double userMiles) {
      return userMiles / .25;
   }
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double userInput = scnr.nextDouble();
      System.out.printf("%.2f\n",milesToLaps(userInput));
      scnr.close();
   }
}