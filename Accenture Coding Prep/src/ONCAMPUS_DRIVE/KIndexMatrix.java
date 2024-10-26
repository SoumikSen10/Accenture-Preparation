package ONCAMPUS_DRIVE;

/*

Given an NxN matrix mat(), find the minimum value of K such that all the elements in the rows and columns of the Kth index are zero, irrespective of the element at (K, K).

*/

import java.util.Scanner;

public class KIndexMatrix
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

        int ans = findMinVal(mat,n);
        System.out.println(ans);

    }

    private static int findMinVal(int[][] mat, int n)
    {
        int min = -1;

        for(int k=0;k<n;k++)
        {
            boolean rowCheck=true,columnCheck=true;

            // check kth row
            for(int j=0;j<n;j++)
            {
                if(j!=k && mat[k][j]!=0)
                {
                    rowCheck=false;
                    break;
                }
            }

            // check kth column
            for(int i=0;i<n;i++)
            {
                if(i!=k && mat[i][k]!=0)
                {
                    columnCheck=false;
                    break;
                }
            }

            if(rowCheck && columnCheck)
            {
                return k;
            }

        }
        return -1;
    }

}
