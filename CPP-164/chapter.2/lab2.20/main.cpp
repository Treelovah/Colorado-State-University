// ## Instructions are imported from java 164 class.
// ## The syntax && logic flow might not follow exact instructions. 
/*
Write a program that takes a first name as the input, and outputs a welcome message to that name.

Ex: If the input is:

    Pat

the output is: 

    Hello Pat, and welcome to CS Online!

*/
#include <iostream>

int main() {
    std::string user_name;
    std::getline(std::cin, user_name);
    std::cin.clear();
    printf("Hello %s, and welcome to CS Online!\n", user_name.c_str());
    return 0;
}