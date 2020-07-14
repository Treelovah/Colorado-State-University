/*
A pedometer treats walking 2,000 steps as walking 1 mile. Write a program whose input is the number of steps, and whose output is the miles walked.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

Ex: If the input is:

5345

the output is:

2.67

Your program must define and call a method:
public static double stepsToMiles(int userSteps)
*/
import java.util.Scanner;

public class LabProgram {

    public static double stepsToMiles(int userSteps) {
        // return coverted steps to miles
        return (double)userSteps / 2000;
    } 
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int user_input = scnr.nextInt();
      scnr.close();
      System.out.printf("%.2f",stepsToMiles(user_input));
   }
}
