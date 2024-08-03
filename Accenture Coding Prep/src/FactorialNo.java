import java.util.Scanner;

public class FactorialNo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Factorial of no is : "+fact(n));
    }
    private static int fact(int n)
    {
        if(n==1)
            return 1;
        return n*fact(n-1);
    }
}
