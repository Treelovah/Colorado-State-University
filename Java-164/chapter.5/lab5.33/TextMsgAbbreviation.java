/*
(1) If a user's input string matches a known text message abbreviation, output the unabbreviated form, else output: Unknown. Support two abbreviations: LOL -- laughing out loud, and IDK -- I don't know. (4 pts)

Sample input/output:

Input an abbreviation:
LOL
laughing out loud


(2) Expand to also decode these abbreviations. (3 pts)

    BFF -- best friends forever
    IMHO -- in my humble opinion
    TMI -- too much information
*/
import java.util.Scanner;

public class TextMsgAbbreviation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* Type your code here. */
        System.out.println("Input an abbreviation:");
        String userInput = scnr.nextLine();
        scnr.close();
        // match Abbrev to value
        switch(userInput) {
            case "LOL":
                System.out.println("laughing out loud");
                break;
            case "IDK":
                System.out.println("I don't know");
                break;
            case "BFF":
                System.out.println("best friends forever");
                break;
            case "IMHO":
                System.out.println("in my humble opinion");
                break;
            case "TMI":
                System.out.println("too much information");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
    }
}