/*
(1) Prompt the user to enter five numbers, being five people's weights. Store the numbers in an array of doubles. 

Output the array's numbers on one line, each number followed by one space. (2 pts)

Ex:

Enter weight 1:
236.0
Enter weight 2:
89.5
Enter weight 3:
142.0
Enter weight 4:
166.3
Enter weight 5:
93.0
You entered: 236.0 89.5 142.0 166.3 93.0

(2) Also output the total weight, by summing the array's elements. (1 pt)

(3) Also output the average of the array's elements. (1 pt)

(4) Also output the max array element. (2 pts)

Ex:

Enter weight 1:
236.0
Enter weight 2:
89.5
Enter weight 3:
142.0
Enter weight 4:
166.3
Enter weight 5:
93.0
You entered: 236.0 89.5 142.0 166.3 93.0

Total weight: 726.8
Average weight: 145.35999999999999
Max weight: 236

*/
import java.util.Scanner;

public class PeopleWeights {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int count = 0;
        double total = 0.0;
        double max = 0.0;
        double[] arr = new double[5];
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter weight " + i + ":");
            if (i > 5) {
                scnr.close();
            }
            arr[count] = scnr.nextDouble();
            count++;
        }
        System.out.print("You entered: ");
        for (double i : arr) {
            System.out.printf("%.1f ",i);
        }
        System.out.println();
        System.out.println();
        for (double i : arr) {
            total += i;
        }
        System.out.printf("Total weight: %.1f\n",total);
        double average = total / count;
        System.out.print("Average weight: ");
        System.out.println(average);  

        max = arr[0];
        for (double i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.print("Max weight: ");
        System.out.println(max);
    }
}