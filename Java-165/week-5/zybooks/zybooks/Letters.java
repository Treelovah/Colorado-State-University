
public class Letters {
    public static void main(String[] args) {
        LinkedList<Character> letters = new LinkedList<Character>();
        Character letter;
        int i;

        letters.add('b');
        letters.add('c');
        letters.add('d');
        letters.add('e');

        letters.add(1, 'f');
        letters.set(3, 'g');
        letters.remove(2);

        for (i = 0; i < letters.size(); ++i) {
            letter = letters.get(i);
            System.out.print(letter);
        }
        System.out.println();
    }
}