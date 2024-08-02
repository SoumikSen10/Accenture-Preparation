import java.util.Scanner;

//has all operations of binary tree
public class BinaryTree
{
    public BinaryTree()
    {

    }

    class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data=data;
        }
    }

    Node root;
    Scanner in = new Scanner(System.in);
    public void populate()
    {
        System.out.println("Enter the node value: ");
        int data=in.nextInt();
        root=new Node(data);
        populate(root);
    }

    private void populate(Node node)
    {
        System.out.println("Do you want to enter left of "+node.data);
        boolean left=in.nextBoolean();
        if(left)
        {
            System.out.println("Enter the value of left of "+node.data);
            int data =in.nextInt();
            node.left=new Node(data);
            populate(node.left);
        }

        System.out.println("Do you want to enter right of "+node.data);
        boolean right = in.nextBoolean();
        if(right)
        {
            System.out.println("Enter the value of right of "+node.data);
            int data=in.nextInt();
            node.right=new Node(data);
            populate(node.right);
        }
    }

    public void preOrder()
    {
        preOrder(root);
    }

    private void preOrder(Node node)
    {
        if(node==null)
            return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder()
    {
        postOrder(root);
    }

    private void postOrder(Node node)
    {
        if(node==null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }

    public void inOrder()
    {
        inOrder(root);
    }

    private void inOrder(Node node)
    {
        if(node==null)
            return;
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        System.out.println("Displaying preorder");
        tree.preOrder();
        System.out.println(" ");
        System.out.println("Displaying inorder");
        tree.inOrder();
        System.out.println(" ");
        System.out.println("Displaying postorder");
        tree.postOrder();
    }
}
