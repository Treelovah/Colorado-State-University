# Instructions are imported from java 164 class.
# The syntax && logic flow might not follow exact instructions. 
'''
/*
On a piano, a key has a frequency, say f0. Each higher key (black or white) has a frequency of f0 * r^n, where n is the distance (number of keys) from that key, and r is 2^(1/12). 

Given an initial key frequency, output that frequency and the next 4 higher key frequencies.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

Ex: If the input is:

    440.0

(which is the A key near the middle of a piano keyboard), the output is: 

    440.00 466.16 493.88 523.25 554.37

Note: Use one statement to compute r = 2^(1.0/12.0) using the pow function. 

Then use that r in subsequent statements that use the formula fn = f0 * rn with n being 1, 2, 3, and finally 4.
*/
'''
import math
r = 0.0
fn = input()
print("%.2f " % float(fn), end=' ')

for i in range(1,5):
    r = float(fn) * math.pow(2.0, float(i)/12.0)
    print("%.2f " % r, end=' ') if float(i) > 0.0 and float(i) < 4.0 else print("%.2f" % r)

