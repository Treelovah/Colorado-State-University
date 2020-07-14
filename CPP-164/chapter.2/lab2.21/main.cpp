// ## Instructions are imported from java 164 class.
// ## The syntax && logic flow might not follow exact instructions. 
/*
Mad Libs are activities that have a person provide various words, which are then used to complete a short story in unexpected (and hopefully funny) ways.

Complete the program to read the needed values from input, that the existing output statement(s) can use to output a short story.

Ex: If the input is:

    Eric Chipotle 12 cars

the output is: 

    Eric went to Chipotle to buy 12 different types of cars.

*/
#include <iostream>

int main(int argc, char const *argv[])
{
    std::string name1;
    std::string name2;
    int num;
    std::string name3;
    std::cin >> name1;
    std::cin >> name2;
    std::cin >> num;
    std::cin >> name3;
    printf("%s went to %s to buy %d different types of %s", name1.c_str(), name2.c_str(), num, name3.c_str());
    return 0;
}
