/*
Write a loop that sets newScores to oldScores shifted once left, with element 0 copied to the end. Ex: If oldScores = {10, 20, 30, 40}, then newScores = {20, 30, 40, 10}.

Note: These activities may test code with different test values. This activity will perform two tests, both with a 4-element array (int oldScores[4]). See "How to Use zyBooks".

Also note: If the submitted code tries to access an invalid array element, such as newScores[9] for a 4-element array, the test may generate strange results. 

Or the test may crash and report "Program end never reached", in which case the system doesn't print the test case that caused the reported message. 
*/

import java.util.Scanner;
public class StudentScores {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int SCORES_SIZE = 4;
      int[] oldScores = new int[SCORES_SIZE];
      int[] newScores = new int[SCORES_SIZE];
      int i;

      for (i = 0; i < oldScores.length; ++i) {
         if (i > 4) {
            scnr.close();
         }
         oldScores[i] = scnr.nextInt();
      }

      /* Your solution goes here  */
      // copy and shift old list to new list.

      for (i = 0; i < oldScores.length -1; i++) {
         newScores[i] = oldScores[i+1];
      }
      newScores[3] = oldScores[0];
      
      for (i = 0; i < newScores.length; ++i) {
         System.out.print(newScores[i] + " ");
      }
      System.out.println();
   }
}