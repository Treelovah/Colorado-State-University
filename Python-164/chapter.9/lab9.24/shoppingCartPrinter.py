from itemToPurchase import ItemToPurchase

# Item 1
print("Item 1")

item1 = ItemToPurchase(input("Enter the item name:\n"), int(input("Enter the item price:\n")), int(input("Enter the item quantity:\n")))

# Item 2
print("\nItem 2")
item2 = ItemToPurchase(input("Enter the item name:\n"), int(input("Enter the item price:\n")), int(input("Enter the item quantity:\n")))

# Total
print("\nTOTAL COST")
total1 = item1.getTotal()
total2 = item2.getTotal()

print(f"{item1.itemName} {item1.itemQuantity} @ ${item1.itemPrice} = {total1}")
print(f"{item2.itemName} {item2.itemQuantity} @ ${item2.itemPrice} = {total2}")
print(f"\nTotal: ${(total1 + total2)}")