package ONCAMPUS_DRIVE;

/*

You are given an array that represents the temperature of different days. Your task is to return an integer that represents the longest consecutive temperature drop.

*/

import java.util.Scanner;

public class TempDrop
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int count=0,maxCount=Integer.MIN_VALUE;

        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
                count++;
            else
            {
                maxCount=Math.max(maxCount,count);
                count=0;
            }
        }
        maxCount=Math.max(maxCount,count);

        System.out.println(maxCount);


    }
}
