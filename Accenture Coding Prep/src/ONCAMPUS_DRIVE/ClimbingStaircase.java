package ONCAMPUS_DRIVE;

/*

You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Examples:

Input: n = 2
Output: 2

Explanation: There are two ways to climb to the top:
1 step + 1 step
2 steps

Input: n = 3
Output: 3

Explanation: There are three ways to climb to the top:
1 step + 1 step + 1 step
1 step + 2 steps
2 steps + 1 step

*/

import java.util.Scanner;

public class ClimbingStaircase
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // no. of steps

        int ways = find(n);
        System.out.println(ways);

    }

    private static int find(int n)
    {
        // resembles fibonacci series only

        if(n<=1)
            return 1;

        int prev2=1,prev1=1,curr=0;

        for(int i=2;i<=n;i++)
        {
            curr=prev2+prev1;
            prev2=prev1;
            prev1=curr;
        }

        return prev1;

    }

}
