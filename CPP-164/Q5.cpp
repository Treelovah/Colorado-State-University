#include <iostream>
#include <math.h>
#include "Q5.h" // location of all declared functions

int main(int argc, char const *argv[])
{
    int num{ 0 };
    std::cin >> num;

    switch (num)
    {
    case 1:
        call_fillArray();
        break;
    case 2:
        call_productMatrix();
        break;
    case 3:
        call_sumOfSquares();
        break;
    case 4:
        call_incPosArray();
        break;
    default:
        break;
    }
    return 0;
}

/*
* Method: fillArray
*
* Precondition: the method accepts a non-null String variable
*              as an argument
* Postcondition: Return a char array that has been filled from
*                      the string passed to the method, each element
*                      set to the corresponding character in the
*                      string.
*              (i.e. result[0]=the character at index 0 in the string)
*/

void fillArray(std::string var, char *arr)
{
    for (int i = 0; i < var.size(); i++) arr[i] = var[i];
}

/*
* Method: productMatrix
* precondition: 0 <= n <= 100
* postcondition: if n is less than 1, return null
* postcondition: if n is greater than zero, return a n x n matrix
*                      with each element of the matrix set to
*                      row index * column index.
*/

int** productMatrix(int *n)
{
    int **arr{ 0 };
    arr = new int *[*n];
    for (auto a = 0; a < *n; a++)
    {
        arr[a] = new int [*n];
        for (auto c = 0; c < *n; c++)
        {
            arr[a][c] = (a * c);
        }
    }
    return arr;
}

	/*
   * Method: sumOfSquares
   * precondition: the method accepts an array of ints
   * postcondition: if the array is null or of size zero, return 0
   * postcondition: if the size of the array is greater than 1,
   *                      return an int equal to the sum of the
   *                      square of each element of the array.
   */

long sumOfSquares(int *arr, int *arrSize)
    {
        int temp{ 0 };
        if (arrSize == 0) return 0;
        
        if (*arrSize > 1)
        {
            for (int i = 0; i < *arrSize; i++) temp += pow(arr[i], 2);
        }
        return temp;
    }

    	/*
         * Method: incPosArray
         * precondition: the method accepts an array of ints
         * postcondition: if the array is null or of size zero, simply return
         * postcondition: if the size of the array is greater than 1,
         *                      increment each positive element of the array,
 *                      leaving the negative elements and the elements
 *                      equal to zero set to their incoming values.
         */

void incPosArray(int *arr, int *arrSize)
{
    if (arr == nullptr || *arrSize == 0) return;
    if (*arrSize > 1) for (int i = 0; i < *arrSize; i++) if (arr[i] > 0) arr[i] = arr[i] + 1;
}

void call_fillArray()
{
    std::cin.ignore(32767, '\n');
    printf("Enter a string to conver to character array: ");
    std::string str;
    std::getline(std::cin, str);

    char arr[str.size()];
    fillArray(str, arr);

    for (char ch : arr) std::cout << ch << " ";
    std::cout << std::endl;

}

void call_productMatrix()
{   
    int n;
    printf("Enter matrix size: ");
    std::cin >> n;
    int **arr = productMatrix(&n); // this was fun as I had to learn about returning arrays and 2d arrays from a function. Not very practical, i think i would prefer to send a pointer to the 2darray as a paramter vs creating one in a function and then returning it.

    printf("Array contents from `productMatrix(%i)`: \n",n);
    for (auto a = 0; a < n; a++)
    {
        for (auto c = 0; c < n; c++)
        {
            std::cout << arr[a][c] << " ";
        }
        std::cout << std::endl;
    }
}

void call_sumOfSquares()
{
    int arrSize;
    printf("Enter array size for sum of squares: ");
    std::cin >> arrSize;
    int arr[arrSize];
    for (int i = 0; i < arrSize; i++) std::cin >> arr[i];
    std::cout << sumOfSquares(arr, &arrSize) << std::endl;
    
}

void call_incPosArray()
{
    int arrSize;
    printf("Enter array size for incrementing position array: ");
    std::cin >> arrSize;

    int arr[arrSize];
    for (int i = 0; i < arrSize; i++) 
    {
        printf("Enter number for index %i: ",i);
        std::cin >> arr[i];
        printf("\n");
    }

    incPosArray(arr, &arrSize);

    for (auto i : arr) std::cout << i << " ";
    std::cout << std::endl;
}