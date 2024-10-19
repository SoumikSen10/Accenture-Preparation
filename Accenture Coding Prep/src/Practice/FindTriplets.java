package Practice;/*

A triplet that sums to a given value C is a set of three elements in an array whose sum is equal to C. For example, if we have an array [1, 2, 3, 4, 5] and the target sum C is 9, then the triplet that sums to C is (2, 3, 4) because 2 + 3 + 4 = 9.

In general, given an array of n elements and a target sum C, the problem is to find all triplets (a, b, c) in the array such that a + b + c = C. The triplets may or may not be unique, and the order of the elements in each triplet does not matter.

*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindTriplets
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++)
            arr[i] = in.nextInt();

        System.out.println("Enter sum :");
        int s = in.nextInt();
        findTriplets(arr, n, s);
    }

    private static void findTriplets(int[] arr, int n, int s)
    {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);  // Sort the array to use two-pointer technique

        for(int i=0; i<n-2; i++)
        {
            // Skip duplicates for the first element of the triplet
            if(i > 0 && arr[i] == arr[i-1]) continue;

            int j = i + 1, k = n - 1;

            while(j < k)
            {
                int sum = arr[i] + arr[j] + arr[k];

                if(sum == s)
                {
                    // Create a new list for each triplet
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));

                    // Skip duplicates for the second and third elements
                    while(j < k && arr[j] == arr[j+1]) j++;
                    while(j < k && arr[k] == arr[k-1]) k--;

                    // Move pointers after processing the current triplet
                    j++;
                    k--;
                }
                else if(sum < s)
                    j++;
                else
                    k--;
            }
        }

        // Display the result
        System.out.println("The triplets are :");
        if (ans.isEmpty()) {
            System.out.println("No triplets found.");
        } else {
            for(List<Integer> el : ans)
            {
                System.out.println(el);
            }
        }
    }
}

