# Instructions are imported from java 164 class
# The syntax && logic flow might not follow exact instructions.
'''
/*
A pedometer treats walking 2,000 steps as walking 1 mile. Write a program whose input is the number of steps, and whose output is the miles walked.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

Ex: If the input is:

5345

the output is:

2.67

Your program must define and call a method:
public static double stepsToMiles(int userSteps)
*/
'''

def stepsToMiles(userSteps):
    # print converted steps to miles
    print("{:.2f}".format(float(userSteps) / 2000))

stepsToMiles(input())