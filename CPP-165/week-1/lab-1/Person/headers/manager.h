#ifndef MANAGER_H
#define MANAGER_H
#include <string>
#include "employee.h"

using namespace std;

class Manager : public Employee
{
public:
    Manager(string name, int age, long salary, string employer)
    : Employee(name, age, salary, employer) {}

    void to_string()
    {
        printf("%s is a manager at %s who is %d and makes $%d a year\n",
        this->get_name().c_str(),
        this->get_employer().c_str(),
        this->get_age(),
        this->get_salary()
        );
    }
};

#endif