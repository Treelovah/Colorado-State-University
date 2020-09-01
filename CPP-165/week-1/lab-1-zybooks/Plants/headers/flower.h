// No error checking 
#ifndef FLOWER_H
#define FLOWER_H
#include <string>
#include "plant.h"

using namespace std;

class Flower : public Plant
{
protected:
    string color_of_flower, is_annual;
public:    
    Flower(string name, string cost, string is_annual, string color_of_flower)
    : Plant(name, cost)
    {
        this->is_annual = is_annual;
        this->color_of_flower = color_of_flower;
    }
    void set_type(string is_annual)
    {
        this->is_annual = is_annual;
    }

    void set_color_of_flower(string color_of_flower)
    {
        this->color_of_flower = color_of_flower;
    }

    string& get_type()
    {
        return this->is_annual;
    }

    string& get_color_of_flower()
    {
        return this->color_of_flower;
    }

    void print_info()
    {
        printf("Plant Information:\n  Plant name: %s\n  Cost: %s\n  Annual: %s\n  Color of flowers %s\n",
            this->get_name().c_str(),
            this->get_cost().c_str(),
            this->get_type().c_str(),
            this->color_of_flower.c_str());        
    }
};
#endif