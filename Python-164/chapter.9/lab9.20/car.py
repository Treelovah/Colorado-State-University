'''
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
'''

class Car:

    def __init__(self, modelYear, purchasePrice, currentYear):
        self.modelYear = int(modelYear)
        self.purchasePrice = int(purchasePrice)
        self.currentYear = int(currentYear)
        self.currentValue = 0

    def calcCurrentValue(self):
        depreciationRate = .15
        carAge = self.currentYear - self.modelYear
        self.currentValue = round(self.purchasePrice * pow((1 - depreciationRate), carAge))

    def printInfo(self):
        print(f"\nCar's information:\n   Model year: {self.modelYear}\n   Purchase price: ${self.purchasePrice}\n   Current value: ${self.currentValue}")