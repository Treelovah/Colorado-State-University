// Instructions are imported from java 164 class.
// The syntax && logic flow might not follow exact instructions.
/*
Mad Libs are activities that have a person provide various words, which are then used to complete a short story in unexpected (and hopefully funny) ways.

Write a program that takes a string and integer as input, and outputs a sentence using those items as below. The program repeats until the input string is quit 0.

Ex: If the input is:

apples 5
shoes 2
quit 0

the output is:

Eating 5 apples a day keeps the doctor away.
Eating 2 shoes a day keeps the doctor away.
*/

// write a function that gets user input as char array.
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
// its all in c, just cuz ¯\_(ツ)_/¯
int main() {
    char arr[10];
    int num;
    char *s;
    scanf("%s", arr);
    scanf("%d", &num);
    s = strstr(arr, "quit");
    if (s != NULL) {
    } else {
        printf("Eating %d %s a day keeps the doctor away.\n",num,arr);
    }
}
