package ONCAMPUS_DRIVE;

/*

Given a string and two characters ch1 and ch2 as input, replace all occurrences of ch1 with ch2 and all occurrences of ch2 with ch1 in the input string.

Input:
A string s
Two characters ch1 and ch2

Output:
The modified string with ch1 and ch2 swapped in their positions.

Example:

Input:
s = "shaurya"
ch1 = 's'
ch2 = 'a'

Output:
ahsurgs

*/

import java.util.Scanner;

public class ReplaceStr
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char ch1=in.next().charAt(0);
        char ch2=in.next().charAt(0);

        String ans = generate(s,ch1,ch2);
        System.out.println(ans);
    }

    private static String generate(String str, char ch1, char ch2)
    {
        String ans="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch1)
                ans+=ch2;
            else if(str.charAt(i)==ch2)
                ans+=ch1;
            else
                ans+=str.charAt(i);
        }
        return ans;
    }
}
