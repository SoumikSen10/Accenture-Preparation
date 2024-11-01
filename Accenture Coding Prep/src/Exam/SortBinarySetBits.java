package Exam;

import java.util.Scanner;

public class SortBinarySetBits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array based on the count of set bits
        sortBySetBits(arr);

        // Print the sorted array
        System.out.println("Sorted array based on set bits:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Method to sort the array based on the number of set bits
    public static void sortBySetBits(int[] arr) {

        int[] bits = new int[arr.length];
        int n=bits.length;
        for(int i=0;i<n;i++)
        {
            bits[i]=countSetBits(arr[i]);
        }



        // Perform bubble sort based on the count of set bits

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare set bit counts of adjacent elements
                if (bits[j] > bits[j+1] || (bits[j] == bits[j + 1] && arr[j] > arr[j + 1])) {
                    // Swap if the element has more set bits than the next one
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    int temp1=bits[j];
                    bits[j]=bits[j+1];
                    bits[j+1]=temp1;
                }
            }
        }
    }

    // Helper method to count the number of set bits in a number
    private static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            count += (num & 1);
            num >>= 1;
        }
        return count;
    }
}
