package Practice;

import java.util.Scanner;

public class SumLargeSmall
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array :");
        int n = in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        System.out.println("Ans is: "+calcSum(arr,n));
    }

    private static int calcSum(int[] arr,int n)
    {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        return max+min;
    }
}
