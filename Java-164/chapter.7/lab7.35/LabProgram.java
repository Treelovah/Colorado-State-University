/*
Write a program that reads an integer, a list of words, and a character. The integer signifies how many words are in the list. The output of the program is every word in the list that contains the character at least once. Assume at least one word in the list will contain the given character. Assume that the list of words will always contain fewer than 20 words.

Ex: If the input is:

4 hello zoo sleep drizzle z

then the output is:

zoo
drizzle

To achieve the above, first read the list into an array. Keep in mind that the character 'a' is not equal to the character 'A'.
*/
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int array_size = scnr.nextInt();
        String[] arr = new String[array_size];

        for (int i = 0; i < array_size; i++) {
            arr[i] = scnr.next(); 
        }
        String delim = scnr.next();
        for (String s : arr) {
            if (s.contains(delim)) {
                System.out.println(s);
            }
        }
        scnr.close();
    }
}