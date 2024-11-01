package ONCAMPUS_DRIVE;

/*

Find the Count of Magical Numbers from 1 to N

A number is considered magical if:

Convert the number to its binary representation.
Replace every --> 0 becomes 1 and 1 becomes 2 in the binary string.
Calculate the sum of all digits in the modified binary string.
The result must be an odd number.

Input:
An integer N (the upper limit of the range).

Output:
The count of magical numbers from 1 to N.

Example:

Input:
N = 5

Output:
2

*/

import java.util.Scanner;

public class CountMagical
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(magical(i))
                count++;
        }

        System.out.println(count);

    }

    private static boolean magical(int n)
    {
        // see after converting a number to binary 0 becomes 1 and 1 becomes 2.
        // So addition of n no of 2's will result in even always. Hence we need to track only the number of 0's which are converted to 1's. If there are even no of 0's then after converting to 1's , it will result in even only. If there are odd no of 0's then after converting to 1's it results in odd result. Hence we will just track the count of 0 bits only.

        int count=0;
        while(n>0)
        {
            if(n%2==0) //tracking 0 bits
                count++;
            n=n/2;
        }
        if(count%2!=0)
            return true; //when odd no. of zeroes which converts to 1's to give odd result
        return false;
    }
}
