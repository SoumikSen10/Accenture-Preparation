package Practice;

import java.util.Scanner;

public class FibonacciTerm
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the term: ");
        int t = in.nextInt();
        System.out.println("The "+t+"th term of series is: "+findfibo(t));
    }

    private static int findfibo(int t)
    {
        if(t<=1)
            return t;
        return findfibo(t-1)+findfibo(t-2);
    }
}
