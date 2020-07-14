/*
Write a program that takes in a line of text as input, and outputs that line of text in reverse. The program repeats, ending when the user enters "Quit", "quit", or "q" for the line of text.

Ex: If the input is:

Hello there
Hey
quit

the output is:

ereht olleH
yeH

*/
//The instructions suck ass..
import java.util.Scanner;

public class LabProgram {

    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        while (true) {
            String user_input = scnr.nextLine();
            if (user_input.contains("q") || (user_input.contains("Q"))) {
                scnr.close();
                break;
            } else {
                user_input = new StringBuilder(user_input).reverse().toString();
                System.out.printf("%s\n",user_input);
            }
        }
    }
}