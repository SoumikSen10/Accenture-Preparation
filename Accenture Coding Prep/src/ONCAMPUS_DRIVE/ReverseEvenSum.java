package ONCAMPUS_DRIVE;

/*

You are given an array A of length N, and you need to find the sum of the values at even positions after reversing the array.

Your task is to return an integer value representing the sum of the elements present at the even positions of the reversed array.

*/

import java.util.Arrays;
import java.util.Scanner;

public class ReverseEvenSum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        //reverse(arr);

        int sum=0;
        for(int i=0;i<n;i++)
        {
            if((n-i-1)%2==0) //using reversed index
                sum+=arr[i];
        }

        System.out.println(sum);

    }

//    private static void reverse(int[] arr)
//    {
//        int n=arr.length;
//        for(int i=0;i<n/2;i++)
//        {
//            int temp=arr[i];
//            arr[i]=arr[n-i-1];
//            arr[n-i-1]=temp;
//        }
//    }
}
