package ONCAMPUS_DRIVE;

/*

Given an integer n, return the least number of perfect square numbers that sum to n.

Definition of Perfect Square:
A perfect square is an integer that is the square of another integer. For example, 1, 4, 9, and 16 are perfect squares, while 3 and 11 are not.

Example:

Input:
n=12

Output: 3

Explanation: The sum can be achieved using three perfect squares:
4+4+4.

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeastPerfectSquares
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int ans = solve(n,1);

        int dp[] = new int[n+1];

        Arrays.fill(dp,-1);
        int ans = solve(dp,n,1);

        System.out.println(ans);
    }



    //using DP
    private static int solve(int[] dp,int n,int x)
    {
        if(n==0)
            return 0;

        if(x*x>n)
            return Integer.MAX_VALUE-1;

        if(dp[n]!=-1)
            return dp[n];

        // Pick the current square number (x * x) and reduce n by this value
        int pick = Integer.MAX_VALUE;
        if (n >= x * x) {
            pick = 1 + solve(dp, n - x * x, x); // Pick this square and count it
        }

        // Not pick the current square and move to the next square
        int notPick = solve(dp, n, x + 1);

       int result =  Math.min(pick,notPick);
        dp[n]=result;

       return result;
    }


    //using backtracking
//    private static int solve(int n,int x)
//    {
//        if(n==0)
//            return 0;
//
//        if(x*x>n)
//            return Integer.MAX_VALUE-1;
//
//        int pick = 1 + solve(n-(x*x),x);
//        int notpick = solve(n,x+1);
//
//       return Math.min(pick,notpick);
//    }

    private static int practice(int n,int k)
    {
       if(n==0)
           return 0;

       if(k*k>n)
           return Integer.MAX_VALUE-1;

       int pick = 1+practice(n-(k*k),k);
       int notpick = practice(n,k+1);

       return Math.min(pick,notpick);

    }

}
