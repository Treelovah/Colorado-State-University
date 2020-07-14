/*
A “jiffy” is the scientific name for 1/100th of a second. Given an input number of seconds, output the number of "jiffies."

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

Ex: If the input is:

15

the output is:

1500.00

Your program must define and call a method:
public static double secondsToJiffies(double userSeconds)
*/
import java.util.Scanner;

public class LabProgram {
   
   public static double secondsToJiffies(double userSeconds) {
       userSeconds = userSeconds * 100;
       return (double)userSeconds;
   }
   
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       double user_input = scnr.nextDouble();
      System.out.printf("%.2f", secondsToJiffies(user_input));
      scnr.close();

   }
}