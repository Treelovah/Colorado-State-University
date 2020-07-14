/*
Write a program whose input is a character and a string, and whose output indicates the number of times the character appears in the string.

Ex: If the input is:

n Monday

the output is:

1

Ex: If the input is:

z Today is Monday

the output is:

0

Ex: If the input is:

n It's a sunny day

the output is:

2

Case matters. n is different than N.

Ex: If the input is:

n Nobody

the output is:

0

Your program must define and call the following method that returns the number of times the input character appears in the input string.
public static int countCharacters(char userChar, String userString)

Note: This is a lab from a previous chapter that now requires the use of a method.
*/
import java.util.Scanner;

public class LabProgram {
   
   /* Define your method here */
   public static int countCharacters(char userChar, String userString) {
       // set variable to count amount of times letter is used.
       int count = 0;
       //convert string to char array for simplicity.
       char[] c_arr = userString.toCharArray();
       // execute order 66.
       for (char i : c_arr) {
           if (i == userChar) {
               count++;
           }
       }
       return count;
   }
   
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        char c = scnr.next().charAt(0);
        String s = scnr.nextLine();
        scnr.close();
        System.out.printf("%d\n",countCharacters(c, s));
    }
}
