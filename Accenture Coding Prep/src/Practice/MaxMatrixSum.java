package Practice;

import java.util.Scanner;

public class MaxMatrixSum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int mat[][] = new int[r][c];

        // Taking input for the matrix
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                mat[i][j] = in.nextInt();
            }
        }

        // Computing the maximum row and column sums
        int ans = compute(mat, r, c);
        System.out.println("Maximum Sum: " + ans);
    }

    private static int compute(int[][] mat, int r, int c)
    {
        int maxR = Integer.MIN_VALUE; // To store the maximum row sum
        int maxC = Integer.MIN_VALUE; // To store the maximum column sum

        // Calculate the maximum sum among rows
        for(int i = 0; i < r; i++)
        {
            int rowSum = 0;
            for(int j = 0; j < c; j++)
            {
                rowSum += mat[i][j];
            }
            // Update maxR with the maximum row sum
            maxR = Math.max(maxR, rowSum);
        }

        // Calculate the maximum sum among columns
        for(int j = 0; j < c; j++)
        {
            int colSum = 0;
            for(int i = 0; i < r; i++)
            {
                colSum += mat[i][j];
            }
            // Update maxC with the maximum column sum
            maxC = Math.max(maxC, colSum);
        }

        // Return the maximum of row or column sum
        return Math.max(maxR, maxC);
    }
}
