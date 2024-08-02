import java.util.Scanner;

class FindMiddleLL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the linked list: ");
        int n = in.nextInt();
        System.out.print("Enter the first element: ");
        int el = in.nextInt();

        LinkedList myList = new LinkedList(el);
        for (int i = 1; i < n; i++) {
            System.out.print("Enter the element: ");
            el = in.nextInt();
            myList.append(el);
        }

        LinkedList.Node middleElement = myList.findMiddle();
        if (middleElement != null) {
            System.out.println("The middle element is: " + middleElement.data);
        } else {
            System.out.println("The linked list is empty.");
        }
    }
}
