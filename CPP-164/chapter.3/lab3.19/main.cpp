// ## Instructions are imported from java 164 class.
// ## The syntax && logic flow might not follow exact instructions. 
/*
(1) Prompt the user to input an integer, a double, a character, and a string, storing each into separate variables. Then, output those four values on a single line separated by a space. (2 pts)

Note: This zyLab outputs a newline after each user-input prompt. For convenience in the examples below, the user's input value is shown on the next line, but such values don't actually appear as output when the program runs.

    Enter integer:
    
    99
    Enter double:
    3.77
    Enter character:
    z
    Enter string:
    Howdy
    99 3.77 z Howdy

(2) Extend to also output in reverse. (1 pt)

    Enter integer:
    99
    Enter double:
    3.77
    Enter character:
    z
    Enter string:
    Howdy
    99 3.77 z Howdy
    Howdy z 3.77 99


(3) Extend to cast the double to an integer, and output that integer. (2 pts)

    Enter integer:
    9
    Enter double:
    3.77
    Enter character:
    z
    Enter string:
    Howdy
    99 3.77 z Howdy
    Howdy z 3.77 99
    3.77 cast to an integer is 3

*/

#include <iostream>
#include <string>

class Basic_Input {
    public:
        void get_input() {
            int user_int;
            double user_double;
            char user_char;
            std::string user_string;
            std::cout << "Enter integer:\n";
            std::cin >> user_int;
            std::cout << "Enter double:\n";
            std::cin >> user_double;
            std::cout << "Enter char:\n";
            std::cin >> user_char;
            std::cout << "Enter string\n";
            std::cin >> user_string;
            get_output((int)user_int, (double)user_double, (char)user_char, user_string);
            std::cin.clear();
        }

        void get_output(int user_int, double user_double, char user_char, std::string user_string) {
            // output raw input
            std::cout << user_int << ' ' << user_double << ' ' << user_char << ' ' << user_string << '\n';
            // output reverse order
            std::cout << user_string << ' ' << user_char << ' ' << user_double << ' ' << user_int << '\n';
            //Cast the double to an int, and output that int.
            printf("%.2f cast to an integer is %d\n",user_double, (int)user_double);
        }

};

int main(int argc, char const *argv[])
{
    Basic_Input user {};
    user.get_input();
    return 0;
}
