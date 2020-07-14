import java.util.Scanner;

public class ShoppingCartManager {
    public static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Customer's Name:");
        String name = scnr.nextLine();
        System.out.println("Enter Today's Date:");
        String date = scnr.nextLine();

        System.out.println();
        ShoppingCart cart = new ShoppingCart(name,date);
        System.out.printf("Customer Name: %s\n",cart.getCustomerName());
        System.out.printf("Today's Date: %s\n",cart.getDate());
        cart.getCustomerName();
        cart.getDate();
        printMenu(cart);
    }

    public static void printMenu(ShoppingCart cart) {
        System.out.println("\nMENU");
        System.out.println("a - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
        System.out.println();
        menuReply(cart);
    }

    public static void menuReply(ShoppingCart cart) {
        ItemToPurchase item = new ItemToPurchase();
        System.out.println("Choose an option:");
        String ch = scnr.next();
        switch (ch) {
            case "a":
                System.out.println("ADD ITEM TO CART");
                scnr.nextLine();
                System.out.println("Enter the item name:");
                item.setName(scnr.nextLine());
                System.out.println("Enter the item description:");
                item.setDescription(scnr.nextLine());
                System.out.println("Enter the item price:");
                item.setPrice(scnr.nextInt());
                System.out.println("Enter the item quantity:");
                item.setQuantity(scnr.nextInt());
                cart.addItem(item);
                printMenu(cart);
                break;
            case "d":
                System.out.println("REMOVE ITEM FROM CART");
                scnr.nextLine();
                System.out.println("Enter name of item to remove:");
                cart.removeItem(scnr.nextLine());
                printMenu(cart);
                break;
            case "c":
                System.out.println("CHANGE ITEM QUANTITY");
                scnr.nextLine();
                System.out.println("Enter the item name:");
                String name = scnr.nextLine();
                System.out.println("Enter the new quantity:");
                int quantity = scnr.nextInt();
                cart.modifyItem(name, quantity);
                printMenu(cart);
                break;
            case "i":
                System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                cart.printDescriptions();
                printMenu(cart);
                break;
            case "o":
                System.out.println("OUTPUT SHOPPING CART");
                cart.printTotal();
                printMenu(cart);
                break;
            case "q":
                break;
            default:
                menuReply(cart);
                break;
        }
    }
}