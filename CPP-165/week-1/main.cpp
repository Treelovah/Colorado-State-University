#include <vector>
#include "plant.h"
#include "flower.h"


int main(int argc, char const *argv[])
{
    Plant plant{ "Rose", "30" };
    Flower flower{ "Lily", "50", "true", "red" };

    std::vector<Plant*> plants;

    plants.push_back(&plant);
    plants.push_back(&flower);

    for (Plant* p : plants) p->print_info();

    return 0;
}
