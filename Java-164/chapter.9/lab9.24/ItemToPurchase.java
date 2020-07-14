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

public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    public ItemToPurchase() {
        this.itemName = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;
    }

    public ItemToPurchase(String str, int price, int quantity) {
        this.itemName = str;
        this.itemPrice = price;
        this.itemQuantity = quantity;
    }

    public void setName(String str) {
        this.itemName = str;
    }

    public void setPrice(int num) {
        this.itemPrice = num;
    }

    public void setQuantity(int num) {
        this.itemQuantity = num;
    }

    public String getName() {
        return this.itemName;
    }

    public int getPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    public int getTotal() {
        return (this.getPrice() * this.getQuantity());
    }
}