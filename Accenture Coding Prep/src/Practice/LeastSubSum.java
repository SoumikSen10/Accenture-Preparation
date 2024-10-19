package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeastSubSum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter k: ");
        int k =in.nextInt();
        if (k > n) {
            System.out.println("Invalid value of k");
            return;
        }
        System.out.println("Result is :"+calcLen(arr,n,k));
    }

    private static int calcLen(int[] arr,int n,int k)
    {
        if(k>n-1)
            return -1;
        List<Integer> list = new ArrayList<>();
        int currSum=0,minStartIndex=0;
        for(int i=0;i<k;i++)
        {
            currSum+=arr[i];
        }

        int minSum=currSum;

        //sliding window
        for(int i=k;i<n;i++)
        {
            currSum=currSum+arr[i]-arr[i-k];
            if (currSum < minSum)
            {
                minSum = currSum;
                minStartIndex = i - k + 1; // Update start index of the minimum subarray
            }
        }

        for(int i=minStartIndex;i<minStartIndex+k;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

       return minSum;
    }
}
