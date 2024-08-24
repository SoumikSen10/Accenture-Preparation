import java.util.*;

public class MatrixSecondLg
{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int r=in.nextInt();
        System.out.print("Enter no of columns: ");
        int c=in.nextInt();
        int[][] mat=new int[r][c];
        System.out.println("Enter elements in matrix :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=in.nextInt();
            }
        }

        System.out.println("The matrix is: ");
        for(int[] arr : mat)
        {
            System.out.println(Arrays.toString(arr));
        }

        List<Integer> oddSet = new ArrayList<>();
        List<Integer> evenSet = new ArrayList<>();

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(mat[i][j]%2==0)
                    evenSet.add(mat[i][j]);
                else
                    oddSet.add(mat[i][j]);
            }
        }
        Collections.sort(oddSet);
        Collections.sort(evenSet);
        oddSet.remove(oddSet.size()-1);
        evenSet.remove(evenSet.size()-1);
        System.out.println(oddSet.get(oddSet.size()-1));
        System.out.println(evenSet.get(evenSet.size()-1));
        System.out.println(oddSet.get(oddSet.size()-1)+evenSet.get(evenSet.size()-1));
    }
}
