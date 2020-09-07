#include <iostream>
#include <algorithm>
#include <vector>
#include "../headers/photo_lineup.h"

using namespace std;

int main()
{
    vector<string> list_of_names{ "Julia", "Lucas", "Mia" };
    permute(list_of_names);
}

