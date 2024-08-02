
// KADANE'S ALGORITHM

import java.util.Scanner;

public class LragestSubArraySum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print("The array elements are: ");
        System.out.println(arr.toString());

        int x = findSubarraySum(arr);
        System.out.println("The largest subarray sum is: "+x);
    }

    private static int findSubarraySum(int arr[])
    {
        int n=arr.length, sum=0,max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            sum = sum + arr[i];
            max = Math.max(max,sum);

            if(sum<0)
                sum=0;
        }
        return max;
    }
}
