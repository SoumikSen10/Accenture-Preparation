package ONCAMPUS_DRIVE;

/*

Find nth tribonacci series term.

Tn = Tn-1 + Tn-2 + Tn-3

T0=0
T1=1
T2=1

Example :

Input :  n=4
output : 4

*/

import java.util.Scanner;

public class TribonacciSeries
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int x = tribonacci(n);
        System.out.println(x);
    }

    private static int tribonacci(int n)
    {
        if(n==0)
            return 0;

        int prev3=0,prev2=1,prev1=1,curr=0;

        for(int i=3;i<=n;i++)
        {
            curr=prev3+prev1+prev2;
            prev3=prev2;
            prev2=prev1;
            prev1=curr;
        }

        return prev1;

    }


}
