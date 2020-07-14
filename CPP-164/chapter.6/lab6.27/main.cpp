// Instructions are imported from java 164 class.
// The syntax && logic flow might not follow exact instructions.
/*
Write a program whose input is a character and a string, and whose output indicates the number of times the character appears in the string.

Ex: If the input is:

n Monday

the output is:

1

Ex: If the input is:

z Today is Monday

the output is:

0

Ex: If the input is:

n It's a sunny day

the output is:

2

Case matters. n is different than N.

Ex: If the input is:

n Nobody

the output is:

0

Your program must define and call the following method that returns the number of times the input character appears in the input string.
public static int countCharacters(char userChar, String userString)

Note: This is a lab from a previous chapter that now requires the use of a method.
*/

/* 
IDK why, but i'm writing all of these in strict C code, instead of cpp. having fun tho 
*/

/* ¯\_(ツ)_/¯ */
#include <stdio.h>
#include <string.h>

int count_characters(char user_char, char* user_string) {
    int count = 0;
    for (int i = 0; user_string[i] != '\0'; ++i) {
        if (user_char == user_string[i]) {
            ++count;
        }
    }
    return count;
}

void get_input() {
    char arr[200];
    char c;
    printf("Enter a string: ");
    fgets(arr, sizeof(arr), stdin);
    printf("Enter a char: ");
    scanf("%c", &c);
    printf("%d\n",count_characters(c,arr));
}

int main(int argc, char const *argv[])
{
    get_input();   
    return 0;
}
