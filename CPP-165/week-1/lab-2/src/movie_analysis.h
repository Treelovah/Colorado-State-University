#ifndef MOVIE_ANALYSIS_H
#define MOVIE_ANALYSIS_H
#include <string>
#include <vector>
#include "movie.h"

using namespace std;

class Movie_Analysis : public Movie
{
protected:
    vector<Movie> movies;
public:
    // default constructor
    Movie_Analysis();

    // load data in from csv and give 100 random ratings between 0 and 6 to each movie
    void load_data();

    // find title in movie list
    Movie* search(string title);

    // find highest rated movie
    Movie* get_highest_rated_movie();

    // find lowest rated movie
    Movie* get_lowest_rated_movie();
};

#endif