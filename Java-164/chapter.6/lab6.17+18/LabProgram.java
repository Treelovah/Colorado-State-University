/*
An acronym is a word formed from the initial letters of words in a set phrase. Write a program whose input is a phrase and whose output is an acronym of the input. 

If a word begins with a lower case letter, don't include that letter in the acronym. Assume there will be at least one upper case letter in the input.

Ex: If the input is:

Institute of Electrical and Electronics Engineers

the output should be:

IEEE

Your program must define and call a method thats returns the acronym created for the given userPhrase.
public static String createAcronym(String userPhrase)

Hint: Refer to the ascii table to make sure a letter is upper case.
*/
import java.util.Scanner;

public class LabProgram {
    /* Define your method here. */
    public static String createAcronym(String userPhrase) {
        String string = "";
        char[] charArray = userPhrase.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
            string += charArray[i];
            }
        }
        return string;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.printf("%s\n",createAcronym(scnr.nextLine()));
        scnr.close();
    }
}