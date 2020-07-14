/*
(1) Prompt the user to enter five numbers, being five people's weights. 

Store the numbers in an array of doubles. 

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
#include <iostream>

int main() {
    double total;
    int max = 0;
    double average;
    double arr[5];

    for (int i = 1; i <= 5; i++) {
        printf("Enter weight %d:\n",i);
        std::cin >> arr[i - 1];
    }
    printf("You entered: ");
    for (double i : arr) { // get everything needed from this loop
        total += i; // get total
        average = total / 5.0; // get average
        printf("%.1f ",i);
        // get max
        if (i > max) {
            max = i;
        }
    }
    printf("\n\n\n");
    printf("Total weight: %.1f\n",total);
    printf("Average weight: %.2f\n",average);
    printf("Max weight: %d\n",max);
    return 0;
}
