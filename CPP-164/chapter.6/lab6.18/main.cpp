// Instructions are imported from java 164 class.
// The syntax && logic flow might not follow exact instructions.
/*
An acronym is a word formed from the initial letters of words in a set phrase. Write a program whose input is a phrase and whose output is an acronym of the input. 

If a word begins with a lower case letter, don't include that letter in the acronym. Assume there will be at least one upper case letter in the input.

Ex: If the input is:

Institute of Electrical and Electronics Engineers

the output should be:

IEEE

Your program must define and call a method thats returns the acronym created for the given userPhrase.
public static String createAcronym(String userPhrase)

Hint: Refer to the ascii table to make sure a letter is upper case.
*/

// #include <bits/stdc++.h>
#include <string.h>
#include <stdio.h>
#include <iostream>

int main() {
    std::string string;
    std::getline(std::cin, string);
    char arr[string.length() + 1]; // to close array with null byte
    strcpy(arr, string.c_str());
    for (int i = 0; i < string.length() + 1; i++) {
        if (std::isupper(arr[i])) {
            printf("%c",arr[i]);
        }
    }
    printf("\n");
}