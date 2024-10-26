package ONCAMPUS_DRIVE;

/*

You are given two strings s1 and s2. Your task is to determine if s2 is an anagram of s1. An anagram is defined as a word formed by rearranging the letters of another word, using all the original letters exactly once.

Input:
Two strings, s1 and s2.

Output:
Return true if s2 is an anagram of s1, otherwise return false.

Conditions:
The lengths of both strings should be equal.
The frequency of each character in s1 should match the frequency of each character in s2.

Example:

Example 1:

Input:
s1 = "anagram"
s2 = "nagaram"

Output: true

Example 2:

Input:
s1 = "rat"
s2 = "car"

Output: false

Explanation:
In the first example, both s1 and s2 have the same length and the frequency of each character matches exactly, so they are anagrams.
In the second example, the frequency of the characters does not match, so s2 is not an anagram of s1.

*/

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();


        a=a.toLowerCase();
        b=b.toLowerCase();


        if(valid(a,b))
            System.out.println("true");
        else
            System.out.println("false");

    }

    private static boolean valid(String a,String b)
    {
        if(a.length()!=b.length())
            return false;

        int[] present = new int[26];
        Arrays.fill(present,0);

        for(int i=0;i<a.length();i++)
        {
            int p = a.charAt(i)-'a';
            present[p]++;
        }

        for(int i=0;i<b.length();i++)
        {
            int p = b.charAt(i)-'a';
            present[p]--;
        }

        for(int i=0;i<26;i++)
        {
            if(present[i]!=0)
                return false;
        }

        return true;

    }

}
