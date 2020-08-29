#ifndef MOVIE_ANALYSIS_H
#define MOVIE_ANALYSIS_H
#include <string>
#include "movie.h"

using namespace std;

class Movie_Analysis : public Movie
{
private:
    /* data */
public:
    // default constructor
    Movie_Analysis();
    
    void load_data();

    // find title in movie list
    Movie* search(string title);

    // find highest rated movie
    Movie* get_highest_rated_movie();

    // find lowest rated movie
    Movie* get_lowest_rated_movie();
};

#endif