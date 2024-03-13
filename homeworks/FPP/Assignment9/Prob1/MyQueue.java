package homeworks.FPP.Assignment9.Prob1;

public class MyQueue {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if (isEmpty()) {
            System.out.println("“Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void enqueue(int obj) {
        if (isEmpty()) {
            front++;
        }
        if (arr.length == size())
            resize();
        arr[isEmpty() ? rear : rear++] = obj;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("“Queue is Empty");
            return -1;
        }

        int[] temp = new int[arr.length];
        int item = arr[rear];
        System.arraycopy(arr, 1, temp, 0, rear--);
        if (rear == 0)
            --front;

        arr = temp;
        return item;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int size() {
        return rear + 1;
    }

    private void resize() {
        int newLen = arr.length * 2;
        int[] temp = new int[newLen];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }

    public void display() {
        if (isEmpty())
            System.out.println("Queue is empty.");
        for (int i = 0; i < rear; ++i) {
            System.out.println(i + ": " + arr[i]);
        }
    }

}
