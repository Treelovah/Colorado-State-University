import java.util.Scanner;

public class DescendingOrder {
   // TODO: Write a void method selectionSortDescendTrace() that takes 
   //       an integer array and the number of elements in the array as arguments, 
   //       and sorts the array into descending order.
    public static void selectionSortDescendTrace(int [] numbers, int numElements) {
        for (int i = 0; i < numElements - 1; i++)
        {
            int pos = i;
            for (int j = i + 1; j < numElements; j++) if (numbers[j] > numbers[pos]) pos = j;
            // make swap
            int temp = numbers[pos];
            numbers[pos] = numbers[i];
            numbers[i] = temp;
            for (int k = 0; k < numElements; k++) System.out.printf("%d ", numbers[k]);
            System.out.println();
        }
    }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int input, i = 0;
      int numElements = 0;
      int [] numbers = new int[10];

      // TODO: Read in a list of up to 10 positive integers; stop when
      //       -1 is read. Then call selectionSortDescendTrace() method.

      do {
          input = scnr.nextInt();
          if (input == -1) break; 
          numbers[i] = input;
          i++;
      } while (input != -1);
      scnr.close();
      numElements = i;
      selectionSortDescendTrace(numbers, numElements);
   }
}

