package ONCAMPUS_DRIVE;

/*

You are given a string S, and your task is to find and return the number of permutations formed by fixing the positions of the vowels present in the string.

Notes:

Ensure the result is non-negative.
If there are no consonants, return 0.

Input:
A string S consisting of both vowels and consonants.

Output:
An integer representing the count of permutations formed by fixing the positions of the vowels.

Examples:

Input: s = "obec"
Output: 2

Input: s = "ABC"
Output: 2

*/

import java.util.Scanner;

public class PermutePosition
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s=s.toLowerCase();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
                count++;
            }
        }
        System.out.println(fact(count));
    }
    private  static int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
}
