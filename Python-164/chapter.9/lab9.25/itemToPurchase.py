class ItemToPurchase:
    
    itemName = "none"
    itemDescription = "none"
    itemPrice = 0
    itemQuantity = 0

    def __init__(self, name, description, price, quantity):
        self.itemName = name
        self.itemDescription = description
        self.itemPrice = price
        self.itemQuantity = quantity
    
    def getTotal(self):
        return (self.itemPrice * self.itemQuantity)

    def printItemDescription(self):
        print(self.itemDescription)
    
    def getItemDescription(self):
        return self.itemDescription
        
    def printItemCost(self):
        print(f"{self.itemName} {self.itemQuantity} @ ${self.itemPrice} = ${self.getTotal()}")
    