import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArraySorter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 5;
        ArrayList<String> userElements = new ArrayList<String>();
        int i;

        for (i = 0; i < NUM_ELEMENTS; ++i) {
            userElements.add(scnr.nextLine());
        }

        Collections.sort(userElements);

        for (i = 0; i < NUM_ELEMENTS; ++i) {
            System.out.println(userElements.get(i));
        }
    }
}