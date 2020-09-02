#include "../headers/Business.h"

Business::Business() {}

Business::Business(string bus_name, string bus_address)
{
    name = bus_name;
    address = bus_address;
}

void Business::to_string()
{
    printf("%s -- %s\n",name.c_str(), address.c_str());
}