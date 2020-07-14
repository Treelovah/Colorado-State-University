#include <iostream>
#include "Car.cpp"

using namespace std;

int userYear, userPrice, userCurrentYear;

int main(int argc, char const *argv[])
{
    cin >> userYear;
    cin >> userPrice;
    cin >> userCurrentYear;

    Car car;
    car.setModelYear(userYear);
    car.setPurchasePrice(userPrice);
    car.calcCurrentValue(userCurrentYear);

    car.printInfo();
        
    return 0;
}
