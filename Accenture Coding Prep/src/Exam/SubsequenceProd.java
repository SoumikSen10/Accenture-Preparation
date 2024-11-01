package Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*

Count and Return All Subsequences of an Array

Problem Description: Given an array of integers as input, find all possible subsequences of the array. A subsequence is defined as a sequence derived from the given array by deleting zero or more elements without changing the order of the remaining elements.

Example:
Input:
arr = [1, 2, 3]

Output:
[[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]

*/

public class SubsequenceProd {

    // Main method to find and return all subsequences of a given array
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter product");
        int p = scanner.nextInt();

        // Call the single method to find all subsequences
       // List<List<Integer>> subsequences = findAllSubsequences(arr, 0, new ArrayList<>());

        List<List<Integer>> subsequences = practice(arr);

        int count=0;

        for(List<Integer> list : subsequences)
        {
            if(check(list,p))
            {
                count++;
                System.out.println(list);
            }

        }

        System.out.println(count);
        // Print the subsequences
        //System.out.println("All Subsequences of the array: " + subsequences);
    }

    private static boolean check(List<Integer> list, int p)
    {
        int prod=1;
        for(int el : list)
        {
            prod=prod*el;
        }

        return prod==p;
    }

    private static List<List<Integer>> practice(int[] arr)
    {
        List<List<Integer>> ans = new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                List<Integer> temp = new ArrayList<>();
                for(int k=i;k<=j;k++)
                {
                    temp.add(arr[k]);
                }
                ans.add(temp);
            }
        }
        return ans;
    }

    // Single method to find all subsequences of a given array using backtracking
    public static List<List<Integer>> findAllSubsequences(int[] arr, int index, List<Integer> current) {
        List<List<Integer>> result = new ArrayList<>();

        // Base case: when the index reaches the length of the array
        if (index == arr.length) {
            result.add(new ArrayList<>(current)); // Add the current subsequence to the result list
            return result;
        }

        // Pick the current element and gather the results
        current.add(arr[index]);
        result.addAll(findAllSubsequences(arr, index + 1, current));

        // Not pick the current element (backtrack) and gather the results
        current.remove(current.size() - 1);
        result.addAll(findAllSubsequences(arr, index + 1, current));

        return result;
    }
}
