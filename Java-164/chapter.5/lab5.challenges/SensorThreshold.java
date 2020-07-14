/*
Write an expression that will cause the following code to print "Equal" if the value of sensorReading is "close enough" to targetValue. Otherwise, print "Not equal". Ex: If targetValue is 0.3333 and sensorReading is (1.0/3.0), output is:

Equal
*/

import java.lang.Math;
import java.util.Scanner;
public class SensorThreshold {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double targetValue;
      double sensorReading;

      targetValue = scnr.nextDouble();
      sensorReading = scnr.nextDouble();
      scnr.close();
      if (Math.abs(sensorReading - targetValue) < 0.0001) {
         System.out.println("Equal");
      }
      else {
         System.out.println("Not equal");
      }
   }
}