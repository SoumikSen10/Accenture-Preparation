package Practice;

import java.util.Scanner;

public class Pattern1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter height: ");
        int n=in.nextInt();

        for(int i=n;i>=1;i--)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}