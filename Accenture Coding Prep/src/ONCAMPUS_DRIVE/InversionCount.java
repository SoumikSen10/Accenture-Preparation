package ONCAMPUS_DRIVE;

/*

Problem statement
Let j and k be two indices in an array A.
If j < k and A[j] > A[k], then the pair (j, k) is known as an “Inversion pair”.
You are required to implement the following function:

c
Copy code
int InversionCount(int *A, int n);
The function accepts an array A of n unique integers as its argument. You are required to calculate the number of "Inversion pairs" in an array A, and return.

Note:

If A is NULL (None in case of Python), return -1.
If n < 2, return 0.

Example:

Input:
n = 5,
A = [1, 20, 6, 4, 5]

Output:
5



*/

import java.util.Scanner;

public class InversionCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        int pairs = InversionCount(arr, n);
        System.out.println(pairs);
    }

    private static int InversionCount(int[] arr, int n) {
        if (arr == null) {
            return -1; // Return -1 if the array is null
        }
        if (n < 2) {
            return 0; // No inversions in an array with less than 2 elements
        }
        return mergeSort(arr, 0, n - 1);
    }

    private static int mergeSort(int[] arr, int beg, int end) {
        int count = 0;
        if (beg < end) {
            int mid = beg + (end - beg) / 2;
            count += mergeSort(arr, beg, mid);    // Sort and count left half
            count += mergeSort(arr, mid + 1, end); // Sort and count right half
            count += merge(arr, beg, mid, end);    // Merge and count inversions
        }
        return count;
    }

    private static int merge(int[] arr, int beg, int mid, int end) {
        int count = 0;
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        // Create temp arrays
        int left[] = new int[n1];
        int right[] = new int[n2];

        // Copy data to temp arrays
        for (i = 0; i < n1; i++)
            left[i] = arr[beg + i];
        for (j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];

        i = 0; // Initial index of the left subarray
        j = 0; // Initial index of the right subarray
        k = beg; // Initial index of the merged subarray

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                count += (n1 - i); // All remaining elements in left[] are greater than right[j]
            }
        }

        // Copy the remaining elements of left[], if any
        while (i < n1) {
            arr[k++] = left[i++];
        }

        // Copy the remaining elements of right[], if any
        while (j < n2) {
            arr[k++] = right[j++];
        }

        return count;
    }
}

/*

Summary of Logic
Use the merge sort technique to split the array into smaller parts.
During the merge step, count the number of inversions (whenever an element from the right array is placed before elements from the left array).
Accumulate these counts and return the total number of inversions.
This approach ensures that we can count inversion pairs efficiently even for large arrays.

*/