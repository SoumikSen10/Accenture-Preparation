package ONCAMPUS_DRIVE;

/*

Find the Sum of All Prime Numbers up to N
You are given an integer N. Your task is to find the sum of all prime numbers up to N.

Input:
An integer N (the upper limit).

Output:
The sum of all prime numbers less than or equal to N.

Example:

Input:
N = 8
Prime numbers up to 8:
(2, 3, 5, 7)

Output:
17

*/

import java.util.Scanner;

public class SumPrimeRange
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        for(int i=2;i<n;i++)
        {
            if(prime(i))
                sum+=i;
        }
        System.out.println(sum);
    }

    private static boolean prime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;

    }
}
