/*

Write multiple if statements:
If carYear is before 1968, print "Probably has few safety features." (without quotes).
If after 1969, print "Probably has head rests.".
If after 1992, print "Probably has electronic stability control.".
If after 2002, print "Probably has tire-pressure monitor.".
End each phrase with period and newline. Ex: carYear = 1995 prints:

Probably has head rests.
Probably has electronic stability control.

*/
public class SafetyFeatures {
    public static void main (String [] args) {
        int carYear;

        carYear = 1991;

        if (carYear < 1968) {
            System.out.println("Probably has a few safety features.");
        }
        if (carYear > 1969) {
            System.out.println("Probably has head rests.");
            
        }
        if (carYear > 1992) {
            System.out.println("Probably has electronic stability control.");
        }
        if (carYear > 2002) {
            System.out.println("Probably has tire-pressure monitor.");
        }
    }
}