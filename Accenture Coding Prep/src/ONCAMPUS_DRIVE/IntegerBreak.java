package ONCAMPUS_DRIVE;

/*

Given an integer n, break it into the sum of k positive integers, where k≥2, and maximize the product of those integers.

Return the maximum product you can get.

Example 1:

Input:
n=2

Output:
1

Example 2:

Input:
n=10

Output:
36

Explanation:
For n=10, the breakdown can be: 3+3+4=10.

The product of these numbers is 3×3×4=36.

The task is to find the breakdown of n into integers such that their product is maximized.

*/

import java.util.Scanner;

public class IntegerBreak
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // math approach
        int ans = integerBreak(n);
        System.out.println(ans);

        // dp approach
//        int dp[] = new int[n+1];
//        int ans = findMaxProduct(n,dp);
//        System.out.println(ans);

    }

    private static int integerBreak(int n)
    {
        if(n==2)
            return 1;
        if(n==3)
            return 2;

        int prod=1;

        while(n>4)
        {
            prod=prod*3;
            n=n-3;
        }

        prod=prod*n;

      return prod;
    }


    //using shortcut math trick
//    private static int integerBreak(int n)
//    {

    //  If n is less than or equal to 3, the best product we can achieve is n - 1.
    //For n = 2, the product is 1 (since
    //1+1 is the only possibility).
    //For n = 3, the product is 2 (since
    //1+2 is the best possibility).

//        if(n<=3)
//            return n-1;
//
//        int quotient = n/3,remainder=n%3;
//
//        if(remainder==0)
//            return (int)Math.pow(3,quotient);
//        if(remainder==1)
//            return (int)Math.pow(3,quotient-1)*4;
//        return (int)Math.pow(3,quotient)*2;
//    }

    private static int findMaxProduct(int n, int[] dp)
    {
        // use pick and notpick logic and optimize it with dp

        if(n<=2)
            return 1;

        if(dp[n]!=0)
            return dp[n];

        int maxProduct=Integer.MIN_VALUE;

        for(int i=1;i<n;i++)
        {
            //Pick i and calculate for rest (n-i)
            int pick = i*(n-i); //pick i and donot break remainder
            int notpick = i*findMaxProduct(n-i,dp); //pick i and  break remainder further

            //take max of both
            maxProduct = Math.max(maxProduct,Math.max(pick,notpick));
        }

        dp[n]=maxProduct;
        return maxProduct;

    }

}
