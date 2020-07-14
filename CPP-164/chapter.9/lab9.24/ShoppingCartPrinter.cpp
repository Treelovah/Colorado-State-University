/*
(1) Create two files to submit:

    ItemToPurchase.java - Class definition
    ShoppingCartPrinter.java - Contains main() method

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

(2) In main(), prompt the user for two items and create two objects of the ItemToPurchase class. 

Before prompting for the second item, call scnr.nextLine(); to allow the user to input a new string. (2 pts)

Ex:

Item 1
Enter the item name:
Chocolate Chips
Enter the item price:
3
Enter the item quantity:
1

Item 2
Enter the item name:
Bottled Water
Enter the item price:
1
Enter the item quantity:
10

(3) Add the costs of the two items together and output the total cost. (2 pts)

Ex:

TOTAL COST
Chocolate Chips 1 @ $3 = $3
Bottled Water 10 @ $1 = $10

Total: $13

*/

#include <iostream>
#include "ItemToPurchase.cpp"

using namespace std;

int main(int argc, char const *argv[])
{
    string name;
    int price, quantity;

    ItemToPurchase item1; // sets default constructor because there are no parameters. talk about intuitive!
    ItemToPurchase item2;

    // Item 1
    cout << "Item 1\n";
    cout << "Enter the item name\n";
    getline(cin, name);
    printf("Enter the item price:\n");
    cin >> price;
    printf("Enter the item quantity:\n");
    cin >> quantity;
    printf("\n");

    item1.setName(name);
    item1.setPrice(price);
    item1.setQuantity(quantity);

    // clear buffer for next set of inputs
    cin.clear();
    cin.ignore(32767, '\n');
    cout << "Item 2\n";
    
    // Item 2
    cout << "Enter the item name\n";
    getline(cin, name);
    printf("Enter the item price:\n");
    cin >> price;
    printf("Enter the item quantity:\n");
    cin >> quantity;

    item2.setName(name);
    item2.setPrice(price);
    item2.setQuantity(quantity);

    printf("\n");
    printf("TOTAL COST\n");
    int total_1 = item1.getTotal();
    int total_2 = item2.getTotal();

    printf("%s %d @ $%d = $%d\n", item1.getName().c_str(), item1.getQuantity(), item1.getPrice(), total_1);
    printf("%s %d @ $%d = $%d\n", item2.getName().c_str(), item2.getQuantity(), item2.getPrice(), total_2);
    printf("\nTotal: $%d\n", (total_1 + total_2));
    return 0;
}
