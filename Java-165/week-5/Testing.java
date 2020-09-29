import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("C");

        arr.add(0,"O");
        
        arr.add(2,"L");
        
        arr.remove(0);
        
        arr.add(1,"O");
        
        arr.add(1,"R");
        
        arr.remove(1);
        
        arr.add(3,"A");
        
        arr.set(2, "D");
        
        arr.set(2, "O");
        
        arr.remove(0); 

        System.out.println(arr.indexOf("C") + arr.indexOf("O"));
    }
}
