package Practice;

import java.util.Scanner;

public class SumRecursion
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int x = sumRecur(n);
        System.out.println("Result is: "+x);
    }

    private static int sumRecur(int n)
    {
        if(n==0)
            return n;
        return n+sumRecur(n-1);
    }
}
