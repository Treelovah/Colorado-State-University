# Instructions are imported from java 164 class
# The syntax && logic flow might not follow exact instructions.
'''
/*
Write a method drivingCost() with input parameters drivenMiles, milesPerGallon, and dollarsPerGallon, that returns the dollar cost to drive those miles. All items are of type double. 

If the method is called with 50 20.0 3.1599, the method returns 7.89975.

Define that method in a program whose inputs are the car's miles/gallon and the gas dollars/gallon (both doubles). 

Output the gas cost for 10 miles, 50 miles, and 400 miles, by calling your drivingCost() method three times.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

The output ends with a newline.

Ex: If the input is:

20.0 3.1599

the output is:

1.58 7.90 63.20

Your program must define and call a method:
public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon)

Note: This is a lab from a previous chapter that now requires the use of a method.
*/
'''

def drivingCost(drivenMiles, milesPergallon, dollarsPerGallon):
    print((drivenMiles / milesPergallon) * dollarsPerGallon)

def drivingCost2(milesPerGallon, dollarsPerGallon):
    pre_sets = [10, 50, 400]
    i = 0
    while i < 3:
        final_cost = (dollarsPerGallon / milesPerGallon) * pre_sets[i]
        print("{0:.2f} ".format(float(final_cost)), end=' ')
        i += 1
        if i > 3:
            print("{0:.2f}".format(float(final_cost)))
drivingCost2(float(input()), float(input()))