package FirstExamPrep;


import java.util.Scanner;
public class Main {
   
   public static double get_grades() {
      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter four grades to calculate the average: ");
      double a = scnr.nextDouble();
      double b = scnr.nextDouble();
      double c = scnr.nextDouble();
      double d = scnr.nextDouble();
      scnr.close();
      return averageGrades(a,b,c,d);
   }   
   public static double averageGrades(double a, double b, double c, double d) {
      return (a + b + c + d) / 4.0;
   }
   public static void main(String[] args) {
      System.out.printf("The average is: %.3f\n",get_grades());     
   }
}