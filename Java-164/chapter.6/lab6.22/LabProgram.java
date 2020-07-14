/*


Mad Libs are activities that have a person provide various words, which are then used to complete a short story in unexpected (and hopefully funny) ways.

Write a program that takes a string and integer as input, and outputs a sentence using those items as below. The program repeats until the input string is quit 0.

Ex: If the input is:

apples 5
shoes 2
quit 0

the output is:

Eating 5 apples a day keeps the doctor away.
Eating 2 shoes a day keeps the doctor away.
*/
import java.util.Scanner;

public class LabProgram {
    public static void doStuff(String a, int b) {    
        System.out.printf("Eating %d %s a day keeps the doctor away.\n",b,a);
    }
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        String a;
        int b;
        while (true) {
        a = scnr.next();
        b = scnr.nextInt();
            if (a.contains("quit")) {
                scnr.close();
                break;
            } else {
                doStuff(a,b);
            }
        }
    }
}
