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
import java.util.List;
import java.util.Scanner;

public class LeastPerfectSquares
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int ans = solve(n,1);

        List<List<Integer>> dp = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <=(int)Math.sqrt(n); j++) {
                row.add(-1); // Initialize with -1
            }
            dp.add(row);
        }

        int ans = solve(dp,n,1);

        System.out.println(ans);
    }

    //using DP
    private static int solve(List<List<Integer>> dp,int n,int x)
    {
        if(n==0)
            return 0;

        if(x*x>n)
            return Integer.MAX_VALUE-1;

        if(dp.get(n).get(x)!=-1)
            return dp.get(n).get(x);

        int pick = 1 + solve(dp,n-(x*x),x);
        int notpick = solve(dp,n,x+1);

       int result =  Math.min(pick,notpick);
        dp.get(n).set(x, result);

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

}
