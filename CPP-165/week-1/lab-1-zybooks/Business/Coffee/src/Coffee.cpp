#include "../headers/Coffee.h"


Coffee::Coffee(std::string coffee_type, std::string coffee_roast)
{
    type = coffee_type;
    bean_roast = coffee_roast;
}

void Coffee::to_string()
{
    printf("%s (%s)\n",type.c_str(), bean_roast.c_str());
}