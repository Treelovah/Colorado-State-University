#ifndef MOVIE_H
#define MOVIE_H
#include <string>
#include <vector>

using namespace std;

class Movie
{
private:
    string m_name;    
    vector<int> ratings; 
    int m_length;

public:
    // Default constructor
    Movie();

    // Parameter constructor
    Movie(string name, int length);

    // virtual function for overrides
    virtual void to_string();
    
    // set name of movie
    void set_name(string name);

    // add rating to movie
    void add_rating(int rating);

    // set length of movie (in minutes)
    void set_length(int length);

    // get name of movie
    string& get_name();

    // get length of movie (in minutes)
    int get_length();
    
    // get average rating of movie
    double get_average_rating();
};


#endif