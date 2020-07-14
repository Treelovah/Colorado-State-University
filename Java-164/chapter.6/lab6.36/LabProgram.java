/*
Write a program that removes all spaces from the given input.

Ex: If the input is:

Hello my name is John.

the output is:

HellomynameisJohn.

Your program must define and call the following method. The method should return a string representing the input string without spaces.
public static String removeSpaces (String userString)

Note: This is a lab from a previous chapter that now requires the use of a method.
*/
import java.util.Scanner; 

public class LabProgram {

    public static String removeSpaces(String userString) {
        return userString.replaceAll(" ","");
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.printf("%s\n",removeSpaces(scnr.nextLine()));
    }
}