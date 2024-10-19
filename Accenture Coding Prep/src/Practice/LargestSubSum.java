package Practice;/*

Question:
Given an array of integers, find the contiguous subarray (contains at least one number) which has the largest sum and return that sum.

Input:
A list of integers `nums` (1 ≤ len(nums) ≤ 10^5) representing an array of numbers.

Output:
Return an integer, the maximum sum of any contiguous subarray in the given array.

Example:
`-2 1 -3 4 -1 2 1 -5 4`

Output:
`6`

*/

import java.util.Scanner;

public class LargestSubSum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array :");
        int n = in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements :");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        int output=calc(arr,n);
        System.out.println("Output is :"+output);

    }

    private static int calc(int[] arr,int n)
    {
        int sum=0,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            if(sum<0)
            {
                sum=0;
            }
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }

}
