'''/*
Build the ItemToPurchase class with the following specifications:

    Private fields
        String itemName - Initialized in default constructor to "none"
        int itemPrice - Initialized in default constructor to 0
        int itemQuantity - Initialized in default constructor to 0
    Default constructor
    Public member methods (mutators & accessors)
        setName() & getName() (2 pts)
        setPrice() & getPrice() (2 pts)
        setQuantity() & getQuantity() (2 pts)
*/'''

class ItemToPurchase:
    
    itemName = "none"
    itemPrice = 0
    itemQuantity = 0

    def __init__(self, name, price, quantity):
        self.itemName = name
        self.itemPrice = price
        self.itemQuantity = quantity
    
    def getTotal(self):
        return (self.itemPrice * self.itemQuantity)
    