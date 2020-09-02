#ifndef EMPLOYEE_H
#define EMPLOYEE_H
#include <string>
#include "person.h"

using namespace std;

class Employee : public Person
{
private:
    long salary;
    string employer;
public:
    Employee(string name, int age, long salary, string employer)
    : Person(name, age)
    {
        this->salary = salary;
        this->employer = employer;
    }

    void set_salary(long salary)
    {
        this->salary = salary;
    }

    void set_employer(string employer)
    {
        this->employer = employer;
    }

    long get_salary()
    {
        return this->salary;
    }

    string& get_employer()
    {
        return this->employer;
    }

    void to_string()
    {
        printf("\n");
        Person::to_string();
        printf(" They make $%d a year at %s\n",
        this->get_salary(), 
        this->get_employer().c_str());
    }
};





#endif