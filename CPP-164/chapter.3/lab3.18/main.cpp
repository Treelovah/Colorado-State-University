// ## Instructions are imported from java 164 class.
// ## The syntax && logic flow might not follow exact instructions. 
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
#include <iostream>
#include <math.h>

class Piano {
    public:
        void get_input() {
            double fn;
            std::cin >> fn;
            calculate(fn);
        }

        void calculate(double fn) {
            double r;
            printf("%.2f ",fn);
            for (double i = 1; i < 5; i++) {
                r = (fn * std::pow(2.0, ((double)i/12.0)));
                if (i < 4) {
                    printf("%.2f ",r);
                } else {
                    printf("%.2f\n",r);
                }
            }
        }
};



int main(int argc, char const *argv[])
{
    Piano keys {};
    keys.get_input();
    return 0;
}
