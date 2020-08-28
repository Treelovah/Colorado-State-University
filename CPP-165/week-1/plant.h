// No error checking 
#ifndef PLANT_H
#define PLANT_H
#include <string>

using namespace std;

class Plant
{
protected:
    string name, cost;
public:
    Plant(string name, string cost)
    {
        this->name = name;
        this->cost = cost;
    }

    void set_name(string name)
    {
        this->name = name;
    }

    void set_cost( string cost)
    {
        this->cost = cost;
    }
    
    string &get_name()
    {
        return this->name;
    }

    string &get_cost()
    {
        return this->cost;
    }

    virtual void print_info()
    {
        printf("Plant Information:\n  Plant name: %s\n  Cost: %s\n",
                this->get_name().c_str(),
                this->get_cost().c_str());
    }
};

#endif
