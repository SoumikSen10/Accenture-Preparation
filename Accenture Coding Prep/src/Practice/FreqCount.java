package Practice;/*

Frequency Count :

Given the string, find the frequency of each character in it.

The input string contains only lowercase letters. The output string should contain a letter followed by its frequency, in the alphabetical order (from a-z)

Input 1 : babdc
Output 1 : a1b2c1d1

Input 2 : cbd
Output 2 : b1c1d1

*/

import java.util.Arrays;
import java.util.Scanner;

public class FreqCount
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = in.next();

        int l = str.length();
        int ch[] = new int[26];
        Arrays.fill(ch,0);
        for(int i=0;i<l;i++)
        {
            char x = str.charAt(i);
            ch[x-'a']++;
        }

        String ans="";
        for(int i=0;i<26;i++)
        {
            if(ch[i]!=0)
            {
                ans =ans+ (char)(i+'a') ;
                ans += ch[i];
            }
        }
        System.out.println("Output: "+ans);
    }
}
