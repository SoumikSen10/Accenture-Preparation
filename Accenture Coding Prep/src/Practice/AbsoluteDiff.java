package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class AbsoluteDiff
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int n = in.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements :");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int minPenalty=calc(arr,n);
        System.out.println("Min penalty is :"+minPenalty);

    }

    private static int calc(int[] arr,int n)
    {
        Arrays.sort(arr);
        int penalty=0;

        for(int i=1;i<n;i++)
        {
            penalty+=Math.abs(arr[i]-arr[i-1]);
        }

        return penalty;
    }

}
