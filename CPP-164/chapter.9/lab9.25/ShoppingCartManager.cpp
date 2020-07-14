#include <iostream>
#include "ShoppingCart.cpp"

using namespace std;

void printMenu(ShoppingCart cart);
void menuReply(ShoppingCart cart);

int main(int argc, char const *argv[])
{
    string name, date;
    printf("Enter Customer's Name:\n");
    getline(cin, name);
    printf("Enter Today's Date:\n");
    getline(cin, date);

    ShoppingCart cart(name, date);
    printf("\nCustomers Name: %s\n", cart.getCustomerName().c_str());
    printf("Today's Date: %s\n", cart.getDate().c_str());
    printf("\n");
    cart.getCustomerName();
    cart.getDate();
    printMenu(cart);
    return 0;
}

void printMenu(ShoppingCart cart)
{
    printf("\nMENU\n");
    printf("a - Add item to cart\n");
    printf("d - Remove item from cart\n");
    printf("c - Change item from cart\n");
    printf("i - Output items' descriptions\n");
    printf("o - Output shopping cart\n");
    printf("q - Quit\n");
    printf("\n");
    menuReply(cart);
}

void menuReply(ShoppingCart cart)
{
    ItemToPurchase item;
    char ch;
    string itemName, itemDescription;
    int itemPrice, itemQuantity;

    cin >> ch;
    cin.ignore(32767, '\n');
    cin.clear();
    switch (ch)
    {
    case 'a':
        printf("ADD ITEM TO CART\n");
        printf("Enter the item name:\n");
        getline(cin, itemName);
        printf("Enter the item description:\n");
        getline(cin, itemDescription);
        printf("Enter the item price:\n");
        cin >> itemPrice;
        printf("Enter the item quantity:\n");
        cin >> itemQuantity;

        item.setName(itemName);
        item.setDescription(itemDescription);
        item.setPrice(itemPrice);
        item.setQuantity(itemQuantity);

        cart.addItem(item);   
        printMenu(cart);
        break;
        // needs fixing 
    // case 'd':
        // needs fixing
    // case 'c':
    //     printf("CHANGE ITEM QUANTITY\n");
    //     printf("Enter the item name:\n");
    //     getline(cin, itemName);
    //     printf("Enter the new quantity:\n");
    //     cin >> itemQuantity;
    //     cart.modifyItem(itemName, itemQuantity);
    //     printMenu(cart);
    //     break;
    case 'i':
        printf("OUTPUT ITEMS' DESCRIPTIONS\n");
        cart.printDescriptions();
        printMenu(cart);
        break;
        // fix printing out default constructor (none 0 @ 0.....)
    case 'o':
        printf("OUTPUT SHOPPING CART\n");
        cart.printTotal();
        printMenu(cart);
        break;
    case 'q':
        exit(0);
        break;
    default:
        break;
    }
}