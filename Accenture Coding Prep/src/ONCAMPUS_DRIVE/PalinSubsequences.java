package ONCAMPUS_DRIVE;

/*

Count All Palindromic Subsequences in a Given String.

Example:

Input:
str = "abcd"

Output:
4 (each character itself is a palindromic subsequence: "a", "b", "c", "d")

*/

import java.util.Arrays;
import java.util.Scanner;

public class PalinSubsequences
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int n =str.length();
        int ans = 0;
//        ans = findSubsequences(str,0,str.length()-1);
//        System.out.println(ans);
        // Initialize the DP table with -1
        int[][] dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        ans=findSubsequences(str,0,str.length()-1,dp);
        System.out.println(ans);
    }

//    private static int findSubsequences(String str,int i,int j)
//    {
//        if(i>j)
//            return 0;
//
//        if(i==j)
//            return 1;
//
//        if(str.charAt(i)==str.charAt(j))
//        {
//            return 1 + findSubsequences(str,i+1,j) + findSubsequences(str,i,j-1);
//        }
//        else
//        {
//            return findSubsequences(str,i+1,j) + findSubsequences(str,i,j-1) - findSubsequences(str,i+1,j-1);
//        }
//
//    }

    // using dp
    private static int findSubsequences(String str,int i,int j,int[][] dp)
    {
        if(i>j)
            return 0;

        if(i==j)
            return 1;

        if(dp[i][j]!=-1)
            return dp[i][j];

        if(str.charAt(i)==str.charAt(j))
        {
             return dp[i][j] = 1 + findSubsequences(str,i+1,j,dp) + findSubsequences(str,i,j-1,dp);
        }
        else {
             return dp[i][j] = findSubsequences(str, i + 1, j, dp) + findSubsequences(str, i, j - 1, dp) - findSubsequences(str, i + 1, j - 1, dp);
        }
    }

}
