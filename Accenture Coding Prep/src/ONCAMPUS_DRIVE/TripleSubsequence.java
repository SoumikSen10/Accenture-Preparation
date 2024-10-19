package ONCAMPUS_DRIVE;

/*

You are given an array of size
𝑁 and you have to find the length of the longest subsequence such that each element in the subsequence is a multiple of the previous element.

Input:
First line contains a single integer
𝑁(size of the array)
Next line contains
N integers representing the array.

Output:
A single integer representing the length of the longest subsequence where each element is a multiple of the previous element.

Example -

Input:
N=4 , arr=[2,3,6,18]

Output:
3

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TripleSubsequence
{
    private static int maxi = Integer.MIN_VALUE;  // Global variable to track the maximum length
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        List<Integer> ans = new ArrayList<>();
        findLongestSubsequence(0,arr,ans);
        System.out.println(maxi);
    }
    private static void findLongestSubsequence(int index,int[] arr,List<Integer> ans)
    {
       if(index==arr.length)
       {
           maxi=Math.max(maxi,ans.size());
           return;
       }

       if(ans.size()==0 || ans.get(ans.size()-1)*3 == arr[index])
       {
           ans.add(arr[index]);
           findLongestSubsequence(index+1,arr,ans); // pick
           ans.remove(ans.size()-1);
       }
       findLongestSubsequence(index+1,arr,ans); // not pick
    }
}
