# Instructions are imported from java 164 class.
# The syntax && logic flow might not follow exact instructions. 
'''
/*
/  Driving is expensive. Write a program with a car's miles/gallon and gas dollars/gallon (both doubles) as input, and output the gas cost for 20 miles, 75 miles, and 500 miles.
/
/  Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
/  System.out.printf("%.2f", yourValue);
/
/  The output ends with a newline.
/
/  Ex: If the input is:
/   20.0 3.1599
/
/  The output is:
/   3.16 11.85 79.00
/
/  Note: Real per-mile cost would also include maintenance and depreciation. 
*/
'''
mpg = input()
gdpg = input()
answer = 0.0
pre_sets = [20.0, 75.0, 500.0]

for i in range(0, 3):
    answer = (float(gdpg) / float(mpg)) * pre_sets[i]
    if i < 2:
        print("%.2f" % answer, end=' ')
    else:
        print("%.2f" % answer)