/*
Write a method printShampooInstructions(), with int parameter numCycles, and void return type. If numCycles is less than 1, print "Too few.". If more than 4, print "Too many.". Else, print "N: Lather and rinse." 

numCycles times, where N is the cycle number, followed by "Done.". End with a newline. Example output with input 2:

1: Lather and rinse.
2: Lather and rinse.
Done.
 
*/
import java.util.Scanner;

public class ShampooMethod {

   public static void printShampooInstructions(int numCycles) {
       if (numCycles < 1) {
           System.out.printf("Too few.\n");
       } else if (numCycles > 4) {
           System.out.printf("Too many.\n");
       } else {
          for (int i = 0; i < numCycles; i++) {
            System.out.printf("%d: Lather and rinse.\n",i+1); 
          }
          System.out.printf("Done.\n");
       }
   }
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userCycles;

      userCycles = scnr.nextInt();
      scnr.close();
      printShampooInstructions(userCycles);
   }
}