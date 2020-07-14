#include <cstdio>

using namespace std;

void printFactorial(int factCounter, int factValue)
{
    int nextCounter, nextValue;

    if (factCounter == 0) // Base case: 0! = 1;
    {
        printf("1\n");
    }
    else if (factCounter == 1) // Base case: Print 1 and result;
    {
        printf("%i = %i\n",factCounter,factValue);
    }
    else // Recursive case
    {
        printf("%i * ",factCounter);
        nextCounter = factCounter - 1;
        nextValue = nextCounter * factValue;

        printFactorial(nextCounter, nextValue);
    }
}

int main(int argc, char const *argv[])
{
    int userVal;
    scanf("%i",&userVal);
    printf("%i! = ",userVal);
    printFactorial(userVal, userVal);
    return 0;
}

