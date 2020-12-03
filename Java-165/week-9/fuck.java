import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class fuck {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Stack");
        list.add(1, "Queue");
        list.add("Queue");
        list.add("LinkedList");
        list.add(2, "ArrayList");
        list.remove("Queue");
        list.remove(3);

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= 4; i++)
            stack.push(i * 12);
        stack.peek();
        stack.push(60);
        stack.pop();
        stack.push(72);
        stack.pop();
        stack.peek();

        Queue<Character> queue = new LinkedList<Character>();
        for (char c = 'A'; c <= 'G'; c++)
            queue.offer(c);
        queue.poll();
        queue.add('H');
        queue.remove();
        queue.add('I');
        System.out.println(queue);
    }
}
