public class ItemToPurchase {
    private String itemName;
    private String itemDescription;
    private int itemPrice;
    private int itemQuantity;

    public ItemToPurchase() {
        this.itemName = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;
        this.itemDescription = "none";
    }

    public ItemToPurchase(String name, String description, int price, int quantity) {
        this.itemName = name;
        this.itemDescription = description;
        this.itemQuantity = quantity;
        this.itemPrice = price;
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
        return (this.itemPrice * this.itemQuantity);
    }

    public void setDescription(String str) {
         this.itemDescription = str;
    }
    public String getDescription() {
        return this.itemDescription;
    }

    public void printItemDescription() {
        System.out.printf("%s",this.itemDescription);
    }
    public void printItemCost() {
        System.out.printf("%s %d @ $%d = $%d\n",this.itemName, this.itemQuantity, this.itemPrice, this.getTotal());
    }
}
