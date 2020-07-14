from itemToPurchase import ItemToPurchase

class ShoppingCart:
    customerName = "none"
    customerDate = "January 1, 2020"
    cartItems = []

    def __init__(self, name, date):
        self.customerName = name
        self.customerDate = date

    def addItem(self, item=ItemToPurchase):
        self.cartItems.append(item)

    def removeItem(self, itemToRemove):
        check = False
        for i in self.cartItems:
            if i.itemName == itemToRemove:
                check = True
                self.cartItems.remove(i)
        if check == False:
            print("Item not found in cart. Nothing removed.")

    def modifyItem(self, name, quantity):
        check = False
        for i in self.cartItems:
            if i.itemName == name:
                check = True
                i.itemQuantity = quantity
        if check == False:
            print("Item not found in cart. Nothing modified.")

    def getNumItemsInCart(self):
        return len(self.cartItems)

    def getCostOfCart(self):
        cartCost = 0
        for i in self.cartItems:
            cartCost = cartCost + (i.itemPrice * i.itemQuantity)
        return cartCost

    def printTotal(self):
        print(f"{self.customerName}'s Shopping Cart - {self.customerDate}")
        print(f"Number of Items: {self.getNumItemsInCart()}\n")

        if (self.cartItems == None):
            print("SHOPPING CART IS EMPTY")
        else:
            for i in self.cartItems:
                i.printItemCost()
    
    def printDescriptions(self):
        print(f"{self.customerName}'s Shopping Cart - {self.customerDate}\n")
        print("Item Descriptions")
        for i in self.cartItems:
            print(f"{i.itemName}: {i.getItemDescription()}")