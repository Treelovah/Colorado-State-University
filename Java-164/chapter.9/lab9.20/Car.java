/*


Given main(), complete the Car class (in file Car.java) with methods to set and get the purchase price of a car (setPurchasePrice(), getPurchasePrice()), and to output the car's information (printInfo()).

Ex: If the input is:

2011
18000
2018

where 2011 is the car's model year, 18000 is the purchase price, and 2018 is the current year, the output is:

Car's information:
   Model year: 2011
   Purchase price: 18000
   Current value: 5770

Note: printInfo() should use three spaces for indentation.
*/

public class Car {
   private int modelYear; 
   private int purchasePrice;
   private int currentValue;
   
   public void setModelYear(int userYear){
      modelYear = userYear;
   }
   
   public int getModelYear() {
      return modelYear;
   }
   
   public void setPurchasePrice(int userPrice) {
      purchasePrice = userPrice;
   } 
   
   public int getPurchasePrice() {
      return purchasePrice;
   }

   
   public void calcCurrentValue(int currentYear) {
      double depreciationRate = 0.15;
      int carAge = currentYear - modelYear;
      
      // Car depreciation formula
      currentValue = (int) 
         Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
   }
   
   // TODO: Define printInfo() method to output modelYear, purchasePrice, and currentValue

   public void printInfo() {
      System.out.printf("Car's information:\n   Model year: %d\n   Purchase price: %d\n   Current value: %d\n",modelYear,purchasePrice,currentValue);
   }
   
}