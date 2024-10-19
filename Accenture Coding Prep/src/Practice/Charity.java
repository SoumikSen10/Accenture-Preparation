package Practice;/*

Adam decides to be generous and do some charity. Starting today from day 1 until day n, he gives i^2 coins to charity on day i.

Input 1: 2
Output 1: 5

Explanation :

On the first day, he will give 1^2 = 1 coin
On the second day, he will give 2^2 = 4 coins

Total coins = 5 coins

*/

import java.util.Scanner;

public class Charity
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of days: ");
        int n = in.nextInt();

        int coins=0;

        for(int i=1;i<=n;i++)
        {
            coins+=Math.pow(i,2);
        }

        System.out.println("Total coins = "+coins+" coins");

    }
}
