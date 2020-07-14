/*


(1) Use scnr.nextLine() to get a line of user input into a string. Output the line. (3 pts)

Ex:

Enter text:
IDK if I'll go. It's my BFF's birthday. 
You entered: IDK if I'll go. It's my BFF's birthday.


(2) Search the string (using indexOf()) for common abbreviations and print a list of each found abbreviation along with its decoded meaning. (3 pts)

Ex:

Enter text:
IDK if I'll go. It's my BFF's birthday. 
You entered: IDK if I'll go. It's my BFF's birthday. 
BFF: best friend forever
IDK: I don't know

Support these abbreviations:

    BFF -- best friend forever
    IDK -- I don't know
    JK -- just kidding
    TMI -- too much information
    TTYL -- talk to you later

*/
import java.util.Scanner;

public class TextMsgDecoder {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter text:");
        String user_input = scnr.nextLine();
        System.out.printf("you entered: %s\n",user_input);
        scnr.close();
        
        String list[] = {"BFF", "IDK", "JK", "TMI", "TTYL"};
        if (user_input.contains("BFF")) {
            System.out.printf("%s: best friend forever\n",list[0]);
        } if (user_input.contains("IDK")) {
            System.out.printf("%s: I don't know\n",list[1]);
        }  if (user_input.contains("JK")) {
            System.out.printf("%s: just kidding\n",list[2]);
        }  if (user_input.contains("TMI")) {
            System.out.printf("%s: too much information\n",list[3]);
        }  if (user_input.contains("TTYL")) {
            System.out.printf("%s: talk to you later\n",list[4]);
        }
    }
}