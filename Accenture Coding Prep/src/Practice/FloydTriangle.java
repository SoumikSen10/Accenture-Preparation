package Practice;

import java.util.Scanner;

public class FloydTriangle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height: ");
        int n=in.nextInt();
        floyd(n);
    }
    public static void floyd(int n)
    {
        int x=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(x+" ");
                ++x;
            }
            System.out.println();
        }
    }
}
