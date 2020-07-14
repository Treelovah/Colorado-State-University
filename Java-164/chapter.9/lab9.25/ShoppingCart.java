import java.util.ArrayList;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();
    ItemToPurchase item = new ItemToPurchase();
    public ShoppingCart() {
        this.customerName = "none";
        this.currentDate = "January 1, 2016";
    }

    public ShoppingCart(String name, String date) {
        this.customerName = name;
        this.currentDate = date;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getDate() {
        return this.currentDate;
    }

    public void addItem(ItemToPurchase obj) {

        this.cartItems.add(obj);
    }

    public void removeItem(String itemToRemove) {
        boolean strChecker = false;
        for (ItemToPurchase itemToPurchase : cartItems) {
            if(itemToPurchase!=null && itemToRemove.equals(itemToPurchase.getName())) {
                strChecker = true;
                cartItems.remove(itemToPurchase);
            }
        }
        if (!strChecker) {
            System.out.println("Item not found in cart. Nothing removed.");
        }
    }

    public void modifyItem(String name, int quantity) {
        boolean strChecker = false;
        for (ItemToPurchase itemToPurchase : cartItems) {
            if(itemToPurchase!=null && name.equals(itemToPurchase.getName())) {
                strChecker = true;
                itemToPurchase.setQuantity(quantity);
            }
        }
        if (!strChecker) {
            System.out.println("Item not found in cart. Nothing modified.");
        }
    }

    public int getNumItemsInCart() {
        int numItems = 0;
        for (ItemToPurchase itemToPurchase : cartItems) {
            numItems += itemToPurchase.getQuantity();
        }
        return numItems;
    }
    public int getCostOfCart() {
        int cartCost = 0;
        for (ItemToPurchase itemToPurchase : cartItems) {
            cartCost += (itemToPurchase.getPrice() *itemToPurchase.getQuantity());
        }
        return cartCost;
    }

    public void printTotal() {
        System.out.printf("%s's Shopping Cart - %s\n",this.customerName, this.currentDate);
            System.out.printf("Number of Items: %d\n\n",this.getNumItemsInCart());

            if (this.cartItems.isEmpty()) {
                System.out.println("SHOPPING CART IS EMPTY\n");
            } else {
                for (ItemToPurchase itemToPurchase : cartItems) {
                    itemToPurchase.printItemCost();
                }
                System.out.println();
            }
            System.out.printf("Total: $%d\n",this.getCostOfCart());

    }
    public void printDescriptions() {
        System.out.printf("%s's Shopping Cart - %s\n\n",this.customerName, this.currentDate);
        System.out.println("Item Descriptions");
        for (ItemToPurchase itemToPurchase : cartItems) {
            System.out.printf("%s: %s\n",itemToPurchase.getName(),itemToPurchase.getDescription());
        }
        
    }
}