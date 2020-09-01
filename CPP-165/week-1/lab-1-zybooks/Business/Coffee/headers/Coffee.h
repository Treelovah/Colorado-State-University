#ifndef COFFEE_H
#define COFFEE_H
#include <string>
#include "Business.h"

using namespace std;

class Coffee : public Business
{
private:
    string type, bean_roast;
public:
    Coffee();
    Coffee(string coffee_type, string coffee_roast);

    virtual void to_string();
};

#endif