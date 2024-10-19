package ONCAMPUS_DRIVE;

/*

Given an integer N, your task is to convert the number into its binary form and return it as a string.

Input:
An integer N.

Output:
A string representing the binary form of N.

Example:

Input:
N = 10

Output:
"1010"

Input:
N = 3

Output:
"11"

*/

import java.util.Scanner;

public class Binary
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String ans = convertBinary(n);
        System.out.println(ans);
    }

    private static String convertBinary(int n)
    {
        String ans= "";

        while(n!=0)
        {
            ans= (n%2) + ans;
            n=n/2;
        }
        return ans;
    }

}
