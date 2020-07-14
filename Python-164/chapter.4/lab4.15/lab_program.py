# Instructions are imported from java 164 class
# The syntax && logic flow might not follow exact instructions.
'''
/*
A “jiffy” is the scientific name for 1/100th of a second. Given an input number of seconds, output the number of "jiffies."

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

Ex: If the input is:

15

the output is:

1500.00

Your program must define and call a method:
public static double secondsToJiffies(double userSeconds)
*/
'''
def secondsToJiffies(userSeconds):
    userSeconds = userSeconds * 100
    print("{:0.2f}".format(userSeconds))

try:
    secondsToJiffies(float(input()))
except ValueError:
    print("\n\n***Check Syntax***\nProgram will only takes numbers.")

