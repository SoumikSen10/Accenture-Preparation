package ONCAMPUS_DRIVE;

/*

Write a program to calculate the sum of "SuperLCM" for all values of i from 1 to n. The formula for SuperLCM is defined as:

For each i from 1 to n:

SuperLCM(i)=i^i×LCM(i,n)
Where LCM(a, b) is the least common multiple of a and b.

The output should be the sum of all SuperLCM values from 1 to n.

Input:
An integer n (1 ≤ n ≤ 10)

Output:
The sum of SuperLCM values for all i from 1 to n.

Example:

Input:
6

Output:
612

Explanation:

Sum = 6+96+162+192+150+6=612

Thus, the output is 612.

*/

import java.util.Scanner;

public class SuperLCM
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;

        for(int i=1;i<=n;i++)
        {
            sum+=superLcm(i,n);
        }

        System.out.println(sum);
    }

    private static int superLcm(int i,int n)
    {
        return (int)Math.pow(i,(n-i)) * lcm(i,n);
    }

    private static int lcm(int a,int b)
    {
        return (a*b)/gcd(a,b);
    }

    private static int gcd(int a,int b)
    {
        if(b==0)
            return a;

        return gcd(b,a%b);
    }
}
