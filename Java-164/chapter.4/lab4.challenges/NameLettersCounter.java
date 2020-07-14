/*


The following program counts the total number of letters in a person's first and last names. The getAndCountNameLetters() method creates a Scanner, reads a name from the user input, and returns the number of letters.

    1. Run the program. Note that the program does not count letters in the last name. The first call to scnr.next() returns the first name, but also reads the last name to make future reads faster. 
        The second call to getAndCountNameLetters() creates a different Scanner, which has nothing left to read.
  
    2. Change the program by passing a Scanner to the getAndCountNameLetters() method.
  
    3. Run the program again. Note that the count now includes the last name.

*/
import java.util.Scanner;

public class NameLettersCounter {

   // FIXME: Specify a Scanner as a method parameter
   public static int getAndCountNameLetters(Scanner scnr) {

      // FIXME: Use the Scanner parameter instead of creating one every time
      String name = "";

      if (scnr.hasNext()) {
         name = scnr.next();
      }

      return name.length();
   }

   public static void main(String[] args) {
      int firstNameLetterCount;
      int lastNameLetterCount;

      Scanner scnr = new Scanner(System.in);

      System.out.println("Enter a person's first and last names:");

      // The first method call will read both first and last names
      // FIXME: Pass the Scanner as an argument to both method calls
      firstNameLetterCount = getAndCountNameLetters(scnr);
      lastNameLetterCount = getAndCountNameLetters(scnr);
      scnr.close();
      System.out.println("The first name has " + firstNameLetterCount + " letters.");
      System.out.println("The last name has " + lastNameLetterCount + " letters.");
   }
}
