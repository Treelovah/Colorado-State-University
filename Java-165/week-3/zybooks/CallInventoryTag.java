// ===== end =====

// ===== Code from file CallInventoryTag.java =====
import java.util.Scanner;

public class CallInventoryTag {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        InventoryTag redSweater = new InventoryTag();
        int sweaterShipment;
        int sweaterInventoryBefore;

        sweaterInventoryBefore = redSweater.getQuantityRemaining();
        sweaterShipment = scnr.nextInt();

        System.out.println("Beginning tests.");

        // FIXME add unit test for addInventory

        /* Your solution goes here */
        redSweater.addInventory(sweaterShipment);
        if (sweaterShipment < 10) System.out.println("   UNIT TEST FAILED: addInventory()");

        System.out.println("Tests complete.");
    }
}
// ===== end =====