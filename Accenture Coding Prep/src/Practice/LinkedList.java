package Practice;

import java.util.Scanner;

public class LinkedList {
    public Node head;
    private Node tail;
    private int length;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public LinkedList(int data) {
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;  // Update the tail reference
        }
        length++;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public Node findMiddle() {
        if (isEmpty()) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean findCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Length of linked list: ");
        int n = in.nextInt();
        System.out.println("Enter linked list elements: ");
        int a = in.nextInt();
        LinkedList list = new LinkedList(a);
        for (int i = 1; i < n; i++) {
            a = in.nextInt();
            list.append(a);
        }

        System.out.println("Linked list elements are: ");
        display(list.head);

        Node head1 = addAlternateNodes(list.head);

        System.out.println("Modified linked list with alternate node sum:");
        display(head1);
    }

    public static Node addAlternateNodes(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        int a = head.data;
        int b = head.next.data;
        Node temp = head.next.next;

        while (temp != null) {
            int c = temp.data;
            temp.data = temp.data + a;  // Update current node's value
            a = b;  // Move a to b
            b = c;  // Move b to current node's original value
            temp = temp.next;  // Move to the next node
        }

        return head;
    }


    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
