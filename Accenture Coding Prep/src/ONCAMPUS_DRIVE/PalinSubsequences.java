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


public class PalinSubsequences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int n = str.length();

        // Create the DP table initialized to -1 for memoization
        int[][] dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = countPalindromicSubsequences(str, 0, n - 1, dp);
        System.out.println(ans);
    }

    private static int countPalindromicSubsequences(String str, int i, int j, int[][] dp) {
        // Base cases
        if (i > j) return 0; // If the starting index is greater than the ending index, no subsequences exist
        if (i == j) return 1; // A single character is a palindromic subsequence

        // Check if the result is already computed
        if (dp[i][j] != -1) return dp[i][j];

        // Pick - Not Pick Logic
        if (str.charAt(i) == str.charAt(j)) {
            // If characters match, count palindromic subsequences by picking both ends and all in-between combinations
            int pickBoth = 1 + countPalindromicSubsequences(str, i + 1, j, dp)
                    + countPalindromicSubsequences(str, i, j - 1, dp);

            // Save the result in the DP table
            dp[i][j] = pickBoth;
        } else {
            // If characters do not match, we count subsequences without picking one or the other end
            int notPick = countPalindromicSubsequences(str, i + 1, j, dp)
                    + countPalindromicSubsequences(str, i, j - 1, dp)
                    - countPalindromicSubsequences(str, i + 1, j - 1, dp);

            // Save the result in the DP table
            dp[i][j] = notPick;
        }

        return dp[i][j];
    }
}

