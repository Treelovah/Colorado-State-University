/*
Given main(), complete the FoodItem class (in file FoodItem.java) with constructors to initialize each food item. 

The default constructor should initialize the name to "None" and all other fields to 0.0. 

The second constructor should have four parameters (food name, grams of fat, grams of carbohydrates, and grams of protein) 
and should assign each private field with the appropriate parameter value.

Ex: If the input is:

M&M's
10.0
34.0
2.0
1.0

where M&M's is the food name, 10.0 is the grams of fat, 34.0 is the grams of carbohydrates, 2.0 is the grams of protein, and 1.0 is the number of servings, the output is:

Nutritional information per serving of None:
   Fat: 0.00 g
   Carbohydrates: 0.00 g
   Protein: 0.00 g
Number of calories for 1.00 serving(s): 0.00


Nutritional information per serving of M&M's:
   Fat: 10.00 g
   Carbohydrates: 34.00 g
   Protein: 2.00 g
Number of calories for 1.00 serving(s): 234.00

The first FoodItem above is initialized using the default constructor.
*/
#include <iostream>
#include "FoodItem.cpp"

using namespace std;

int main(int argc, char const *argv[])
{
    // since no paramtersr are called, these will default to default constructor.
    FoodItem foodItem1;

    string itemName;
    double amountFat, amountCarbs, amountProtein, numServings;

    cin >> itemName;
    cin >> amountFat;
    cin >> amountCarbs;
    cin >> amountProtein;

    FoodItem foodItem2(itemName, amountFat, amountCarbs, amountProtein);

    cin >> numServings;

    foodItem1.printInfo();
    printf("Number of calories for %.2f serving(s): %.2f\n", numServings, foodItem1.getCalories(numServings));
    printf("\n");

    foodItem2.printInfo();
    printf("Number of calories for %.2f serving(s): %.2f\n", numServings, foodItem2.getCalories(numServings));
    
    
    return 0;
}
