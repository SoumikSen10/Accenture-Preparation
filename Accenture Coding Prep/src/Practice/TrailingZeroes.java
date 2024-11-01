package Practice;

/*

Count Trailing Zeroes in Factorial

Given an integer N, your task is to find the number of trailing zeroes in the factorial of N.

A trailing zero is a zero that appears at the end of a number. For example, 1000 has three trailing zeroes.

Input: An integer N such that 1 ≤ N ≤ 10^9.

Output: An integer representing the number of trailing zeroes in the factorial of N.

Example 1:
Input:
N = 5

Output:
1

Explanation: 5! (5 factorial) = 120, which has one trailing zero.

Example 2:
Input:
N = 20

Output:
4

*/

import java.util.Scanner;

public class TrailingZeroes
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int x = findZeroes(N);
        System.out.println(x);
    }

    private static int findZeroes(int n)
    {
        int c = 0;
        while(n>0)
        {
            c=c+(n/5);
            n=n/5;
        }
        return c;
    }
}
