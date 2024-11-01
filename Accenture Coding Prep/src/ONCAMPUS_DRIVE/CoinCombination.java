package ONCAMPUS_DRIVE;

/*

You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.

Example:

Input:
coins = [1, 2, 5]
amount = 11

Output:
3

Explanation: The minimum number of coins to make 11 is 3 (5 + 5 + 1).

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CoinCombination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int coins[] = new int[n];

        for (int i = 0; i < n; i++)
            coins[i] = in.nextInt();

        int amount = in.nextInt();

//        int count = findCombination(coins,0,amount);
//        if(count==Integer.MAX_VALUE-1)
//            System.out.println(-1);
//        else
//            System.out.println(count);

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1); // Use -1 to indicate an uncomputed state

        int count = findCombination( coins, 0,amount,dp);
        if (count == Integer.MAX_VALUE - 1)
            System.out.println(-1);
        System.out.println(count);

    }

    //using dp

    private static int findCombination(int[] coins, int index, int amount, int[] dp) {
        // Base case: if amount is zero, no coins are needed
        if (amount == 0) {
            return 0;
        }

        // If amount becomes negative or index exceeds the length of the coins array, return a large value to indicate an invalid state
        if (amount < 0 || index >= coins.length) {
            return Integer.MAX_VALUE - 1;
        }

        // Check the dp table for a previously computed result for this amount
        if (dp[amount] != -1) {
            return dp[amount];
        }

        // Try picking the current coin and explore further
        int pick = Integer.MAX_VALUE - 1;
        if (coins[index] <= amount) {
            pick = 1 + findCombination(coins, index, amount - coins[index], dp);
        }

        // Try not picking the current coin and move to the next coin
        int notPick = findCombination(coins, index + 1, amount, dp);

        // Take the minimum of the two choices
        int result = Math.min(pick, notPick);

        // Store the result in the dp table and return it
        dp[amount] = result;
        return result;
    }

    private static int practice(int[] coins,int amount)
    {
       int minCoins = Integer.MAX_VALUE;

       for(int i=coins.length-1;i>=0;i--)
       {
           int currAmt = amount;
           int coinCount=0;

           for(int j=i;j>=0;j--)
           {
               while(currAmt>=coins[j])
               {
                   currAmt-=coins[j];
                   coinCount++;
               }
           }

           if(currAmt==0)
               minCoins = Math.min(minCoins,coinCount);
       }

       return minCoins == Integer.MAX_VALUE ? -1 : minCoins;

    }


}

/*

Key Points
Base Case:

If the amount == 0, it means no more coins are needed, so return 0.
If cur (the index of the current coin) exceeds the size of the coin array, return Integer.MAX_VALUE - 1 (a very large number) to represent an invalid solution.
Memoization:

The result of each subproblem is stored in the dp table to avoid recalculating it.
Recursive Cases:

Pick: If the current coin can be used (i.e., coin[cur] <= amount), reduce the amount and add 1 to represent using that coin.
Not pick: Skip to the next coin and check if it can be used to make up the amount.
The final result is the minimum of these two choices.

2D List (Memoization Table):

This table dp stores the result of each subproblem. If we have already computed the result for a specific combination of cur (coin index) and amount, we use the stored result instead of recalculating.

Example Walkthrough
Given:

Coins = [1, 2, 5]
Amount = 11
Step-by-Step:

Start with cur = 0 (coin 1) and amount = 11.
Try to pick coin 1: call findLowestCoins(1, 11 - 1 = 10) recursively.
Continue picking coin 1 until amount == 0 (pick 11 coins of 1).
Try skipping coin 1 and moving to the next coin (2).
Check for every coin combination and store results in the dp table.
The result is 3 because you can use 5 + 5 + 1 to make 11 with only 3 coins.

*/

    //using backtracking

//    private static int findCombination(int[] coins,int index, int amount)
//    {
//         if(index>=coins.length)
//             return Integer.MAX_VALUE-1;
//
//         if(amount==0)
//             return 0;
//
//         int pick = Integer.MAX_VALUE-1, notpick = Integer.MAX_VALUE-1;
//
//         if(coins[index]<=amount)
//         {
//             pick = 1 + findCombination(coins,index,amount-coins[index]);
//         }
//
//         notpick = findCombination(coins,index+1,amount);
//
//         return Math.min(pick,notpick);
//
//    }







