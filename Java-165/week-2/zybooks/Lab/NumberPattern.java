import java.util.Scanner;

public class NumberPattern {

    static void printNumPattern(int num1, int num2)
    {
        if (num1 <= 0) System.out.printf("%d ",num1);
        else
        {
            System.out.printf("%d ",num1);
            printNumPattern((num1 - num2), num2);
            System.out.printf("%d ",num1);
        }
    }

    public static void main(String[] args) 
    {
        Scanner scnr = new Scanner(System.in);
        printNumPattern(scnr.nextInt(), scnr.nextInt());
        scnr.close(); 
    } 
}