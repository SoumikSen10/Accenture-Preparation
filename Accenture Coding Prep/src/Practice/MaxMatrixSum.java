package Practice;

import java.util.Scanner;

public class MaxMatrixSum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int mat[][]=new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=in.nextInt();
            }
        }

        int ans = compute(mat,r,c);
        System.out.println(ans);
    }

    private static int compute(int[][] mat,int r, int c)
    {
        int maxR=Integer.MIN_VALUE;
        int maxC=Integer.MIN_VALUE;

        int colSum=0,rowSum=0;
        for(int i=0;i<r;i++)
        {
            rowSum=0;
            for(int j=0;j<c;j++)
            {
                rowSum+=mat[i][j];
            }
            maxC=Math.max(maxR,rowSum);
        }

        //transpose matrix
        for(int i=0;i<r;i++)
        {
            colSum=0;
            for(int j=0;j<c;j++)
            {
                colSum+=mat[j][i];
            }
            maxC=Math.max(maxC,colSum);
        }
        return rowSum+colSum;
    }
}
