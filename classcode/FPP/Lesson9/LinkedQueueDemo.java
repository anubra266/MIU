package classcode.FPP.Lesson9;

public class LinkedQueueDemo {
    public static void main(String[] args) {
        LinkedQueue q = new LinkedQueue();
        q.display();
        q.enqueue('A');
        q.enqueue('B');
        q.enqueue('C');
        q.enqueue('D');
        q.display();
    }
}
