'''
/*
Write a method maxMagnitude() with two integer input parameters that returns the largest magnitude value. 

Use the method in a program that takes two integer inputs, and outputs the largest magnitude value.

Ex: If the inputs are:

5 7

the method returns:

7

Ex: If the inputs are:

-8 -2

the method returns:

-8

Note: The method does not just return the largest value, which for -8 -2 would be -2. 

Though not necessary, you may use the absolute-value built-in math method.

Your program must define and call a method:
public static int maxMagnitude(int userVal1, int userVal2)
*/
'''

num1 = input()
num2 = input()

# easy way to run program if input is digit.
while (int(num1) and int(num2)):
    if abs(num1 > num2):
        print(num1)
        break
    else:
        print(num2)
        break
# gg