# Instructions are imported from java 164 class
# The syntax && logic flow might not follow exact instructions.
'''
/*


One lap around a standard high-school running track is exactly 0.25 miles. Write a program that takes a number of miles as input, and outputs the number of laps.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

Ex: If the input is:

1.5

the output is:

6.00

Ex: If the input is:

2.2

the output is:

8.80

Your program must define and call a method:
public static double milesToLaps(double userMiles)
*/
'''

def milesToLaps(userMiles):
    return float(userMiles) / .25

def main():
    print("{:0.2f}".format(milesToLaps(input())))

main()