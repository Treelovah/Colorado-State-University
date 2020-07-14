/*
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
*/

#include <iostream>

using namespace std;

class ItemToPurchase
{
    private:
        string itemName, itemDescription;
        int itemPrice, itemQuantity = 0;
    public:
        ItemToPurchase()
        {
            // this->itemName = "none";
            // this->itemDescription = "none";
            // this->itemPrice = 0;
            // this->itemQuantity = 0;
        }

        ItemToPurchase(string name, string description, int price, int quantity)
        {
            this->itemName = name;
            this->itemDescription = description;
            this->itemPrice = price;
            this->itemQuantity = quantity;
        }

        void setName(string str)
        {
            this->itemName = str;
        }

        void setDescription(string str)
        {
            this->itemDescription = str;
        }

        void setPrice(int num)
        {
            this->itemPrice = num;
        }

        void setQuantity(int quantity)
        {
            this->itemQuantity = quantity;
        }

        string getName()
        {
            return this->itemName;
        }

        string getDescription()
        {
            return this->itemDescription;
        }

        int getPrice()
        {
            return this->itemPrice;
        }

        int getQuantity()
        {
            return this->itemQuantity;
        }

        int getTotal()
        {
            return (this->getPrice() * this->getQuantity());
        }

        void printItemDescription()
        {
            printf("%s",this->itemDescription.c_str());
        }

        void printItemCost()
        {
            printf("%s %d @ $%d = $%d\n", this->getName().c_str(), this->getQuantity(), this->getPrice(), this->getTotal());
        }
};