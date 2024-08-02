public class LinkedList {
    private Node head;
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

    public boolean findCycle()
    {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
}

