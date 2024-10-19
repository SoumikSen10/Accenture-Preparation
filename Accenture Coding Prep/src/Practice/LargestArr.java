package Practice;

import java.util.Scanner;

public class LargestArr
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

        int x = findLargest(arr);
        System.out.println("The largest number in the array is: "+x);

    }

    private static int findLargest(int arr[])
    {
        int maxLarge=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxLarge)
            {
                maxLarge = arr[i];
            }
        }
        return maxLarge;
    }
}
