package Practice;

import java.util.Scanner;

public class CountOccurenceEl
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

        System.out.print("Enter the target element: ");
        int target = in.nextInt();

        System.out.print("The array elements are: ");
        System.out.println(arr.toString());

        int freq = findOccurence(arr,n,target);

        if(freq==0)
            System.out.println("TARGET NOT FOUND.");
        else
            System.out.println("Target element "+target+" has freq : "+ freq);
    }

    private static int findOccurence(int[] arr,int n,int target)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
                count++;
        }
        return count;
    }
}
