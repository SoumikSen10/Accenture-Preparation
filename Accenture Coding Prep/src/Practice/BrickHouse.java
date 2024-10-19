package Practice;

import java.util.Scanner;

public class BrickHouse
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the level: ");
        int n = in.nextInt();
        int ans = calcBricks(n);
        System.out.println("No of bricks = "+ans);
    }

    private static int calcBricks(int n)
    {
        int bricks=0,step=0;
        for(int i=1;i<=n;i++)
        {
            bricks+= i*3;
        }
        return bricks-n;
    }

}
