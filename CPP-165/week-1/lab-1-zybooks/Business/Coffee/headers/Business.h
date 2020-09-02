#ifndef BUSINESS_H
#define BUSINESS_H
#include <string>

using namespace std;

class Business
{
private:
    string name, address;
public:
    Business();
    Business(string bus_name, string bus_address);

    virtual void to_string();
};

#endif