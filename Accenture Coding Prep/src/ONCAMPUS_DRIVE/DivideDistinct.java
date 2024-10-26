package ONCAMPUS_DRIVE;

/*

Take a number N as input, and check if it can be divided into two even distinct parts.

Input:
A single integer N.
Output:
Print "YES" if the number can be divided into two even distinct parts.
Print "NO" if it cannot be divided into two even distinct parts.
Example:
Input: N = 8
Output: YES
Explanation: 8 can be divided into two even numbers like 2 and 6, or 4 and 4.

Input: N = 9
Output: NO
Explanation: 9 cannot be divided into two even numbers.

Approach:
The number N must be an even number and greater than 2 to be split into two even distinct parts. If N is even and N > 2, print "YES". Otherwise, print "NO".

*/

import java.util.Scanner;

public class DivideDistinct
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if(possible(n))
            System.out.println("YES");
        else
            System.out.println("NO");

    }

    private static boolean possible(int n)
    {
        if(n<=2)
            return false;

        if(n%2==0)
            return true;
        return false;

    }

}
