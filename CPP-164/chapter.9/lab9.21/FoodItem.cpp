#include <iostream>
using namespace std;
class FoodItem
{
    private:
        string name;
        double fat, carbs, protein;
    
    public:
        FoodItem()
        {
            this->name = "None";
            this->fat = 0.0;
            this->carbs = 0.0;
            this->protein = 0.0;
        }

        FoodItem(string foodName, double gramsOfFat, double gramsOfCarbs, double gramsOfProtein)
        {
            this->name = foodName;
            this->fat =gramsOfFat;
            this->carbs = gramsOfCarbs;
            this->protein = gramsOfProtein;
        }

        string getName()
        {
            return name;
        }

        double getFat()
        {
            return fat;
        }

        double getCarbs()
        {
            return carbs;
        }

        double getProtein()
        {
            return protein;
        }

        double getCalories(double numServings)
        {
            // Calorie formula
            double calories = ((fat * 9) + (carbs * 4) + (protein * 4)) * numServings;
            return calories;
        }

        void printInfo()
        {
            printf("Nutitional information per serving of %s:\n", name.c_str()); // calling c_str() on name for printf compaitibility.
            printf("   Fat: %.2f g\n", fat);
            printf("   Carbohydrates: %.2f g\n", carbs);
            printf("   Protein: %.2f g\n", protein);
        }
};