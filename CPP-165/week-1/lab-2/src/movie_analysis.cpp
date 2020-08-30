#include <fstream>
#include <iostream>
#include <utility>
#include <algorithm>
#include "movie_analysis.h"

Movie_Analysis::Movie_Analysis()
{
    vector<Movie> movies;
    Movie_Analysis::load_data();
}

void Movie_Analysis::load_data()
{   
    int i{ 0 };
    Movie movie;
    std::pair<string, string> data;
    std::string line;
    ifstream fin{ "../resources/IMDB-Movie-Data.csv" };

    while (getline(fin, line))
    { 
        // get movies from csv and store them in a 'movies' vector
        data.first = line.substr(0, line.find(","));
        data.second = line.substr(line.find(",")+1);;
        // catch stoi error
        try
        {
            movie.set_name(data.first);
            movie.set_length(std::stoi(data.second));
            movie.add_rating(rand()%6);
            movies.push_back(movie);
        }
        catch(const std::exception& e)
        {
            continue;
        }
    }
    for (Movie m : movies)
    {
        for (; i < 100; i++)
        {
            m.add_rating(rand() % 6);
        }
    }
}

Movie* Movie_Analysis::search(std::string title)
{
    int i{ 0 };
    try
    {
        for (; i < movies.size(); i++)
        {
            if (movies.at(i).get_name().compare(title.c_str()) == 0) 
            {
                return &movies.at(i);
            }
        }
    }
    catch(const std::exception& e)
    {
        std::cerr << e.what() << '\n';
    }
    return nullptr;
}

Movie* Movie_Analysis::get_highest_rated_movie()
{
    float max{ INT16_MIN };
    int i{ 0 }, pos{ 0 };
    for (; i < movies.size(); i++)
    {
        if (movies.at(i).get_average_rating() > max)
        {
            max = movies.at(i).get_average_rating();
            pos = i;
        }
    }
    return &movies.at(pos);
}

Movie* Movie_Analysis::get_lowest_rated_movie()
{
    float min{ INT16_MAX };
    int i{ 0 }, pos{ 0 };
    for (; i < movies.size(); i++)
    {
        if (movies.at(i).get_average_rating() < min)
        {
            min = movies.at(i).get_average_rating();
            pos = i;
        }
    }
    return &movies.at(pos);
}
