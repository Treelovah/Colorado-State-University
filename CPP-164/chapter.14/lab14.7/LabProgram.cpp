/*
Write a void method selectionSortDescendTrace() that takes an integer array, and sorts the array into descending order. 
The method should use nested loops and output the array after each iteration of the outer loop, thus outputting the array N-1 times (where N is the size). 
Complete main() to read in a list of up to 10 positive integers (ending in -1) and then call the selectionSortDescendTrace() method.

If the input is:

20 10 30 40 -1

then the output is:

40 10 30 20 
40 30 10 20 
40 30 20 10 

*/
    // TODO: Write a void method selectionSortDescendTrace() that takes 
    //       an integer array and the number of elements in the array as arguments, 
    //       and sorts the array into descending order.


#include <iostream>
#include <vector>

using namespace std;

void selectionSortDescendTrace(vector<int> arr, int arrSize);

int main(int argc, char const *argv[])
{
    bool check{ true };
    vector<int> arr;

    while (check)
    {
        int temp{ 0 };
        cin >> temp;
        if (temp == -1) 
        {
            check = false;
            break;
        } else arr.push_back(temp);
    }
    selectionSortDescendTrace(arr, arr.size());   
    return 0;
}

void selectionSortDescendTrace(vector<int> arr, int arrSize)
{
    int max;
    for (int i = 0; i < arrSize - 1; i++)
    {
        max = i;
        for (int j = i + 1; j < arrSize; j++) if (arr[max] < arr[j]) max = j;
        swap(arr[max], arr[i]);
        for (int c = 0; c < arrSize; c++) printf("%d ",arr[c]);
        printf("\n");       
    }
}