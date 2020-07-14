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

#include <iostream>
using namespace std;

class Weight { // felt like organizing.
    private:
        double weight;
    public:
        int array_size;
        double total {0};
        double average {0};
        int max {0};

        void get_weight(double *w_arr) {
            printf("Enter size of array:\n");
            
            for (int i = 0; i < 5; i++) {
                printf("Enter weight %d:\n",i+1);
                cin >> weight;
                w_arr[i] = weight;
            }
            printf("You entered: ");
            for (int i = 0; i < array_size; i++) {
                printf("%.2f ",w_arr[i]);
            }
            printf("\n\n");
        }

        void total_weight(double *w_arr) {
            for (int i = 0; i < array_size; i++) {
                total += w_arr[i];
            }
            printf("Total weight: %.2f\n",total);
        }

        double average_weight() {
            printf("Average weight: %.2f\n", (total / 5));
            return total / 5;

        }

        void max_weight(double *w_arr) {
            for (int i = 0; i < array_size; i++) {
                if (w_arr[i] > max) {
                    max = w_arr[i];
                }
            }
            printf("Max weight: %d\n",max);
        }
};


int main() {
    Weight player;
    printf("Enter array size:\n");
    cin >> player.array_size;
    double w_arr[player.array_size];

    player.get_weight(w_arr);
    player.total_weight(w_arr);
    player.average_weight();
    player.max_weight(w_arr);
    
    return 0;
}
