/*
Print numbers 0, 1, 2, ..., userNum as shown, with each number indented by that number of spaces. For each printed line, print the leading spaces, then the number, and then a newline. Hint: Use i and j as loop variables (initialize i and j explicitly). Note: Avoid any other spaces like spaces after the printed number. Ex: userNum = 3 prints:

0
 1
  2
   3
*/
// this one had me thinking lul...good one ;) ez to code, logic wuz oof.
import java.util.Scanner;
public class NestedLoop {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;
        int i;
        int j;

        userNum = scnr.nextInt();
        scnr.close();
        for (i = 0; i <= userNum; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}