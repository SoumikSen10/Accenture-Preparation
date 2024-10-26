package ONCAMPUS_DRIVE;

/*

Convert a given integer N into its binary form and calculate the number of set bits (1s) in the binary representation.

Input:
An integer N.

Output:
The number of set bits (1s) in the binary form of N.

Example:

Input:
N = 15

Output:
4

*/

import java.util.Scanner;

public class BinarySetBits
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int x = findSetBits(n);

        System.out.println(x);
    }

    private static int findSetBits(int n)
    {

        int count=0;
        while(n>0)
        {
            if((n&1)==1)
                count++;
            n=n>>1;
        }
        return count;
    }
}
