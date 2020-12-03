import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Quiz {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(9);

        q.offer(3);

        int a = (Integer) q.poll();

        q.offer(4);

        int b = (Integer) q.poll();

        q.offer(2);

        q.offer(7);

        int c = (Integer) q.poll();

        LinkedList l = new LinkedList();
        l.add(2);
        l.add(1, 2);
        l.add(0, 4);
        l.add(2, 10);
        l.add(3, 20);
        l.add(2, 30);
        l.add(3, 40);
        List l1 = new Queue();

    }

}
