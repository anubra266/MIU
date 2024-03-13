package classcode.practice;

public class ArrayStack {

    private Object[] a;
    // private Object a[]; //* Also works

    private int top;

    ArrayStack(int n) {
        a = new Object[n];
        top = -1;
    }

    public void push(Object item) {
        if (top == a.length - 1) {
            System.out.println("Stack is full");
            return;
        }
        a[++top] = item;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        return a[top--];
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return a[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        ArrayStack stk = new ArrayStack(4);
        stk.push('A');
        stk.push('B');
        stk.push('C');
        stk.push('D');
        System.out.println("size(): " + stk.size());
        stk.pop();
        stk.pop();
        System.out.println("Top item: " + stk.peek());
    }
}
