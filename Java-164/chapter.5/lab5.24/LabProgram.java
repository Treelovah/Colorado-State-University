/*
Primary U.S. interstate highways are numbered 1-99. Odd numbers (like the 5 or 95) go north/south, and evens (like the 10 or 90) go east/west. Auxiliary highways are numbered 100-999, and service the primary highway indicated by the rightmost two digits. Thus, I-405 services I-5, and I-290 services I-90.

Given a highway number, indicate whether it is a primary or auxiliary highway. If auxiliary, indicate what primary highway it serves. Also indicate if the (primary) highway runs north/south or east/west.

Ex: If the input is:

90

the output is:

I-90 is primary, going east/west.

Ex: If the input is:

290

the output is:

I-290 is auxiliary, serving I-90, going east/west.

Ex: If the input is:

0

or any number not between 1 and 999, the output is:

0 is not a valid interstate highway number. 
*/
import java.util.Scanner;;
public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); 

        /* Type your code here. */

        int highwayNumber = scnr.nextInt();
        boolean primaryNumber = (highwayNumber < 100) ? true : false;
        boolean auxiliaryNumber = (highwayNumber > 99 && highwayNumber < 1000) ? true : false;
        boolean highwayNumberValidity = (highwayNumber > 0 && highwayNumber < 1000) ? true : false;
        scnr.close();
        
        // if prime num
        if (highwayNumberValidity) {
            if (primaryNumber) {
                if (highwayNumber % 5 == 0 && highwayNumber % 10 == 0) {
                    System.out.printf("I-%d is primary, going east/west.\n",highwayNumber);
                } 
                if (highwayNumber % 5 == 0 && highwayNumber % 10 != 0) {
                    System.out.printf("I-%d is primary, going north/south.\n",highwayNumber);
                }
            }
            if (auxiliaryNumber) {
                if (highwayNumber % 5 == 0 && highwayNumber % 10 == 0) {
                    System.out.printf("I-%d is auxiliary, serving I-%s, going east/west.\n",highwayNumber, Integer.toString(highwayNumber).substring(1));
                } else if (highwayNumber % 5 == 0 && highwayNumber % 10 != 0) {
                    System.out.printf("I-%d is auxiliary, serving I-%s, going north/south.\n",highwayNumber, Integer.toString(highwayNumber).substring(Integer.toString(highwayNumber).length() - 1));
                } else {
                    System.out.printf("%d is not a valid interstate highway number.\n",highwayNumber);
                }   
            }
        } else {
            System.out.printf("%d is not a valid interstate highway number.\n",highwayNumber);
        }
    }
}
