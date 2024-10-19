package Practice;

import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of first array: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("The first array elements are: ");
        printArray(arr);

        System.out.print("Enter the length of second array: ");
        int m = in.nextInt();
        int arr1[] = new int[m];
        System.out.print("Enter the array elements: ");
        for(int i = 0; i < m; i++) {
            arr1[i] = in.nextInt();
        }
        System.out.print("The second array elements are: ");
        printArray(arr1);

        int[] mergedArray = mergeSorted(arr, n, arr1, m);
        System.out.print("The merged array elements are: ");
        printArray(mergedArray);
    }

    private static int[] mergeSorted(int[] arr, int n, int[] arr1, int m) {
        int[] merged = new int[m + n];
        int left = 0, right = 0, k = 0;

        while (left < n && right < m) {
            if (arr[left] == 0) {
                left++;
            } else if (arr1[right] == 0) {
                right++;
            } else if (arr[left] <= arr1[right]) {
                merged[k++] = arr[left++];
            } else {
                merged[k++] = arr1[right++];
            }
        }

        while (left < n) {
            if (arr[left] != 0) {
                merged[k++] = arr[left];
            }
            left++;
        }

        while (right < m) {
            if (arr1[right] != 0) {
                merged[k++] = arr1[right];
            }
            right++;
        }

        // Create a final array of the correct size to exclude trailing zeros
        int[] finalMerged = new int[k];
        for (int i = 0; i < k; i++) {
            finalMerged[i] = merged[i];
        }
        return finalMerged;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) { // Skip zeroes while printing
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
