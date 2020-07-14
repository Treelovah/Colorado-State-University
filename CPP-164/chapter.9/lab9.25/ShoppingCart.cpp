#include <iostream>
#include <vector>
#include <algorithm>
#include "ItemToPurchase.cpp"
using namespace std;

class ShoppingCart
{
    private:
        string customerName, currentDate;
        vector<ItemToPurchase> cartItems{ ItemToPurchase() };

    public:
        ShoppingCart()
        {
            this->customerName = "none";
            this->currentDate = "January 1, 2016";
        }

        ShoppingCart(string name, string date)
        {
            this->customerName = name;
            this->currentDate = date;
        }

        string getCustomerName()
        {
            return this->customerName;
        }

        string getDate()
        {
            return this->currentDate;
        }

        int getNumItemsInCart()
        {
            int numItems{ 0 };
            for (ItemToPurchase itemtoPurchase : cartItems)
            {
                numItems += itemtoPurchase.getQuantity();
            }
            return numItems;
        }
        int getCostofCart()
        {
            int cartCost{ 0 };
            for (ItemToPurchase itemToPurchase : cartItems)
            {
                cartCost += (itemToPurchase.getPrice() * itemToPurchase.getQuantity());
            }
            return cartCost;

        }
        void addItem(ItemToPurchase obj)
        {
            this->cartItems.push_back(obj);
        }
                // This bugs out, not removing element from vector
        /* 
        void removeItem(string itemToRemove)
        {
            bool strChecker{ false };
            for (ItemToPurchase itemToPurchase : cartItems)
            {
                // There is no need to test for NULL obj here, as a reference can NOT BE NULL.
                if (itemToRemove.compare(itemToPurchase.getName()))
                {
                    strChecker = true;
                    cartItems.erase(remove(cartItems.begin(), cartItems.end(), itemToRemove), cartItems.end());
                }
            }
            if (!strChecker)
            {
                printf("Item not found in car. Nothing removed.\n");
            }
        }
        */
            // ===== FIX THIS AS WELL ====== (Not updating quantity)
        /* 
        void modifyItem(string name, int quantity)
        {
            bool strChecker{ false };
            for (ItemToPurchase itemToPurchase : cartItems)
            {
                if (name.compare(itemToPurchase.getName()))
                {
                    strChecker = true;
                    itemToPurchase.setQuantity(quantity);
                }
            }
            if (!strChecker)
            {
                printf("Item not found in cart. Nothing modified\n");
            }
         }
        */
        void printTotal()
        {
            printf("%s's Shopping Cart - %s\n",this->getCustomerName().c_str(), this->getDate().c_str());
            printf("Number of Items: %d\n",this->getNumItemsInCart());

            if (this->cartItems.empty())
            {
                printf("SHOPPING CART IS EMPTY\n");
            } else
            {
                for (ItemToPurchase itemToPurchase : cartItems)
                {
                    itemToPurchase.printItemCost();
                }
                printf("\n");
            }
            printf("Total: $%d\n",this->getCostofCart());
        }

        void printDescriptions()
        {
            printf("%s's Shopping Cart - %s\n\n",this->getCustomerName().c_str(), this->getDate().c_str());
            printf("Item Descriptions\n");
            for (ItemToPurchase itemToPurchase : cartItems)
            {
                printf("%s: %s\n",itemToPurchase.getName().c_str(), itemToPurchase.getDescription().c_str());
            }
        }
};