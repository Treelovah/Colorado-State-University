# Instructions are imported from java 164 class.
# The syntax && logic flow might not follow exact instructions. 

'''
/*


Given three floating-point numbers x, y, and z, output x to the power of z, x to the power of (y to the power of z), the absolute value of y, and the square root of (xy to the power of z).

Ex: If the input is:

    3.6 4.5 2.0

the output is: 

    12.96 1.841304610218211E11 4.5 16.2

*/
'''
import math
x = input()
y = input()
z = input()

a = pow(float(x), float(z))
b = pow(float(x), (math.pow(float(y), float(z))))
c = abs(float(y))
d = math.sqrt(pow((float(x)*float(y)), float(z)))
print(f"{a} {b} {c} {d}")
