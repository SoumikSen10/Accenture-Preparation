package ONCAMPUS_DRIVE;

/*

The question involves two numbers: dice and num. The task is to print a specific sum of digits based on whether the value of dice is even or odd:

Problem Statement:
If the value of dice is even, you need to print the sum of the digits in odd indices (starting from index 0).

If the value of dice is odd, you need to print the sum of the digits in even indices.

Approach:
Count the digits of the number num.

Compute two sums:
Sum1 for the sum of digits at odd indices.
Sum2 for the sum of digits at even indices.

Based on the value of dice:
If dice is even, print the sum of digits at odd indices.
If dice is odd, print the sum of digits at even indices.

Example:

Input:
dice = 2
num = 1234
Digits: [1, 2, 3, 4]
Indices: [0, 1, 2, 3]

Output: The sum of digits at odd indices = 2 + 4 = 6.

*/

import java.util.Scanner;

public class DiceProblem
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dice = in.nextInt();
        int num = in.nextInt();

        int ans = calculate(dice,num);
        System.out.println(ans);

    }

    private static int calculate(int dice,int num)
    {
        int oddSum=0,evenSum=0;
        int sum1=0 , sum2=0, flag=0,n=0;
        while(num>0)
        {
            int d = num%10;
            if(flag%2==0)
                sum1+=d;
            else
                sum2+=d;
            num=num/10;
            flag=~flag;
            n++;
        }

        if(n%2==0)
        {
            oddSum = sum1;
            evenSum = sum2;
        }
        else
        {
            evenSum = sum1;
            oddSum = sum2;
        }

        return (dice%2 == 0) ? oddSum : evenSum;

    }
}
