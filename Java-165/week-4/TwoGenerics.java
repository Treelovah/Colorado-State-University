public class TwoGenerics <T, K>{
    T al;
    K sl;
    public TwoGenerics (T al, K sl) {
        this.al = al;
        this.sl = sl;
    }

    public void printer (T a, K b){
        System.out.println(a + " " + b);
    }

    public static void main (String[] args) {
        TwoGenerics<Integer, Double> t = new TwoGenerics<>(new Integer(4), new Double(5.0));
        TwoGenerics<Character, Boolean> t2 = new TwoGenerics<>(new Character ('a'), new Boolean (true));

        t.printer(t.al, t.sl);
        t2.printer(t2.al, t2.sl);
    }
}
