package Exam;

import java.util.Scanner;

public class LongestSequenceMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the matrix
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input the matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Find and print the length of the longest increasing sequence in the matrix
        int maxLength = findLongestIncreasingSequence(matrix);
        System.out.println("Longest increasing sequence length: " + maxLength);
    }

    // Method to find the length of the longest increasing sequence using normal for loops
    private static int findLongestIncreasingSequence(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxLength = 0;

        // Traverse each cell of the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Check the longest sequence starting from the current cell
                int currentLength = exploreAllDirections(matrix, i, j);
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    // Helper method to explore all four directions and find the longest path from a given cell
    private static int exploreAllDirections(int[][] matrix, int row, int col) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int length = 1; // Each cell itself is of length 1

        // Explore in each direction (up, down, left, right) and track the path length
        int currentValue = matrix[row][col];

        // Check Up direction
        for (int i = row - 1; i >= 0 && matrix[i][col] > currentValue; i--) {
            length++;
            currentValue = matrix[i][col];
        }

        // Reset current value for next direction
        currentValue = matrix[row][col];

        // Check Down direction
        for (int i = row + 1; i < rows && matrix[i][col] > currentValue; i++) {
            length++;
            currentValue = matrix[i][col];
        }

        // Reset current value for next direction
        currentValue = matrix[row][col];

        // Check Left direction
        for (int j = col - 1; j >= 0 && matrix[row][j] > currentValue; j--) {
            length++;
            currentValue = matrix[row][j];
        }

        // Reset current value for next direction
        currentValue = matrix[row][col];

        // Check Right direction
        for (int j = col + 1; j < cols && matrix[row][j] > currentValue; j++) {
            length++;
            currentValue = matrix[row][j];
        }

        return length;
    }
}
