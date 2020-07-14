# Instructions are imported from java 164 class.
# The syntax && logic flow might not follow exact instructions. 
'''
/* A half-life is the amount of time it takes for a substance or entity to fall to half its original value. 
/  Caffeine has a half-life of about 6 hours in humans. 
/  Given caffeine amount (in mg) as input, output the caffeine level after 6, 12, and 24 hours.
/  Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
/  System.out.printf("After 6 hours: %.2f mg\n", yourValue);
/  Ex: If the input is:
/   100
/
/  The output is:
/   After 6 hours: 50.00 mg
/   After 12 hours: 25.00 mg
/   After 24 hours: 6.25 mg
/
/  Note: A cup of coffee has about 100 mg. 
/  A soda has about 40 mg. An "energy" drink (a misnomer) has between 100 mg and 200 mg.
*/
'''
caffeine_mg= input()
day = 6

for i in range(0,3):
    if day == 24:
        caffeine_mg = float(caffeine_mg) / 4.0
        print("After %d hours: %.2f mg" % (day, caffeine_mg))
    else:
        caffeine_mg = float(caffeine_mg) / 2.0
        print("After %d hours: %.2f mg" % (day, caffeine_mg))
        day = (day * 2)