package ONCAMPUS_DRIVE;

/*

Given 2 strings having both uppercase and lowercase characters. Irrespective of the case, determine the lexicographically smaller string.

Return -1 if the first string is smaller.
Return 1 if the second string is smaller.
Return 0 if both strings are equal.
Example:
Input:
S1 = "SHOUryA"
S2 = "SauroBH"
Output: -1


*/

import java.util.Scanner;

public class Lexicography
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        int result=check(s1,s2);
        System.out.println(result);
    }

    private static int check(String s1,String s2)
    {
        // Convert both strings to lowercase for case-insensitive comparison
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int n = Math.max(s1.length(),s2.length());

        for(int i=0;i<n;i++)
        {
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);

            if(ch1<ch2)
             return -1;
            else if(ch1>ch2)
                return 1;
        }

        if (s1.length() < s2.length())
            return -1;
        else if (s1.length() > s2.length())
            return 1;

       return 0;
    }

}
