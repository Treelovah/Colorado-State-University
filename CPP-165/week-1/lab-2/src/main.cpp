#include <iostream>
#include <fstream>
#include "movie_analysis.h"
using namespace std;

int main(int argc, char const *argv[])
{
    Movie_Analysis m;
    Movie* moana = m.search("Moana");
    (moana) ? cout << "Moana Found!\n" : cout << "Moana wasn't found" << '\n';
    cout << "Highest Rated Movie is: " << m.get_highest_rated_movie()->get_name() << " :: Rating is: " << m.get_highest_rated_movie()->get_average_rating() << '\n';
    cout << "Lowest Rated Movie is: " << m.get_lowest_rated_movie()->get_name() << " :: Rating is: " << m.get_lowest_rated_movie()->get_average_rating() << endl;
    return 0;
}

