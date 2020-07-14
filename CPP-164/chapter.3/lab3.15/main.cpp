// ## Instructions are imported from java 164 class.
// ## The syntax && logic flow might not follow exact instructions. 
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
#include <iostream>

class LabProgram {
    public:
        double mpg;
        double gdpg;
        double answer;
        double pre_sets[3] {20, 75, 500};

        void get_input() {
            std::cin >> mpg;
            std::cin >> gdpg;
            calculate(mpg, gdpg);
        }
        // calculate and print
        void calculate(double mpg, double gdpg) {
            for (int i = 0; i < 3; i++) {
                answer = (gdpg / mpg) * pre_sets[i];
                if (i < 2) {
                    printf("%.2f ",answer);
                } else {
                    printf("%.2f\n",answer);
                }
            }
        }
};

int main(int argc, char const *argv[])
{
    LabProgram user_1 {};
    user_1.get_input();
    return 0;
}
