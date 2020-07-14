// ## Instructions are imported from java 164 class.
// ## The syntax && logic flow might not follow exact instructions. 
/* Write a program using integers userNum and x as input, and output userNum divided by x three times.
Ex: If the input is:
    2000 2
the output is:
    1000 500 250
no extra whitespace, the end must be a newline. go
*/
#include <iostream>

class LabProgram {
    public:
        int user_num;
        int x;

        void get_input() {
            std::cin >> user_num;
            std::cin >> x;
            print((int)user_num, (int)x);
        }

        void print(int user_num, int x) {
            for (int i = 0; i < 3; i++) {
                std::cout << user_num / x << ' ';
                user_num = user_num / x;
            }
        }
};
int main() { 
    LabProgram calculations {};
    calculations.get_input();
    return 0;
}
