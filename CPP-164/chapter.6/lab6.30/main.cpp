// Instructions are imported from java 164 class.
// The syntax && logic flow might not follow exact instructions.
/*
Write a program that takes in a line of text as input, and outputs that line of text in reverse. The program repeats, ending when the user enters "Quit", "quit", or "q" for the line of text.

Ex: If the input is:

Hello there
Hey
quit

the output is:

ereht olleH
yeH

*/
//The instructions suck ass..

#include <iostream>
#include <string>

void reverse_string(std::string& str) {
    int n = str.length();

    // swap char starting from two corners ^_^;
    for (int i = 0; i < n / 2; ++i) {
        std::swap(str[i], str[n - i - 1]);
    }
}

int main(int argc, char const *argv[])
{
    /* code */
    std::string arr;
    std::getline(std::cin, arr);
    reverse_string(arr);
    std::cout << arr << std::endl;
    return 0;
}
