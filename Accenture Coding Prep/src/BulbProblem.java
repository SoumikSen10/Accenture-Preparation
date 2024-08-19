/*

There are n bulbs that are initially off. You first turn on all the bulbs, then you turn off every second bulb. On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb. Return the number of bulbs that are on after n rounds.

Input : n=3
Output : 1
Explanation : At first, the three bulbs are [off,off,off]. After the third round, the three bulbs are [on,off,off]. So you should return 1 because there is only one bulb is on.

*/

import java.util.Scanner;

public class BulbProblem
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of bulbs: ");
        int n = in.nextInt();
        int k = computeBulbState(n);
        System.out.print("Number of bulbs that are on after n rounds is: "+k);
    }

    private static int computeBulbState(int n)
    {
        return (int)Math.sqrt(n);
    }
}
