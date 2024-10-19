package Practice;

import java.util.Scanner;

public class EquilibriumPoint
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

        int x = equilibriumPoint(arr);
        System.out.println(x);
    }

    public static int equilibriumPoint(int[] arr)
    {
        int n=arr.length;
        int sum=0,prefixSum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        for(int i=0;i<n;i++)
        {
            sum-=arr[i];
            if(sum==prefixSum)
                return i;
            prefixSum+=arr[i];
        }
        return -1;
    }
}
