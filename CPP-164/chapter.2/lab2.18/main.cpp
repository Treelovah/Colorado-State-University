// ## Instructions are imported from java 164 class.
// ## The syntax && logic flow might not follow exact instructions. 
/*
Given a long integer representing a 10-digit phone number, output the area code, prefix, and line number using the format (800) 555-1212.

Ex: If the input is:

    8005551212

the output is:

    (800) 555-1212

Hint: Use % to get the desired rightmost digits. Ex: The rightmost 2 digits of 572 is gotten by 572 % 100, which is 72.

Hint: Use / to shift right by the desired amount. Ex: Shifting 572 right by 2 digits is done by 572 / 100, which yields 5. (Recall integer division discards the fraction).

For simplicity, assume any part starts with a non-zero digit. So 0119998888 is not allowed. 
*/
#include <iostream>

int main()
{
    std::string phone_number;
    std::cin >> phone_number;
    int area_code = stoi(phone_number.substr(0, 3));
    int prefix = stoi(phone_number.substr(3, 3));
    int line_number = stoi(phone_number.substr(6, 4));
    std::cin.clear();
    printf("(%d) %d-%d\n", area_code, prefix, line_number);
}