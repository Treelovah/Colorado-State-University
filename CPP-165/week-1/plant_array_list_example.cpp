#include <iostream>
#include <vector>

using namespace std;

class Plant
{
    private:
        string plant_name, plant_cost;
    public:
        void set_plant_name(string user_plant_name) 
        {
            this->plant_name = user_plant_name;
        }
        
        string get_plant_name()
        {
            return this->plant_name;
        }

        void set_plant_cost(string user_plant_cost)
        {
            this->plant_cost = user_plant_cost;
        }

        string get_plant_cost()
        {
            return this->plant_cost;
        }

        virtual void print_info()
        {
            printf("Plant Information:\n  Plant name: %s\n  Cost: %s\n",plant_name.c_str(),plant_cost.c_str());
        }
};

class Flower: public Plant
{
    private:
        bool is_annual;
        string color_of_flower;
    public:
        void set_plant_type(bool user_is_annual)
        {
            this->is_annual = user_is_annual;
        }

        bool get_plant_type()
        {
            return this->is_annual;
        }

        void set_color_of_flower(string user_color_of_flower)
        {
            this->color_of_flower = user_color_of_flower;
        }

        string get_color_of_flower()
        {
            return this->color_of_flower;
        }

        void print_info() override
        {
            printf("Plant Information:\n  Plant name: %s\n  Cost: %s\n  Annual: %d\n  Color of flowers %s\n",get_plant_name(), get_plant_cost().c_str(), is_annual, color_of_flower.c_str());
        }
};


int main(int argc, char const *argv[])
{
    Plant plant;
    Flower flower;
    // most likely going to have to create a vector that holds pointers to so that they can be unique.
    plant.set_plant_name("Rose");
    plant.set_plant_cost("30");

    flower.set_plant_name("Lily");
    flower.set_plant_cost("50");
    flower.set_plant_type("true");
    flower.set_color_of_flower("red");

    // my_garden.push_back(flower);
    // my_garden.push_back(plant);

}
