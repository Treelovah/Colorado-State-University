/*
Write a method drivingCost() with input parameters drivenMiles, milesPerGallon, and dollarsPerGallon, that returns the dollar cost to drive those miles. All items are of type double. 

If the method is called with 50 20.0 3.1599, the method returns 7.89975.

Define that method in a program whose inputs are the car's miles/gallon and the gas dollars/gallon (both doubles). 

Output the gas cost for 10 miles, 50 miles, and 400 miles, by calling your drivingCost() method three times.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

The output ends with a newline.

Ex: If the input is:

20.0 3.1599

the output is:

1.58 7.90 63.20

Your program must define and call a method:
public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon)

Note: This is a lab from a previous chapter that now requires the use of a method.
*/
import java.util.Scanner;

public class LabProgram {
   
   public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon) {
       return (drivenMiles / milesPerGallon) * dollarsPerGallon;
   }
   
   public static void drivingCost(double milesPerGallon, double dollarsPerGallon) {
       for (int i = 0; i < 3; i++) {
           double[] pre_sets = {10, 50, 400};
            if (i < 2) {
                System.out.printf("%.2f ",(dollarsPerGallon / milesPerGallon) * pre_sets[i]);
            } else {
                System.out.printf("%.2f\n",(dollarsPerGallon / milesPerGallon) * pre_sets[i]);
            }
       }
   }
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double mpg = scnr.nextDouble();
      double dpg = scnr.nextDouble();
      drivingCost(mpg, dpg);
      scnr.close();
   }
}
