package Practice;

import java.util.Scanner;

public class BestTimeStock
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n =in.nextInt();
        int prices[]=new int[n];
        System.out.println("Enter the stock prices in serial order for each day: ");
        for(int i=0;i<n;i++)
        {
            prices[i]=in.nextInt();
        }

        int profit = calcProfit(prices,n);
        System.out.println("Profit is: "+profit);
    }

    private static int calcProfit(int[] prices,int n)
    {
        int minPrice=Integer.MAX_VALUE,maxProfit=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            minPrice=Math.min(minPrice,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-minPrice);
        }
        return maxProfit;
    }
}
