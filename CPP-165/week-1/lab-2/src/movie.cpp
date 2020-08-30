#include "movie.h"

Movie::Movie()
{
    set_name("none");
    set_length(0);
}

Movie::Movie(std::string name, int length)
{
    set_name(name);
    set_length(length);
}

void Movie::to_string()
{
    printf("Movie Name: %s, Movie Length(in minutes): %d\n", get_name().c_str(), get_length());
}

void Movie::set_name(std::string movie_name)
{
    m_name = movie_name;
}

void Movie::set_length(int movie_length)
{
    m_length = movie_length;
}

std::string& Movie::get_name()
{
    return m_name;
}

int Movie::get_length()
{
    return m_length;
}

void Movie::add_rating(int rating)
{
    ratings.push_back(rating);
}

float Movie::get_average_rating()
{
    double sum{ 0.0 };
    int i{ 0 };

    for (; i < ratings.size(); i++) sum += ratings.at(i);
    return (sum / ratings.size());
}