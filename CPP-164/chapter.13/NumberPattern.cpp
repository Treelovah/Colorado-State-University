/*
Write a recursive method called printNumPattern() to output the following number pattern.

Given a positive integer as input (Ex: 12), subtract another positive integer (Ex: 3) continually until 0 or a negative value is reached, 
and then continually add the second integer until the first integer is again reached.

Ex. If the input is:

12
3

the output is:

12 9 6 3 0 3 6 9 12 

*/

#include <cstdio>

void printNumPattern(int num1, int num2)
{
    if (num1 <= 0)
    {
        printf("%i ",num1);
    }
    else
    {
        printf("%i ",num1);
        printNumPattern((num1 - num2), num2);
        printf("%i ",num1);
    }
}

int main()
{
    int num1, num2;
    scanf("%i",&num1);
    scanf("%i",&num2);
    printNumPattern(num1, num2);
    return 0;
}
