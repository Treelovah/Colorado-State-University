/*
Write a program that reads an integer, a list of words, and a character. 

The integer signifies how many words are in the list. 

The output of the program is every word in the list that contains the character at least once. 

Assume at least one word in the list will contain the given character. 

Assume that the list of words will always contain fewer than 20 words.

Ex: If the input is:

4 hello zoo sleep drizzle z

then the output is:

zoo
drizzle

To achieve the above, first read the list into an array. 

Keep in mind that the character 'a' is not equal to the character 'A'.
*/

#include <iostream>
#include <string>

int main(int argc, char const *argv[]) {
    int array_size;
    std::cin >> array_size;
    std::string arr[array_size];

    for (int i = 0; i < array_size; i++) {
        std::cin >> arr[i];
    }
    char letter;
    std::cin >> letter;
    for (int i = 0; i < array_size; i++) {
        size_t found = arr[i].find(letter,0);
        if (found != std::string::npos) {
            printf("%s ",arr[i].c_str());
        }
    }
    printf("\n");
    return 0;
}

