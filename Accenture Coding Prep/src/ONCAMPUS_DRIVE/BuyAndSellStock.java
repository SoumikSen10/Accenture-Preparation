package ONCAMPUS_DRIVE;

/*

You are given an integer array prices where prices[i] is the price of a given stock on the i-th day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it and then immediately sell it on the same day.

Task: Find and return the maximum profit you can achieve.

Example:

Input:
prices = [7, 1, 5, 3, 6, 4]

Output: 7

Explanation:
Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5 - 1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6 - 3 = 3.
Total profit = 4 + 3 = 7.

Approach:
Traverse through the list of prices and calculate the profit whenever the current day's price is higher than the previous day's price.
Accumulate the profits from these upward trends.

*/

import java.util.Scanner;

public class BuyAndSellStock
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int n = in.nextInt();

         int prices[] = new int[n];

         for(int i=0;i<n;i++)
             prices[i]=in.nextInt();

         int profit = 0, maxProfit = Integer.MIN_VALUE, minPrice = prices[0];

         for(int i=0;i<n;i++)
         {
             profit=prices[i]-minPrice;

             maxProfit = Math.max(maxProfit,profit);

             minPrice = Math.min(minPrice,prices[i]);

         }

        System.out.println(maxProfit);

    }
}
