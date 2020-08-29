#ifndef MOVIE_H
#define MOVIE_H
#include <string>
#include <vector>

using namespace std;

class Movie
{
private:
    string name;    
    vector<int> ratings;
    int length;

public:
    Movie(string name, int length)
    {
        this->name = name;
        this->length = length;
    }

    virtual void to_string()
    {
        printf("Movie Name: %s, Movie Length(in minutes): %d\n", this->name.c_str(), this->length);
    }
    
    void set_name(string name)
    {
        this->name = name;
    }

    void set_length(int length)
    {
        this->length = length;
    }

    string& get_name()
    {
        return this->name;
    }

    int get_length()
    {
        return this->length;
    }

    void add_rating(int rating)
    {
        ratings.push_back(rating);
    }

    double get_average_rating()
    {
        double sum{ 0.0 };
        int i{ 0 };

        for (; i < ratings.size(); i++) sum += ratings.at(i);
        return (sum / ratings.size());
    }
};


#endif