public class FoodItem {
    private String name;
    private double fat;
    private double carbs;
    private double protein;
    
    // TODO: Define default constructor
    public FoodItem() {
        this.name = "None";
        this.fat = 0.0;
        this.carbs = 0.0;
        this.protein = 0.0;
    }

    public FoodItem(String foodName, double gramsOfFat, double gramsOfCarbs, double gramsOfProtein) {
        this.name = foodName;
        this.fat = gramsOfFat;
        this.carbs = gramsOfCarbs;
        this.protein = gramsOfProtein;
    }
    
    // TODO: Define second constructor with arguments to initialize 
    //       private fields (name, fat, carbs, protein)
    
    public String getName() {
       return name;
    }
    
    public double getFat() {
       return fat;
    }
    
    public double getCarbs() {
       return carbs;
    }
    
    public double getProtein() {
       return protein;
    }
    
    public double getCalories(double numServings) {
       // Calorie formula
       double calories = ((fat * 9) + (carbs * 4) + (protein * 4)) * numServings;
       return calories;
    }
    
    public void printInfo() {
       System.out.println("Nutritional information per serving of " + name + ":");
       System.out.printf("   Fat: %.2f g\n", fat);
       System.out.printf("   Carbohydrates: %.2f g\n", carbs);
       System.out.printf("   Protein: %.2f g\n", protein);
    }
 }