/**
     * selectionSort
     * 
     * This method performs a selection sort on an array recursively.
     * 
     * @param int[] values The array, full of integer values to sort
     * @param int   start The start index to begin sorting. Nothing before this
     *              index should be changed!
     * @param int   depth This variable is decremented on the first line of the
     *              method. If it is 0, return from the method immediately.
     * 
     *              Precondition: values is a valid int array with length >= 1.
     *              Precondition: 0 <= start < values.length Postcondition: The
     *              given array, from the position of start variable, is sorted in
     *              place from smallest to largest. Exception: if Depth causes a
     *              return, then fewer values are sorted, as appropriate.
     * 
     *              Note: The method should recursively call itself to sort the rest
     *              of the values. You will need a loop, though, to select the next
     *              smallest value.
     */

#include <iostream>
#include <cstdio>
void selectionSort(int *arr, int start, int depth, int arrSize);

int main(int argc, char const *argv[])
{
     int arrSize;
     std::cin >> arrSize;

     int arr[arrSize];
     for (int i = 0; i < arrSize; i++) std::cin >> arr[i];

     selectionSort(arr, 0, 10, arrSize);
     for (int i : arr) printf("%i ", i);
     return 0;
}

void selectionSort(int *arr, int start, int depth, int arrSize)
{
     depth--;

     if (depth == 0) return;

     if (start < 0 || start >= arrSize) return;
     int min{  2147483647 };
     int mindex{ 0 };

     for (int i = start; i < arrSize; i++)
     {
          if (arr[i] < min)
          {
               min = arr[i];
               mindex = i;
          }
     }
     std::swap(arr[start], arr[mindex]);
     selectionSort(arr, start+1, depth, arrSize);
}