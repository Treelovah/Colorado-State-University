#include <fstream>
#include <iostream>
#include <utility>
#include "movie_analysis.h"

Movie_Analysis::Movie_Analysis()
{
    vector<Movie*> movies;
    Movie_Analysis::load_data();
}

void Movie_Analysis::load_data()
{   
    std::pair<string, string> data;
    std::string line;
    ifstream fin{ "../resources/IMDB-Movie-Data.csv" };

    

    while (getline(fin, line))
    {
        // currently building
        data.first = line.substr(0, line.find(","));
        data.second = line.substr(line.find(",")+1);
        std::cout << "First part: " << data.first << '\n';
        std::cout << "Second part: " << data.second << std::endl;
    }
    
}

Movie_Analysis::Movie* search(std::string title)
{
    return nullptr;
}

Movie* Movie_Analysis::get_highest_rated_movie()
{
    return nullptr;
}

Movie* Movie_Analysis::get_lowest_rated_movie()
{
    return nullptr;
}

int main(int argc, char const *argv[])
{
    Movie moana;
    std::cout << moana.get_name() << " " << moana.get_length() << std::endl;
    Movie_Analysis m;
    return 0;
}
