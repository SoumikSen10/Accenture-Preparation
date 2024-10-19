package ONCAMPUS_DRIVE;

/*

Prime Number Checking and Finding Primes up to a Given Number

1. Check whether a number is prime or not.
2. Find all prime numbers up to N (given).

Prime Number Definition: A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.


i) Check whether a number is prime or not.

ii) Find all prime numbers up to N.

*/

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNo
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // using Sieve of Eratosthenes
        boolean isPrime[]=new boolean[n+1];
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

        for(int i=2;i<=n;i++)
        {
            if(isPrime[i])
                System.out.println(i);
        }

    }


}
