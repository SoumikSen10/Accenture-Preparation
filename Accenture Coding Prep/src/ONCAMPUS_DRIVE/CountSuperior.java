package ONCAMPUS_DRIVE;/*

In an array, a superior element is one which is greater than all elements to its right. The rightmost element will always be considered a superior element.

You are given a function:

Int FindNumberOfSuperiorElements(int* arr, int n);
The function accepts an integer array arr and its length n. Implement the function to find and return the number of superior elements in array arr.

Assumptions:
N > 0.
Array index starts from 0.

*/

import java.util.Scanner;

public class CountSuperior
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int x = FindNumberOfSuperiorElements(arr,n);
        System.out.println(x);
    }

    private static int FindNumberOfSuperiorElements(int[] arr,int n)
    {
        int c=0,superior=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>superior)
            {
                superior=arr[i];
                c++;
            }
        }
        return c;
    }

    private static int practice(int[] arr,int n)
    {
        int superior=Integer.MIN_VALUE;
        int c=0;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>superior)
            {
                superior=arr[i];
                c++;
            }
        }
        return c;
    }
}
