from foodItem import FoodItem

food = FoodItem(input(), input(), input(), input())
servings = input()

food.printInfo()
print(f"Number of calories for {servings} serving(s): {food.getCalories(servings)}")