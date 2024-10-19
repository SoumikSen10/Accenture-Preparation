package Practice;

import java.util.Scanner;

public class DonateToys
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of toys Akshay had :");
        int n = in.nextInt();
        System.out.print("Enter number of toys donated :");
        int d = in.nextInt();
        System.out.println("Number of remaining toys :"+(n-d));
    }
}
