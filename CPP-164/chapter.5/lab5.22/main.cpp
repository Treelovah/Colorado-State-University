/*
Write a program whose inputs are three integers, and whose outputs are the largest of the three values and the smallest of the three values.

Ex: If the input is:

7 15 3

the output is:

largest: 15 
smallest: 3

Your program must define and call the following two methods. The method largestNumber() should return the largest number of the three input values. 

The method smallestNumber() should return the smallest number of the three input values.

public static int largestNumber(int num1, int num2, int num3)
public static int smallestNumber(int num1, int num2, int num3)
*/
#include <iostream>

int get_largest_number(int num1, int num2, int num3) {
    if (num1 > num2) {
        if (num1 > num3) {
            return num1;
        } else {
            return num3;
        }
    }
    if (num2 > num1) {
        if (num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }
    return errno;
}
int get_smallest_number(int num1, int num2, int num3) {
    if (num1 < num2) {
        if (num1 < num3) {
            return num1;
        } else {
            return num3;
        }
    }
    if (num2 < num1) {
        if (num2 < num3) {
            return num2;
        } else {
            return num3;
        }
    }
    return errno;
}

void get_ints() {
    int num1;
    int num2;
    int num3;
    
    // assign inputs
    std::cin >> num1;
    std::cin >> num2;
    std::cin >> num3;
    // clear input buffer
    std::cin.clear();
    int count = 1;

    // require integer from user, and only print once.
    while ((int)num1 && (int)num2 && (int)num3 && count == 1) { 
        printf("largest: %d\n",get_largest_number(num1, num2, num3));
        printf("smallest: %d\n",get_smallest_number(num1, num2, num3));
        count++;
    }

}

int main()
{
    get_ints();
    return 0;
}
