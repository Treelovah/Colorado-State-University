#include <cstdio>
#include <iostream>


bool palindromeChecker(std::string str);
int totalWord(std::string str);
std::string stringClean(std::string str);
std::string reverseString(std::string str);
std::string permutationHelper(std::string str);
std::string permutation(std::string str);

int main(int argc, char const *argv[])
{

std::string str; // declare 'str' for multiple tests
// BEGIN palindromeChecker()
    
    std::getline(std::cin, str); // get input from user, store in str
    if (palindromeChecker(str)) printf("true\n"); // if the string passed to palindromeChecker is true, print true
    else printf("false\n"); // else print false

// END palindromeChecker()



// BEGIN stringClean()
    printf("%s\n",stringClean("yyzzzaaa").c_str());
// END stringClean()



// BEGIN reverseString()
    printf("%s\n", reverseString(str).c_str());
// END reverseString()



// BEGIN totalWord()
    printf("%i\n",totalWord(str));
// END totalWord()



// BEGIN permutationHelper()
    std::cout << permutation("123") << std::endl;

    return 0;
}




/* palindromeChecker()
*
* Given a string, check if it is a palindrome recursively. 
* Return true if the given word is a palindrome, and false if it is not.
* For example, "abcba" would yield true, but "abc" would not. 
* A word is a palindrome if the letters in the word are symmetric.
*
*/
bool palindromeChecker(std::string str)
{
    if (str.length() <= 1) return true; // if string is less than or equal to 1, return true (nothing to compare, string is only 1 or less characters)
    if (str[0] == str[str.length() -1]) return palindromeChecker(str.substr(1, str.length() - 2)); // if index 0 equals last item in string, return string starting at 2nd index thru the very last char in string, repeat
    else return false; // else return false;
}

/* stringClean()

* Given a string, return recursively a "cleaned" string
* where adjacent chars that are the same have been reduced
* to a single char. So "yyzzza" yields "yza".
* 
*/
std::string stringClean(std::string str)
{
    if (str.length() <= 1) return str; // if string only has 1 char, or is empty, return that char, or blank string.
    if (str[0] == str[1]) return stringClean(str.substr(1)); // return 2nd index to end of string
    else return str[0] + stringClean(str.substr(1)); // return first index + 2nd index to end of string
}

/* reverseString()
* Given a string, recursively reverse the letters to yield a new string. 
* For example, if given "abcde", the method would yield "edcba".
*/

std::string reverseString(std::string str)
{
    if (str.length() <= 1) return str; // if string is empty, return string
    else return reverseString(str.substr(1)) + str[0]; // returns 2nd index to end of string, and appends 1st index to end of string.
}


/* totalWord()
* Given a string, recursively find the sum of the integer values of the characters in the word.
* Since characters have corresponding integer values from the ASCII table, you are able to sum them into a single integer.
* For example, if given "abc", the method would return 294.
*/
int totalWord(std::string str)
{
    if (str.length() == 0) return 0; // simply returns 0 if string length is 0
    return totalWord(str.substr(1)) + (int)str[0]; // returns 2nd index to end of string + the last char in string (as an int)
}

/*
* The following method is given to you, and you will be responsible for completing the permutationHelper method it calls.
* Sometimes, helper methods are used for recursive methods when another parameter is needed to recursively call a method repeatedly, 
* but passing that parameter initially doesn't make sense.
*/

