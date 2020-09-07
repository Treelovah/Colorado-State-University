#include <iostream>

void print_num_pattern(int n1, int n2)
{
    if (n1 <= 1) std::cout << n1 << " ";
    else
    {
        std::cout << n1 << " ";
        print_num_pattern(n1 - n2, n2);
        std::cout << n1 << " ";
    }
    
}