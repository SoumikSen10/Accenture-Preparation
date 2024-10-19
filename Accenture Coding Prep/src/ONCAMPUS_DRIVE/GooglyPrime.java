package ONCAMPUS_DRIVE;

/*

A googly prime number is defined as a number derived from the sum of its individual digits.

For example, if N = 43, the sum of its individual digits is 4 + 3 = 7, which is a prime number, making it a googly prime number.

Your task is to find whether the current number is a googly prime number or not.

Examples:

Input: 43
Output: YES

Input: 123
Output: NO

Input: 92
Output: YES

*/

import java.util.Scanner;

public class GooglyPrime
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sum=0;
        while(n!=0)
        {
            int d=n%10;
            sum+=d;
            n=n/10;
        }

        if(prime(sum))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static boolean prime(int n)
    {
        if(n<2)
            return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

}
