package ONCAMPUS_DRIVE;

/*

Positive Mid-Element

You are given an array arr of length n. Find and print the element at the mid-index of arr, ignoring all the indices at which negative numbers are present in the array.

Note:
In case there are two mid indices, print the element at the smaller index.
You may assume that there will be at least one positive number in arr.

Input Format:
The input consists of two lines:
The first line contains a single integer n (the length of the array).
The second line contains n space-separated integers denoting arr.

Output Format:
Print the element at the mid-index of arr, ignoring all the indices at which negative numbers are present in the array.

Example:

Input:
6
12 -3 14 -56 77 13

Output:
14

Explanation:
After ignoring the negative numbers, the remaining array is: [12, 14, 77, 13]. The mid-index is 1 (14). Hence, the output is 14.

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositiveMid
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
                count++;
        }

        int posIndex = (count - 1) / 2;

        count=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0) {
                if(count==posIndex)
                {
                    System.out.println(arr[i]);
                    break;
                }
                count++;
            }
        }
    }
}
