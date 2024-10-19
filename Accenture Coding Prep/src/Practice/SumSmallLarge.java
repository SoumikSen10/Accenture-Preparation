package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class SumSmallLarge
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
        System.out.print("Enter array length :");
        int n = in.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter array elements :");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        System.out.println("Array elements :");
        System.out.println(Arrays.toString(arr));

        int output = calc(arr,n);
        System.out.println("Output is :"+output);

    }

    private static int calc(int[] arr,int n)
    {
        int smallest=Integer.MAX_VALUE,largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            smallest=Math.min(smallest,arr[i]);
            largest=Math.max(largest,arr[i]);
        }
        return smallest+largest;
    }


}
