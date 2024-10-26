package ONCAMPUS_DRIVE;

/*

Determine if a Number is a Power of Two

You are given an integer n. Your task is to determine if n is a power of 2. A number is a power of 2 if there exists an integer k such that 2^k = n.

Input:
A single integer n (1 ≤ n ≤ 2^31 - 1)

Output:
Print "Yes" if n is a power of 2.
Print "No" if n is not a power of 2.

Example 1:

Input:
16

Output:
Yes

Explanation: 16 is equal to 2^4, so it is a power of 2.

*/

import java.util.Scanner;

public class PowerOfTwo
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(check(n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static boolean check(int n)
    {
        if(n<=0)
            return false;

        return (n & (n-1)) == 0;
    }

}
