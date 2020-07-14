/*
(1) If a user's input string matches a known text message abbreviation, output the unabbreviated form, else output: Unknown. 

Support two abbreviations: LOL -- laughing out loud, and IDK -- I don't know. (4 pts)

Sample input/output:

Input an abbreviation:
LOL
laughing out loud


(2) Expand to also decode these abbreviations. (3 pts)

    BFF -- best friends forever
    IMHO -- in my humble opinion
    TMI -- too much information
*/
#include <iostream>
#include <string>
int main(int argc, char const *argv[])
{
    std::string user_text;
    std::getline(std::cin, user_text); 
    std::cin.clear();
    
    std::string str1 = "BFF";
    if (user_text.find("BFF") != std::string::npos) {
        std::cout << "best friend forever\n";
    }
    if (user_text.find("LOL") != std::string::npos) {
        std::cout << "laughing out loud\n";
    }
    if (user_text.find("TMI") != std::string::npos) {
        std::cout << "too much information\n";
    }
}
