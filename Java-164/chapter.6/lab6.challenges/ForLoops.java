/*
Write code that prints: numVal ... 2 1
Print a newline after each number. Ex: numVal = 3 outputs:

3
2
1
*/
public class ForLoops {
    public static void main(String[] args) {
        int numVal;
        int i;
        
        numVal = 3;

        /* Write your for loop here */
        for (i = numVal; i > 0; i--) {
            System.out.println(i);
        }
    }
}