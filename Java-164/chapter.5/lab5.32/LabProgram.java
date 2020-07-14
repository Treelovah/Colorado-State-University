/*
Write a program that takes a date as input and outputs the date's season. The input is a string to represent the month and an int to represent the day.

Ex: If the input is:

April 11

the output is:

Spring

In addition, check if the string and int are valid (an actual month and day).

Ex: If the input is:

Blue 65

the output is:

Invalid

The dates for each season are:
Spring: March 20 - June 20
Summer: June 21 - September 21
Autumn: September 22 - December 20
Winter: December 21 - March 19
*/

import java.time.Month;
import java.util.Scanner; 

public class LabProgram {
    
   
    // function to verify date;
    public static boolean verifyMonth(String month, int day) {
        if (month.equals("January") || month.equals("Febuary") || month.equals("March") || month.equals("April") || month.equals("May") || month.equals("June") || month.equals("July") || month.equals("August") || month.equals("September") || month.equals("October") || month.equals("November") || month.equals("December")) {
            if (day > 0 && day <= 31) {
                if (month.equals("Febuary") && day > 29) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }
        return false;
    }  

    public static void seasonChecker(String month, int day) {
        if (verifyMonth(month, day)) {
            if (month.equals("December")) {
                if (day >= 21) {
                    System.out.println("Winter");
                } else if (day < 21) {
                    System.out.println("Autumn");
                }
            }
            if (month.equals("January") || month.equals("Febuary")) {
                System.out.println("Winter");
            }
            if (month.equals("March")) {
                if (day >= 20) {
                    System.out.println("Spring");
                } else if (day < 20) {
                    System.out.println("Winter");
                }
            }
            if (month.equals("April") || month.equals("May")) {
                System.out.println("Spring");
            }
            if (month.equals("June")) {
                if (day >= 21) {
                    System.out.println("Summer");
                } else if (day < 21) {
                    System.out.println("Spring");
                }
            }
            if (month.equals("July") || month.equals("August")) {
                System.out.println("Summer");
            }
            if (month.equals("September")) {
                if (day >= 22) {
                    if (day == 31) {
                        System.out.println("Invalid");
                    } else if (day <= 31) {
                        System.out.println("Autumn");
                    }
                } else if (day < 22) {
                    System.out.println("Summer");
                }
            }
            if (month.equals("October") || month.equals("November")) {
                System.out.println("Autumn");
            }
        } else {
            System.out.println("Invalid");
        }
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); 
        String inputMonth = scnr.next();
        int inputDay = scnr.nextInt();
        seasonChecker(inputMonth, inputDay);
        scnr.close();
    }
}
