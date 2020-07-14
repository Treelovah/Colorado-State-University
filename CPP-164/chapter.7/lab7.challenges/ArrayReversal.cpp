// Write a method swapArrayEnds() that swaps the first and last elements of its array parameter. 

// Ex: sortArray = {10, 20, 30, 40} becomes {40, 20, 30, 10}. 

#include <iostream>

void swapArrayEnds(int arr[]) {
    arr[1] += 1;
}

int main(int argc, char const *argv[])
{
    int arr[5] = {0};
    swapArrayEnds(arr);
    return 0;
}
