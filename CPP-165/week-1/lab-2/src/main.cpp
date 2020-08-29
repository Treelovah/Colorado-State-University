#include <iostream>
#include "movie.h"
#include <fstream>

using namespace std;

int main(int argc, char const *argv[])
{
    int i{ 0 };

    Movie movie{ "moana", 30 };

    cout << movie.get_name() << endl;
    return 0;
}
