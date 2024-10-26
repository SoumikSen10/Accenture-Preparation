package ONCAMPUS_DRIVE;

/*

Problem Statement:
You are given a number N. If N is odd, then print the product of the digits of the number N. Otherwise, print the sum of the digits of the number N.

Input Format:
The input consists of a single integer N.

Output Format:
If N is odd, print the product of its digits.
If N is even, print the sum of its digits.

Example:

Example 1:

Input:
12

Output:
3

Example 2:

Input:
16

Output:
7

*/

import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        if(N%2!=0)
            System.out.println(product(N));
        else
            System.out.println(sum(N));

    }

    private static int product(int n)
    {
        int p=1;
        while(n!=0)
        {
            int d=n%10;
            p=p*d;
            n=n/10;
        }
        return p;
    }

    private static int sum(int n)
    {
        int s=0;
        while(n!=0)
        {
            int d=n%10;
            s=s+d;
            n=n/10;
        }
        return s;
    }

}
