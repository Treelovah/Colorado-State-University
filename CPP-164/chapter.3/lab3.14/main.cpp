// ## Instructions are imported from java 164 class.
// ## The syntax && logic flow might not follow exact instructions. 
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

#include <iostream>

class LabProgram {
    public:
        double caffeine_mg;

        void calculate() {
            int day {6};
            for (int i = 0; i < 3; i++) {
                if (day == 24) {
                    caffeine_mg = (caffeine_mg / 4.0);
                    printf("After %d hours: %.2f mg\n",day, caffeine_mg);
                } else {
                    caffeine_mg = (caffeine_mg / 2.0);
                    printf("After %d hours: %.2f mg\n",day, caffeine_mg);
                    day = day * 2;
                }
            }
        }
};

int main(int argc, char const *argv[])
{
    LabProgram user_num { 100.0 };
    user_num.calculate();
    return 0;
}
