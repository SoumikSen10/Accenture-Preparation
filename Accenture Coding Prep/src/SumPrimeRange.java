import java.util.Scanner;
import java.util.Arrays;
public class SumPrimeRange
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter range n: ");
        int n = in.nextInt();
        System.out.println("Sum of all primes less than n are: "+primeSum(n));
    }

    private static int primeSum(int n)
    {
            if(n<=1)
                return 0;

            boolean isPrime[] = new boolean[n+1];
            Arrays.fill(isPrime,true);

            for(int i=2;i*i<=n;i++)
            {
                if(isPrime[i])
                {
                    for(int j=i*i;j<=n;j+=i)
                    {
                        isPrime[j]=false;
                    }
                }
            }

            int sum = 0;
            for(int i=2;i<=n;i++)
            {
                if(isPrime[i])
                    sum+=i;
            }

            return sum;

    }

}
