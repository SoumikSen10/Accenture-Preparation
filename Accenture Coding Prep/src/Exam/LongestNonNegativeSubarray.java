package Exam;
import java.util.Scanner;

public class LongestNonNegativeSubarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of array
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        // Input elements of array
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate and print the length of the longest subarray without negatives
        int maxLength = findLongestNonNegativeSubarray(arr);
        System.out.println("Length of the longest subarray without negatives: " + maxLength);
    }

    // Method to find the length of the longest subarray without negative numbers
    public static int findLongestNonNegativeSubarray(int[] arr) {
        int maxLength = 0;
        int currentLength = 0;

        for (int num : arr) {
            if (num >= 0) {
                currentLength++; // Increment length if the current number is non-negative
                maxLength = Math.max(maxLength, currentLength); // Update max length if needed
            } else {
                currentLength = 0; // Reset length if a negative number is found
            }
        }

        return maxLength;
    }

    private static int practice(int[] arr)
    {
        int maxLength=0,currentLen=0;

        for(int num:arr)
        {
            if(num>0)
            {
                currentLen++;
                maxLength = Math.max(currentLen,maxLength);
            }
            else
                currentLen=0;
        }
        return maxLength;
    }
}
