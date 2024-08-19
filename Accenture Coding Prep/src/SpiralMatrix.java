import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class SpiralMatrix
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int r = in.nextInt();
        System.out.print("Enter the no of columns: ");
        int c = in.nextInt();
        int mat[][]=new int[r][c];
        System.out.println("Enter the matrix elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=in.nextInt();
            }
        }

        System.out.println("The matrix elements are :");
        for(int[] row : mat)
        {
            for(int element : row)
                System.out.print(element+" ");
        }

        System.out.println("");

        System.out.println("Printing in Spiral matrix format: ");
        List<Integer> ans =  spiralOrder(mat);
        for(int el : ans)
            System.out.print(el+" ");
    }
    public static List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> list = new ArrayList<>();
        int rows=matrix.length,columns=matrix[0].length;
        int left=0,top=0,bottom=rows-1,right=columns-1;

        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                list.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++)
            {
                list.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    list.add(matrix[i][left]);
                }
                left++;
            }

        }
        return list;
    }
}
