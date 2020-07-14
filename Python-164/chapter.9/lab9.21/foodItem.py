'''/*
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
*/'''

class FoodItem:
    name = "None"
    fat = 0.0
    carbs = 0.0
    protein = 0.0

    def __init__(self, name, gramsOfFat, gramsOfCarbs, gramsOfProtein):
        self.name = name
        self.fat = float(gramsOfFat)
        self.carbs = float(gramsOfCarbs)
        self.protein = float(gramsOfProtein)

    def getCalories(self, numServings):
        calories = ((self.fat * 9) + (self.carbs * 4) + (self.protein * 4)) * float(numServings)
        return calories

    def printInfo(self):
        print(f"Nutritional information per serving of {self.name}:")
        print(f"   Fat: {self.fat} g\n   Carbohydrates: {self.carbs} g\n   Protein: {self.protein}")