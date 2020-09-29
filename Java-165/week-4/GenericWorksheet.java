/**
 * GenericWorksheet
 */
import java.util.ArrayList;
import java.lang.Number;

public class GenericWorksheet {
    public static void main (String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(new Integer(4));
        System.out.println(max(al));

    }

    public static double max (ArrayList<? extends Number> as) {
        double max = as.get(0).doubleValue();
        return max;
    }
    
}