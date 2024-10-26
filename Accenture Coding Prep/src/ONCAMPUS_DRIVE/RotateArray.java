package ONCAMPUS_DRIVE;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int k = in.nextInt();

        k = k % n; // handling case where k>n

        System.out.println(Arrays.toString(arr));


        reverse(arr,0,n-1);

        reverse(arr,0,k-1);

        reverse(arr,k,n-1);

        System.out.println(Arrays.toString(arr));

    }

    private static void reverse(int[] arr, int start, int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
