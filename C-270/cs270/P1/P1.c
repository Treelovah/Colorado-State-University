// P1 Assignment
// Author: Marshall Livingston
// Date:   1/25/2021
// Class:  CS270
// Email:  mltechi@colostate.edu

// Include files
#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

// example of a global array
double input[4];
double output[4];


void computeCircle(double radius, double *output)
{
    *output = (3.141593 * radius * radius);
};

void computeTriangle(double side, double *output)
{
    *output = (0.433013 * side * side);
};
void computeSquare(double side, double *output)
{
    *output = (side * side);
};
void computePentagon(double side, double *output)
{
    *output = (1.720477 * side * side);
};


// this function can be used as a guide for the funtions you will implement
void computeSphere(double radius, double *addressOfVolume)
{
    // Compute volume
    double result = (4.0 / 3.0) * (3.141593 * radius * radius * radius);

    // Dereference pointer to return result
    *addressOfVolume = result;
}

int main(int argc, char *argv[])
{
    // Check number of arguments
    if (argc != 5)
    {
        printf("usage: ./P1 <double> <double> <double> <double> \n");
        return EXIT_FAILURE;
    }

    // Parse arguments
    double radius = atof(argv[1]);
    double sideTriangle = atof(argv[2]);
    double sideSquare = atof(argv[3]);
    double sidePentagon = atof(argv[4]);
    // Local variable
    double volume;

    // Call function
    computeSphere(radius, &volume);
    computeCircle(radius, &output[0]);
    computeTriangle(sideTriangle, &output[1]);
    computeSquare(sideSquare, &output[2]);
    computePentagon(sidePentagon, &output[3]);
    
    // Print volume
    // printf("The volume of a sphere with radius %.5f equals %.5f.\n", radius, volume);
    printf("CIRCLE, radius = %.5f, area = %.5f.\n",radius, output[0]);
    printf("TRIANGLE, length = %.5f, area = %.5f.\n",sideTriangle, output[1]);
    printf("SQUARE, length = %.5ff, area = %.5f.\n",sideSquare, output[2]);
    printf("PENTAGON, length = %.5ff, area = %.5f.\n",sidePentagon, output[3]);
    // Return success
    return EXIT_SUCCESS;
}

/*

Sample output
Your program should print four lines. 
The sample output below shows how to compile, 
and run the P1 program on Linux using the gcc compiler. 
See the grading criteria below for additional information.

$ gcc -Wall P1.c -o P1

$ ./P1 1.0 2.0 3.0 4.0

CIRCLE, radius = 1.00000, area = 3.14159.
TRIANGLE, length = 2.00000, area = 1.73205.
SQUARE, length = 3.00000, area = 9.00000.
PENTAGON, length = 4.00000, area = 27.52763.



*/