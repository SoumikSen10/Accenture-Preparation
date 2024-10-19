package ONCAMPUS_DRIVE;

/*

Count the Number of Days with Negative Stock Market Growth

You are working on a financial analysis tool that represents daily stock prices of a company over time. Each element in an integer array A of size N represents the closing price of the stock for that particular day. Your task is to find and return an integer value representing the total number of days where the stock market price decreased, indicating negative growth.

Input:
N: Integer representing the number of days.
A[]: Array representing the stock prices for N days.

Output:
An integer representing the total number of days where the stock price decreased compared to the previous day.

Examples:

Input:
N = 6
A[] = {2, 3, 1, 4, 5, 2}

Output:
2

Explanation: The stock price decreased on day 3 and day 6.

Input:

N = 1
A[] = {6}
Output:

0

*/

import java.util.Scanner;

public class FinanceTool
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        int count = countDaysNeg(arr,n);
        System.out.println(count);
    }

    private static int countDaysNeg(int[] arr,int n)
    {
        if(n<=1)
            return 0;

        int count=0;

        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
                count++;
        }
        return count;
    }
}
