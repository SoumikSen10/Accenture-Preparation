package ONCAMPUS_DRIVE;

/*

Given an N×N matrix where N is odd with all values as 0 except for a single cell that contains a value of 1. The task is to find the minimum possible moves to get this 1 to the center of the matrix. In a single move, any two consecutive rows or two consecutive columns can be swapped.

Constraints:
N is odd.
You can swap two consecutive rows or columns in a single move.

Example:

Input:
N=5

Matrix:
0 0 0 0 0
0 0 0 0 0
0 0 0 1 0
0 0 0 0 0
0 0 0 0 0

Output: 3

*/

import java.util.Scanner;

public class MinStepsBinaryMatrix
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] mat = new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=in.nextInt();
            }
        }

        int ans = searchAndFind(mat,n);
        System.out.println(ans);

    }

    private static int searchAndFind(int[][] mat, int n)
    {
        int x=0,y=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==1)
                {
                    x=i;
                    y=j;
                }
            }
        }

        return Math.abs(x-n/2)+Math.abs(y-n/2);
    }
}
