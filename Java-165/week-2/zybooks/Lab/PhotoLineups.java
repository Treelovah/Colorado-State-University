import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {

    // TODO: Write method to create and output all permutations of the list of
    // names.
    public static void allPermutations(ArrayList<String> nameList, ArrayList<String> permList) {
        ArrayList<String> tmpList;
        String tmpRemove;
        int i;
        if (permList.size() == 0)
        {
            for (String str : nameList) System.out.printf("%s ",str);
            System.out.println();
        }
        else 
        {
            for (i = 0; i < permList.size(); i++)
            {
                tmpList = new ArrayList<String>(permList); // copy made
                tmpRemove = tmpList.remove(i);
                nameList.add(tmpRemove);
                allPermutations(nameList, tmpList);
                nameList.remove(nameList.size() - 1);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<String> permList = new ArrayList<String>();
        String name;

        // TODO: Read in a list of names; stop when -1 is read. Then call recursive
        // method.
        do {
            name = scnr.next();
            if (name.equals("-1")) break;
            else permList.add(name);
        } while (!name.equals("-1"));
        allPermutations(nameList, permList);
    }
}
