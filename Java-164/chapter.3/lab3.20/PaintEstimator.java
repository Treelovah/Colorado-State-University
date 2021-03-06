/*
(1) Prompt the user to input a wall's height and width. Calculate and output the wall's area. (2 pts)

Note: This zyLab outputs a newline after each user-input prompt. For convenience in the examples below, the user's input value is shown on the next line, but such values don't actually appear as output when the program runs.

    Enter wall height (feet):
    12.0
    Enter wall width (feet):
    15.0
    Wall area: 180.0 square feet

(2) Extend to also calculate and output the amount of paint in gallons needed to paint the wall. Assume a gallon of paint covers 350 square feet. Store this value using a const double variable. (2 pts)

    Enter wall height (feet):
    12.0
    Enter wall width (feet):
    15.0
    Wall area: 180.0 square feet
    Paint needed: 0.5142857142857142 gallons

(3) Extend to also calculate and output the number of 1 gallon cans needed to paint the wall. Hint: Use a math function to round up to the nearest gallon. (2 pts)

    Enter wall height (feet):
    12.0
    Enter wall width (feet):
    15.0
    Wall area: 180.0 square feet
    Paint needed: 0.5142857142857142 gallons
    Cans needed: 1 can(s)

*/
import java.util.Scanner;
// import java.lang.Math;     // Note: Needed for math functions in part (3)
// This is not needed ^^

public class PaintEstimator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double wallHeight;
      double wallWidth;
      double wallArea;
      double paintNeeded;
      
      System.out.println("Enter wall height (feet):");
      wallHeight = scnr.nextDouble();
      System.out.println("Enter wall width (feet):");
      wallWidth = scnr.nextDouble();
      scnr.close();
      
      // Calculate and output wall area
      wallArea = wallHeight * wallWidth;
      System.out.printf("Wall area: %.1f square feet\n",wallArea);
      
      paintNeeded = wallArea / 350.00;
      System.out.println("Paint needed: " + paintNeeded + " gallons");
      
      if (paintNeeded > 0.0 && paintNeeded < 1.0) {
         System.out.printf("Cans needed: %d can(s)\n",(int)paintNeeded + 1);
      } else {
         System.out.printf("Cans needed: %d can(s)\n",(int)paintNeeded + 1);
      }
   }
}
