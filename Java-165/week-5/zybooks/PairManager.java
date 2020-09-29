public class PairManager {
    public static void main(String[] args) {
        Pair<Integer> twoInts = new Pair<Integer>(43, 22);
        Pair<Double> twoDbls = new Pair<Double>(10.9, 4.4);
        Pair<Character> twoChars = new Pair<Character>('p', 's');

        System.out.println(twoInts.chooseItem());
        System.out.println(twoDbls.chooseItem());
        System.out.println(twoChars.chooseItem());
    }
}