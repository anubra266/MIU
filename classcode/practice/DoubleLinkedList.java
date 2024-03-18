package classcode.practice;

import classcode.FPP.Lesson8.MyLinkedList;

public class DoubleLinkedList {
    int numOfElements;
    Node head;
    Node tail;

    class Node {
        int val;
        Node pred;
        Node next;

        Node(int x) {
            val = x;
        }
    }

    DoubleLinkedList() {
        numOfElements = 0;
        head = new Node(0);
        tail = new Node(0);
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(numOfElements, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0)
            index = 0;

        Node pred, succ;
        if (index < numOfElements - index) {
            pred = head;
            for (int i = 0; i < index; ++i) {
                pred = pred.next;
            }
            succ = pred.next;

        } else {
            succ = tail;
            for (int i = 0; i < numOfElements - index; ++i) {
                succ = succ.pred;
            }
            pred = succ.pred;
        }

        Node toAdd = new Node(val);
        toAdd.pred = pred;
        toAdd.next = succ;
        pred.next = toAdd;
        succ.pred = toAdd;
        numOfElements++;

    }

    public void deleteAtIndex(int index) {
        Node pred = head;
        for (int i = 0; i < index; ++i) {
            pred = pred.next;
        }
        Node succ = pred.next.next;
        succ.pred = pred;
        pred.next = succ;
        numOfElements--;
    }

    public int get(int index) {
        Node curr = head;
        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
        l.addAtHead(800);
        l.addAtHead(300);
        l.addAtHead(900);
        // l.addAtIndex(1, 200);

        System.out.println(l.get(1));
        // l.deleteAtIndex(2);
        // l.deleteAtIndex(1);
    }
}
