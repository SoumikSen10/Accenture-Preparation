package Practice;/*

Given an array of integers and a number 'sum', print all pairs in the array whose sum is equal to 'sum'.

Examples :
Input : arr[] = {1,5,7,-1,5}, sum=6
Output : (1,5) (7,-1) (1,5)

Input : arr[] = {2,5,17,-1}, sum=7
Output : (2,5)

*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class PairSum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter sum: ");
        int sum = in.nextInt();
//        List<List<Integer>> list = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] + arr[j] == sum) {
//                    List<Integer> ans = new ArrayList<>();
//                    ans.add(arr[i]);
//                    ans.add(arr[j]);
//                    list.add(ans);
//                }
//            }
//        }
//
//        if (list.size() > 0) {
//            System.out.println("The pairs are:");
//            for (List<Integer> pair : list) {
//                System.out.println("(" + pair.get(0) + ", " + pair.get(1) + ")");
//            }
//        } else {
//            System.out.println("No pairs found.");
//        }

        // optimized approach
        // Set to store elements
        HashSet<Integer> set = new HashSet<>();

        System.out.println("The pairs are:");
        boolean found = false; // To track if any pair is found

        for (int i = 0; i < n; i++) {
            int complement = sum - arr[i];

            // If the complement exists in the set, we've found a pair
            if (set.contains(complement)) {
                System.out.println("(" + complement + ", " + arr[i] + ")");
                found = true;
            }

            // Add the current element to the set
            set.add(arr[i]);
        }

        if (!found) {
            System.out.println("No pairs found.");
        }

    }
}

