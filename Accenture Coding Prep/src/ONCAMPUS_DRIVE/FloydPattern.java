package ONCAMPUS_DRIVE;

import java.util.Scanner;

public class FloydPattern
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int x=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(x + " ");
                x++;
            }
            System.out.println("");
        }

    }
}
