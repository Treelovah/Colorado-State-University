# Instructions are imported from java 164 class.
# The syntax && logic flow might not follow exact instructions. 
'''
/*
======PART 1=======

Given 4 integers, output their product and their average, using integer arithmetic.

Ex: If the input is:

    8 10 5 4

the output is:

    1600 6

Note: Integer division discards the fraction. Hence the average of 8 10 5 4 is output as 6, not 6.75.

Note: The test cases include four very large input values whose product results in overflow. You do not need to do anything special, but just observe that the output does not represent the correct product (in fact, four positive numbers yield a negative output; wow).

Submit the above for grading. Your program will fail the last test cases (which is expected), until you complete part 2 below. 

======PART 2=======

Also output the product and average, using floating-point arithmetic.

Output each floating-point value with three digits after the decimal point, which can be achieved as follows:
System.out.printf("%.3f", yourValue);

Ex: If the input is 8 10 5 4, the output is:

    1600 6
    1600.000 6.750

Note that fractions aren't discarded, and that overflow does not occur for the test case with large values. 
*/
'''
class Lab_Program:
    
    def __init__(self, num1, num2, num3, num4):
        self.num1 = float(num1)
        self.num2 = float(num2)
        self.num3 = float(num3)
        self.num4 = float(num4)

    def math_stuff(self):
        total = (self.num1 * self.num2 * self.num3 * self.num4)
        amount_of_allowed_args = 4 
        average = (self.num1 + self.num2 + self.num3 + self.num4) / float(amount_of_allowed_args)
        print(f"{int(total)} {int(average)}")
        print("%.3f %.3f" % (total, average))

Lab_Program(input(), input(), input(), input()).math_stuff()
