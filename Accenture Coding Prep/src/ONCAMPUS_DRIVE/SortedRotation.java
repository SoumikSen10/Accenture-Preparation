package ONCAMPUS_DRIVE;

/*

Given an array of n distinct integers. The task is to check whether reversing any one sub-array can make the array sorted or not. If the array is already sorted or can be made sorted by reversing any one sub-array, print "Yes", else print "No".

Example 1:

Input:
arr = [1, 2, 5, 4, 3]

Output:
Yes

Explanation: By reversing the sub-array [5, 4, 3], the array becomes [1, 2, 3, 4, 5] which is sorted.

Example 2:

Input:
arr = [1, 2, 4, 5, 3]

Output:
No

*/

import java.util.Arrays;
import java.util.Scanner;

public class SortedRotation
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        if(check(arr,n))
            System.out.println("YES");
        else
            System.out.println("NO");

    }

    private static boolean check(int[] arr,int n)
    {
        int temp[]=new int[n];

        for(int i=0;i<n;i++)
            temp[i]=arr[i];

        Arrays.sort(temp);

        int front = 0, back = 0;

        for(front=0;front<n;front++)
        {
            if(arr[front]!=temp[front])
                break;
        }

        for(back=n-1;back>=0;back--)
        {
            if(arr[back]!=temp[back])
                break;
        }

        while(front<back)
        {
            front++;
            if(arr[front-1]<arr[front])
                return false;
        }
        return true;
    }
}
