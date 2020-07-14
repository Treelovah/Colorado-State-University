/*
Print "userNum1 is negative." if userNum1 is less than 0. End with newline.
Convert userNum2 to 0 if userNum2 is greater than 11. Otherwise, print "userNum2 is less than or equal to 11.". End with newline
*/
public class UserNums {
    public static void main (String [] args) {
        int userNum1;
        int userNum2;
 
        userNum1 = -1;
        userNum2 = 6;

        if (userNum1 < 0) {
            System.out.println("userNum1 is negative.");
        }
        if (userNum2 > 11) {
            userNum2 = 0;
        }
        else {
            System.out.println("userNum2 is less than or equal to 11.");
        }
        System.out.println("userNum2 is " + userNum2);
 
    }
}
 