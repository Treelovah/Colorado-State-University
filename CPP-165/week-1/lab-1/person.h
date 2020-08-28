#ifndef PERSON_H
#define PERSON_H
#include <string>

using namespace std;

class Person
{
private:
    string name;
    int age;
public:
    Person(string name, int age)
    {
        this->name = name;
        this->age = age;
    }

    void set_name(string name)
    {
        this->name = name;
    }

    void set_age(int age)
    {
        this->age = age;
    }

    string& get_name()
    {
        return this->name;
    }

    int get_age()
    {
        return this->age;
    }

    virtual void to_string()
    {
        printf("%s is %d years old.", this->get_name().c_str(), this->get_age());
    }    
};

#endif