#ifndef MOVIE_ANALYSIS_H
#define MOVIE_ANALYSIS_H
#include <string>
#include <iostream>
#include <fstream>
#include <utility>
#include "movie.h"

using namespace std;

class Movie_Analysis
{
private:
    vector<Movie> movies;
public:
    Movie_Analysis()
    {
        load_data();
    }

    void load_data()
    {
        ifstream fin{ "../resources/IMDB-Movie-Data.csv" };
        string row;
        string delim{ "," };
        pair<string, int> pair;
        vector< pair <string, int> > data;
        while (getline(fin, row))
        {
            pair.first = row.substr(0, row.find(delim));
            pair.second = stoi(row.substr(1, row.find(delim)));
            data.push_back(pair);
        }
    }
};


#endif