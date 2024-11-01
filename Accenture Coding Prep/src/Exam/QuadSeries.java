package Exam;
import java.util.Scanner;

public class QuadSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: the term to find in the series
        System.out.println("Enter the term number (n):");
        int n = scanner.nextInt();

        // Get the nth term in the series
//        long result = findNthTerm(n);
//        System.out.println("The " + n + "th term in the series is: " + result);

        int ans = find(n);
        System.out.println(ans);
    }

    private static int find(int n)
    {
        if(n<=4)
            return n;

        int prev4=1,prev3=2,prev2=3,prev1=4,curr=0;
        for(int i=5;i<=n;i++)
        {
            curr = prev4+prev3+prev2+prev1;
            prev4=prev3;
            prev3=prev2;
            prev2=prev1;
            prev1=curr;
        }

        return prev1;
    }

    // Method to find the nth term of the series using DP
    public static long findNthTerm(int n) {
        // Handle base cases
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 3;
        if (n == 4) return 4;

        // Create a DP array to store the series values
        long[] dp = new long[n + 1];

        // Initialize the first four terms
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        dp[4] = 4;

        // Fill the DP array using the given relation
        for (int i = 5; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3] + dp[i - 4];
        }

        return dp[n]; // Return the nth term
    }
}
