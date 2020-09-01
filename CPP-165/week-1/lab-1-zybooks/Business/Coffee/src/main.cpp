#include <iostream>
#include <vector>
#include "../headers/Business.h"
#include "../headers/Coffee.h"
#include <string>

using namespace std;

void print_list(vector<Business*> objects)
{
    int i{ 0 };

    for (; i < objects.size(); i++) cout << objects.at(i);
}

int main(int argc, char const *argv[])
{
    vector<Business*> objects;

    string my_string{ "Graph" };
    Coffee my_coffee{"Iced", "Light" };
    Business my_business{"Dinoco", "5 Park Ave" };

    objects.push_back(&my_coffee);
    objects.push_back(&my_business);

    for (Business* b : objects) b->to_string();
    return 0;
}
