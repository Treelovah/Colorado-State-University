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
        string itemName;
        int itemPrice, itemQuantity = 0;
    public:
        ItemToPurchase()
        {
            this->itemName = "none";
            this->itemPrice = 0;
            this->itemQuantity = 0;
        }

        ItemToPurchase(string str, int price, int quantity)
        {
            this->itemName = str;
            this->itemPrice = price;
            this->itemQuantity = quantity;
        }

        void setName(string str)
        {
            this->itemName = str;
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
};