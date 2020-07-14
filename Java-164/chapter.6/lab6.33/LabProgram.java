/*
Statistics are often calculated with varying amounts of input data. Write a program that takes any number of non-negative integers as input, and outputs the average and max. 

A negative integer ends the input and is not included in the statistics.

Ex: When the input is:

15 20 0 5 -1

the output is:

10 20

You can assume that at least one non-negative integer is input.
*/
import java.util.Scanner; 



public class LabProgram {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int total = 0;
        int biggestNumber = 0;
        int count = 0;
        while (true) {
            int userInput = scnr.nextInt();
            if (userInput > -1) {
                count++;
                total += userInput;
                if (biggestNumber < userInput) {
                    biggestNumber = userInput;
                }
            } else {
                scnr.close();
                break;
            }
        }
        System.out.printf("%d %d\n",(total / count),biggestNumber);
    }
}
