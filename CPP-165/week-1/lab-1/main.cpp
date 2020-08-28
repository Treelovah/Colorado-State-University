#include <iostream>
#include <vector>
#include "includes.h"

using namespace std;

int main(int argc, char const *argv[])
{
    Person nobody{ "noname", 0 };
    Employee erin{ "Erin", 24, 400000, "mltechi" };
    Manager marshall{ "Marshall", 29, 65000, "mltechi" };

    vector<Person*> people;

    people.push_back(&nobody);
    people.push_back(&erin);
    people.push_back(&marshall);

    for (Person* p : people) p->to_string();
    return 0;
}
