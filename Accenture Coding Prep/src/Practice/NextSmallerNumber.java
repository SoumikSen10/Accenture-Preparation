/*

You are given an array of integers. For each element in the array, you need to find the next smaller number to its right. If there is no smaller number to its right, replace that element with -1.

Input:

An integer n, which is the size of the array.
An integer array arr of size n.
Output:

An updated array where each element is replaced by the next smaller number to its right. If no such smaller number exists, replace it with -1.
Example:

Input:
5
4 2 1 5 3

Output:
[2, 1, -1, 3, -1]

*/

package Practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextSmallerNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array :");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Array is: " + Arrays.toString(arr));

        int[] result = nextSmallerElements(arr);

        System.out.println("Displaying changed array with next smaller numbers: ");
        System.out.println(Arrays.toString(result));
    }

    private static int[] nextSmallerElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack that are greater or equal to the current element
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            // If the stack is not empty, the top of the stack is the next smaller element
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            } else {
                // If stack is empty, there is no smaller element to the right
                result[i] = -1;
            }

            // Push the current element onto the stack
            stack.push(arr[i]);
        }

        return result;
    }
}
