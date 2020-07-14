// Instructions are imported from java 164 class.
// The syntax && logic flow might not follow exact instructions.
/*
Statistics are often calculated with varying amounts of input data. Write a program that takes any number of non-negative integers as input, and outputs the average and max. 

A negative integer ends the input and is not included in the statistics.

Ex: When the input is:

15 20 0 5 -1

the output is:

10 20

You can assume that at least one non-negative integer is input.
*/


#include <iostream>
#include <vector>

int user_input_average(std::vector<int> &arr);
int user_input_largest(std::vector<int> &arr);
void get_input();

int main(int argc, char const *argv[])
{
    get_input();
    return 0;
}

void get_input() {
    std::vector<int>arr;
    int i;
    while ((std::cin >> i) && (i > -1)) {
        arr.push_back(i);
    }
    printf("%d %d \n",user_input_average(arr),user_input_largest(arr));
}

int user_input_average(std::vector<int> &arr) {
    int total {0};
    for (int i : arr) {
        total += i;
    }
    return (total / arr.size());

}

int user_input_largest(std::vector<int> &arr) {
    int biggest_int = 0;
    for (int i : arr) {
        if (i > biggest_int) {
            biggest_int = i;
        }
    }
    return biggest_int;
}