from shoppingCart import ShoppingCart
from itemToPurchase import ItemToPurchase

def menu(cart=ShoppingCart):
    print("\nMENU")
    print("a - Add item to cart")
    print("d - Remove item from cart")
    print("c - Change items quantity")
    print("i - Output items' descriptions")
    print("o - Output shopping cart")
    print("q - Quit")
    menuReply(cart)

def menuReply(cart=ShoppingCart):
    print("Choose an option:")
    ch = input()
    
    if ch == "a":
        item = ItemToPurchase(input("Enter the item name:\n"), input("Enter the item description:\n"), float(input("Enter the item price:\n")), int(input("Enter item quantity:\n")))
        cart.addItem(item)
        menu(cart)
    elif ch == "d":
        print("\nREMOVE ITEM FROM CART")
        cart.removeItem(input("Enter name of item to remove:\n"))
        menu(cart)
    elif ch == "c":
        print("\nCHANGE ITEM QUANTITY")
        cart.modifyItem(input("Enter the item name:\n"), int(input("Enter the new quantity:\n")))
        menu(cart)
    elif ch == "o":
        print("\nOUTPUT SHOPPING CART")
        cart.printTotal()
        menu(cart)
    elif ch == "i":
        print("\nOUTPUT ITEMS' DESCRIPTIONS")
        cart.printDescriptions()
        menu(cart)
    elif ch == "q":
        print("Bye")      
        exit(1)
    else:
        print("Enter something on the menu.")
        menu(cart)
name = input("Enter Customer's Name:\n")
date = input("Enter Today's Date:\n")
print()

cart = ShoppingCart(name,date)
print(f"Customer Name: {cart.customerName}")
print(f"Today's Date: {cart.customerDate}")


menu(cart)