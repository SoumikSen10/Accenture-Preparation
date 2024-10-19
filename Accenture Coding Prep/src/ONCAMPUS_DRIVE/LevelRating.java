package ONCAMPUS_DRIVE;

/*

You are given an integer N, and your task is to find the Nth Fibonacci number. The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, starting from 0 and 1. The series looks like this: 0, 1, 1, 2, 3, 5, 8, 13, ...

Input:
An integer N representing the position in the Fibonacci series.

Output:
Return the Fibonacci number at the Nth position.

Examples:

Example 1:

Input: N = 1
Output: 1

Example 2:

Input: N = 0
Output: 0

Example 3:

Input: N = 4
Output: 3

Solution Approaches:

Recursive Approach: Time Complexity: O(2^N), Space Complexity: O(N)

Bottom-Up Approach (Dynamic Programming): Time Complexity: O(N), Space Complexity: O(N)

Optimized Bottom-Up Approach: Time Complexity: O(N), Space Complexity: O(1)

Matrix Exponentiation: Time Complexity: O(logN), Space Complexity: O(logN)

*/

import java.util.Scanner;

public class LevelRating
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fibo(n));
    }

    private static int fibo(int n)
    {
        if(n==0)
            return 0;

        int prev2=0,prev1=1;

        for(int i=2;i<=n;i++)
        {
            int curr = prev2+prev1;
            prev2=prev1;
            prev1=curr;
        }

        return prev1;

    }

}
