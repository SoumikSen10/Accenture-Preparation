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
//        List<Integer> ans = new ArrayList<>();
//        findLongestSubsequence(0,arr,ans);
//        System.out.println(maxi);
//
//        int res = findLongestMultipleSubsequence(arr,n);
//        System.out.println("Brute force :"+res);

        List<List<Integer>> ans = practice(arr,0,new ArrayList<>());
        int maxLen = 0;
        for(List<Integer> sequence : ans)
        {
            if(check(sequence))
            {
                maxLen = Math.max(maxLen,sequence.size());
            }
        }

        System.out.println(maxLen);

    }

    private static boolean check(List<Integer> sequence)
    {
        for(int i=1;i<sequence.size();i++)
        {
            if(sequence.get(i)/sequence.get(i-1) !=3)
                return false;
        }
        return true;
    }

//    private static List<List<Integer>> practice(int[] arr)
//    {
//        int n=arr.length;
//        List<List<Integer>> ans = new ArrayList<>();
//        for(int i=0;i<n;i++)
//        {
//            for(int j=i;j<n;j++)
//            {
//                List<Integer> temp = new ArrayList<>();
//                for(int k=i;k<=j;k++)
//                {
//                    temp.add(arr[k]);
//                }
//                ans.add(temp);
//            }
//        }
//       return ans;
//    }

    public static List<List<Integer>> practice(int[] arr, int index, List<Integer> current) {
        List<List<Integer>> result = new ArrayList<>();

        // Base case: when the index reaches the length of the array
        if (index == arr.length) {
            result.add(new ArrayList<>(current)); // Add the current subsequence to the result list
            return result;
        }

        // Pick the current element and gather the results
        current.add(arr[index]);
        result.addAll(practice(arr, index + 1, current));

        // Not pick the current element (backtrack) and gather the results
        current.remove(current.size() - 1);
        result.addAll(practice(arr, index + 1, current));

        return result;
    }

//    private static void findLongestSubsequence(int index,int[] arr,List<Integer> ans)
//    {
//       if(index==arr.length)
//       {
//           maxi=Math.max(maxi,ans.size());
//           return;
//       }
//
//       if(ans.size()==0 || ans.get(ans.size()-1)*3 == arr[index])
//       {
//           ans.add(arr[index]);
//           findLongestSubsequence(index+1,arr,ans); // pick
//           ans.remove(ans.size()-1);
//       }
//       findLongestSubsequence(index+1,arr,ans); // not pick
//    }
//
//    // Method to find the length of the longest subsequence with multiples using only for-loops
//    private static int findLongestMultipleSubsequence(int[] arr, int n) {
//        int maxLength = 1;
//
//        // Iterate through each element to consider it as the start of a subsequence
//        for (int i = 0; i < n; i++) {
//            int currentLength = 1; // Length of the current subsequence
//            int lastElement = arr[i]; // Start with the current element
//
//            // Iterate through the rest of the array to find a subsequence
//            for (int j = i + 1; j < n; j++) {
//                // Check if arr[j] is a multiple of lastElement and if it is exactly lastElement * 3 (if specified)
//                if (arr[j] % lastElement == 0 && arr[j] / lastElement == 3) {
//                    currentLength++; // Increment the length of the current subsequence
//                    lastElement = arr[j]; // Update the last element to the current one
//                }
//            }
//
//            // Update the maximum length of any subsequence found
//            maxLength = Math.max(maxLength, currentLength);
//        }
//
//        return maxLength;
//    }
}
