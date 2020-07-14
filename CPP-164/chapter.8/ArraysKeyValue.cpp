/*
 Find the maximum value and minimum value in milesTracker. 
 
 Assign the maximum value to maxMiles, and the minimum value to minMiles. 
 
 Sample output for the given program:

Min miles: -10
Max miles: 40
*/

#include <iostream>

int main(int argc, char const *argv[])
{
    int max_miles {0};
    int min_miles {0};
    constexpr int numRows {2};
    constexpr int numCols {2};

    int milesTracker[numRows][numCols] 
    {
        { -10, 10 }, // assigning numRows
        { 30, 40 } // assigning numCols
    };

    for (int row {0}; row < numRows; ++row) {       // loop through row
        for (int col {0}; col < numCols; col++) {   // loop through col
            if (milesTracker[row][col] > max_miles) {        
                max_miles = milesTracker[row][col];          // set largest value found in array
            }
            if (milesTracker[row][col] < min_miles) {        // set smallest value foudn in array
                min_miles = milesTracker[row][col];
            }
        }
    }
    printf("Min miles: %d\n",min_miles);
    printf("Max miles: %d\n",max_miles);
    return 0;
}