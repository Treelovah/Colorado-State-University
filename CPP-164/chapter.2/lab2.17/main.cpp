// ## Instructions are imported from java 164 class.
// ## The syntax && logic flow might not follow exact instructions. 
/*
Given two input integers for an arrowhead and arrow body, print a right-facing arrow.

Ex: If the input is:

    0 1

the output is: 

    1
     11
00000111
000001111
00000111
     11
     1

*/

#include <iostream>
// get char for design
int get_input() {
    void design(char base_char, char head_char);
    unsigned short base_char;
    unsigned short head_char;
    std::cin >> base_char;
    std::cin >> head_char;
    design(base_char, head_char);
    return 0;
}
// create design
void design(char base_char, char head_char) {
    printf("     %d\n",head_char);
    printf("     %d%d\n", head_char, head_char);
    printf("%d%d%d%d%d%d%d%d%d\n", base_char, base_char, base_char, base_char, base_char, head_char, head_char, head_char, head_char);
    printf("%d%d%d%d%d%d%d%d%d%d\n", base_char, base_char, base_char, base_char, base_char, head_char, head_char, head_char, head_char, head_char);
    printf("%d%d%d%d%d%d%d%d%d\n", base_char, base_char, base_char, base_char, base_char, head_char, head_char, head_char, head_char);
    printf("     %d%d\n", head_char, head_char);
    printf("     %d\n",head_char);    
}
// execute order 66
int main(int argc, char const *argv[])
{
    get_input();
    return 0;
}
