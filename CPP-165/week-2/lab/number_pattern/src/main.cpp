#include <iostream>
#include "../headers/number_pattern.h"

using namespace std;

int main()
{
    int total, pattern;

    cin >> total;
    cin >> pattern;

    print_num_pattern(total, pattern);
}