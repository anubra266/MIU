package homeworks.FPP.Assignment9.Prob2;

public class StackLinkedList {
    class Node {
        Object val;
        Node next;

        Node(Object x) {
            val = x;
        }

        @Override
        public String toString() {
            return "Stack Item: " + val;
        }
    }

    Node front;
    int count = 0;

    public void push(Object item) {
        Node toAdd = new Node(item);
        if (isEmpty()) {
            front = toAdd;
        } else {
            toAdd.next = front;
            front = toAdd;
        }
        count++;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        Node item = front;
        front = front.next;
        count--;
        return item;
    }

    public Object peek() {
        return front;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return count;
    }

    public static void main(String[] args) {
        StackLinkedList stk = new StackLinkedList();
        stk.push(20.00);
        stk.push("Hello World!");
        stk.push('C');
        stk.push(1);
        stk.pop();
        stk.pop();
        System.out.println("size(): " + stk.size());
        System.out.println("Top item: " + stk.peek());
    }
}
