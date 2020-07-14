/*
Given a line of text as input, output the number of characters excluding spaces, periods, or commas

Ex: If the input is:

Listen, Mr. Jones, calm down.

the output is:

21

Note: Account for all characters that aren't spaces, periods, or commas (Ex: "r", "2", "!").
*/

import java.util.*;
public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String str;
        str = scnr.nextLine();
        scnr.close();
        str = str.replace(" ", "");
        str = str.replace(",", "");
        str = str.replace(".", "");
        int count = 0;
        for (char ch : str.toCharArray()) {
            count++;
        }
        System.out.printf("%d\n",count);

    }
}