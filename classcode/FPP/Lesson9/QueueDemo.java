package classcode.FPP.Lesson9;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(42);
        q.add(-3);
        q.add(18);

        System.out.println(q.remove());

    }
}
