import java.util.Scanner;
import java.util.LinkedList;

/*
Given a ListItem class, complete main() using the built-in LinkedList type to create a linked list called shoppingList. 

The program should read items from input (ending with -1), adding each item to shoppingList, 

and output each item in shoppingList using the printNodeData() method.

Ex. If the input is: 
''' 
    milk
    bread
    eggs
    waffles
    cereal
    -1
'''
The output is:
'''
    milk
    bread
    eggs
    waffles
    cereal
'''
*/
public class ShoppingList 
{
    public static void main(String[] args) 
    {
        Scanner scnr = new Scanner(System.in);

        LinkedList<ListItem> shoppingList = new LinkedList<>();

        String item;
        
        item = scnr.nextLine();

        while (!item.equals("-1"))
        {
            ListItem ummm_this_could_have_been_written_way_better = new ListItem(item);
            shoppingList.add(ummm_this_could_have_been_written_way_better);
            item = scnr.nextLine();
        }
        for (ListItem itm : shoppingList) itm.printNodeData();

        /*
         * TODO: Declare a LinkedList called shoppingList of type ListItem
         * TODO: 1. Create variable for input; 
         * TODO: 2. while loop check for -1 on input, break;
         * TODO: 3. Scan inputs (items) and add them to the shoppingList LinkedList Read
         * TODO: Print the shoppingList LinkedList using the printNodeData() method
         */
        scnr.close();
    }
}
