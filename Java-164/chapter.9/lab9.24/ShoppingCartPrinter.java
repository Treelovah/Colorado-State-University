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
import java.util.Scanner;
public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        // Item 1
        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        item1.setName(scnr.nextLine());
        System.out.println("Enter the item price:");
        item1.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity:");
        item1.setQuantity(scnr.nextInt());
        scnr.nextLine(); // this is annoying af.

        System.out.println();

        // Item 2
        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        item2.setName(scnr.nextLine());
        System.out.println("Enter the item price:");
        item2.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity:");
        item2.setQuantity(scnr.nextInt());
        // scnr.nextLine(); // this is annoying af.

        System.out.println();
        System.out.printf("TOTAL COST\n");
        int total_1 = item1.getTotal();
        int total_2 = item2.getTotal();
        
        System.out.printf("%s %d @ $%d = $%d\n",item1.getName(), item1.getQuantity(), item1.getPrice(), total_1);
        System.out.printf("%s %d @ $%d = $%d\n",item2.getName(), item2.getQuantity(), item2.getPrice(), total_2);
        System.out.printf("\nTotal: $%d\n",(total_1 + total_2));
    }
}