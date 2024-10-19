package ONCAMPUS_DRIVE;

/*

You are given an array of size
𝑁
N, and you have to find the length of the longest subsequence in which the difference of every consecutive element is divisible by 𝐾

Input:
First line having 2 integers:
N (size of array) and 𝐾
Next line contains N integers representing the array.
Output:
A single integer representing the length of the longest subsequence.

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestSubsequence
{
    private static int maxi = Integer.MIN_VALUE;  // Global variable to track the maximum length
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        List<Integer> ans = new ArrayList<>();
        findLongestSubsequence(0,arr,ans,k);
        System.out.println(maxi);
    }
    private static void findLongestSubsequence(int index,int[] arr,List<Integer> ans,int k)
    {
        if(index==arr.length)
        {
            maxi=Math.max(maxi,ans.size());
            return;
        }

        if(ans.size()==0 || (arr[index]-ans.get(ans.size()-1))%k==0) //pick
        {
            ans.add(arr[index]);
            findLongestSubsequence(index+1,arr,ans,k);
            ans.remove(ans.size()-1);
        }
        findLongestSubsequence(index+1,arr,ans,k); //not pick

    }
}
