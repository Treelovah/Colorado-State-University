/*
Sort an Array by using SelectionSort method
*/
#include <iostream>

using namespace std;

void sortArray(int *arr, int *arrSize);

int main(int argc, char const *argv[])
{
    int arrSize;
    cin >> arrSize;
    int arr[arrSize];
    for (int i = 0; i < arrSize; i++) cin >> arr[i];

    sortArray(arr, &arrSize);
    for (int i : arr) printf("%d ",i);
    printf("\n");
    return 0;
}

void sortArray(int *arr, int *arrSize)
{
    int i, min;
    for (i = 0; i < *arrSize; i++)
    {
        min = i;
        for (int j = i + 1; j < *arrSize; j++)
        {
            if (arr[min] > arr[j])
            {
                std::swap(arr[min], arr[j]);
            }
        }
    }
}