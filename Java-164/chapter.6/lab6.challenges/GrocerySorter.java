/*
Print either "Fruit" or "Drink" (followed by a newline) depending on the value of userItem. For example, if userItem is GR_APPLES, output should be:

Fruit

*/
import java.util.Scanner;

public class GrocerySorter {
    public enum GroceryItem {GR_APPLES, GR_BANANAS, GR_JUICE, GR_WATER};

    public static void main (String [] args) {
        GroceryItem userItem;
        userItem = GroceryItem.GR_APPLES;
        
        if (userItem.equals(GroceryItem.GR_JUICE) || userItem.equals(GroceryItem.GR_WATER)) {
            System.out.println("Drink");
        } else {
            System.out.println("Fruit");
        }
    }
}