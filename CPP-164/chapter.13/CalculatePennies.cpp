/*
Write code to complete doublePennies()'s base case. Sample output for below program with inputs 1 and 10:

    Number of pennies after 10 days: 1024

Note: If the submitted code has an infinite loop, the system will stop running the code after a few seconds, and report "Program end never reached." 

The system doesn't print the test case that caused the reported message.
*/

#include <cstdio>

// Returns number of pennies if pennies are doubled numDays times;
long doublePennies(long numPennies, int numDays)
{
    long totalPennies;

    if (numDays == 0)
    {
        totalPennies = numPennies;
    }
    else
    {
        totalPennies = doublePennies((numPennies * 2), numDays - 1);
    }
    return totalPennies;
}

// Program computes pennies if you have 1 penny today,
// 2 pennies after one day, 4 after two days, and so on

int main()
{
    long startingPennies, userDays;

    scanf("%d", &startingPennies);
    scanf("%d", &userDays);
    printf("Number of pennies after %d days %d\n",userDays, doublePennies(startingPennies, userDays));
    return 0;
}
