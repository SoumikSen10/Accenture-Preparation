import java.util.Scanner;

public class SumDivisors
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n = in.nextInt();
        int x = sumDivi(n);
        System.out.println("Computed value is: "+x);
    }
    private static int sumDivi(int n)
    {
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }
}
