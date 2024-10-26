package ONCAMPUS_DRIVE;

/*

You are given a special Fibonacci sequence defined by the following recurrence relation:

f(N)=f(N-1)xf(N-1)+f(N-2)xf(N-2)

f(0)=1
f(1)=1

Input Format:

The first and only line contains a single integer N (where N >= 0).

Output Format:

Print the Nth term of the special Fibonacci sequence modulo 47.

Example:

Example 1:
Input:
2

Output:
2

Example 2:
Input:
5

Output:
20

Sequence Example:

For N = 0, 1, 2, 3, 4, 5:

f(0) = 1
f(1) = 1
f(2) = 2
f(3) = 5
f(4) = 29
f(5) = 20

*/

import java.util.Scanner;

public class SpecialFibonacci
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(specialFibo(n)%47);
    }

    private static int specialFibo(int n)
    {
        if(n<=1)
            return n;

        int prev2=1,prev1=1;
        int curr=0;
        for(int i=2;i<=n;i++)
        {
            curr = prev2*prev2+prev1*prev1;
            prev2=prev1;
            prev1=curr;
        }

        return prev1;

    }
}
