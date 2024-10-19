package Practice;

import java.util.Scanner;

public class MissingNoArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print("The array elements are: ");
        System.out.println(arr.toString());
        int x = findMissing(arr);
        if(x==0)
            System.out.println("No missing number in array.");
        else
         System.out.println("The missing number in the array is: "+x);
    }

    private static int findMissing(int arr[])
    {
        int missing=0;
        int n=arr.length;
        int sum=0, rangeSum=n*(n+1)/2;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        missing=rangeSum-sum;
        return missing;
    }
}
