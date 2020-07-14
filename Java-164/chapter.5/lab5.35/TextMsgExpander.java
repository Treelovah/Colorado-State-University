/*
(1) Use scnr.nextLine(); to get a line of user input into a string. Output that line. (1 pt)

Ex:

Enter text:
IDK how that happened. TTYL. 
You entered: IDK how that happened. TTYL.


(2) Expand common text message abbreviations. Output a message for each abbreviation that is expanded, then output the expanded line. Note: Check for abbreviations in the order provided below. (5 pts)

Support these abbreviations:

    BFF -- best friend forever
    IDK -- I don't know
    JK -- just kidding
    TMI -- too much information
    TTYL -- talk to you later

Ex:

Enter text:
IDK how that happened. TTYL. 
You entered: IDK how that happened. TTYL.

Replaced "IDK" with "I don't know".
Replaced "TTYL" with "talk to you later".

Expanded: I don't know how that happened. talk to you later.

*/
import java.util.Scanner;

public class TextMsgExpander {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* Type your code here. */
        
        // approved abbrev's.
        String list[] = {"BFF", "IDK", "JK", "TMI", "TTYL"};
        // interact w/ user
        System.out.println("Enter text:");
        String userInput = scnr.nextLine();
        scnr.close();
        System.out.printf("You entered: %s\n\n",userInput);
        // check for abbrev's
        if (userInput.contains(list[0])) {
            System.out.printf("Replaced \"%s\" with \"%s\".\n",list[0], "best friend forever");
            userInput = userInput.replace(list[0], "best friend forever");
        } 
        if (userInput.contains(list[1])) {
            System.out.printf("Replaced \"%s\" with \"%s\".\n",list[1], "I don't know");
            userInput = userInput.replace(list[1], "I don't know");          
        }
        if (userInput.contains(list[2])) {
            System.out.printf("Replaced \"%s\" with \"%s\".\n",list[2], "just kidding");
            userInput = userInput.replace(list[2], "just kidding");
        }
        if (userInput.contains(list[3])) {
            System.out.printf("Replaced \"%s\" with \"%s\".\n",list[3], "too much information");
            userInput = userInput.replace(list[3], "too much information");
        }
        if (userInput.contains(list[4])) {
            System.out.printf("Replaced \"%s\" with \"%s\".\n",list[4], "talk to you later");
            userInput = userInput.replace(list[4], "talk to you later");
        }
        // spit out final
        System.out.printf("\nExpanded: %s\n",userInput);
    }
}
