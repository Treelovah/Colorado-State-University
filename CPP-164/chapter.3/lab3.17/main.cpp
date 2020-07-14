// ## Instructions are imported from java 164 class.
// ## The syntax && logic flow might not follow exact instructions. 
/*
Given three floating-point numbers x, y, and z, output x to the power of z, x to the power of (y to the power of z), the absolute value of y, and the square root of (xy to the power of z).

Ex: If the input is:

    3.6 4.5 2.0

the output is: 

    12.96 1.841304610218211E11 4.5 16.2

*/
#include <iostream>
#include <math.h>

class LabProgram {
    public:
        void get_input() {
            double x;
            double y;
            double z;
            std::cin >> x;
            std::cin >> y;
            std::cin >> z;
            pow_calculations((double)x, (double)y, (double)z);
        }
        
        void pow_calculations(double x, double y, double z) {
            double a = std::pow(x, z);
            double b = std::pow(x, (std::pow(y, z)));
            double c = std::abs(y);
            double d = std::sqrt(std::pow((x*y), z));
            std::cout << a << ' ' << b << ' ' << c << ' ' << d << '\n';
        }
};

int main(int argc, char const *argv[])
{
    LabProgram user_input {};
    user_input.get_input();
    return 0;
}
