package Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorialSubsequences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of x
        System.out.println("Enter the value of x:");
        int x = scanner.nextInt();

        // Input the size of the array
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find and print the maximum number of subsequences
        int maxSubsequences = findMaxFactorialSubsequences(arr, x);
        System.out.println("Maximum number of subsequences whose product equals x: " + maxSubsequences);
    }



    // Method to find the maximum number of subsequences whose product is equal to x
    public static int findMaxFactorialSubsequences(int[] arr, int x) {
        // Step 1: Identify the factorial numbers up to x
        List<Integer> factorials = findFactorialsUpToX(x);

        // Step 2: Count subsequences whose product equals one of the factorials equal to x
        return countSubsequencesWithProduct(arr, x, factorials);
    }

    // Helper method to find all factorials less than or equal to x
    private static List<Integer> findFactorialsUpToX(int x) {
        List<Integer> factorials = new ArrayList<>();
        int factorial = 1;
        int i = 1;

        while (factorial <= x) {
            factorials.add(factorial);
            i++;
            factorial *= i; // Calculate next factorial
        }

        return factorials;
    }

    // Helper method to count subsequences whose product is equal to x
    private static int countSubsequencesWithProduct(int[] arr, int x, List<Integer> factorials) {
        int count = 0;

        int n = arr.length;

        // Check all possible subsequences
        for (int i = 0; i < (1 << n); i++) { // Iterate over all possible subsequences using bit masking
            int product = 1;
            boolean isValid = true;

            // Calculate the product of the current subsequence
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { // If the j-th element is included in the subsequence
                    product *= arr[j];
                    if (product > x) { // If the product exceeds x, this subsequence is invalid
                        isValid = false;
                        break;
                    }
                }
            }

            // Check if the product is equal to x and is a factorial number
            if (isValid && factorials.contains(product) && product == x) {
                count++;
            }
        }

        return count;
    }
}
