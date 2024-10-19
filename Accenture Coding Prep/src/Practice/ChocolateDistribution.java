package Practice;/*

Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

Example 1:

Input:
N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}
Output: 6
Explanation: The minimum difference between maximum chocolates and minimum chocolates is 9 - 3 = 6 by choosing following M packets :{3, 4, 9, 7, 9}.

Example 2:

Input:
N = 7, M = 3
A = {7, 3, 2, 4, 9, 12, 56}
Output: 2
Explanation: The minimum difference between maximum chocolates and minimum chocolates is 4 - 2 = 2 by choosing following M packets :{3, 2, 4}.

*/

//simple sort array and perform sliding window

import java.util.*;
public class ChocolateDistribution
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList();
        System.out.println("Enter array elements :");
        for(int i=0;i<n;i++)
        {
            int a = in.nextInt();
            list.add(a);
        }

        System.out.print("Enter no of children :");
        int m = in.nextInt();

        long ans = findMinDiff(list,n,m);
        System.out.println("Output is :"+ans);
    }
    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int left=0,right=left+m-1;
        int diff=Integer.MAX_VALUE;
        while(right<n)
        {
            int min=a.get(left);
            int max=a.get(right);
            diff=Math.min(diff,max-min);
            left++;
            right++;
        }
        return diff;
    }
}
