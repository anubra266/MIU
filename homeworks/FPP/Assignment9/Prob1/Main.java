package homeworks.FPP.Assignment9.Prob1;

public class Main {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.display();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.dequeue();
        q.enqueue(5);
        q.enqueue(6);
        q.dequeue();
        q.enqueue(7);
        q.display();
    }
}
