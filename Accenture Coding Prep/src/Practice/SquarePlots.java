package Practice;

import java.util.Scanner;

public class SquarePlots
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = in.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter area of plots :");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        System.out.println("No of shortlisted plots is :"+shortlist(arr,n));

    }

    private static int shortlist(int[] arr,int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(Math.ceil(Math.sqrt(arr[i]))==Math.floor(Math.sqrt(arr[i])))
                count++;
        }
        return count;
    }

}
