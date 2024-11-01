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
//        List<Integer> ans = new ArrayList<>();
//        findLongestSubsequence(0,arr,ans,k);
//        System.out.println(maxi);

        int ans = practice(arr,k);
        System.out.println(ans);

    }

    private static int practice(int arr[], int k) {
        int n = arr.length;
        int maxLen = 1;

        // Iterate through each element to consider it as the starting point of a subsequence
        for (int i = 0; i < n; i++) {
            int currentLength = 1; // Start with the current element
            int lastElement = arr[i];

            // Inner loop to compare with all elements after the current element
            for (int j = i + 1; j < n; j++) {
                // Check if the difference between the current element and the next element is divisible by k
                if ((arr[j] - lastElement) % k == 0) {
                    currentLength++; // Increment the current subsequence length
                    lastElement = arr[j]; // Update the last element to the current one
                }
            }

            // Update the maximum length found
            maxLen = Math.max(maxLen, currentLength);
        }

        return maxLen;
    }


//    private static void findLongestSubsequence(int index,int[] arr,List<Integer> ans,int k)
//    {
//        if(index==arr.length)
//        {
//            maxi=Math.max(maxi,ans.size());
//            return;
//        }
//
//        if(ans.size()==0 || (arr[index]-ans.get(ans.size()-1))%k==0) //pick
//        {
//            ans.add(arr[index]);
//            findLongestSubsequence(index+1,arr,ans,k);
//            ans.remove(ans.size()-1);
//        }
//        findLongestSubsequence(index+1,arr,ans,k); //not pick
//
//    }

    private static void findLongestSubsequence(int index, int[] arr, List<Integer> ans,int k)
    {
        if(index==arr.length)
        {
            maxi=Math.max(maxi,ans.size());
            return;
        }

        if(ans.size()==0 || (arr[index]-ans.get(ans.size()-1))%k==0)
        {
            ans.add(arr[index]);
            findLongestSubsequence(index+1,arr,ans,k);
            ans.remove(ans.size()-1);
        }

        findLongestSubsequence(index+1,arr,ans,k);

    }

}
