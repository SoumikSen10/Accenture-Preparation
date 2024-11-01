package Practice;

/*

You are given two unbiased 6-faced dice. Your task is to find the number of possible ways to obtain a given sum by throwing the two dice. If no such combinations exist, return 0.

Input:
An integer representing the sum to be obtained by throwing two dice.

Output:
The number of ways the sum can be obtained using two dice.

Example:

Input: 10

Output: 3

Explanation:

For two 6-faced dice, the possible sums can range from 2 (1+1) to 12 (6+6). The task is to find how many combinations of dice rolls add up to the given sum. For the sum of 10, the possible combinations are:

4 + 6
5 + 5
6 + 4

Thus, there are 3 ways to obtain the sum 10.

*/

import java.util.Scanner;

public class UnbiasedDice
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();

        int count=0;

//        for(int i=1;i<=6;i++)
//        {
//            for(int j=1;j<=6;j++)
//            {
//                if(i+j==sum)
//                    count++;
//            }
//        }
//        System.out.println(count);

        //optimized approach

//        if(sum<=12 && sum>0) {
//            for (int i = 1; i <= 6; i++) {
//                int j = sum - i;
//                if (j >= 1 && j <= 6) {
//                    count++;
//                }
//            }
//        }
//        else
//            count=0;

        if(sum<=16 && sum>0)
        {
            for(int i=1;i<=6;i++)
            {
                int j = sum-i;
                if(j>=1 && j<=6)
                {
                    count++;
                }
            }
        }
        else
            count=0;

        System.out.println(count);

    }
}
