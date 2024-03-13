package classcode.FPP.Lesson9;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(42);
        s.push(-3);
        s.push(17);
        System.out.println(s.pop());
    }
}
