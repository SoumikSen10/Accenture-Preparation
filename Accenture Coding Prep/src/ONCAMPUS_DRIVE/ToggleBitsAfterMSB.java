package ONCAMPUS_DRIVE;

/*

Toggle All Bits After Most Significant Bit (MSB)

You are given an integer n in decimal form. Your task is to toggle all the bits that come after the most significant bit (MSB) in the binary representation of n. The MSB should remain the same.

Input:
A single integer n (1 ≤ n ≤ 10^9)

Output:
Print the resulting integer after toggling all bits that come after the MSB in the binary representation of n.

Example 1:

Input:
9

Output:
14

Explanation:
The binary representation of 9 is 1001.
After toggling all bits after the MSB, the result is 1110 which is 14 in decimal.

*/

import java.util.Scanner;

public class ToggleBitsAfterMSB
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = toggle(n);
        System.out.println(x);
    }

    private static int toggle(int n)
    {
        // get msb position

        int msb=0;
        int temp = n;

        while(temp>0)
        {
            msb++;
            temp=temp>>1;
        }

        //create mask to toggle bits after msb
         int mask = (1 << (msb-1)) -1;

        //toggle bits after msb using xor
        int result = n ^ mask;

        return result;

    }
}
