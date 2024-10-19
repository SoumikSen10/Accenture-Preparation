package Practice;

import java.util.Scanner;

public class DiffSquareRoots
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the start of range: ");
        int m = in.nextInt();
        System.out.print("Enter the end of range: ");
        int n = in.nextInt();

        double result = compute(m,n);
        System.out.printf("The computed result is: %.5f\n",result);
    }

    private static double compute(int m,int n)
    {
        double result=0.0;
        double evensum=0.0,oddsum=0.0;
        for(int i=m;i<=n;i++)
        {
            if(i%2==0)
                evensum+=Math.sqrt(i);
            else
                oddsum+=Math.sqrt(i);
        }
        result = evensum-oddsum;
        return result;
    }
}
