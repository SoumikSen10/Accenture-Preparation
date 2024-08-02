import java.util.Scanner;

//apply binary search since given in ascending order
public class SearchInMatrix
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

        System.out.print("Enter the element to be searched: ");
        int target = in.nextInt();

        System.out.println("The matrix elements are :");
        for(int[] row : mat)
        {
            for(int element : row)
                System.out.print(element+" ");
        }

        System.out.println("");

        if(search(mat,target)==true)
         System.out.println(target+" found in matrix");
        else
            System.out.println(target+" not found in matrix");
    }

    private static boolean search(int[][] mat,int target)
    {
        int row=mat.length;
        int col=mat[0].length;

        int low=0,high=(row*col)-1 ;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(mat[mid/col][mid%col]==target)
                return true;
            else if(mat[mid/col][mid%col]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return false;
    }
}
